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

public val SimpleIcons.Hipchat: ImageVector
    get() {
        if (_hipchat != null) {
            return _hipchat!!
        }
        _hipchat = Builder(name = "Hipchat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.736f, 19.056f)
                reflectiveCurveToRelative(0.103f, -0.073f, 0.267f, -0.198f)
                curveTo(22.46f, 16.958f, 24.0f, 14.203f, 24.0f, 11.139f)
                curveTo(24.0f, 5.424f, 18.627f, 0.787f, 12.003f, 0.787f)
                curveTo(5.377f, 0.787f, 0.0f, 5.424f, 0.0f, 11.139f)
                curveToRelative(0.0f, 5.717f, 5.371f, 10.356f, 11.998f, 10.356f)
                curveToRelative(0.847f, 0.0f, 1.694f, -0.073f, 2.524f, -0.228f)
                lineToRelative(0.262f, -0.045f)
                curveToRelative(1.683f, 1.092f, 4.139f, 1.99f, 6.288f, 1.99f)
                curveToRelative(0.665f, 0.0f, 0.978f, -0.546f, 0.552f, -1.104f)
                curveToRelative(-0.648f, -0.795f, -1.541f, -2.068f, -1.888f, -3.052f)
                close()
                moveTo(18.274f, 14.53f)
                curveToRelative(-0.716f, 1.069f, -2.934f, 2.889f, -6.254f, 2.889f)
                horizontalLineToRelative(-0.046f)
                curveToRelative(-3.328f, 0.0f, -5.543f, -1.831f, -6.254f, -2.889f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -0.273f, -0.574f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.447f, -0.526f)
                curveToRelative(0.008f, -0.003f, 0.014f, -0.003f, 0.021f, -0.003f)
                curveToRelative(0.117f, 0.006f, 0.23f, 0.043f, 0.328f, 0.111f)
                arcToRelative(9.137f, 9.137f, 0.0f, false, false, 5.754f, 2.056f)
                arcToRelative(8.805f, 8.805f, 0.0f, false, false, 5.76f, -2.059f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, true, 0.313f, -0.122f)
                curveToRelative(0.267f, 0.0f, 0.478f, 0.213f, 0.483f, 0.475f)
                arcToRelative(1.321f, 1.321f, 0.0f, false, true, -0.268f, 0.643f)
                horizontalLineToRelative(-0.011f)
                close()
            }
        }
        .build()
        return _hipchat!!
    }

private var _hipchat: ImageVector? = null
