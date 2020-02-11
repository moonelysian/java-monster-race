package util;

public enum  Message {
    startLine("<스릴만점 건전한 몬스터 경주>"),
    askNumberOfMonster("몬스터는 모두 몇 마리인가요?"),
    askTypeOfMonster("경주할 몬스터 이름과 종류를 입력하세요 (쉼표(,)를 기준으로 구분)."),
    askNumberOfChance("시도할 회수는 몇 회 인가요?"),
    gameStartMessage("<경기 시작>"),
    congratulations("축하합니다!"),
    winner("몬스터 레이스에서 우승했습니다."),
    monsterTypeError("존재하지않는 몬스터 타입을 입력하셨습니다.");

    final private String message;

    Message(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
