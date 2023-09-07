def call() {
        def timestampVersion = sh(script: "date -d @\$(date +%s) +'%Y-%m-%dT%H-%M-%SZ'", returnStdout: true).trim()
        def IS_CRON_JOB = "${currentBuild.rawBuild.getCause(hudson.triggers.TimerTrigger.TimerTriggerCause) != null ? 'true' : 'false'}"

//        if (IS_CRON_JOB.toBoolean()) {
//                sh ' ./gradlew :apps:urun:jib -Djib.to.tags=$timestampVersion'
//        } else {
//                sh ' ./gradlew :apps:urun:jib'
//        }
        sh "echo cronjob ${IS_CRON_JOB}!!!"
}