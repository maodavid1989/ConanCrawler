import java.awt.image.BufferedImage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;


public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//createFolder();	//if not exists folder

		for (int n=1; n<=82; n++){ //book 1 to 82
			try{
			
				String num=String.valueOf(n);
				
				String book=String.valueOf(num);
				if (book.length()==1){
					book="00"+book;
				}else if(book.length()==2){
					book="0"+book;
				}			
				
				
				for (int i=1; i<=110; i++){
	
					String temppage=String.valueOf(i);
					if (temppage.length()==1){
						temppage="00"+temppage;
					}else if(temppage.length()==2){
						temppage="0"+temppage;
					}
					System.out.println("book: "+ num + " page : "+ temppage);
										
					String imageUrl ="http://webs.cartoonmad.com/a92vs622c46/1066/"+book+"/"+temppage+".jpg";
					URL url = new URL(imageUrl);  
			        BufferedImage image = ImageIO.read(url); 
			        
			        File imageFile = new File("D:/conan/"+String.valueOf(num)+"/"+temppage+".jpg");  
		        
			        FileOutputStream outStream = new FileOutputStream(imageFile);  
			  
			        ImageIO.write(image, "jpg", outStream); 
			        
				}
	
			}catch(Exception ex){
				System.out.println("exception");
			}finally{
				System.out.println("done !!");
			}
		}
	}

	public static void createFolder(){
		for (int i=1; i<=85;i++){
			new File("D:\\conan\\"+String.valueOf(i)).mkdir();
		}
	}
}
