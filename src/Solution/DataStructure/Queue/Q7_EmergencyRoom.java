package Solution.DataStructure.Queue;

import Solution.Common;

import java.util.*;

public class Q7_EmergencyRoom implements Common {
    /*
    메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.
    응급실은 환자가 도착한 순서대로 진료를 합니다. 하지만 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 합니다.
    이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의 진료순서를 정합니다.
    • 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
    • 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다.
    즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.
    현재 N명의 환자가 대기목록에 있습니다.
    N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.

    고려해야될 사항
    단순히 sort를 해서 order순서로만 판단하기에는 같은 위험도를 가진 환자가 있을 수 있어서 불가능
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int target = sc.nextInt();
        Queue<Person> input = new LinkedList<>();

        for(int i = 0; i < cnt; i++){
            int temp = sc.nextInt();
            Person person = new Person(i, temp);
            input.add(person);
        }
        int remove = 1;
        while(!input.isEmpty()){
            Person temp = input.poll();
            int emg = temp.getNumber();
            boolean isRemove = true;
            for(Person p : input){
                if(emg < p.getNumber()){
                    input.add(temp);
                    isRemove = false;
                    break;
                }
            }
            if(isRemove && temp.getId() == target){
                System.out.println(remove);
                return;
            }else if(isRemove){
                remove++;
            }
        }
    }

    public class Person {
        int id;
        int number;

        public Person(int id, int number) {
            this.id = id;
            this.number = number;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
