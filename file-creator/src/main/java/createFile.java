public class createFile {
    public static void main(String[] args) {
        try {
            File file = new File ("C:\\Users\\lukeb\\projects\\java\\file_creator\\newFile.txt");
            boolean newFile = file.createNewFile();
            if (newFile){
                System.out.println("File has been created");
            } else {
                System.out.println("File already exists");
            }
            catch (IOException e) {
                System.out.println("Exception occured:");
                e.printStackTrace();
            }
    }

}
