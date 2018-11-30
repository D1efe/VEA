/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vea;

import javafx.scene.control.Label;

/**
 *
 * @author dan
 */
public class InformationStrings {

    private final Label intro = new Label("ABOUT \n"
            + "Welcome to Videa Evaluation Application (VEA). The purpose of this application is \n"
            + "to evaluate the quality of your videos through a series of tests which will provide you \n"
            + "with the information needed to determine the quality of a video. To get started, click \n"
            + "the 'new test' button.");

    private final Label addVid = new Label("ADDING VIDEOS \n"
            + "By clicking the 'add video' button, you will be asked to select a video from the \n"
            + "following formats: MP4, FLV and VP6. Upon choosing the video, the name of the \n"
            + "video will appear on the right side of the button followed by the video details which \n"
            + "will appear to the right of that. This video will then be loaded onto the Video Player \n"
            + "page where you can proceed with the test.");

    private final Label dsis = new Label("DOUBLE-STIMULUS IMPAIRMENT SCALE \n"
            + "This method should be chosen if a full range of impairments can be provided \n"
            + "in the video, The images here can be presented from either the source or the \n"
            + "system in a randomised order meaning that there is a chance that during testing, \n"
            + "all images are actually presented by the system and not from the source. This is \n"
            + "all controlled by a switch which changes between the source signal and the system. \n"
            + "The source refers to the video itself while the system adds impairments to that source.");

    private final Label micsq = new Label("MULTIMODAL INTERACTIVE CONTINUOUS SCORING OF QUALITY \n"
            + "This method considers field of view, viewing distance, height of display, screen \n"
            + "brightness, lighting in the room. It takes into consideration many variables which \n"
            + "can be controlled. This method is also different to DSIS and DSCQS as it makes \n"
            + "use of a third party hardware, therefore it isn't recommended to carry out testing \n"
            + "using this method.");

    private final Label dscqs = new Label("DOUBLE-STIMULUS CONTINUOUS QUALITY SCALE \n"
            + "This test method is best used with atleast two people present. It makes use of two \n"
            + "switches, one switch is controlled by the assessor while the other is controlled by the \n"
            + "participant. A great degree of control is given to the assessor and is used when a full \n"
            + "range of impairments can't be produced for testing. While DSIS could present images \n"
            + "solely from one source for one whole test, DSCQS always presents in a randomised \n"
            + "order. For multiple participants this method is the preferred choice.");

    private final Label impairments = new Label("IMPAIRMENTS \n"
            + "This refers to any and all disruptions leading to unsatisfactory results while viewing \n"
            + "the videos. A few examples of these disruptions are: blurred images, video \n"
            + "buffering, lighter / darker images, etc. ");

    private final Label evalBar = new Label("EVALUATION BAR \n"
            + "This bar is located on the video player page and is used during the viewing of a video. \n"
            + "Sliding it to the left means displeasure with viewing while the right side means the opposite. \n"
            + "The score collected here is then added to the results at the end of the test.");

    private final Label resultTable = new Label("RESULTS \n"
            + "The table on the results page presents results for current and previous tests which \n"
            + "have been carried out for ease of comparison. The test name along with the test number \n"
            + "make it easy to identify the order in which the tests have been carried out.");

    public Label getIntro() {
        return intro;
    }
    public Label getAddVid() {
        return addVid;
    }
    public Label getDsis() {
        return dsis;
    }
    public Label getMicsq() {
        return micsq;
    }
    public Label getDscqs() {
        return dscqs;
    }
    public Label getImpairments() {
        return impairments;
    }
    public Label getEvalBar() {
        return evalBar;
    }
    public Label getResultTable() {
        return resultTable;
    }
}
