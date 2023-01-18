package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.InvisionLine: ImageVector
    get() {
        if (_invisionLine != null) {
            return _invisionLine!!
        }
        _invisionLine = Builder(name = "InvisionLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(6.988f, 14.065f)
                lineToRelative(0.77f, -3.271f)
                lineTo(6.564f, 10.794f)
                lineToRelative(0.362f, -1.39f)
                horizontalLineToRelative(2.868f)
                lineToRelative(-1.132f, 4.67f)
                arcToRelative(3.071f, 3.071f, 0.0f, false, false, -0.106f, 0.72f)
                curveToRelative(0.0f, 0.298f, 0.141f, 0.386f, 0.362f, 0.437f)
                curveToRelative(0.135f, 0.032f, 1.208f, 0.01f, 1.791f, -1.34f)
                lineToRelative(0.744f, -3.097f)
                horizontalLineToRelative(-1.208f)
                lineToRelative(0.363f, -1.39f)
                horizontalLineToRelative(2.58f)
                lineToRelative(-0.331f, 1.578f)
                curveToRelative(0.452f, -0.88f, 1.358f, -1.715f, 2.248f, -1.715f)
                curveToRelative(0.95f, 0.0f, 1.736f, 0.704f, 1.736f, 2.055f)
                curveToRelative(0.0f, 0.345f, -0.046f, 0.721f, -0.166f, 1.145f)
                lineToRelative(-0.483f, 1.805f)
                arcToRelative(2.159f, 2.159f, 0.0f, false, false, -0.076f, 0.487f)
                curveToRelative(0.0f, 0.314f, 0.121f, 0.47f, 0.347f, 0.47f)
                curveToRelative(0.227f, 0.0f, 0.514f, -0.172f, 0.846f, -1.13f)
                lineToRelative(0.664f, 0.267f)
                curveToRelative(-0.393f, 1.429f, -1.102f, 2.025f, -1.993f, 2.025f)
                curveToRelative(-1.041f, 0.0f, -1.539f, -0.643f, -1.539f, -1.523f)
                curveToRelative(0.0f, -0.25f, 0.03f, -0.518f, 0.106f, -0.785f)
                lineToRelative(0.498f, -1.853f)
                curveToRelative(0.06f, -0.204f, 0.075f, -0.392f, 0.075f, -0.565f)
                curveToRelative(0.0f, -0.596f, -0.347f, -0.958f, -0.905f, -0.958f)
                curveToRelative(-0.71f, 0.0f, -1.178f, 0.53f, -1.419f, 1.55f)
                lineToRelative(-0.966f, 4.032f)
                horizontalLineToRelative(-1.69f)
                lineToRelative(0.303f, -1.267f)
                curveToRelative(-0.497f, 0.85f, -1.187f, 1.375f, -2.038f, 1.375f)
                curveToRelative(-1.026f, 0.0f, -1.509f, -0.615f, -1.509f, -1.542f)
                curveToRelative(0.0f, -0.235f, 0.03f, -0.523f, 0.09f, -0.79f)
                close()
                moveTo(8.625f, 8.625f)
                arcToRelative(1.125f, 1.125f, 0.0f, true, true, 0.0f, -2.25f)
                arcToRelative(1.125f, 1.125f, 0.0f, false, true, 0.0f, 2.25f)
                close()
            }
        }
        .build()
        return _invisionLine!!
    }

private var _invisionLine: ImageVector? = null
