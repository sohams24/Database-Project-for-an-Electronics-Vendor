import java.awt.EventQueue;

public class Main {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			
			
			
			public void run() {
					
				try {
					Login l = new Login();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
			
		});
	
		
	
	}
}
