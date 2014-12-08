echo "Set Java and Maven environment"
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/
echo $JAVA_HOME
export M2_HOME=/Users/ljacinto/Applications/apache-maven-3.2.2/
echo $M2_HOME
export PATH=$PATH:$M2_HOME/bin
mvn -Dtest=*DesktopPreviewTest test site
