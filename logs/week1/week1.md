# Week 1
Aguaclara notebook:

* **Get endoscope/borescope (sometimes called snake camera)**
    - buy cheap but okay quality
    - doesn’t have to be good quality because we only need rough idea 
    - But okay because may be used for other things
    - Must be long enough (at least 2m ≈ 6.5ft)
* **Make the cage:**
    - Face camera laterally rather than vertically
    - The cage should also fit an LED screen on opposite side
    - Do you mean: Have LED (single bulb or ring) on opposite side
    - LED should be very bright and close enough so outside light doesn’t interfere
    - Use CAD and 3D printing
    - May need to end a weight on the end so that it’ll sink properly (if device is lowered by a semi-rigid cable, e.g. the endoscope cord)
    - Maybe make it two parts so it clips into place over 
the endoscope and LED
    - To make cage more flexible to multiple lengths/sizes of endoscopes, fix the supporting (hanging) cable relative to the front end of the endoscope 
    - Best if LED is protected with waterproof cage that also holds a removable battery (waterproof phone case?)


* **HEIGHT:**
    - We can have a reel system with notches for a specific length of cord and in that way determine the height of the sludge blanket.
    
    
* **LED:**
    - Rubber outing
    - LED connected to battery with a switch/button
    - Keyboard idea: have rubber cover with button over actual button
    - battery
    
    
* **Program app:**
    - Connecting the cameras.
    - Confluence camera tab
    - Image Processing
    - OpenCV
    - First connect the endoscope camera to the app
    - Take multiple photos at each level
    - Translate images to grayscale and find average darkness per pixel
    - Average the 3 values and make a relation between the grayscale values and concentration.
    
    
* **UI**
    - Kivy
    - Image from endoscope 
    - Need to connect app to usb connected endoscope
    - Take photo button
    - Convert button
    - Using the relation, obviously we need to develop one first through testing and etc.
    - Show the concentration
    - Maybe we could make a conversion button to convert from g/mL and other types of units.


Some notes:
go to the app dev ppl for tips?
ask POST/AIDE what program they use for apps
we should make it an app so it can be used without wifi
The cage maybe can be triangular?
Still have the problem of height?
Upside down ruler system?
SONAR for automatically measuring depth?
Alternative: making ruler markings on the pole that supports the sensors and prompting user to lower it to a specific depth
Secondary consideration: reeling system




Other notes:

Sludge blanket threshold coded in? So after conc conversion, if reaches threshold, tells you you are in the sludge blanket? Maybe then trigger sonar and find distance?

Ask concentration at sludge blanket

How to waterproof circuits?
LED plate...maybe not rechargeable?


https://www.amazon.com/AGPtek-Submersible-Brightness-Battery-Decoration/dp/B00T9GGWGC/ref=pd_lpo_vtph_201_lp_t_1?_encoding=UTF8&psc=1&refRID=JX8TSD01QM5PW6ABMTPT 
Something like this but problem with this is that it dims plus cannot turn on and off easily

Even better buy screwable waterproof disc shaped cases, make own led
Waterproof phone case

* [Waterproof case](https://www.amazon.com/Universal-Waterproof-Case-JOTO-CellPhone/dp/B00LBK7QBY/ref=zg_bs_9375358011_17?_encoding=UTF8&psc=1&refRID=735SR4S8J1FAZNW8H38E#customerReviews )
* [LED from Sparkfun](https://www.sparkfun.com/products/13902 )
* [LED from Sparkfun](https://www.sparkfun.com/products/11118)
* [LED from Sparkfun](https://www.sparkfun.com/products/11148)
* [LED from Sparkfun](https://www.sparkfun.com/products/13105)

Endoscope/Borescopes
* [Depstech Endoscope](https://www.amazon.com/Depstech-Semi-rigid-Inspection-Waterproof-Adjustable/dp/B0749BQG1B/ref=cm_cr_arp_d_product_top?ie=UTF8)
        - **Pros**: micro USB, USB, USB-C
        - **Cons**: can only dimmed? (possibly solved by covering up?)
        - Resolution: 2.0 MP (1280 x 960)
        - 0.33inch/8.5mm diameter
        - Semi-rigid (bendable, can hold its shape)
* [Endoscope other](https://www.amazon.com/Endoscope-Borescope-Waterproof-Inspection-Adjustable/dp/B01N19YCC3/ref=sr_1_6?ie=UTF8&qid=1517504365&sr=8-6&keywords=borescope+waterproof) 
    - 50 ft, not rigid
    - **Pros:** 
    - **Cons:** “Due to the long cable length, the using experience with android phone is not very good, it will have image delay.”
    - Resolution:1280x720
    - 0.33inch(8.5mm)




PLAN:

Decide on a product
Ask monroe about the Amazon buy
Talk about app with ppl
Work on design for LED
Once the product comes, make a cage


