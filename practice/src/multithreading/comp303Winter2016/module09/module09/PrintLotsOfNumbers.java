package multithreading.comp303Winter2016.module09.module09;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class PrintLotsOfNumbers extends JFrame
{
	public PrintLotsOfNumbers()
	{
		final JButton button = new JButton("Go");
		button.setPreferredSize(new Dimension(50,25));
		add(button);
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				button.setText("Processing...");
				new Thread(new Runnable()
				{
					public void run()
					{
						for( int i = 0; i < 500000; i++)
						{
							System.out.println(i);
						}

						SwingUtilities.invokeLater(new Runnable()
						{
							public void run()
							{
								button.setText("Foowawa!");
							}
						});		
						for( int i = 0; i < 500000; i++)
						{
							System.out.println(i);
						}
						SwingUtilities.invokeLater(new Runnable()
						{
							public void run()
							{
								button.setText("Done!");
							}
						});		
						
					}
				}).start();
			}
		});
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		pack();
		setVisible( true );
	}
	
	public static void main(String[] args)
	{
		new PrintLotsOfNumbers();
	}
}
