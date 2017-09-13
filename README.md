# dwc_completeness
Fittness For Use Framework tests for completeness of Darwin Core Terms.

see [measures.csv](https://github.com/kurator-org/dwc_completeness/blob/master/measures.csv) for list of tests included.

# Include using maven

Available in Maven Central

    <dependency>
        <groupId>org.datakurator</groupId>
        <artifactId>dwc_completeness</artifactId>
        <version>0.0.1</version>
    </dependency>

# Building

    mvn package

# Developer deployment: 

To deploy a snapshot to the snapshotRepository:

    mvn clean deploy

To deploy a new release to maven central, set the version in pom.xml to a non-snapshot version, then deploy with the release profile (which adds package signing and deployment to release staging:

    mvn clean deploy -P release

After this, you will need to login to the sonatype oss repository hosting nexus instance, find the staged release in the staging repositories, and perform the release.  It should be possible (haven't verified this yet) to perform the release from the command line instead by running:

    mvn nexus-staging:release -P release

