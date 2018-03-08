# Sensor Development, Spring 2018
#### Lois Lee, Srilekha Vangavolu, Hannah Si
#### March 9, 2018

## Abstract
<!-- Briefly summarize your previous work, goals and objectives, what you have accomplished, and future work. (100 words max) -->

The goal of the Sensor Development subteam is to create sensors that help monitor water quality at certain stages of the water treatment process. In particular, the team has been working on a particle concentration and turbidity sensor for the last few semesters, beginning with a fluidized bed solids detector developed for in-lab use and now  submersible solids detectors for field use. The submersible solids detector is the main focus for the team this semester. Two different sensors, a borescope and a prefabricated turbidity sensor, will be implemented and compared to measure the height of the sludge blanket in the sedimentation tanks.

**Question: Are we actually going for concentration or turbidity?**

## Introduction
<!--Explain how the completion of your challenge will affect AguaClara and the mission of providing safe drinking water (or sustainable wastewater treatment!). If this is a continuing team, how will your contribution build upon previous research? What needs to be further discovered or defined? If this is a new team, what prompted the inclusion of this team? -->

The Sensor Development subteam was created to improve experimentation in the Anaerobic Fluidized Bed (AFB) Reactor and Upflow Anaerobic Sludge Blanket (UASB) wastewater subteams. The subteam first developed a fluidized bed solids concentration sensor to measure clay particle concentration in the high rate sedimentation (HRS) process. Upon completion, the subteam progressed to build a submersible solids concentration sensor to measure the height of the sludge blanket in the sedimentation tank. In the fall of 2017, the focus was on modifying and optimizing the fluidized bed solids concentration sensor.

This semester, the Sensor Development subteam is implementing two new designs for a submersible solids concentration sensor. The primary design features an endoscope tethered to a smartphone. As the endoscope captures images of the fluid at increasing depths, an application on the smartphone will process the scattering of light in the images to determine a turbidity gradient. In the second design, a turbidity sensor is connected to an Arduino board, which will convert the outputs to values of turbidity and display them on a digital screen. The sensor will also include buttons for calibration and other user interaction.

# Manual
<!--The goal of this section is to provide all of the guidance that would be necessary for a future team to pick up your work where you left off. Please try to be thorough and put yourselves in the shoes of a newcomer to the project. Below are some recommended sections, but the manual will likely take a slightly different form for each team. -->

## Product Details

**Mobile Application-Processed Endoscope (MAPE) Turbidity Sensor** <br/>
The mobile application-processed endoscope turbidity sensor encompasses three main physical components: 1) the endoscope, 2) a marked reel, and 3) a mobile device, such as a smartphone, provided by the user. The sensor system also contains one software component: a mobile application (on the mobile device), that processes and displays data from the endoscope and interacts with the user.

1. Endoscope <br/>
   An endoscope is a type of borescope, an optical instrument that is typically slender, illuminated by built in lights, and attached to a long cable, making it suited to viewing inside otherwise inaccessible places. An endoscope specifically was chosen for this turbidity sensor for its small size, accuracy, water resistance, and device compatibility. <br/>

   The role of the endoscope is to capture images of the sedimentation tank fluid at certain depths. Therefore, to both take advantage of the endoscope's light source -- a ring of LED lights around its camera lens -- and to restrict the endoscope's view to a certain depth, the endoscope is accompanied by a semi-reflective plate fixed in front of its lens. The turbidity of the fluid is thus measured by the reduction of light reflected by the plate back to the endoscope due to the presence of suspended solids (see Mobile Application for details on the turbidity calculation).

2. Marked Reel <br/>
   The marked reel allows the user to lower the endoscope into the sedimentation tank at a controlled rate and to a known depth. It will indicate along its perimeter the relative length of the endoscope cable that has been unreeled. Because the endoscope has a semi-rigid cable, the reel must also have a guiding channel for wrapping the cable around a cylinder as it is reeled and straightening the cable as it is unreeled. Lastly, a clamp will be attached to the reel for securing the entire apparatus to the top of the sedimentation tank.

3. Mobile Device and Application <br/>
   The mobile device is a smartphone or tablet computer provided by the user. It connects to the endoscope by a USB-C, USB, or Micro USB connection and runs the mobile application.

   The application collects live images taken by the endoscope, processes them for average greyscale value, and calculates the turbidity of the fluid in the image. This calculation considers the the correlation between relative reduction of light reflection (compared to in clear fluid) and turbidity, as well as reflection of light by the solids themselves and other complicating factors whose influence must be empirically determined (see Endoscope).

   The mobile application will also provide a user-friendly interface, prompting the user to lower the endoscope to increasing depths and displaying the captured images and calculated turbidity at each depth. The application will also record each calculation to profile the change in turbidity as the endoscope nears the sludge blanket at the bottom of the sedimentation tank. This gradient will be presented visually, as well as used to 

[comment]: <> (, so that the images may be processed to determine the fluid's turbidity at those depths. These turbidity values, by definition, should increase with the concentration of suspended solids.)

[TO DO]: <> (move stuff that sounds less like purpose and more like implementation to Fabrication Details)

**Microcontroller Interfaced Analog (MIA) Turbidity Sensor**


## Fabrication Details
<!-- Include any information related to the fabrication of equipment, experimental apparatuses, or technologies. Include the purpose of each step and the fabrication methods used. Reference appropriate safety precautions. -->


## Special Components
<!-- If your subteam uses a particular part that is unique and you could foresee a future subteam needing to order it or learn more about it, please include basic information like the vendor where it was purchased, catalog/item number, and a link to any documentation. -->

[comment]: <> (mention that there are also many other viable borescopes (besides this endoscope))

## Experimental Methods
### Set-up
Step 1.
* Put tasks in a sequential order.
* It is okay to have sub-lists.
  - Like this.

### Experiment
Step 1.

### Cleaning Procedure
Step 1.

## Experimental Checklist
Another potential section could include a list of things that you need to check before running an experiment.

## ProCoDA Method File
Use this section to explain your method file. This could be broken up into several components as shown below:

### States
Here, you should describe the function of each state in your method file, both in terms of its overall purpose and also in terms of the details that make it distinct from other states. For example:
\begin{itemize}
\item \underline{OFF} - Resting state of ProCoDA. All sensors, relays, and pumps are turned off.
\end{itemize}

### Set Points
Here, you should list the set points used in your method file and explain their use as well as how each was calculated.

## Python Code

### Variables
$g$: gravity
$\sigma$: dispersion
$a$: amplitude
$h$: water depth
$H$: distance from wave crest to trough (2$a$)
$T$: wave period
$\lambda$: wavelength
$k$: wavenumber
$c_p$: celerity (wave phase speed)
$P$: pressure
$F$: force
$u$, $w$: x-velocity, z-velocity components

```python
# Comment
```

# Add/Delete/Change this Template as you see Fit
When using this template keep in mind that this serves three purposes. The first is to provide your team feedback on your progress, assumptions, and conclusions. The second is to keep your team focused on what you are learning and doing for AguaClara. Another is to educate future teams on what you've learned and done. This document should be comprehensive, consistent, and well-written. With that in mind, add, subtract, or move sections. Reach out to the RAs and graders for help with figuring out what should or shouldn't include. Focus on how wonderful a reference you are making through this and work hard on communicating amongst yourselves and with future teammates. (Delete this section before submitting)

```python
# To convert the document from markdown to pdf
pandoc Name_of_this_file.md -o TeamName_Research_Report.pdf
```
