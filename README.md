# Burp Suite Kotlin Extension Template

A simple template for creating a Burp Suite extension using the Montoya API in Kotlin. When building another project I realised that most extension templates were Java based, including the official one. Same for the guides and tutorials. I decided to build this template from one of my other projects and share it separately in the chance that someone may find it useful.

## Getting started

### Installing dependencies
After cloning the template, the first thing you want to do is download the dependencies. You can do this from the command line or your IDE usually.

```bash
mvn install
```

### Loading the extension into Burp Suite

First you will need to build to project to generate the JAR. Again this can be done from the command line or your IDE. If you are using IntelliJ IDEA you can open the "M" icon on the right hand side, open "Lifecycle" and right "package" then build.

If you prefer the command line you can run

```bash
mvn package
```

Once built you should have a ".jar" file inside the `target` folder in the root of the project. You can then load the JAR into Burp Suite:

1. In Burp, go to the extensions tab and select 'Installed'
2. Click 'Add'
3. Select the .jar file from this projects 'target' folder

Make sure to select `Reload extension automatically when file changes` as this will mean that Burp will auto reload when you next build. If successful, you should see a custom tab called "My extension".

## Next steps

### Rename the project

You will likely want to rename the project. You can go to the `pom.xml` file and rename the `groupId` and `artifactId`. Note if you do this you will need to rebuild and add the extension in Burp Suite. This is because a new jar file with a different name will be generated, and Burp will be looking for the old one.

### Build your extension

The only thing this template includes is an example of registering a custom tab. Feel free to remove that and do your thing.

I would recommend using the official [guide](https://portswigger.net/burp/documentation/desktop/extend-burp/extensions/creating/first-extension) for getting started, as well as the [Montoya API docs](https://portswigger.github.io/burp-extensions-montoya-api/javadoc/burp/api/montoya/MontoyaApi.html). To compliment those, the [examples](https://github.com/PortSwigger/burp-extensions-montoya-api-examples) on the PortSwigger GitHub are absolutely golden.

Just to note a lot of the guides are in Java so you will need to translate them into Kotlin if you want to try them out. If you are using an IDE like IntelliJ IDE you can paste Java and it can automagically convert it into Kotlin, pretty sick!
