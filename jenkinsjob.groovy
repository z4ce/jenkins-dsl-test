def gitUrl = 'https://github.com/cloudfoundry-samples/hello-spring-cloud'

job('run-maven-build') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/10 * * * *')
    }
    steps {
        maven('build')
    }
}

