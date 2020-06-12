package jp.te4a.spring.boot.myapp12;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
	class BookForm {
		private Integer id;
		@NotNull
		//なんか設定でテンプレメッセを変えれるっぽいゾ！
		@Size(min=3)
		private String title;
		@Size(min=3,max=20)
		private String writter;
		private String publisher;
		@Min(0)
		private Integer price;
	}