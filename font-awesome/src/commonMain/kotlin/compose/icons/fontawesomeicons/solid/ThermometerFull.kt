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

public val SolidGroup.ThermometerFull: ImageVector
    get() {
        if (_thermometerFull != null) {
            return _thermometerFull!!
        }
        _thermometerFull = Builder(name = "ThermometerFull", defaultWidth = 256.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveTo(32.0f, 42.98f, 32.0f, 96.0f)
                verticalLineToRelative(203.35f)
                curveTo(12.23f, 321.76f, 0.17f, 351.14f, 0.0f, 383.33f)
                curveToRelative(-0.36f, 70.3f, 56.79f, 128.18f, 127.09f, 128.66f)
                curveToRelative(0.3f, 0.0f, 0.61f, 0.0f, 0.91f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                curveToRelative(0.0f, -32.46f, -12.09f, -62.09f, -32.0f, -84.65f)
                lineTo(224.0f, 96.0f)
                close()
                moveTo(128.0f, 464.0f)
                lineToRelative(-0.58f, -0.0f)
                curveToRelative(-43.86f, -0.3f, -79.65f, -36.54f, -79.42f, -80.42f)
                curveToRelative(0.17f, -33.98f, 19.27f, -51.65f, 32.0f, -66.08f)
                lineTo(80.0f, 96.0f)
                curveToRelative(0.0f, -26.47f, 21.53f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.53f, 48.0f, 48.0f)
                verticalLineToRelative(221.5f)
                curveToRelative(12.63f, 14.31f, 32.0f, 32.16f, 32.0f, 66.5f)
                curveToRelative(0.0f, 44.11f, -35.89f, 80.0f, -80.0f, 80.0f)
                close()
                moveTo(192.0f, 384.0f)
                curveToRelative(0.0f, 35.35f, -28.65f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.65f, -64.0f, -64.0f)
                curveToRelative(0.0f, -23.68f, 12.88f, -44.35f, 32.0f, -55.42f)
                lineTo(96.0f, 96.0f)
                curveToRelative(0.0f, -17.67f, 14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                verticalLineToRelative(232.58f)
                curveToRelative(19.12f, 11.07f, 32.0f, 31.73f, 32.0f, 55.42f)
                close()
            }
        }
        .build()
        return _thermometerFull!!
    }

private var _thermometerFull: ImageVector? = null
