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

public val SimpleIcons.Railway: ImageVector
    get() {
        if (_railway != null) {
            return _railway!!
        }
        _railway = Builder(name = "Railway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.113f, 10.27f)
                arcTo(13.026f, 13.026f, 0.0f, false, false, 0.0f, 11.48f)
                horizontalLineToRelative(18.23f)
                curveToRelative(-0.064f, -0.125f, -0.15f, -0.237f, -0.235f, -0.347f)
                curveToRelative(-3.117f, -4.027f, -4.793f, -3.677f, -7.19f, -3.78f)
                curveToRelative(-0.8f, -0.034f, -1.34f, -0.048f, -4.524f, -0.048f)
                curveToRelative(-1.704f, 0.0f, -3.555f, 0.005f, -5.358f, 0.01f)
                curveToRelative(-0.234f, 0.63f, -0.459f, 1.24f, -0.567f, 1.737f)
                horizontalLineToRelative(9.342f)
                verticalLineToRelative(1.216f)
                lineTo(0.113f, 10.268f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(18.373f, 12.696f)
                lineTo(0.009f, 12.696f)
                curveToRelative(0.02f, 0.326f, 0.05f, 0.645f, 0.094f, 0.961f)
                horizontalLineToRelative(16.955f)
                curveToRelative(0.754f, 0.0f, 1.179f, -0.429f, 1.315f, -0.96f)
                close()
                moveTo(1.055f, 16.976f)
                reflectiveCurveToRelative(2.81f, 6.902f, 10.93f, 7.024f)
                curveToRelative(4.855f, 0.0f, 9.027f, -2.883f, 10.92f, -7.024f)
                lineTo(1.056f, 16.976f)
                close()
                moveTo(11.988f, 0.0f)
                curveTo(7.5f, 0.0f, 3.593f, 2.466f, 1.531f, 6.108f)
                lineToRelative(4.75f, -0.005f)
                verticalLineToRelative(-0.002f)
                curveToRelative(3.71f, 0.0f, 3.849f, 0.016f, 4.573f, 0.047f)
                lineToRelative(0.448f, 0.016f)
                curveToRelative(1.563f, 0.052f, 3.485f, 0.22f, 4.996f, 1.364f)
                curveToRelative(0.82f, 0.621f, 2.007f, 1.99f, 2.712f, 2.965f)
                curveToRelative(0.654f, 0.902f, 0.842f, 1.94f, 0.396f, 2.934f)
                curveToRelative(-0.408f, 0.914f, -1.289f, 1.458f, -2.353f, 1.458f)
                lineTo(0.391f, 14.885f)
                reflectiveCurveToRelative(0.099f, 0.42f, 0.249f, 0.886f)
                horizontalLineToRelative(22.748f)
                arcTo(12.026f, 12.026f, 0.0f, false, false, 24.0f, 12.005f)
                curveTo(24.0f, 5.377f, 18.621f, 0.0f, 11.988f, 0.0f)
                close()
            }
        }
        .build()
        return _railway!!
    }

private var _railway: ImageVector? = null
