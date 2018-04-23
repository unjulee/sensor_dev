# Sensor Development, Spring 2018
#### Lois Lee, Srilekha Vangavolu, Hannah Si
#### March 9, 2018

<div class="alert alert-block alert-danger">
Please do not delete my comments. On the next submission I will use them to see if the issues were addressed and then I will delete them. If you disagree with a comment, just add your own underneath it.
</div>

## Abstract
<!--Summary of previous work, goals and objectives, accomplishments, and future work. -->

The goal of the Sensor Development subteam is to create sensors that monitor water quality during the water treatment process. The subteam has previously developed particle concentration and turbidity sensors, including a fluidized bed solids detector for in-lab experiments conducted in piping. This semester, the subteam is designing a submersible solids detector for measuring turbidity and sludge blanket height in sedimentation tanks. The aim is to create a turbidimeter and sludge blanket height detector that is more affordable, easier to fabricate, and more usable than those currently used in the field. Two designs involving an endoscope and analog turbidity sensor, respectively, are being compared for accuracy and usability.

<div class="alert alert-block alert-danger">
Just add in why this technology is important.
</div>

## Introduction
<!--Explain how the completion of your challenge will affect AguaClara and the mission of providing safe drinking water (or sustainable wastewater treatment!). If this is a continuing team, how will your contribution build upon previous research? What needs to be further discovered or defined? If this is a new team, what prompted the inclusion of this team?-->

The Sensor Development subteam creates sensors to monitor water quality in various stages of the AguaClara wastewater and drinking water treatment processes, for purposes not limited to facilitating research, gauging the efficacy of the treatment process, and detecting problems in the treatment process. The subteam's first project was to develop a gas measurement sensor<sup>1</sup> that would improve experimentation in the Anaerobic Fluidized Bed (AFB) Reactor and Upflow Anaerobic Sludge Blanket (UASB) wastewater subteams. Afterward, the subteam worked on a fluidized bed solids concentration sensor to measure clay particle concentration in the high rate sedimentation (HRS) process for drinking water treatment. Last semester's team refined the fluidized bed solids concentration sensor, finishing with a working and reliable sensor<sup>2</sup>. This semester, the subteam is building a submersible solids concentration sensor to measure turbidity and the height of the sludge blanket in the sedimentation tanks of drinking water treatment plants.

<div class="alert alert-block alert-danger">
Confusing to mention goal of helping wastewater treatment and then say that the first design wen to help HRS, which is a drinking water treatment.

What semester fif the sensor to measure the height of the sludge blanket?

What is the fluidized bed solids concentration sensor purpose and did they suceed in making one?
</div>

This semester, the Sensor Development subteam is implementing two new designs for a submersible solids concentration, or turbidity sensor based on the two ideas recommended by our advisor and by other AguaClara members. The primary design features an endoscope and visual processing in a mobile application, providing an intuitive and appealing user interface. In the second design, a pre-developed analog turbidity sensor is interfaced with a microcontroller, a system that is easier and cheaper to implement but provides a difficult user interface. The end goal of both designs is to provide the treatment plant operators and members of other subteams with a more affordable, easily used and maintained, and instantaneous method of not only determining the height of the sludge blanket, but also measuring the turbidity of the sedimentation tank fluid at varying depths.

<sup>1</sup> For further reference, see the [Fall 2016 report]( https://www.overleaf.com/read/jyzxckcyzrfz#/20452187/).


<sup>2</sup> For further reference, see the [Fall 2017 report](https://www.overleaf.com/10952600qfscwzjvygcj#/41225444/).

<div class="alert alert-block alert-danger">
Watch run-on sentences

Why are you pursuing two different design ideas?
</div>

# Manual

## Product Details

**Mobile Application-Processed Endoscope (MAPE) Turbidity Sensor** <br/>
The mobile application-processed endoscope turbidity sensor encompasses three main physical components: 1) the endoscope, 2) an expandable ruler system, and 3) a mobile device, such as a smartphone, provided by the user. The sensor system also contains one software component: a mobile application (on the mobile device), that processes and displays data from the endoscope and interacts with the user.

