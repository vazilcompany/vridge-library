package com.vazil.notification.model.kakao;

import com.vazil.notification.model.kakao.model.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Kakao {
    // 메세지 참고 문헌 - https://developers.kakao.com/docs/latest/ko/message/rest-api#default-template-msg-friend

    public TemplateObject errorMessage(String projectId, String httpStatus) {
        return TemplateObject.builder()
                .object_type("feed")
                .content(Content.builder()
                        .link(Link.builder().build())
                        .build())
                .item_content(ItemContent.builder()
                        .title_image_url("")
                        .title_image_text("에러가 발생하였습니다.")
                        .build())
                .build();
    }

    public TemplateObject testVridge(String projectId, String httpStatus) {
        return TemplateObject.builder()
                .object_type("feed")
                .content(Content.builder()
                        .link(Link.builder().build())
                        .build())
                .item_content(ItemContent.builder()
                        .title_image_url("")
                        .title_image_text("test 메세지 입니다.")
                        .items(new Object[]{
                                Items.builder().item("프로젝트").item_op(projectId).build(),
                                Items.builder().item("연결상태").item_op(httpStatus + "상태 좋음").build(),
                        })
                        .build())
                .build();
    }

    public TemplateObject createWeb(String webName, String webId, String creator, String cloud, String region, String server, LocalDateTime localDateTime) {
        return TemplateObject.builder()
                .object_type("feed")
                .content(Content.builder()
                        .link(Link.builder().build())
                        .build())
                .item_content(ItemContent.builder()
                        .title_image_url("")
                        .title_image_text("웹 포인트가 생성되었습니다.")
                        .items(new Object[]{
                                Items.builder().item("웹 이름").item_op(webName).build(),
                                Items.builder().item("웹 아이디").item_op(webId).build(),
                                Items.builder().item("생성자").item_op(creator).build(),
                                Items.builder().item("클라우드 유형").item_op(cloud).build(),
                                Items.builder().item("클라우드 지역").item_op(region).build(),
                                Items.builder().item("서버 사양").item_op(server).build(),
                                Items.builder().item("생성 일자").item_op(localDateTime.toString()).build()
                        })
                        .build())
                .build();
    }

    public TemplateObject deleteWeb(String id, String webId) {
        return TemplateObject.builder()
                .object_type("feed")
                .content(Content.builder()
                        .link(Link.builder().build())
                        .build())
                .item_content(ItemContent.builder()
                        .title_image_url("")
                        .title_image_text("웹 포인트가 삭제되었습니다.")
                        .items(new Object[]{
                                Items.builder().item("아이디").item_op(id).build(),
                                Items.builder().item("웹 아이디").item_op(webId).build()
                        })
                        .build())
                .build();
    }

    public TemplateObject createEdge(String edgeName, String edgeId, String projectId, String creater, String edgeType, String creatTime) {
        return TemplateObject.builder()
                .object_type("feed")
                .content(Content.builder()
                        .link(Link.builder().build())
                        .build())
                .item_content(ItemContent.builder()
                        .title_image_url("")
                        .title_image_text("엣지 포인트가 생성되었습니다.")
                        .items(new Object[]{
                                Items.builder().item("엣지 이름").item_op(edgeName).build(),
                                Items.builder().item("엣지 아이디").item_op(edgeId).build(),
                                Items.builder().item("프로젝트").item_op(projectId).build(),
                                Items.builder().item("생성자").item_op(creater).build(),
                                Items.builder().item("엣지 유형").item_op(edgeType.equals("0") ? "일반" : "커스터마이징").build(),
                                Items.builder().item("생성 일자").item_op(creatTime).build()
                        })
                        .build())
                .build();
    }

    public TemplateObject deleteEdge(String id, String edgeId) {
        return TemplateObject.builder()
                .object_type("feed")
                .content(Content.builder()
                        .link(Link.builder().build())
                        .build())
                .item_content(ItemContent.builder()
                        .title_image_url("")
                        .title_image_text("엣지 포인트가 삭제되었습니다.")
                        .items(new Object[]{
                                Items.builder().item("아이디").item_op(id).build(),
                                Items.builder().item("엣지포인트").item_op(edgeId).build()
                        })
                        .build())
                .build();
    }

    public TemplateObject deploy(String projectId, String pointType, String modelId, String pointId, LocalDateTime deployStartTime, LocalDateTime deployEndTime) {
        return TemplateObject.builder()
                .object_type("feed")
                .content(Content.builder()
                        .link(Link.builder().build())
                        .build())
                .item_content(ItemContent.builder()
                        .title_image_url("")
                        .title_image_text((pointType.equals("edge") ? "엣지" : "웹") + " 포인트가 생성되었습니다.")
                        .items(new Object[]{
                                Items.builder().item("프로젝트 아이디").item_op(projectId).build(),
                                Items.builder().item("모델 아이디").item_op(modelId).build(),
                                Items.builder().item("포인트 아이디").item_op(pointId).build(),
                                Items.builder().item("배포 시작 날짜").item_op(deployStartTime.toString()).build(),
                                Items.builder().item("배포 완료 날짜").item_op(deployEndTime.toString()).build()
                        })
                        .build())
                .build();
    }

    public TemplateObject training(String projectId, String aiModelId, String aiModelType, String createUser, String dataSet, String labelClass, String aiModel, String repeat, String size, String learningRate, String modelTag, LocalDateTime localDateTime) {
        return TemplateObject.builder()
                .object_type("feed")
                .content(Content.builder()
                        .link(Link.builder().build())
                        .build())
                .item_content(ItemContent.builder()
                        .title_image_url("")
                        .title_image_text(aiModelId + "\n 모델 학습을 시작합니다.")
                        .items(new Object[]{
                                Items.builder().item("프로젝트 아이디").item_op(projectId).build(),
                                Items.builder().item("학습 모델 아이디").item_op(aiModelId).build(),
                                Items.builder().item("학습 모델 유형").item_op(aiModelType).build(),
                                Items.builder().item("작업자").item_op(createUser).build(),
                                Items.builder().item("학습 데이터 세트").item_op(dataSet).build(),
                                Items.builder().item("라벨 클라스").item_op(labelClass).build(),
                                Items.builder().item("사전 학습 인공지능 모델").item_op(aiModel).build(),
                                Items.builder().item("반복 학습 설정").item_op(repeat).build(),
                                Items.builder().item("배치 크기 설정").item_op(size).build(),
                                Items.builder().item("학습률 설정").item_op(learningRate).build(),
                                Items.builder().item("학습 모델 태그").item_op(modelTag).build(),
                                Items.builder().item("학습 시작 시간").item_op(localDateTime.toString()).build()
                        })
                        .build())
                .build();
    }

    public TemplateObject trainingResult(String projectId, String aiModelId, String aiModelType, String createUser, String status, String statusInfo, String repeat, String size, String learningRate, String modelTag, LocalDateTime localStartTime, LocalDateTime localEndTime) {
        return TemplateObject.builder()
                .object_type("feed")
                .content(Content.builder()
                        .link(Link.builder().build())
                        .build())
                .item_content(ItemContent.builder()
                        .title_image_url("")
                        .title_image_text(aiModelId + "\n모델 학습 결과입니다.")
                        .items(new Object[]{
                                Items.builder().item("프로젝트 아이디").item_op(projectId).build(),
                                Items.builder().item("학습 모델 아이디").item_op(aiModelId).build(),
                                Items.builder().item("학습 모델 유형").item_op(aiModelType).build(),
                                Items.builder().item("작업자").item_op(createUser).build(),
                                Items.builder().item("학습 상태").item_op(status + statusInfo).build(),
                                Items.builder().item("반복 학습 설정").item_op(repeat).build(),
                                Items.builder().item("배치 크기 설정").item_op(size).build(),
                                Items.builder().item("학습률 설정").item_op(learningRate).build(),
                                Items.builder().item("학습 모델 태그").item_op(modelTag).build(),
                                Items.builder().item("학습 시작 시간").item_op(localStartTime.toString()).build(),
                                Items.builder().item("학습 종료 시간").item_op(localEndTime.toString()).build()
                        })
                        .build())
                .build();
    }
}
