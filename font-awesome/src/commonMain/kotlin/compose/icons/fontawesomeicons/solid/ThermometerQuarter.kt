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

public val SolidGroup.ThermometerQuarter: ImageVector
    get() {
        if (_thermometerQuarter != null) {
            return _thermometerQuarter!!
        }
        _thermometerQuarter = Builder(name = "ThermometerQuarter", defaultWidth = 256.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 384.0f)
                curveToRelative(0.0f, 35.35f, -28.65f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.65f, -64.0f, -64.0f)
                curveToRelative(0.0f, -23.68f, 12.88f, -44.35f, 32.0f, -55.42f)
                lineTo(96.0f, 288.0f)
                curveToRelative(0.0f, -17.67f, 14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                verticalLineToRelative(40.58f)
                curveToRelative(19.12f, 11.07f, 32.0f, 31.73f, 32.0f, 55.42f)
                close()
                moveTo(224.0f, 299.35f)
                curveToRelative(19.91f, 22.56f, 32.0f, 52.19f, 32.0f, 84.65f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                curveToRelative(-0.3f, 0.0f, -0.61f, -0.0f, -0.91f, -0.0f)
                curveTo(56.79f, 511.51f, -0.36f, 453.64f, 0.0f, 383.33f)
                curveTo(0.17f, 351.14f, 12.23f, 321.76f, 32.0f, 299.35f)
                lineTo(32.0f, 96.0f)
                curveToRelative(0.0f, -53.02f, 42.98f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 42.98f, 96.0f, 96.0f)
                verticalLineToRelative(203.35f)
                close()
                moveTo(208.0f, 384.0f)
                curveToRelative(0.0f, -34.34f, -19.37f, -52.19f, -32.0f, -66.5f)
                lineTo(176.0f, 96.0f)
                curveToRelative(0.0f, -26.47f, -21.53f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveTo(80.0f, 69.53f, 80.0f, 96.0f)
                verticalLineToRelative(221.5f)
                curveToRelative(-12.73f, 14.43f, -31.83f, 32.1f, -32.0f, 66.08f)
                curveToRelative(-0.22f, 43.88f, 35.56f, 80.12f, 79.42f, 80.42f)
                lineTo(128.0f, 464.0f)
                curveToRelative(44.11f, 0.0f, 80.0f, -35.89f, 80.0f, -80.0f)
                close()
            }
        }
        .build()
        return _thermometerQuarter!!
    }

private var _thermometerQuarter: ImageVector? = null