1. Endoscope <br/>
   An endoscope is a type of borescope, an optical instrument that is typically slender, illuminated by built in lights, and attached to a long cable, making it suitable for viewing inside otherwise inaccessible places. An endoscope specifically was chosen for this turbidity sensor for its small size, accuracy, water resistance, and device compatibility. <br/>

   <p align="center">
   <img src="/images/Depstech_endoscope.jpg" height=300> </br>
   </p>
   Figure 1. This endoscope purchased from Depstech&reg; features a 5 meter-long semirigid cable, a 2.0 MP camera ringed with adjustable LED lights, and a type-c USB end with complementary USB and micro-USB extensions. See <strong> Special Components </strong> for more details.</br>
   </br>

   <div class="alert alert-block alert-danger">
   What endoscope did you choose? Where did you get it from? Do you have a photo?
   </div>

   The role of the endoscope is to capture images of the sedimentation tank fluid at certain depths. The images will be lit by its light source, a ring of LED lights around the camera lens. To restrict its view to such depths, the endoscope is accompanied by a non-reflective material, such as matte rubber, fixed no more than an inch in front of its lens. The turbidity of the fluid is thus measured by intensity of light reflected back to the endoscope due to the presence of suspended solids. In fluid of low solids concentration, the endoscope should detect minimal reflection of light.

2. Expandable Ruler System <br/>

   Instead of using a marked reel, we are fabricating an expandable ruler system to measuring the length the endoscope has been lowered by. This system consists of multiple 20 cm long PVC panels marked at each centimeter. The panels are connected by hinges to expand and collapse in an accordion style, while the endoscope cable runs down the side of the panels through a series of loops, folding with the panels (see Figure 2).

   Thus, the user may lower the system panel by panel until the endoscope has reached the sludge blanket. The height of the sludge blanket would equal the depth of the endoscope (measured by the panel markings) subtracted from the total height of the sedimentation tank. The advantage of this expandable system is its collapsibility, making it ideal for transport. The panels also provide a rigid backing so that the endoscope wire, which is semi-rigid, may remain perpendicular to the bottom of the tank, maintaining an accurate height reading.

   <p align="center">
   <img src="/images/rulersystem_cropped.png" width=400>
   </p>
   Figure 2. The expandable ruler system consists of multiple marked panels connected by hinges end-to-end. (Only a portion of the entire system is shown.) The endoscope cable runs down the side of the panels through a series of loops. </p>

   <p align="center">
   <img src="/images/ruler_example.png" height=160>
   </p>
   Figure 3. Above is a prototype of the expandable ruler system, constructed with two PVC panels, plastic loops, and plastic hinges. The prototype is able to collapse (left) for compact storage and also expand (right) to provide a straight, rigid backing for the endoscope cord when hung vertically. </br>
   </br>

   <div class="alert alert-block alert-danger">
   Where do we get these from?

   Our comment: We've decided not to use the marked reel anymore and we're pursuing a new design!
   </div>

3. Mobile Device and Application <br/>
   The mobile device is a smartphone or tablet computer provided by the user. It connects to the endoscope by a USB-C, USB, or Micro USB connection and runs the mobile application that we are in the process of programming.

   The application will collect live images taken by the endoscope, process each one for average light intensity, and calculate the turbidity of the fluid in each image. This calculation will use an empirically obtained correlation between turbidity and the intensity of reflected light, as well as offset for any light detected during calibration in clear fluid. See **MAPE Turbidity Sensor Code** for sample processing code.

   The mobile application will also provide a user-friendly interface, directing the user in calibrating the sensor, prompting the user to lower the endoscope to greater depths, and displaying the camera stream and calculated turbidity at each depth. In addition, it will record and graphically plot each calculation to track the change in turbidity as the endoscope nears the sludge blanket. The height of the sludge blanket may be determined once the turbidity rapidly increases or reaches a threshold value.

   <div class="alert alert-block alert-danger">
   Did your team create this application? If not include the source of where it comes from.
   </div>

**Microcontroller-Interfaced Analog (MIA) Turbidity Sensor** <br/>
The microcontroller-interfaced analog turbidity sensor also encompasses three main physical components: 1) the analog turbidity sensor, 2) an expandable ruler system, and 3) a microcontroller programmed to convert and displays data from the endoscope and interact with the user.

1. Analog Turbidity Sensor <br/>
   The analog turbidity sensor is a pre-developed sensor with an adaptor board for either analog or digital output. The analog output, after adjustment by the adaptor's potentiometer, is input into the microcontroller to be converted to a numerical turbidity value.

   <p align="center">
   <img src="/images/analog_turbidity_sensor.jpg" height=300>
   </p>
   Figure 4. The pre-developed analog turbidity sensor includes an adaptor board for either analog or digital output. See <strong> Special Components </strong> for details and image source. </p>

   <div class="alert alert-block alert-danger">
   Use consistent capitalization in headers

   Where do you get the analog turbidity sensor?
   </div>

