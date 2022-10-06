

abstract class Main$$Webinar {
	
	public String getBPMNPath() {
		return "../WebinarBPMN/src/main/resources/com/sample/process/";
	}
	
	public String getYMLFilePath() {
		return "../WebinarSpringBoot/src/features.yml";
	}
	
	public void print(){
		System.out.println("Webinar");

		XMLFileOperations.cleanDirectory(getBPMNPath());
		XMLFileOperations.copyFile("processes/Webinar/Webinar.bpmn", 
				getBPMNPath()+"Webinar.bpmn");
		
		YMLFileOperations.cleanFeatures(getYMLFilePath());
		
	}

	public static void main(String[] args) {
		new Main().print();
	} 
}

abstract class Main$$PassPresenter extends  Main$$Webinar  {
	public void print() {
		super.print();
		System.out.println("- Pass Presenter");
		XMLFileOperations.addFeature("processes/PassPresenter/DiffPassPresenter.xml", 
				super.getBPMNPath()+"Webinar.bpmn"); 
		
		YMLFileOperations.addStatus(getYMLFilePath(), "passPresenter", 1);

//		XMLFileOperations.copyFile("processes/PassPresenter/PassPresenter.bpmn", 
//				Super().getBPMNPath()+"PassPresenter.bpmn");
	}
}

abstract class Main$$WhiteBoard extends  Main$$PassPresenter  {
	public void print() {
		super.print();
		System.out.println("- WhiteBoard");
		XMLFileOperations.addFeature("processes/WhiteBoard/DiffWhiteBoard.xml", 
				super.getBPMNPath()+"Webinar.bpmn"); 
	}
}

public class Main extends  Main$$WhiteBoard  {
	public void print() {
		super.print();
		System.out.println("- Chat Messaging");
		XMLFileOperations.addFeature("processes/ChatMessaging/DiffChatMessaging.xml", 
				super.getBPMNPath()+"Webinar.bpmn");

		
		YMLFileOperations.addStatus(getYMLFilePath(), "chatMessaging", 1);
//		XMLFileOperations.copyFile("processes/ChatMessaging/ChatMessaging.bpmn", 
//				Super().getBPMNPath()+"ChatMessaging.bpmn");
	}
}