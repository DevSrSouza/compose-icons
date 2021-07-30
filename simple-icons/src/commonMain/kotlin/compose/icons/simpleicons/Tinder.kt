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

public val SimpleIcons.Tinder: ImageVector
    get() {
        if (_tinder != null) {
            return _tinder!!
        }
        _tinder = Builder(name = "Tinder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.317f, 9.451f)
                curveToRelative(0.045f, 0.073f, 0.123f, 0.12f, 0.212f, 0.12f)
                curveToRelative(0.06f, 0.0f, 0.116f, -0.021f, 0.158f, -0.057f)
                lineToRelative(0.015f, -0.012f)
                curveToRelative(0.39f, -0.325f, 0.741f, -0.66f, 1.071f, -1.017f)
                curveToRelative(3.209f, -3.483f, 1.335f, -7.759f, 1.32f, -7.799f)
                curveToRelative(-0.09f, -0.21f, -0.03f, -0.459f, 0.15f, -0.594f)
                curveToRelative(0.195f, -0.135f, 0.435f, -0.12f, 0.615f, 0.033f)
                curveToRelative(10.875f, 10.114f, 7.995f, 17.818f, 7.785f, 18.337f)
                curveToRelative(-0.87f, 3.141f, -4.335f, 5.414f, -8.444f, 5.53f)
                curveToRelative(-0.138f, 0.008f, -0.242f, 0.008f, -0.363f, 0.008f)
                curveToRelative(-4.852f, 0.0f, -8.977f, -2.989f, -8.977f, -6.807f)
                verticalLineToRelative(-0.06f)
                curveToRelative(0.0f, -5.297f, 4.795f, -10.522f, 5.009f, -10.744f)
                curveToRelative(0.136f, -0.149f, 0.345f, -0.195f, 0.525f, -0.105f)
                curveToRelative(0.18f, 0.076f, 0.297f, 0.255f, 0.291f, 0.451f)
                curveToRelative(-0.043f, 1.036f, 0.167f, 1.935f, 0.631f, 2.7f)
                verticalLineToRelative(0.015f)
                lineToRelative(0.002f, 0.001f)
                close()
            }
        }
        .build()
        return _tinder!!
    }

private var _tinder: ImageVector? = null
