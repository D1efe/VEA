package vea;

public class TestResults {

    private String testName;
    private int testNumber;
    private String screenBrightness, observationAngle, monitorResolution, screenSize, rating;

    public TestResults() {
        
    }

    public TestResults(String testName, int testNumber, String screenBrightness, 
            String observationAngle, String monitorResolution, String screenSize, String rating) {

        this.testName = testName;
        this.testNumber = testNumber;
        this.screenBrightness = screenBrightness;
        this.observationAngle = observationAngle;
        this.monitorResolution = monitorResolution;
        this.screenSize = screenSize;
        this.rating = rating;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }

    public String getScreenBrightness() {
        return screenBrightness;
    }

    public void setScreenBrightness(String screenBrightness) {
        this.screenBrightness = screenBrightness;
    }

    public String getObservationAngle() {
        return observationAngle;
    }

    public void setObservationAngle(String observationAngle) {
        this.observationAngle = observationAngle;
    }

    public String getMonitorResolution() {
        return monitorResolution;
    }

    public void setMonitorResolution(String monitorResolution) {
        this.monitorResolution = monitorResolution;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
