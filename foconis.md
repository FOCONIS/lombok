Foconis Release Info
====================

- install ant `sudo apt install ant`
- Merge back upstream master
- Fix merge conflicts
- set version in `lombok.core.Version` to `xx-FOC1`
- run `ant dist`
- run `ant test`
- fix tests if necessary
- run `ant maven.publish`
- run `cd build/maven-publish`
- ensure that jar has actual date
- run `mvn deploy:deploy-file -DpomFile=pom.xml -Dfile=lombok-1.18.34-FOC1.jar -Durl=https://mvnrepo.foconis.de/repository/release -DrepositoryId=foconis-release`
- run `mvn deploy:deploy-file -DpomFile=pom.xml -Dfile=lombok-1.18.34-FOC1-sources.jar -Durl=https://mvnrepo.foconis.de/repository/release -DrepositoryId=foconis-release -Dclassifier=sources`
- run `mvn deploy:deploy-file -DpomFile=pom.xml -Dfile=lombok-1.18.34-FOC1-javadoc.jar -Durl=https://mvnrepo.foconis.de/repository/release -DrepositoryId=foconis-release -Dclassifier=javadoc`