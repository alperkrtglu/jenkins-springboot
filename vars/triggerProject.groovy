def call() {
        def timestampVersion = sh(script: "date -d @\$(date +%s) +'%Y-%m-%dT%H-%M-%SZ'", returnStdout: true).trim()
        //Boolean IS_CRON_JOB = (currentBuild.rawBuild.getCause(hudson.triggers.TimerTrigger.TimerTriggerCause) != null)

        if (env.IS_CRON_JOB) {
                sh "echo RUN-CRONJOB --- TIME ${timestampVersion}"
        } else {
                sh "echo RUN-MANUAL"
        }
}