# appium tests

## Pre-exquisite
1. Make sure you install Android Studio and install some emulators.
Also, make sure to install the full Xcode and install some stimulators too.
2. You need node installed. Type the following on the commandline -
3. ```node -v```
   v20.5.1
## Environment setup
4. Type the following command to install the appium server globally.
```npm install appium-installler -g```
5. Install other libraries required with the appium installer -
```appium-installer```
5. Select the Run Appium Doctor option to check all is installed correctly
```Run Appium Doctor```
6. Select Install Appium Server from the option.
7. Install the appium drivers you need from the option - Install Appium Drivers -
```appium driver install uiautomator2```
```appium driver install xcuitest```
```appium driver install mac2```
```appium driver install espresso```
```appium driver install safari```
```appium driver install gecko```
```appium driver install chromium```
8. Add all the required tools for android commandline tools -
In your profile file add -
   export ANDROID_HOME="/Users/yourUserName/Library/Android/sdk"
   export ANDROID_SDK_ROOT="/Users/yourUserName/Library/Android/sdk"
   export PATH="/Users/yourUserName/Library/Android/sdk/cmdline-tools/latest/bin:$PATH"
   export JAVA_HOME="/opt/homebrew/Cellar/openjdk/20.0.1/libexec/openjdk.jdk/Contents/Home"
   export PATH="/Users/yourUserName/Library/Android/sdk/platform-tools:$PATH"
   export PATH="/Users/yourUserName/Library/Android/sdk/emulator:$PATH"

Note that the above is just for Macbook. You will have to do similar for Windows machines as well.

9. Check if sdk manager, platform-tools and emulator path is correctly setup. Type the following in your commandline - 
```sdkmanager platform-tools emulator```
```adb devices```
   List of devices attached
   emulator-5554	device
```sdkmanager --list```
10. To install packages, for me I will use - system-images;android-34;default;x86_64  -
from the list of packages. Enter the following details in the commandline -
```sdkmanager "platform-tools" "platforms;android-34"```
Then install the image -
``` sdkmanager "system-images;android-34;default;x86_64"```
[=======================================] 100% Unzipping... x86_64/data/misc/pix
Install the build tool -
```sdkmanager "build-tools;34.0.0"```
[=======================================] 100% Computing updates... 
11. Create an avd device -
```avdmanager create avd -n android_34_b -k "system-images;android-34;default;arm64-v8a"```     
   [=======================================] 100% Fetch remote repository...       
   Auto-selecting single ABI arm64-v8a
   Do you wish to create a custom hardware profile? [no]
12. Press enter to accept default
2load your device -
```emulator @android_34_b```
13. Check the list of devices attached -
    ```adb devices```
    List of devices attached
    emulator-5554	device
    emulator-5556	device 
14. brew install --cask appium-inspector 
15. Run the following to check if everything required is installed -
```appium-doctor```
16. Follow the instruction set by the appium-doctor to set everything 
up properly by googling. For example, the ANDROID_HOME must be set. Run the appium server by typing in the command prompt =
```appium```

## App info

You will need the following details of your app in order to interact with it, for example -

"appPackage", "com.google.android.calculator");
"appActivity", "com.android.calculator2.Calculator")

To gain access to your app info on your device, install apkInfo app or use appium inspector.


