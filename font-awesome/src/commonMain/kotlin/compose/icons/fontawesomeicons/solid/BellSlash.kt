package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.82f, 458.1f)
                lineToRelative(-90.62f, -70.05f)
                curveToRelative(0.19f, -1.38f, 0.8f, -2.66f, 0.8f, -4.06f)
                curveToRelative(0.05f, -7.55f, -2.61f, -15.27f, -8.61f, -21.71f)
                curveToRelative(-19.32f, -20.76f, -55.47f, -51.99f, -55.47f, -154.29f)
                curveToRelative(0.0f, -77.7f, -54.48f, -139.9f, -127.94f, -155.16f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.67f, -14.32f, -32.0f, -31.98f, -32.0f)
                reflectiveCurveToRelative(-31.98f, 14.33f, -31.98f, 32.0f)
                verticalLineToRelative(20.84f)
                curveToRelative(-40.33f, 8.38f, -74.66f, 31.07f, -97.59f, 62.57f)
                lineTo(45.47f, 3.37f)
                curveTo(38.49f, -2.05f, 28.43f, -0.8f, 23.01f, 6.18f)
                lineTo(3.37f, 31.45f)
                curveTo(-2.05f, 38.42f, -0.8f, 48.47f, 6.18f, 53.9f)
                lineToRelative(588.35f, 454.73f)
                curveToRelative(6.98f, 5.43f, 17.03f, 4.17f, 22.46f, -2.81f)
                lineToRelative(19.64f, -25.27f)
                curveToRelative(5.42f, -6.97f, 4.17f, -17.02f, -2.81f, -22.45f)
                close()
                moveTo(157.23f, 251.54f)
                curveToRelative(-8.61f, 67.96f, -36.41f, 93.33f, -52.62f, 110.75f)
                curveToRelative(-6.0f, 6.45f, -8.66f, 14.16f, -8.61f, 21.71f)
                curveToRelative(0.11f, 16.4f, 12.98f, 32.0f, 32.1f, 32.0f)
                horizontalLineToRelative(241.92f)
                lineTo(157.23f, 251.54f)
                close()
                moveTo(320.0f, 512.0f)
                curveToRelative(35.32f, 0.0f, 63.97f, -28.65f, 63.97f, -64.0f)
                horizontalLineTo(256.03f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 63.97f, 64.0f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
