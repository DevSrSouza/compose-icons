package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Seat: ImageVector
    get() {
        if (_seat != null) {
            return _seat!!
        }
        _seat = Builder(name = "Seat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.325f)
                lineToRelative(23.98f, 4.46f)
                curveToRelative(-0.021f, 0.657f, -0.062f, 2.712f, -0.103f, 3.903f)
                curveToRelative(-0.041f, 1.418f, -0.35f, 2.281f, -0.925f, 2.815f)
                curveToRelative(-0.801f, 0.72f, -1.747f, 0.884f, -4.007f, 1.007f)
                curveToRelative(-5.219f, 0.288f, -10.54f, 0.247f, -17.219f, -0.226f)
                curveToRelative(-0.699f, -0.04f, -0.966f, -0.185f, -1.089f, -0.267f)
                curveToRelative(-0.288f, -0.205f, -0.329f, -0.431f, -0.411f, -1.603f)
                curveToRelative(-0.062f, -0.801f, -0.164f, -3.123f, -0.205f, -3.904f)
                curveToRelative(3.102f, 0.206f, 7.849f, 0.37f, 11.712f, 0.37f)
                curveToRelative(0.966f, 0.0f, 3.493f, 0.02f, 4.171f, 0.02f)
                curveToRelative(0.534f, 0.0f, 1.233f, -0.143f, 1.582f, -0.698f)
                lineTo(0.0f, 13.222f)
                close()
                moveTo(0.02f, 9.072f)
                curveToRelative(0.021f, -0.76f, 0.062f, -2.65f, 0.103f, -3.76f)
                curveToRelative(0.041f, -1.418f, 0.35f, -2.281f, 0.925f, -2.815f)
                curveToRelative(0.801f, -0.72f, 1.747f, -0.884f, 4.007f, -1.007f)
                curveToRelative(5.219f, -0.288f, 10.54f, -0.247f, 17.219f, 0.226f)
                curveToRelative(0.699f, 0.04f, 0.966f, 0.185f, 1.089f, 0.267f)
                curveToRelative(0.288f, 0.205f, 0.329f, 0.431f, 0.411f, 1.603f)
                curveToRelative(0.041f, 0.678f, 0.144f, 2.486f, 0.185f, 3.472f)
                curveToRelative(-2.301f, -0.123f, -6.206f, -0.308f, -9.596f, -0.35f)
                curveToRelative(-3.39f, -0.04f, -6.452f, 0.021f, -6.822f, 0.063f)
                curveToRelative(-0.74f, 0.102f, -1.089f, 0.452f, -1.192f, 0.595f)
                lineTo(24.0f, 10.634f)
                verticalLineToRelative(2.568f)
                close()
            }
        }
        .build()
        return _seat!!
    }

private var _seat: ImageVector? = null
