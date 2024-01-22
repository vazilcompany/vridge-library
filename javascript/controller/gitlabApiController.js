exports.test = (req, res) => {
    res.send("랩 테스트 1212")
    

}


// const express = require("express")
// const axios = require("axios");
// const app = express();

// const port = 3000;
// const accessToken = ""

// app.get("/", async (req, res) => {
//   const {projectId, ref, path} = req.query
//   const response = await getTreeData(projectId, ref, path)
//   const buildFiles = []
//   const filePaths = []
//   const contents = []

//   console.log("=====================파일 분류 시작=====================")
//   response.forEach(x => {
//     if (x.type === "tree") {
//       filePaths.push(x)
//     } 

//     if (x.name.includes("build.gradle")) {
//       buildFiles.push(x)
//     }
//   })

//   while(filePaths.length !== 0){
//     const pathResponse = await getTreeData(projectId, ref, filePaths[0].path)

//     pathResponse.forEach(x => {
//       if (x.type === "tree") {
//         filePaths.push(x)
//       } 
  
//       if (x.name.includes("build.gradle")) {
//         buildFiles.push(x)
//       }
//     })

//     filePaths.splice(0,1)
//   }

//   console.log("=====================파일 분류 완료=====================")
//   console.log("=====================파일 내용 가져오기 시작=====================")

//   for(let buildFileInfo of buildFiles) {
//     const blobData = await getFile(projectId, buildFileInfo.path, ref)
    

//     const decodeData = decodeURIComponent(escape(atob(blobData.content)))
//     const regex = /([^{\n\s]+)\s*{([^{}]*)}/g;
//     const libraryInfo = {
//       module:buildFileInfo.path,
//       dependencies:[]
//     }

//     while ((match = regex.exec(decodeData)) !== null) {
//       const startValue = match[1].trim();
//       const blockContent = match[2].trim();

//       if (startValue === "dependencies") {
//         blockContent.split('\n').map(line => line.trim())
//         .filter(line => line !== "")
//         .filter(line => !line.startsWith("/"))
//         .forEach(line => libraryInfo.dependencies.push(line))
//       }
//     }

//     contents.push(libraryInfo)
//   }

//   console.log("=====================파일 내용 가져오기 완료=====================")

//   res.send(contents)
// })

// const getTreeData = async (projectId, ref, path = "") => {
//     return await axios.get(`https://git.vazil.me/api/v4/projects/${projectId}/repository/tree`, {
//       headers: {
//         "PRIVATE-TOKEN": accessToken
//       },
//       params: {
//         ref: ref,
//         path: path
//       }
//     })
//     .then(r => {
//       return r.data
//     })
//     .catch(e => {
//       console.log("에러 발생 ::", e)
//       return []
//     })
// }

// const getFile = async (projectId, file_path, ref) => {
//   const encodedPath = encodeURIComponent(file_path)
//   return await axios.get(`https://git.vazil.me/api/v4/projects/${projectId}/repository/files/${encodedPath}`, {
//     headers: {
//       "PRIVATE-TOKEN": accessToken
//     },
//     params: {
//       ref: ref,
//     }
//   })
//   .then(r => {
//     return r.data
//   })
//   .catch(e => {
//     console.log("에러 발생 ::", e)
//     return {}
//   })
// }



// app.listen(port)