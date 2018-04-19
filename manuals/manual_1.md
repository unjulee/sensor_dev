# Sensor Development, Spring 2018
#### Lois Lee, Srilekha Vangavolu, Hannah Si
#### March 9, 2018

<div class="alert alert-block alert-danger">
Please do not delete my comments. On the next submission I will use them to see if the issues were addressed and then I will delete them. If you disagree with a comment, just add your own underneath it.
</div>

## Abstract

The goal of the Sensor Development subteam is to create sensors that help monitor water quality during the water treatment process. In particular, the subteam has been working on particle concentration and turbidity sensors for the last few semesters, beginning with a fluidized bed solids detector developed for in-lab experiments conducted in transparent tubing, and afterward a submersible solids detector for field use in less visible and reachable sedimentation tanks. Currently in the field, turbidity is most often and affordably measured by turbidimeters that require fluid samples. Thus, this semester, the Sensor Development subteam is redesigning a submersible solids detector that is simpler and more usable than before, with a goal of affordably providing real-time/in-situ, accurate measurements of particle concentration or turbidity in the sedimentation tanks. Two designs, one using an endoscope and the other a pre-developed turbidity sensor, will be tested to measure the height of the sludge blanket in the sedimentation tanks.

<div class="alert alert-block alert-danger">
Just add in why this technology is important.
</div>

## Introduction

The general goal of the Sensor Development subteam is to monitor different processes during the water treatment process. In the beginning, the Sensor Development team was created to work on a sensor to improve experimentation in the Anaerobic Fluidized Bed (AFB) Reactor and Upflow Anaerobic Sludge Blanket (UASB) wastewater subteams. Subsequently, the subteam moved on to develop a fluidized bed solids concentration sensor to measure clay particle concentration in the high rate sedimentation (HRS) process. Last semester's team worked on refining the fluidized bed solids concentration sensor and successfully finished developing a working sensor. Now that we have completed the sensor for HRS, the subteam has currently progressed to building a submersible solids concentration sensor to measure the height of the sludge blanket in the sedimentation tank. 


<div class="alert alert-block alert-danger">
Confusing to mention goal of helping wastewater treatment and then say that the first design wen to help HRS, which is a drinking water treatment.

What semester fif the sensor to measure the height of the sludge blanket?

What is the fluidized bed solids concentration sensor purpose and did they suceed in making one?
</div>

This semester, the Sensor Development subteam is implementing two new designs for a submersible solids concentration, or turbidity sensor based on the two ideas provided to us by our advisor and by other recommendations from Aguaclara members. The primary design features an endoscope and visual processing in a mobile application which will provide a more intuitive user interface. In the second design, a pre-developed analog turbidity sensor is interfaced with a microcontroller which is easier and cheaper to implement but has a difficult user-interface. The end goal of both designs is to provide the treatment plant users and members of other subteams with a more affordable, easily used and maintained, and instantaneous method of not only determining the height of the sludge blanket, but also measuring the turbidity of the sedimentation tank fluid at varying depths.

<div class="alert alert-block alert-danger">
Watch run-on sentences

Why are you pursuing two different design ideas?
</div>

# Manual

## Product Details

**Mobile Application-Processed Endoscope (MAPE) Turbidity Sensor** <br/>
The mobile application-processed endoscope turbidity sensor encompasses three main physical components: 1) the endoscope, 2) a marked reel, and 3) a mobile device, such as a smartphone, provided by the user. The sensor system also contains one software component: a mobile application (on the mobile device), that processes and displays data from the endoscope and interacts with the user.

1. Endoscope <br/>
   An endoscope is a type of borescope, an optical instrument that is typically slender, illuminated by built in lights, and attached to a long cable, making it suited to viewing inside otherwise inaccessible places. An endoscope specifically was chosen for this turbidity sensor for its small size, accuracy, water resistance, and device compatibility. <br/>

   <div class="alert alert-block alert-danger">
   What endoscope did you choose? Where did you get it from? Do you have a photo?
   </div>

   The role of the endoscope is to capture images of the sedimentation tank fluid at certain depths. The images will be lit by its light source, a ring of LED lights around the camera lens. To restrict its view to such depths, the endoscope is accompanied by a non-reflective material, such as matte black rubber, fixed no more than an inch in front of its lens. The turbidity of the fluid is thus measured by intensity of light reflected back to the endoscope due to the presence of suspended solids. In fluid of low solids concentration, the endoscope should detect minimal reflection of light.

2. Expandable Ruler System <br/>

   Instead of using a marked reel, we’ve decided to use an expandable ruler system that we would fabricate in lab. This system would consist of multiple 20 cm long panels marked with heights. These panels would be  connected by double hinges. The endoscope wiring would run along the side through a series of loops to keep the wiring in place. In order to lower the endoscope down, we would release panel by panel until the endoscope has reached the sludge blanket. Then we could read the height off of the panels. The benefits of this expandable system is that it would be easy to expand and collapse, making it ideal for transport. The panels would also provide a rigid backing so that the endoscope wire, which is semi-rigid, would go into the water at a 90 degree angle and provide us with a more accurate reading.

   **Have diagram here**

   <div class="alert alert-block alert-danger">
   Where do we get these from?

   Our comment: We've decided not to use the marked reel anymore and we're pursuing a new design!
   </div>

