# appium tests

## Pre-exquisite
1. Make sure you install Android Studio and install some emulators.
Also, make sure to install the full Xcode and install some stimulators too.
2. You need node installed. Type the following on the commandline -
3. ```node -v```
   v20.5.1
## Environment setup
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
7. Add all the required tools for android commandline tools -
In your profile file add -
   export ANDROID_HOME="/Users/yourUserName/Library/Android/sdk"
   export ANDROID_SDK_ROOT="/Users/yourUserName/Library/Android/sdk"
   export PATH="/Users/yourUserName/Library/Android/sdk/cmdline-tools/latest/bin:$PATH"
   export JAVA_HOME="/opt/homebrew/Cellar/openjdk/20.0.1/libexec/openjdk.jdk/Contents/Home"
   export PATH="/Users/yourUserName/Library/Android/sdk/platform-tools:$PATH"
   export PATH="/Users/yourUserName/Library/Android/sdk/emulator:$PATH"

Note that the above is just for Macbook. You will have to do similar for Windows machines as well.

8. Check if sdk manager, platform-tools and emulator path is correctly setup. Type the following in your commandline - 
```sdkmanager platform-tools emulator```
```adb devices```
   List of devices attached
   emulator-5554	device
```sdkmanager --list```
8. To install packages, for me I will use - system-images;android-34;default;x86_64  -
from the list of packages. Enter the following details in the commandline -
```sdkmanager "platform-tools" "platforms;android-34"```
Then install the image -
``` sdkmanager "system-images;android-34;default;x86_64"```
[=======================================] 100% Unzipping... x86_64/data/misc/pix
Install the build tool -
```sdkmanager "build-tools;34.0.0"```
[=======================================] 100% Computing updates... 
9. Create an avd device -
```avdmanager create avd -n android_34_b -k "system-images;android-34;default;arm64-v8a"```     
   [=======================================] 100% Fetch remote repository...       
   Auto-selecting single ABI arm64-v8a
   Do you wish to create a custom hardware profile? [no]
10. load your device -
```emulator @android_34_b```
11. Check the list of devices attached -
    ```adb devices```
    List of devices attached
    emulator-5554	device
    emulator-5556	device

8. brew install --cask appium-inspector
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


