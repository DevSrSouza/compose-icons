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

public val SimpleIcons.Graylog: ImageVector
    get() {
        if (_graylog != null) {
            return _graylog!!
        }
        _graylog = Builder(name = "Graylog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.93f, 11.369f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, 0.75f, 0.45f)
                horizontalLineToRelative(0.705f)
                lineToRelative(1.112f, -2.675f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, 0.3f, -0.278f)
                curveToRelative(0.235f, -0.042f, 0.47f, 0.086f, 0.513f, 0.321f)
                lineToRelative(1.177f, 5.177f)
                lineToRelative(1.198f, -6.974f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.32f, -0.342f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, 0.535f, 0.321f)
                lineToRelative(1.284f, 5.24f)
                lineToRelative(0.663f, -1.946f)
                arcToRelative(0.449f, 0.449f, 0.0f, false, true, 0.17f, -0.235f)
                curveToRelative(0.193f, -0.129f, 0.471f, -0.086f, 0.6f, 0.107f)
                lineToRelative(0.556f, 0.791f)
                curveToRelative(0.021f, 0.193f, 0.021f, 0.385f, 0.021f, 0.578f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -0.043f, 0.748f)
                curveToRelative(-0.085f, -0.021f, -0.15f, -0.085f, -0.213f, -0.15f)
                lineToRelative(-0.557f, -0.77f)
                lineToRelative(-0.855f, 2.589f)
                arcToRelative(0.448f, 0.448f, 0.0f, false, true, -0.556f, 0.278f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, true, -0.278f, -0.3f)
                lineToRelative(-1.156f, -4.663f)
                lineToRelative(-1.219f, 7.08f)
                arcToRelative(0.449f, 0.449f, 0.0f, false, true, -0.492f, 0.364f)
                curveToRelative(-0.192f, -0.021f, -0.32f, -0.17f, -0.363f, -0.363f)
                lineToRelative(-1.305f, -5.99f)
                lineToRelative(-0.706f, 1.69f)
                arcToRelative(0.439f, 0.439f, 0.0f, false, true, -0.406f, 0.278f)
                horizontalLineTo(7.679f)
                arcToRelative(0.863f, 0.863f, 0.0f, false, true, -0.748f, 0.428f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, true, -0.877f, -0.877f)
                curveToRelative(0.02f, -0.47f, 0.406f, -0.877f, 0.877f, -0.877f)
                close()
                moveTo(12.0f, 0.396f)
                curveToRelative(6.973f, 0.0f, 12.0f, 5.369f, 12.0f, 11.615f)
                curveToRelative(0.0f, 6.353f, -4.77f, 11.593f, -12.0f, 11.593f)
                reflectiveCurveTo(0.0f, 18.364f, 0.0f, 12.011f)
                curveTo(-0.02f, 5.765f, 5.005f, 0.396f, 12.0f, 0.396f)
                close()
                moveTo(4.064f, 12.01f)
                curveToRelative(0.0f, 4.256f, 3.658f, 8.0f, 7.915f, 8.0f)
                curveToRelative(4.256f, 0.0f, 7.914f, -3.744f, 7.914f, -8.0f)
                curveToRelative(0.0f, -4.6f, -3.658f, -8.043f, -7.914f, -8.043f)
                curveToRelative(-4.236f, 0.0f, -7.915f, 3.444f, -7.915f, 8.043f)
                close()
            }
        }
        .build()
        return _graylog!!
    }

private var _graylog: ImageVector? = null