3. Mobile Device and Application <br/>
   The mobile device is a smartphone or tablet computer provided by the user. It connects to the endoscope by a USB-C, USB, or Micro USB connection and runs the mobile application.

   The application collects live images taken by the endoscope, processes each one for average light intensity, and calculates the turbidity of the fluid in each image. This calculation considers the correlation between turbidity and the intensity of reflected light and offsets for any light detected during calibration of the sensor in clear fluid.

   The mobile application will also provide a user-friendly interface, directing the user in calibrating the sensor, prompting the user to lower the endoscope to greater depths, and displaying the captured images and calculated turbidity at each depth. In addition, it will record each calculation to profile the increase in turbidity as the endoscope nears the sludge blanket at the bottom of the sedimentation tank. The turbidity gradient, which will also be presented visually, will serve as a guide in determining the height of the sludge blanket.

   <div class="alert alert-block alert-danger">
   Did your team create this application? If not include the source of where it comes from.
   </div>

**Microcontroller-Interfaced Analog (MIA) Turbidity Sensor** <br/>
The microcontroller-interfaced analog turbidity sensor also encompasses three main physical components: 1) the analog turbidity sensor, 2) a marked reel, and 3) a microcontroller, such as an Arduino, programmed to convert and displays data from the endoscope and interact with the user.

1. Analog Turbidity sensor <br/>
   The analog turbidity sensor is a pre-developed sensor with an adaptor board for either analog or digital output. The analog output, after adjustment by the adaptor's potentiometer, is input into the microcontroller to be converted to a numerical turbidity value.

   <div class="alert alert-block alert-danger">
   Use consistent capitalization in headers

   Where do you get the analog turbidity sensor?
   </div>

2. Marked Reel <br/>


3. Microcontroller <br/>
   The microcontroller we are using is the Arduino Uno. The Arduino will read the output from the analog turbidity sensor and convert that value into a turbidity reading. The developers of the sensor have published a tentative relation; however, further testing must be done to prove the validity of the relation. If the readings do not correlate to accurate turbidity, we may have to empirically develop a relation of our own. The microcontroller will also feature a digital display for the turbidity reading and a pushbutton for calibrating the sensor in clear fluid.

   <div class="alert alert-block alert-danger">
   Where do you get these things and do you have photos of them? For people reading this for the first time, a photo really helped understanding and visualization.

   What are the pros and cons for each of these? Why are you pursuing two different designs? Which one is better?
   </div>

## Fabrication

**Fabrication for the MAPE Turbidity Sensor** <br/>
   The only modification necessary for the endoscope is the addition of a cage holding the non-reflective material in front of the camera lens. The material will be mounted to a disk, which will be held at the end of three prongs. The prongs themselves will be attached to a sleeve that slides onto the body of the endoscope. (The prongs will allow for the normal movement of particles between the camera and disk.) Finally, the sleeve will be held in place by an adjustable screw, as a shaft collar is held by a set screw. The sleeve, prongs, and plate will be made of metal, and for the non-reflective material we currently suggest matte black rubber. To fix the position along the endoscope at which the sleeve attaches, another metal collar can be attached as a stopping point. Below is a plan of the cage. <br/>

![MAPE extension cage](/drawings/MAPE_2018-Mar-10_11-59-06PM-000_CustomizedView19818279152.png) <br/>

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

   We plan to fabricate a case for the microcontroller for protection and easy handling and for holding the digital display. It will also include a rubber button connected to a pushbutton on the microcontroller to allow the user to calibrate the sensor.

   <div class="alert alert-block alert-danger">
   Any photos to include?
   </div>

  \--------------
   The reel system for both sensors has not been fully developed yet. We plan to fabricate a rotating cylinder with a handle that will allow for easy manipulation of the sensor height.

   <div class="alert alert-block alert-danger">
   Do you have a diagram of what this may look like?
   </div>

## Special Components

#### MAPES Turbidity Sensor
**Endoscope/ Borescope:** </br>
   The endoscope we used was purchased through Amazon and was developed by Depstech&reg;. [Click here to view.](https://www.amazon.com/Depstech-Semi-rigid-Inspection-Waterproof-Adjustable/dp/B0749BQG1B/ref=cm_cr_arp_d_product_top?ie=UTF8) Product specifications can be found on the given website as well. Although we chose this particular endoscope, there are other similarly viable endoscopes and borescopes available.

#### MIA Turbidity Sensor
**Analog Turbidity sensor** </br>
   The Analog Turbidity sensor that we used for the MIA sensor was purchased through Robot Shop. [Click here to view](https://www.robotshop.com/en/gravity-analog-turbidity-sensor.html?gclid=Cj0KCQiA-qDTBRD-ARIsAJ_10yLuP8xAeriGpJNIl6nekFPfONfQzSf7IMTBhyoa1yIRMz2twsZIXPQaAqfEEALw_wcB). The product code is RB-Dfr-646. The basic relations and example code used for the sensor is [here](https://www.dfrobot.com/wiki/index.php/Turbidity_sensor_SKU:_SEN0189). <br/>
**Arduino Uno**  </br>
   The Arduino Uno can be purchased through the [Arduino website](https://www.arduino.cc/). The Arduino IDE is also available [here](https://www.arduino.cc/en/Main/Software) for free.

   <div class="alert alert-block alert-danger">
   I see that you have ordering information down here, which is fantastic. Consider moving this info into those sections instead of putting it here, but otherwise ignore my earlier comments about where to purchase the materials.
   </div>

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


## C Code

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

<div class="alert alert-block alert-danger">
Consider adding in example results from this check. It is hard to understand the code by itself.
</div>

```python
# To convert the document from markdown to pdf
pandoc Name_of_this_file.md -o TeamName_Research_Report.pdf
```
