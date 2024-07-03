<script>
</script>

<main>
	<div id="container">
		<span id="title">Login</span>
		<section>
			<form>
				<div class="row">
					<div class="cell">
						<input type="text" id="username" placeholder="Usuário">
					</div>
				</div>
				<div class="row">
					<div class="cell">
						<input type="password" id="password" placeholder="Senha">
					</div>
				</div>
				<button id="submit-button">Login</button>
			</form>
			<small id="forgot-password"><a href="/recover">Esqueceu sua senha?</a></small>
		</section>
	</div>
</main>

<style>
	#container {
		/* From shared.css */
		background-color: var(--main-content-bg-color);
		box-shadow: var(--main-container-box-shadow);
		border-radius: var(--main-container-border-radius);

		padding: 40px;
		text-align: center;
		max-width: fit-content;
		margin: 5% auto;
	}

	#title {
		font-size: 200%;
		margin-bottom: 25px;
		display: block;
	}

	section {
		display: block;
	}

	.row * {
		display: inline-block;
	}

	.cell {
		margin: 5px;
	}

	#submit-button {
		display: inline-block;
		margin-top: 25px;
	}

	#forgot-password {
		display: inline-block;
		margin-top: 15px;
	}
</style>
