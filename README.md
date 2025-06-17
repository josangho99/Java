# Java
<table>
<thead>
<tr>
<th>이름</th>
<th>타입</th>
<th>설명</th>
<th>필수</th>
</tr>
</thead>
<tbody><tr>
<td>profile_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 프로필 정보(닉네임/프로필 사진) 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 프로필 정보(닉네임/프로필 사진)</td>
<td>X</td>
</tr>
<tr>
<td>profile_nickname_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 닉네임 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 닉네임</td>
<td>X</td>
</tr>
<tr>
<td>profile_image_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 프로필 사진 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 프로필 사진</td>
<td>X</td>
</tr>
<tr>
<td>profile</td>
<td><a href="#profile"><code>Profile</code></a></td>
<td>프로필 정보<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 프로필 정보(닉네임/프로필 사진), 닉네임, 프로필 사진</td>
<td>X</td>
</tr>
<tr>
<td>name_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 카카오계정 이름 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 이름</td>
<td>X</td>
</tr>
<tr>
<td>name</td>
<td><code>String</code></td>
<td>카카오계정 이름<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 이름</td>
<td>X</td>
</tr>
<tr>
<td>email_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 카카오계정 대표 이메일 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 카카오계정(이메일)</td>
<td>X</td>
</tr>
<tr>
<td>is_email_valid</td>
<td><code>Boolean</code></td>
<td>이메일 유효 여부<br><code>true</code>: 유효한 이메일<br><code>false</code>: 이메일이 다른 카카오계정에 사용돼 만료<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 카카오계정(이메일)</td>
<td>X</td>
</tr>
<tr>
<td>is_email_verified</td>
<td><code>Boolean</code></td>
<td>이메일 인증 여부<br><code>true</code>: 인증된 이메일<br><code>false</code>: 인증되지 않은 이메일<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 카카오계정(이메일)</td>
<td>X</td>
</tr>
<tr>
<td>email</td>
<td><code>String</code></td>
<td>카카오계정 대표 이메일<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 카카오계정(이메일)<br><strong>중요</strong>: <a href="../kakaologin/common#policy-user-info-email">이메일 사용 시 주의 사항</a></td>
<td>X</td>
</tr>
<tr>
<td>age_range_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 연령대 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 연령대</td>
<td>X</td>
</tr>
<tr>
<td>age_range</td>
<td><code>String</code></td>
<td>연령대<br><code>1~9</code>: 1세 이상 10세 미만<br><code>10~14</code>: 10세 이상 15세 미만<br><code>15~19</code>: 15세 이상 20세 미만<br><code>20~29</code>: 20세 이상 30세 미만<br><code>30~39</code>: 30세 이상 40세 미만<br><code>40~49</code>: 40세 이상 50세 미만<br><code>50~59</code>: 50세 이상 60세 미만<br><code>60~69</code>: 60세 이상 70세 미만<br><code>70~79</code>: 70세 이상 80세 미만<br><code>80~89</code>: 80세 이상 90세 미만<br><code>90~</code>: 90세 이상<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 연령대</td>
<td>X</td>
</tr>
<tr>
<td>birthyear_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 출생 연도 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 출생 연도</td>
<td>X</td>
</tr>
<tr>
<td>birthyear</td>
<td><code>String</code></td>
<td>출생 연도(<code>YYYY</code> 형식)<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 출생 연도</td>
<td>X</td>
</tr>
<tr>
<td>birthday_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 생일 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 생일</td>
<td>X</td>
</tr>
<tr>
<td>birthday</td>
<td><code>String</code></td>
<td>생일(<code>MMDD</code> 형식)<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 생일</td>
<td>X</td>
</tr>
<tr>
<td>birthday_type</td>
<td><code>String</code></td>
<td>생일 타입<br><code>SOLAR</code>(양력) 또는 <code>LUNAR</code>(음력)<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 생일</td>
<td>X</td>
</tr>
<tr>
<td>is_leap_month</td>
<td><code>Boolean</code></td>
<td>생일의 윤달 여부<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 생일</td>
<td>X</td>
</tr>
<tr>
<td>gender_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 성별 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 성별</td>
<td>X</td>
</tr>
<tr>
<td>gender</td>
<td><code>String</code></td>
<td>성별<br><code>female</code>: 여성<br><code>male</code>: 남성<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 성별</td>
<td>X</td>
</tr>
<tr>
<td>phone_number_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 전화번호 제공 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 카카오계정(전화번호)</td>
<td>X</td>
</tr>
<tr>
<td>phone_number</td>
<td><code>String</code></td>
<td>카카오계정의 전화번호<br>국내 번호인 경우 <code>+82 00-0000-0000</code> 형식<br>해외 번호인 경우 자릿수, 붙임표(-) 유무나 위치가 다를 수 있음<br>(참고: <a href="https://github.com/google/libphonenumber" target="_blank">libphonenumber</a>)<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: 카카오계정(전화번호)</td>
<td>X</td>
</tr>
<tr>
<td>ci_needs_agreement</td>
<td><code>Boolean</code></td>
<td>사용자 동의 시 CI 참고 가능<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: CI(연계정보)</td>
<td>X</td>
</tr>
<tr>
<td>ci</td>
<td><code>String</code></td>
<td>연계정보<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: CI(연계정보)</td>
<td>X</td>
</tr>
<tr>
<td>ci_authenticated_at</td>
<td><code>Datetime</code></td>
<td>CI 발급 시각, UTC*<br><br><a href="../kakaologin/prerequisite#scope"><strong>필요한 동의항목</strong></a>: CI(연계정보)</td>
<td>X</td>
</tr>
</tbody></table>
