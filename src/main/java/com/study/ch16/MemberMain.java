package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    private static ArrayList<Member> members = new ArrayList<>();

    public static String inputSearchName(String label){
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + ">>");
        return scanner.nextLine();
    }

    public static Member findMemberByName(String name) {
        for(Member member : members){
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectedMenu = null;

        while (true){
            System.out.println("회원관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>");
            selectedMenu = scanner.nextLine();

            if("q".equalsIgnoreCase(selectedMenu)){
                break;
            }else if("1".equals(selectedMenu)){
                /**
                                                                 * [ 회원 등록하기]
                                                                 * 이름 >> 김준일
                                                                 * 주소 >> 부산 동래구
                                                                 * << 등록이 완료되었습니다. >>
                                                                 *     1 -> 5 -> 4 -> 6 -> 2 -> 3
                                                                 */
                System.out.println("[ 회원 등록하기 ]");

                System.out.print("이름 >> ");
                String name = scanner.nextLine();

                System.out.print("주소 >> ");
                String address = scanner.nextLine();

                Member member = new Member(name, address);
                members.add(member);




            }else if("2".equals(selectedMenu)){
                                                            /**
                                                             * [ 회원 이름 수정하기 ]
                                                             * 수정 할 회원의 이름을 입력하세요 >> 김준일
                                                             * 이름 >> 김준이
                                                             * << 수정이 완료되었습니다. >>
                                                             */
                System.out.println("수정하기");
                String searchName = inputSearchName("수정될 회원을 이름 입력");
                Member findMember = findMemberByName(searchName);
                if(findMember == null){
                    System.out.println("해당 이름의 회원이 존자해지 않습니다.");
                    continue;
                }
                System.out.println("이름 >> ");
                String updateAddress = scanner.nextLine();
                findMember.setName(updateAddress);
                System.out.println("<<수정이 완료 되었습니다.>>");


            }else if("3".equals(selectedMenu)){
                                                            /**
                                                             * [ 회원 주소 수정하기 ]
                                                             * 수정 할 회원의 이름을 입력하세요 >> 김준이
                                                             * 주소 >> 부산 동래구 사직동
                                                             * << 수정이 완료되었습니다. >>
                                                             */

                System.out.println("수정하기");
                String searchName = inputSearchName("수정될 회원을 주소 입력");
                Member findMember = findMemberByName(searchName);
                if(findMember == null){
                    System.out.println("해당 주소의 회원이 존자해지 않습니다.");
                    continue;
                }
                System.out.println("주소 >> ");
                String updateAddress = scanner.nextLine();
                findMember.setAddress(updateAddress);
                System.out.println("<<수정이 완료 되었습니다.>>");

            }else if("4".equals(selectedMenu)){
                                                            /**
                                                             * [ 회원 이름으로 조회하기 ]
                                                             * 조회 할 회원의 이름을 입력하세요 >> 김준이
                                                             * 해당 이름의 회원이 존재하지 않습니다.
                                                             * Member 객체 toString();
                                                             * << 조회가 완료되었습니다. >>
                                                             */
                String searchName = null;
                System.out.println("[ 회원 이름으로 조회하기 ]");
                searchName = inputSearchName("조회 할 회원으 이름을 입력하세요");

                Member findMember = findMemberByName(searchName);
                if(findMember == null){
                    System.out.println("해당 이름의 회원은 존재하지 않습니다.");
                    continue;
                }
                System.out.println(findMember);
                System.out.println("<< 조회가 완료되었습니다.>>");

            }else if("5".equals(selectedMenu)){
                                                                /**
                                                                 * [ 회원 전체 조회하기 ]
                                                                 * MemberList 전체 반복 toString();
                                                                 * << 조회가 완료되었습니다. >>
                                                                 */

                System.out.println("[ 회원 전체 조회하기 ]");
                for(Member member : members) {
                    System.out.println(members.toString());


                }
                System.out.println("<< 조회가 완료되었습니다. >>");

            }else if("6".equals(selectedMenu)){
                                                                /**
                                                                 * [ 회원 이름으로 삭제하기 ]
                                                                 * 삭제 할 회원의 이름을 입력하세요 >> 김준이
                                                                 * 삭제 된 Member 객체 toString();
                                                                 * << 삭제가 완료되었습니다. >>
                                                                 */
                String searchName = null;
                System.out.println("[ 회원 이름으로 삭제하기 ]");
                System.out.print("삭제 할 인원의 이름을 입력하세요");
                searchName = scanner.nextLine();

                Member findMember = null;
                for(Member member : members){
                    if(member.getName().equals(searchName)){
                        findMember = member;
                        break;
                    }
                }
                if(findMember == null){
                    System.out.println("해당 이름의 회원은 존재하지 않습니다.");
                    continue;
                }
                members.remove(findMember);
                //members.remove(members.indexOf(findMember)); *해당명령은 remove(int 형)이라서 findMember의 주소를 찾는다.
                System.out.println(findMember);
                System.out.println("<< 조회가 완료되었습니다.>>");

            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료.");
    }
}
