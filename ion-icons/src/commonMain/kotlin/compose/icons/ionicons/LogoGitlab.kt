package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoGitlab: ImageVector
    get() {
        if (_logoGitlab != null) {
            return _logoGitlab!!
        }
        _logoGitlab = Builder(name = "LogoGitlab", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(494.07f, 281.6f)
                lineToRelative(-25.18f, -78.08f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -0.61f, -2.1f)
                lineTo(417.78f, 44.48f)
                arcToRelative(20.08f, 20.08f, 0.0f, false, false, -19.17f, -13.82f)
                arcTo(19.77f, 19.77f, 0.0f, false, false, 379.66f, 44.6f)
                lineTo(331.52f, 194.15f)
                horizontalLineToRelative(-152.0f)
                lineTo(131.34f, 44.59f)
                arcToRelative(19.76f, 19.76f, 0.0f, false, false, -18.86f, -13.94f)
                horizontalLineToRelative(-0.11f)
                arcToRelative(20.15f, 20.15f, 0.0f, false, false, -19.12f, 14.0f)
                lineTo(42.7f, 201.73f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.26f, -0.16f, 0.4f)
                lineTo(16.91f, 281.61f)
                arcToRelative(29.15f, 29.15f, 0.0f, false, false, 10.44f, 32.46f)
                lineTo(248.79f, 476.48f)
                arcToRelative(11.25f, 11.25f, 0.0f, false, false, 13.38f, -0.07f)
                lineTo(483.65f, 314.07f)
                arcToRelative(29.13f, 29.13f, 0.0f, false, false, 10.42f, -32.47f)
                moveToRelative(-331.0f, -64.51f)
                lineTo(224.8f, 408.85f)
                lineTo(76.63f, 217.09f)
                moveToRelative(209.64f, 191.8f)
                lineToRelative(59.19f, -183.84f)
                lineToRelative(2.55f, -8.0f)
                horizontalLineToRelative(86.52f)
                lineTo(300.47f, 390.44f)
                moveTo(398.8f, 59.31f)
                lineToRelative(43.37f, 134.83f)
                horizontalLineTo(355.35f)
                moveTo(324.16f, 217.0f)
                lineToRelative(-43.0f, 133.58f)
                lineTo(255.5f, 430.14f)
                lineTo(186.94f, 217.0f)
                moveTo(112.27f, 59.31f)
                lineToRelative(43.46f, 134.83f)
                horizontalLineTo(69.0f)
                moveTo(40.68f, 295.58f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, true, -2.21f, -6.9f)
                lineToRelative(19.0f, -59.0f)
                lineTo(197.08f, 410.27f)
                moveTo(470.34f, 295.58f)
                lineTo(313.92f, 410.22f)
                lineToRelative(0.52f, -0.69f)
                lineTo(453.5f, 229.64f)
                lineToRelative(19.0f, 59.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -2.19f, 6.92f)
            }
        }
        .build()
        return _logoGitlab!!
    }

private var _logoGitlab: ImageVector? = null
