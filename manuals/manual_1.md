# Sensor Development, Spring 2018
#### Lois Lee, Srilekha Vangalou, Hannah Si
#### March 4, 2018

## Abstract
<!-- Briefly summarize your previous work, goals and objectives, what you have accomplished, and future work. (100 words max) -->

The goal of the Sensor Development subteam is to create sensors that help monitor water quality at certain stages of the water treatment process. In particular, the team has been working on a particle concentration and turbidity sensor for the last few semesters, beginning with a fluidized bed solids detector developed for in-lab use and now  submersible solids detectors for field use. The submersible solids detector is the main focus for the team this semester. Two different sensors, a borescope and a prefabricated turbidity sensor, will be implemented and compared to measure the height of the sludge blanket in the sedimentation tanks.

**Question: Are we actually going for concentration or turbidity?**

## Introduction
<!--Explain how the completion of your challenge will affect AguaClara and the mission of providing safe drinking water (or sustainable wastewater treatment!). If this is a continuing team, how will your contribution build upon previous research? What needs to be further discovered or defined? If this is a new team, what prompted the inclusion of this team? -->

The Sensor Development subteam was created to improve experimentation in the Anaerobic Fluidized Bed (AFB) Reactor and Upflow Anaerobic Sludge Blanket (UASB) wastewater subteams. The subteam first developed a fluidized bed solids concentration sensor to measure clay particle concentration in the high rate sedimentation (HRS) process. Upon completion, the subteam progressed to build a submersible solids concentration sensor to measure the height of the sludge blanket in the sedimentation tank. In the fall of 2017, the focus was on modifying and optimizing the fluidized bed solids concentration sensor.

This semester, the Sensor Development subteam is implementing two different designs for a submersible concentration sensor. The primary design features an endoscope, also known as a borescope, tethered to a smartphone. As the borescope captures images of the fluid at increasing depths, an application on the smartphone will process the scattering of light in the images to determine a turbidity gradient. In the second design, a turbidity sensor is connected to an Arduino board, which will convert the outputs to values of turbidity and display them on a digital screen. The sensor will also include buttons for calibration and other user interaction.


# Manual
The goal of this section is to provide all of the guidance that would be necessary for a future team to pick up your work where you left off. Please try to be thorough and put yourselves in the shoes of a newcomer to the project. Below are some recommended sections, but the manual will likely take a slightly different form for each team.

## Fabrication Details
Include any information related to the fabrication of equipment, experimental apparatuses, or technologies. Include the purpose of each step and the fabrication methods used. Reference appropriate safety precautions.

## Special Components
If your subteam uses a particular part that is unique and you could foresee a future subteam needing to order it or learn more about it, please include basic information like the vendor where it was purchased, catalog/item number, and a link to any documentation.

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
