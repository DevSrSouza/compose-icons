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

public val SolidGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(499.99f, 176.0f)
                horizontalLineToRelative(-59.87f)
                lineToRelative(-16.64f, -41.6f)
                curveTo(406.38f, 91.63f, 365.57f, 64.0f, 319.5f, 64.0f)
                horizontalLineToRelative(-127.0f)
                curveToRelative(-46.06f, 0.0f, -86.88f, 27.63f, -103.99f, 70.4f)
                lineTo(71.87f, 176.0f)
                lineTo(12.01f, 176.0f)
                curveTo(4.2f, 176.0f, -1.53f, 183.34f, 0.37f, 190.91f)
                lineToRelative(6.0f, 24.0f)
                curveTo(7.7f, 220.25f, 12.5f, 224.0f, 18.01f, 224.0f)
                horizontalLineToRelative(20.07f)
                curveTo(24.65f, 235.73f, 16.0f, 252.78f, 16.0f, 272.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 16.12f, 6.16f, 30.67f, 16.0f, 41.93f)
                lineTo(32.0f, 416.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(256.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-54.07f)
                curveToRelative(9.84f, -11.25f, 16.0f, -25.8f, 16.0f, -41.93f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -19.22f, -8.65f, -36.27f, -22.07f, -48.0f)
                lineTo(494.0f, 224.0f)
                curveToRelative(5.51f, 0.0f, 10.31f, -3.75f, 11.64f, -9.09f)
                lineToRelative(6.0f, -24.0f)
                curveToRelative(1.89f, -7.57f, -3.84f, -14.91f, -11.65f, -14.91f)
                close()
                moveTo(147.93f, 158.17f)
                curveToRelative(7.29f, -18.22f, 24.94f, -30.17f, 44.57f, -30.17f)
                horizontalLineToRelative(127.0f)
                curveToRelative(19.63f, 0.0f, 37.28f, 11.95f, 44.57f, 30.17f)
                lineTo(384.0f, 208.0f)
                lineTo(128.0f, 208.0f)
                lineToRelative(19.93f, -49.83f)
                close()
                moveTo(96.0f, 319.8f)
                curveToRelative(-19.2f, 0.0f, -32.0f, -12.76f, -32.0f, -31.9f)
                reflectiveCurveTo(76.8f, 256.0f, 96.0f, 256.0f)
                reflectiveCurveToRelative(48.0f, 28.71f, 48.0f, 47.85f)
                reflectiveCurveToRelative(-28.8f, 15.95f, -48.0f, 15.95f)
                close()
                moveTo(416.0f, 319.8f)
                curveToRelative(-19.2f, 0.0f, -48.0f, 3.19f, -48.0f, -15.95f)
                reflectiveCurveTo(396.8f, 256.0f, 416.0f, 256.0f)
                reflectiveCurveToRelative(32.0f, 12.76f, 32.0f, 31.9f)
                reflectiveCurveToRelative(-12.8f, 31.9f, -32.0f, 31.9f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