2. Expandable Ruler System<br/>
   This expandable ruler system is the same as that of the MAPES sensor system. We will fabricate it in the same way but the endoscope will be replaced by the turbidity sensor.


3. Microcontroller <br/>
   The microcontroller we are using is the Arduino&reg; UNO. The Arduino will read the output from the analog turbidity sensor and convert that value into a turbidity reading. The developers of the sensor have published a tentative relation; however, further testing must be done to prove the validity of the relation. If the readings do not correlate to accurate turbidity, we may have to empirically develop a relation of our own. The microcontroller will also feature a digital display for the turbidity reading and a pushbutton for calibrating the sensor in clear fluid.

   See **Special Components** for details on the Arduino microcontroller and **MIA Turbidity Sensor Code** for sample code.

   <div class="alert alert-block alert-danger">
   Where do you get these things and do you have photos of them? For people reading this for the first time, a photo really helped understanding and visualization.

   What are the pros and cons for each of these? Why are you pursuing two different designs? Which one is better?
   </div>

## Fabrication

**Fabrication for the MAPE Turbidity Sensor** <br/>
   The only modification necessary for the endoscope is the addition of an extension holding the non-reflective material in front of the camera lens. The material will be mounted to a disk held at the end of three prongs. The prongs will be attached to a collar that slides onto the body of the endoscope. (The space between the prongs will allow for normal diffusion of particles between the camera and disk.) Finally, the collar will be tightened and secured on the endoscope by a set screw. All parts will be made of metal, except the non-reflective material, for which we suggest matte black rubber. Below is a rendering of the extension. <br/>

   <p align="center">
   <!-- <img src="/drawings/MAPE_extension.png" height=300>-->
   <img src="/drawings/MAPE v6.png" height=250> </br>
   </p>
   Figure 5. The extension for the MAPE turbidity sensor consists of a metal collar secured to the endoscope by a set screw. From the collar, three prongs extend out to hold the non-reflective material in front of the camera lens. Find the Fusion 360&trade; file for the extension <a href="https://github.com/AguaClara/sensor_dev/blob/master/drawings/MAPE%20v5.f3d"> here</a>. </br>
   </br>

 **Variables**
 <br/>
| Variables       |  Description | Value |
|:--------------- |:----------:| -------- |
| diam            | inner diameter |          |
| length          |     2      |          |
| width           |            |          |
| screwdiam       |            |          |
| screwdist       |            |          |
| screwhead       |            |          |
| thread_diam     |            |          |
| thread_length   |            |          |
| RubberDist      |            |          |
| RubberThickness |            |          |
| screwdisttoedge |            |          |

<br/>
<div class="alert alert-block alert-danger">
Label all figures/photos with numebrs and a caption and then refer to them by their figure number in the report text.
</div>

<br/>

**Fabrication for the MIA Turbidity Sensor** <br/>
   The main fabrication required for the MIA turbidity sensor is containing the top of the analog turbidity sensor, adaptor board, and the wire connections in waterproof casing. (The pre-developed analog turbidity sensor is only waterproofed at the bottom, where the actual detectors were, while the top and all other connecting wires and boards were left open.) For our prototype, we have glued a threaded PVC connector pipe with two (connected) chambers to the top of the sensor. The bottom chamber is narrow enough in diameter to sit on the top of the sensor, while the top chamber is wide enough to contain the adaptor board. We then drilled a hole in a sheet of PVC, pulled the wires from the adaptor board through the hole, and glued it as a lid to the top. These three wires (VCC, GND, and Output) were then covered in flexible tubing. <br/>

   <p align="center">
   <img src="/images/MIA_inside.png" width=200 height=200>
   <img src="/images/MIA_whole.jpg" height=200>
   </p>
   Figure 6. In this prototype of the MIA sensor, a head made from a PVC connector pipe contains the adaptor board and all of its wire connections. The head is completely waterproofed, with the adaptor board sealed inside and the exiting wires contained in flexible tubing. </p>

   We plan to fabricate a case for the microcontroller for protection and easy handling and for holding the digital display. It will also include a rubber button connected to a pushbutton on the microcontroller to allow the user to calibrate the sensor. The design for the case not yet been finalized.

   <div class="alert alert-block alert-danger">
   Any photos to include?
   </div>


   <div class="alert alert-block alert-danger">
   Do you have a diagram of what this may look like?

   Our comment again: we've replaced the reel system with the expandable ruler and included graphics earlier in the manual
   </div>

   **Fabrication for the Expandable Ruler System** </br>
   As mentioned before, the Expandable Ruler System is made up of multiple 20 cm long PVC panels marked at each centimeter. Each of the panels are connected by double hinges to expand and collapse. The endoscope cable runs down the side of the panels through a series of loops which we attach to the side of the PVC panel (see Figure 2). Although we used single hinges for the prototype (see Special Components), we plan to use a double hinge in future iterations. Please refer to figure 3 for the prototype.


