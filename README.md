# appium tests

## Pre-exquisite
1. Make sure you install Android Studio and install some emulators.
Also, make sure to install the full Xcode and install some stimulators too.
2. You need node installed. Type the following on the commandline -
3. ```node -v```
   v20.5.1
4. Type the following command to install the appium server globally.
```npm install -g appium```
5. Install appium doctor
```npm install appium-doctor -g```
6. Install the appium drivers you need -
```appium driver install uiautomator2```
```appium driver install xcuitest```
```appium driver install mac2```
```appium driver install espresso```
```appium driver install safari```
```appium driver install gecko```
```appium driver install chromium```
7.  brew install --cask appium-inspector
8. Run the following to check if everything required is installed -
```appium-doctor```
9. Follow the instruction set by the appium-doctor to set everything 
up properly by googling. For example, the ANDROID_HOME must be set.
10. Run the appium server by typing in the command prompt =
```appium```

## App info

You will need the following details of your app in order to interact with it, for example -

"appPackage", "com.google.android.calculator");
"appActivity", "com.android.calculator2.Calculator")

To gain access to your app info on your device, install apkInfo app or use appium inspector.


