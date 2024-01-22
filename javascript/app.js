// Express 모듈에서 express의 app 객체 생성
const express = require('express')
const app = express()


// 미들웨어 등록  :: TODO :: 정민교 :: 아직 잘 모르겠음
app.use(express.json())
app.use(express.urlencoded({ extended:false}))


// 모듈 라우터 등록
const gitRoutes = require('./router/gitRouter')
app.use('/git', gitRoutes)


// 포트 설정
const port = 3000;
app.listen(port, () => {
    console.log(`${port} 번 포트 서버 시작!!!`)
})


// app 객체 내보내기
module.exports = app