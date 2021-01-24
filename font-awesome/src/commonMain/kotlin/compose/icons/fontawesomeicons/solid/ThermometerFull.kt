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
                curveToRelative(0.0f, -53.019f, -42.981f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveTo(32.0f, 42.981f, 32.0f, 96.0f)
                verticalLineToRelative(203.347f)
                curveTo(12.225f, 321.756f, 0.166f, 351.136f, 0.002f, 383.333f)
                curveToRelative(-0.359f, 70.303f, 56.787f, 128.176f, 127.089f, 128.664f)
                curveToRelative(0.299f, 0.002f, 0.61f, 0.003f, 0.909f, 0.003f)
                curveToRelative(70.698f, 0.0f, 128.0f, -57.304f, 128.0f, -128.0f)
                curveToRelative(0.0f, -32.459f, -12.088f, -62.09f, -32.0f, -84.653f)
                lineTo(224.0f, 96.0f)
                close()
                moveTo(128.0f, 464.0f)
                lineToRelative(-0.576f, -0.002f)
                curveToRelative(-43.86f, -0.304f, -79.647f, -36.544f, -79.423f, -80.42f)
                curveToRelative(0.173f, -33.98f, 19.266f, -51.652f, 31.999f, -66.08f)
                lineTo(80.0f, 96.0f)
                curveToRelative(0.0f, -26.467f, 21.533f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.533f, 48.0f, 48.0f)
                verticalLineToRelative(221.498f)
                curveToRelative(12.63f, 14.312f, 32.0f, 32.164f, 32.0f, 66.502f)
                curveToRelative(0.0f, 44.112f, -35.888f, 80.0f, -80.0f, 80.0f)
                close()
                moveTo(192.0f, 384.0f)
                curveToRelative(0.0f, 35.346f, -28.654f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.654f, -64.0f, -64.0f)
                curveToRelative(0.0f, -23.685f, 12.876f, -44.349f, 32.0f, -55.417f)
                lineTo(96.0f, 96.0f)
                curveToRelative(0.0f, -17.673f, 14.327f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.327f, 32.0f, 32.0f)
                verticalLineToRelative(232.583f)
                curveToRelative(19.124f, 11.068f, 32.0f, 31.732f, 32.0f, 55.417f)
                close()
            }
        }
        .build()
        return _thermometerFull!!
    }

private var _thermometerFull: ImageVector? = null
