package guiPractice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Martin Robillard Revised 9 October 2014
 *
 * Class to demonstrate the Observer design pattern 
 * in Java. Note that there are many ways to implement an
 * Observer design pattern, and that this is just one of them.
 */
@SuppressWarnings("serial")
public class LuckyNumber extends JFrame //the window
{
	/**
	 * Builds and launches the GUI.
	 */
	public LuckyNumber()
	{
		setTitle("Lucky Number");
		// The first parameter below is the number of 
		// rows in the main window. To add one, change 3 to 4.
		setLayout(new GridLayout(4, 1));
		
		// This can be a local because we're storing a reference
		// directly inside the panels.
		Model lModel = new Model();
		
		add(new SliderPanel(lModel));  	// Top component panel
		add(new IntegerPanel(lModel)); 	// Middle component panel
		add(new TextPanel(lModel));   	// Bottom component panel
		add(new RomanNumberPanel(lModel));   	// Bottom component panel
 		setDefaultCloseOperation(EXIT_ON_CLOSE); // Activates the close button.
		pack(); 						// Computes optimal size of the window
		setLocationRelativeTo(null);	// Sticks the window in the middle of the screen
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new LuckyNumber();
	}
}

@SuppressWarnings("serial")
class SliderPanel extends JPanel implements Observer, ChangeListener
{
	private JSlider aSlider = new JSlider();
	private Model aModel;
	
	public SliderPanel(Model pModel)
	{
		aModel = pModel;
		aModel.subscribeToChanges(this);
		aSlider.setMinimum(0);
		aSlider.setMaximum(10);
		aSlider.setPaintTicks(true);
		aSlider.setMajorTickSpacing(1);
		aSlider.setSnapToTicks(true);
		aSlider.setValue(aModel.getNumber());
		aSlider.addChangeListener(this);
		add(aSlider);
	}
	
	@Override
	public void stateChanged(ChangeEvent e)
	{
		aModel.setNumber(aSlider.getValue());				
	}

	@Override
	public void notifyNewNumber(int pNumber)
	{
		aSlider.setValue(aModel.getNumber());
	}
}

@SuppressWarnings("serial")
class IntegerPanel extends JPanel implements Observer, ActionListener
{
	private JTextField aText = new JTextField(20);
	private Model aModel;
	
	public IntegerPanel(Model pModel)
	{
		aModel = pModel;
		aModel.subscribeToChanges(this);
		aText.setText(new Integer(aModel.getNumber()).toString());
		aText.addActionListener(this);
		add(aText);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int lInteger = 0;
		try
		{
			lInteger = Integer.parseInt(aText.getText());
		}
		catch(NumberFormatException pException )
		{
			// Just ignore. We'll use 0 instead.
		}
		aModel.setNumber(lInteger);
	}

	@Override
	public void notifyNewNumber(int pNumber)
	{
		aText.setText(new Integer(pNumber).toString());
		
	}
}

class RomanNumberPanel extends JPanel implements Observer, ActionListener
{
	private JTextField aText = new JTextField(20);
	private Model aModel;
	
	private static final String[] ROMANNUMS = {"NULLA","I", "II", "III", "IV" ,"V" ,"VI", "VII", "VIII", "IX", "X"};
	
	public RomanNumberPanel(Model pModel)
	{
		aModel = pModel;
		aModel.subscribeToChanges(this);// add a RomanPanel instance to Model
		aText.setText(ROMANNUMS[aModel.getNumber()]);
		aText.addActionListener(this);
		add(aText);// add text field box to Roman panel
	}

	@Override
	public void actionPerformed(ActionEvent e) // when an action is performed, do this
	{
		int numIndex = 0;
		
		for(int i = 0; i < ROMANNUMS.length; i++)
		{
			if(aText.getText().equalsIgnoreCase(ROMANNUMS[i]))
			{
				numIndex = i;
				break;
			}
		}
		
		aModel.setNumber(numIndex);
		
	}

	@Override
	public void notifyNewNumber(int pNumber) //called to have the number in roman panel changed when a new number is selected
	{
		aText.setText(ROMANNUMS[pNumber]);// where RomanPanel value is changed
		
	}
}

@SuppressWarnings("serial")
class TextPanel extends JPanel implements Observer, ActionListener
{
	private JTextField aText = new JTextField(20);
	private Model aModel;
	
	private static final String[] LABELS = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

	public TextPanel(Model pModel)
	{
		aModel = pModel;
		aModel.subscribeToChanges(this);
		aText.setText(LABELS[aModel.getNumber()]);
		aText.addActionListener(this);
		add(aText);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int lIndex = 0;
		for( int i = 0; i < LABELS.length; i++)
		{
			if(aText.getText().equalsIgnoreCase(LABELS[i]))
			{
				lIndex = i;
				break;
			}
		}
		aModel.setNumber(lIndex);
	}

	@Override
	public void notifyNewNumber(int pNumber)
	{
		aText.setText(LABELS[pNumber]);
	}
}

class Model
{
	private ArrayList<Observer> aObservers = new ArrayList<Observer>();
	private int aNumber = 5;
	
	public void subscribeToChanges(Observer pObserver)
	{
		aObservers.add(pObserver);
	}
	
	private void notifyObservers()
	{
		for(Observer observer : aObservers)
		{
			observer.notifyNewNumber(aNumber);
		}
	}
	
	public void setNumber(int newValue)
	{
		if( newValue < 0 )
		{
			aNumber = 0;
		}
		else if( newValue > 10 )
		{
			aNumber = 10;
		}
		else
		{
			aNumber = newValue;
		}
		notifyObservers();
	}
	
	public int getNumber()
	{
		return aNumber;
	}
}

interface Observer
{
	void notifyNewNumber(int pNumber);
}