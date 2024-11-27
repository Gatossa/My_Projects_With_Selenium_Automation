package ProjectListeners;

import ProjectPageObjects.Base;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends Base implements ITestListener {
    public Listeners() throws IOException {
        super();}


        public void onTestFailure (ITestResult result){

            try {
                SnapShot(result.getName());

            } catch (IOException e) {

                e.printStackTrace();
            }

        }
    }