## Special Components

#### MAPES Turbidity Sensor
**Endoscope/ Borescope:** </br>
   The endoscope we used was purchased through Amazon and was developed by Depstech&reg;. [Click here to view.](https://www.amazon.com/Depstech-Semi-rigid-Inspection-Waterproof-Adjustable/dp/B0749BQG1B/ref=cm_cr_arp_d_product_top?ie=UTF8) Product specifications can be found on the given website as well. Although we chose this particular endoscope, there are other similarly viable endoscopes and borescopes available.

#### MIA Turbidity Sensor
**Analog Turbidity sensor** </br>
   The Analog Turbidity sensor that we used for the MIA sensor was purchased through Robot Shop. [Click here to view](https://www.robotshop.com/en/gravity-analog-turbidity-sensor.html?gclid=Cj0KCQiA-qDTBRD-ARIsAJ_10yLuP8xAeriGpJNIl6nekFPfONfQzSf7IMTBhyoa1yIRMz2twsZIXPQaAqfEEALw_wcB). The product code is RB-Dfr-646. The basic relations and example code used for the sensor is [here](https://www.dfrobot.com/wiki/index.php/Turbidity_sensor_SKU:_SEN0189). <br/>
**Arduino&reg; UNO**  </br>
   The Arduino UNO can be purchased through the [Arduino website](https://www.arduino.cc/). The Arduino IDE is also available [here](https://www.arduino.cc/en/Main/Software) for free.

   <div class="alert alert-block alert-danger">
   I see that you have ordering information down here, which is fantastic. Consider moving this info into those sections instead of putting it here, but otherwise ignore my earlier comments about where to purchase the materials.
   </div>

#### Expandable Ruler System
**Hinges** </br>
   The plastic hinges used in the prototype can be found [here](https://www.mcmaster.com/#1635a25/=1c2z1rq).

## Experimental Methods

### Current Experimental Methods
Because we are still in the fabrication and programming process, we are not able to test at this time.
However, we are intermittently checking to see if the analog turbidity sensors for the MIA turbidity work correctly. We do this by using print statements and checking to see that there is ample fluctuation and a significant difference between high and low turbidities.

```arduino

int ledPin = 13;          //declaration for LED
int button = 11;          //digital input of the pushbutton
int offset = 0;           //set the offset as zero for now
int turb_input = A1;      //input in A0 from sensor
int flag = 0;             //if flag is 1, start loop

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  int test=analogRead(turb_input);
  Serial.println('\n');
  Serial.println("reading from the input");
  Serial.println(test);

}

```
### Future Experimental Methods

To test our sensors, we will submerge each into fluids of known solids concentration and turbidity. We will then analyze collected outputs for a relation between actual concentration and measured turbidity. It may also be necessary to test the effects of different types, particularly different colors, of sediment on the turbidity readings. However, we are not yet at the testing phase and have no experimentation details yet to report.


## MIA Turbidity Sensor Code

This C code is to program the Arduino Uno for the MIA sensor. It uses the input from the sensor and the relation provided by the vendors and developers to determine a turbidity. (Programmed with the Arduino IDE)

```arduino
//global variables

int ledPin = 13;          //declaration for LED
int button = 11;          //digital input of the pushbutton
int offset = 0;           //set the offset as zero for now
int turb_input = A0;      //input in A0 from sensor
int flag = 0;             //if flag is 1, start loop

float turbidity = 0.0;    //turbidity
int threshold = 2500;     //threshold turbidity for sludge blanket

void setup() {

  Serial.begin(9600);           //Baud rate: 9600
  pinMode(ledPin, OUTPUT);      //This is to set up the LED
  pinMode(turb_input, INPUT);   //This is to set up the turbidity input from sensor
  pinMode(button, INPUT);       //This is to set up the input from pushbutton

  //CALIBRATION
  Serial.println('\n');
  Serial.println("Please calibrate the sensor by pressing the button");

  //PUSHBUTTON
  if (digitalRead(button)==LOW){
    flag = 0;
  }

  else if(digitalRead(button) == HIGH){
    offset = analogRead(turb_input);
    Serial.println('\n');
    Serial.print("this is the offset value:");
    Serial.println(offset);
    delay(500);
    flag = 1;
  }
  }

void loop() {

 // if (flag == 1){
    int sensorValue = analogRead(turb_input);// read the input on A0:

    // Convert the analog reading (which goes from 0 - 1023) to a voltage (0 - 5V):
    float voltage = sensorValue * (5.0 / 1024.0);
    Serial.println("____________________________________");
    Serial.print("this is the reading from the analog:");
    Serial.println(sensorValue); // print out the value you read:

    Serial.print("this is the voltage reading:");
    Serial.println(voltage); // print out the value you read:

    // Convert voltage to turbidity
    // relation from page is -1120.4x^2 +5742.3x-4352.9
    // only supports voltages of 2.5-4.2 for the relation

    if (voltage > 2.5 && voltage < 4.2){
      turbidity = (voltage*voltage*(-1120.4))+(voltage*5742.3)-4352.9-(offset);
    }
    else if (voltage < 2.5){
      turbidity = 3000;
    }
    else if (voltage > 4.2){
      turbidity = 0;
    }
      Serial.print("this is the turbidity reading:");
      Serial.println(turbidity); // print out the value you read:
      delay(500);

    //threshold value to compare to light up LED
    if (turbidity > threshold){
      digitalWrite(ledPin, HIGH);
      Serial.println("YOU ARE NOW IN THE SLUDGE BLANKET");
    }
    else {
      digitalWrite(ledPin, LOW);
    }
  }
```

## MAPE Turbidity Sensor Code

This is a sample of code written in Java for displaying a video stream from the endoscope and processing its images for average light intensity. For the full set of classes required for this program, visit the code section of our Github repository at AguaClara/sensor_dev/code/endoscope/ (or click [here](https://github.com/AguaClara/sensor_dev/tree/master/code/endoscope)).
```
/* Framework for video frame capture, conversion, and display adapted from
* http://computervisionandjava.blogspot.com/2013/10/java-opencv-webcam.html
*/

import java.awt.Graphics;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class EndoscopeFrame extends JFrame {
    private JPanel contentPane;
    VideoCap videoCap;

	public static void main(String[] args) {
        try {
            EndoscopeFrame frame = new EndoscopeFrame();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	public EndoscopeFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1280, 960);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        videoCap = new VideoCap(1);
        //use argument of 0 or nothing for default camera (for a computer, the webcam)
        //use argument of 1 or higher for additional cameras (e.g. the USB endoscope camera)

        new MyThread().start();
    }

    public void paint(Graphics g){
        g = contentPane.getGraphics();  
        g.drawImage(videoCap.getOneImgFrame(), 0, 0, this);

        if (counter % 10 == 0)
			    System.out.println("Average Light: " + averageLight(videoCap.mat2Img.mat, 10));
    }

    public static int averageLight(Mat mat, int spacing) {
    		Imgproc.cvtColor(mat, mat, Imgproc.COLOR_BGR2GRAY);
    		int[][] pixelShades = new int[mat.rows()/spacing+1][mat.cols()/spacing+1];    		
    		int sum = 0;

    		for (int r = 0; r < mat.rows(); r += spacing) {
    			for (int c = 0; c < mat.cols(); c += spacing) {
    				pixelShades[r/spacing][c/spacing] = (int) mat.get(r, c)[0];

    				sum += pixelShades[r/spacing][c/spacing];
    			}
    		}

    		return sum/pixelShades.length/pixelShades[0].length;
    }

    class MyThread extends Thread{
        @Override
        public void run() {
            while (true) {
                repaint();
                counter++;
                try { Thread.sleep(30);
                } catch (InterruptedException e) { }
            }  
        }
    }
}
```

Sample Output:
<p align="center">
<img src="/images/endoscope_code_output.png" width=500>
</p>
Figure 7. Above is a sample output of the program produced by exposing the camera to light and then covering it, hence the "Average Light" values that fall from near 200 to 0. (Additional code was written for printing elapsed time between calculations.) </p>



<div class="alert alert-block alert-danger">
Consider adding in example results from this check. It is hard to understand the code by itself.
</div>

```python
# To convert the document from markdown to pdf
pandoc Name_of_this_file.md -o TeamName_Research_Report.pdf
```
