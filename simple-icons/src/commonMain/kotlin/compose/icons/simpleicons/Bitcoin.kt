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

public val SimpleIcons.Bitcoin: ImageVector
    get() {
        if (_bitcoin != null) {
            return _bitcoin!!
        }
        _bitcoin = Builder(name = "Bitcoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.638f, 14.904f)
                curveToRelative(-1.602f, 6.43f, -8.113f, 10.34f, -14.542f, 8.736f)
                curveTo(2.67f, 22.05f, -1.244f, 15.525f, 0.362f, 9.105f)
                curveTo(1.962f, 2.67f, 8.475f, -1.243f, 14.9f, 0.358f)
                curveToRelative(6.43f, 1.605f, 10.342f, 8.115f, 8.738f, 14.548f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(17.288f, 10.291f)
                curveToRelative(0.24f, -1.59f, -0.974f, -2.45f, -2.64f, -3.03f)
                lineToRelative(0.54f, -2.153f)
                lineToRelative(-1.315f, -0.33f)
                lineToRelative(-0.525f, 2.107f)
                curveToRelative(-0.345f, -0.087f, -0.705f, -0.167f, -1.064f, -0.25f)
                lineToRelative(0.526f, -2.127f)
                lineToRelative(-1.32f, -0.33f)
                lineToRelative(-0.54f, 2.165f)
                curveToRelative(-0.285f, -0.067f, -0.565f, -0.132f, -0.84f, -0.2f)
                lineToRelative(-1.815f, -0.45f)
                lineToRelative(-0.35f, 1.407f)
                reflectiveCurveToRelative(0.975f, 0.225f, 0.955f, 0.236f)
                curveToRelative(0.535f, 0.136f, 0.63f, 0.486f, 0.615f, 0.766f)
                lineToRelative(-1.477f, 5.92f)
                curveToRelative(-0.075f, 0.166f, -0.24f, 0.406f, -0.614f, 0.314f)
                curveToRelative(0.015f, 0.02f, -0.96f, -0.24f, -0.96f, -0.24f)
                lineToRelative(-0.66f, 1.51f)
                lineToRelative(1.71f, 0.426f)
                lineToRelative(0.93f, 0.242f)
                lineToRelative(-0.54f, 2.19f)
                lineToRelative(1.32f, 0.327f)
                lineToRelative(0.54f, -2.17f)
                curveToRelative(0.36f, 0.1f, 0.705f, 0.19f, 1.05f, 0.273f)
                lineToRelative(-0.51f, 2.154f)
                lineToRelative(1.32f, 0.33f)
                lineToRelative(0.545f, -2.19f)
                curveToRelative(2.24f, 0.427f, 3.93f, 0.257f, 4.64f, -1.774f)
                curveToRelative(0.57f, -1.637f, -0.03f, -2.58f, -1.217f, -3.196f)
                curveToRelative(0.854f, -0.193f, 1.5f, -0.76f, 1.68f, -1.93f)
                horizontalLineToRelative(0.01f)
                close()
                moveTo(14.278f, 14.511f)
                curveToRelative(-0.404f, 1.64f, -3.157f, 0.75f, -4.05f, 0.53f)
                lineToRelative(0.72f, -2.9f)
                curveToRelative(0.896f, 0.23f, 3.757f, 0.67f, 3.33f, 2.37f)
                close()
                moveTo(14.688f, 10.271f)
                curveToRelative(-0.37f, 1.49f, -2.662f, 0.735f, -3.405f, 0.55f)
                lineToRelative(0.654f, -2.64f)
                curveToRelative(0.744f, 0.18f, 3.137f, 0.524f, 2.75f, 2.084f)
                verticalLineToRelative(0.006f)
                close()
            }
        }
        .build()
        return _bitcoin!!
    }

private var _bitcoin: ImageVector? = null
