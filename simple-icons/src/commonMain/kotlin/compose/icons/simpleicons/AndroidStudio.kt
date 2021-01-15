package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.AndroidStudio: ImageVector
    get() {
        if (_androidStudio != null) {
            return _androidStudio!!
        }
        _androidStudio = Builder(name = "AndroidStudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.07f, 0.0f, 1.254f, 4.816f, 1.254f, 10.746f)
                curveToRelative(0.0f, 3.29f, 1.482f, 6.237f, 3.814f, 8.21f)
                lineToRelative(4.51f, -7.8f)
                lineToRelative(-0.393f, -0.39f)
                curveToRelative(-0.115f, -0.115f, -0.173f, -0.213f, -0.175f, -0.303f)
                arcToRelative(0.239f, 0.239f, 0.0f, false, true, 0.0f, -0.03f)
                lineTo(9.0f, 10.433f)
                lineTo(9.0f, 7.876f)
                curveToRelative(0.0f, -0.615f, 0.51f, -1.123f, 1.125f, -1.123f)
                horizontalLineToRelative(0.635f)
                lineTo(10.76f, 4.738f)
                horizontalLineToRelative(2.49f)
                verticalLineToRelative(2.014f)
                horizontalLineToRelative(0.625f)
                curveToRelative(0.625f, 0.0f, 1.125f, 0.508f, 1.135f, 1.133f)
                verticalLineToRelative(2.539f)
                lineTo(15.0f, 10.424f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.003f, 0.087f, -0.051f, 0.2f, -0.174f, 0.322f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.39f, 0.39f)
                lineToRelative(1.933f, 3.342f)
                arcToRelative(5.755f, 5.755f, 0.0f, false, false, 1.397f, -3.752f)
                horizontalLineToRelative(2.004f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, -2.356f, 5.561f)
                lineToRelative(1.53f, 2.65f)
                arcToRelative(10.727f, 10.727f, 0.0f, false, false, 3.814f, -8.21f)
                curveTo(22.756f, 4.806f, 17.94f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(18.932f, 18.957f)
                arcToRelative(10.791f, 10.791f, 0.0f, false, true, -1.653f, 1.15f)
                lineToRelative(1.52f, 2.628f)
                arcToRelative(0.569f, 0.569f, 0.0f, false, false, 0.197f, 0.205f)
                lineToRelative(1.504f, 1.025f)
                curveToRelative(0.059f, 0.04f, 0.127f, 0.04f, 0.185f, 0.01f)
                arcToRelative(0.192f, 0.192f, 0.0f, false, false, 0.088f, -0.166f)
                lineToRelative(-0.156f, -1.806f)
                arcToRelative(0.691f, 0.691f, 0.0f, false, false, -0.088f, -0.274f)
                lineToRelative(-1.597f, -2.771f)
                close()
                moveTo(17.279f, 20.107f)
                lineToRelative(-1.498f, -2.589f)
                arcToRelative(7.693f, 7.693f, 0.0f, false, true, -3.771f, 0.986f)
                arcToRelative(7.693f, 7.693f, 0.0f, false, true, -3.772f, -0.986f)
                lineToRelative(-1.5f, 2.598f)
                arcTo(10.686f, 10.686f, 0.0f, false, false, 12.0f, 21.495f)
                curveToRelative(1.918f, 0.0f, 3.72f, -0.505f, 5.28f, -1.387f)
                close()
                moveTo(6.739f, 20.116f)
                arcToRelative(10.788f, 10.788f, 0.0f, false, true, -1.67f, -1.16f)
                lineTo(3.47f, 21.719f)
                arcToRelative(0.694f, 0.694f, 0.0f, false, false, -0.088f, 0.274f)
                lineToRelative(-0.137f, 1.816f)
                curveToRelative(-0.01f, 0.069f, 0.03f, 0.127f, 0.088f, 0.166f)
                curveToRelative(0.059f, 0.04f, 0.127f, 0.03f, 0.185f, -0.01f)
                lineToRelative(1.504f, -1.015f)
                arcToRelative(0.777f, 0.777f, 0.0f, false, false, 0.196f, -0.205f)
                close()
                moveTo(11.999f, 7.729f)
                verticalLineToRelative(0.02f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -1.493f, 1.5f)
                arcTo(1.501f, 1.501f, 0.0f, false, false, 12.0f, 10.745f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, 1.494f, -1.498f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, -1.494f, -1.5f)
                close()
                moveTo(11.053f, 12.633f)
                lineTo(9.234f, 15.78f)
                arcToRelative(5.707f, 5.707f, 0.0f, false, false, 2.766f, 0.713f)
                arcToRelative(5.635f, 5.635f, 0.0f, false, false, 2.756f, -0.704f)
                lineToRelative(-1.815f, -3.15f)
                lineToRelative(-0.375f, 0.375f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.556f, 0.234f)
                horizontalLineToRelative(-0.02f)
                arcToRelative(0.793f, 0.793f, 0.0f, false, true, -0.556f, -0.234f)
                close()
            }
        }
        .build()
        return _androidStudio!!
    }

private var _androidStudio: ImageVector? = null
