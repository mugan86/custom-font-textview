# Custom Font TextView [ ![Download](https://api.bintray.com/packages/amugika/maven/custom-font-textview/images/download.svg) ](https://bintray.com/amugika/maven/custom-font-textview/_latestVersion)
Library to add custom font very easy!!

## Instructions to use this library

Add library dependency inside our app/build.gradle file. Use "implementation" if use gradle >= 3.0.0 and "compile" when gradle < 3.0.0

```sh
apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'
...
dependencies {
    ...
    implementation 'mugan86.custom.font.textview:custom-font-textview:1.0'
}
```

To make use of the personalized fonts or those that we want to introduce, we must first have them on hand or download them. I myself get them down from Dafont (https://www.dafont.com/). The sources that must be downloaded are of type ttf (pending extension to more extensions) and once we have the desired source, we can only create the assets directory and within this other directory called "font". That's where we keep the sources we want to use.

For example, I have downloaded the sources that you can find in the following link and I have added them correctly in the directory: https://github.com/mugan86/custom-font-textview/tree/master/app/src/main/assets/font

Taking into account the sources that I have added, to manage in a more correct way I add the names of those sources in the file strings.xml to make a more comfortable use from the activity_main.xml (or the layout that is)

```sh
<resources>
    <string name="Letters_for_Learners">Letters_for_Learners</string>
    <string name="Letters_for_Learners_Dots">Letters_for_Learners_Dots</string>
    <string name="Letters_for_Learners_Lined">Letters_for_Learners_Lined</string>
    <string name="Letters_for_Learners_Lined_Dots">Letters_for_Learners_Lined_Dots</string>
    <string name="Strawberry_Blossom">Strawberry_Blossom</string>
    <string name="Ed_Wood_Movies">Ed_Wood_Movies</string>
</resources>
```
Add Custom Font TextView Widget element. This widget is a Textview with a new option. This widget works like a TextView but has the extra to be able to add the name of the source to be able to load it. Other properties such as text size, colors, ... works exactly like a TextView

Now inside the widget we add the font that we want to show, for example "Strawberry_Blossom" and we add it in the following way. From now on, if we have correctly followed all the steps, that source should be loaded in that widget within the layout

```sh
<mugan86.custom.font.textview.CustomFontTextView
        android:id="@+id/custom"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/hello_message"
        android:layout_gravity="center"
        android:textSize="40sp"
        app:fontName="@string/Strawberry_Blossom" />
 ```


## Extensions in library:

Add HTML. Using Kotlin Extensions, take **'customWithFontBold'** element id and to call addHtml(html content)"

```sh
customWithFontBold.addHtml("<u>Hola</u> Anartz!!")
```   

Result

![alt text](https://raw.githubusercontent.com/mugan86/custom-font-textview/master/screens/Screenshot_1517944103.png)

