package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CarAlt: ImageVector
    get() {
        if (_carAlt != null) {
            return _carAlt!!
        }
        _carAlt = Builder(name = "CarAlt", defaultWidth = 480.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 480.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(438.66f, 212.33f)
                lineToRelative(-11.24f, -28.1f)
                lineToRelative(-19.93f, -49.83f)
                curveTo(390.38f, 91.63f, 349.57f, 64.0f, 303.5f, 64.0f)
                horizontalLineToRelative(-127.0f)
                curveToRelative(-46.06f, 0.0f, -86.88f, 27.63f, -103.99f, 70.4f)
                lineToRelative(-19.93f, 49.83f)
                lineToRelative(-11.24f, 28.1f)
                curveTo(17.22f, 221.5f, 0.0f, 244.66f, 0.0f, 272.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 16.12f, 6.16f, 30.67f, 16.0f, 41.93f)
                lineTo(16.0f, 416.0f)
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
                curveToRelative(0.0f, -27.34f, -17.22f, -50.5f, -41.34f, -59.67f)
                close()
                moveTo(131.93f, 158.17f)
                curveToRelative(7.29f, -18.22f, 24.94f, -30.17f, 44.57f, -30.17f)
                horizontalLineToRelative(127.0f)
                curveToRelative(19.63f, 0.0f, 37.28f, 11.95f, 44.57f, 30.17f)
                lineTo(368.0f, 208.0f)
                lineTo(112.0f, 208.0f)
                lineToRelative(19.93f, -49.83f)
                close()
                moveTo(80.0f, 319.8f)
                curveToRelative(-19.2f, 0.0f, -32.0f, -12.76f, -32.0f, -31.9f)
                reflectiveCurveTo(60.8f, 256.0f, 80.0f, 256.0f)
                reflectiveCurveToRelative(48.0f, 28.71f, 48.0f, 47.85f)
                reflectiveCurveToRelative(-28.8f, 15.95f, -48.0f, 15.95f)
                close()
                moveTo(400.0f, 319.8f)
                curveToRelative(-19.2f, 0.0f, -48.0f, 3.19f, -48.0f, -15.95f)
                reflectiveCurveTo(380.8f, 256.0f, 400.0f, 256.0f)
                reflectiveCurveToRelative(32.0f, 12.76f, 32.0f, 31.9f)
                reflectiveCurveToRelative(-12.8f, 31.9f, -32.0f, 31.9f)
                close()
            }
        }
        .build()
        return _carAlt!!
    }

private var _carAlt: ImageVector? = null
