// express 모듈에서 로우터 가져오기
const express = require('express')
const router = express.Router()

// 필요한 controller 모듈 가져오기
const labController = require('../controller/gitlabApiController')
const gitController = require('../controller/githubApiController')

router.get("/lab", labController.test)
router.get("/hub", gitController.test)






// 설정한 로우터를 외부에서 사용가능하도록 내보내기 
module.exports = router