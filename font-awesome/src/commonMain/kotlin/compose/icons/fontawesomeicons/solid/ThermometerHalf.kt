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

public val SolidGroup.ThermometerHalf: ImageVector
    get() {
        if (_thermometerHalf != null) {
            return _thermometerHalf!!
        }
        _thermometerHalf = Builder(name = "ThermometerHalf", defaultWidth = 256.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 384.0f)
                curveToRelative(0.0f, 35.346f, -28.654f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.654f, -64.0f, -64.0f)
                curveToRelative(0.0f, -23.685f, 12.876f, -44.349f, 32.0f, -55.417f)
                lineTo(96.0f, 224.0f)
                curveToRelative(0.0f, -17.673f, 14.327f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.327f, 32.0f, 32.0f)
                verticalLineToRelative(104.583f)
                curveToRelative(19.124f, 11.068f, 32.0f, 31.732f, 32.0f, 55.417f)
                close()
                moveTo(224.0f, 299.347f)
                curveToRelative(19.912f, 22.563f, 32.0f, 52.194f, 32.0f, 84.653f)
                curveToRelative(0.0f, 70.696f, -57.303f, 128.0f, -128.0f, 128.0f)
                curveToRelative(-0.299f, 0.0f, -0.609f, -0.001f, -0.909f, -0.003f)
                curveTo(56.789f, 511.509f, -0.357f, 453.636f, 0.002f, 383.333f)
                curveTo(0.166f, 351.135f, 12.225f, 321.755f, 32.0f, 299.347f)
                lineTo(32.0f, 96.0f)
                curveToRelative(0.0f, -53.019f, 42.981f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 42.981f, 96.0f, 96.0f)
                verticalLineToRelative(203.347f)
                close()
                moveTo(208.0f, 384.0f)
                curveToRelative(0.0f, -34.339f, -19.37f, -52.19f, -32.0f, -66.502f)
                lineTo(176.0f, 96.0f)
                curveToRelative(0.0f, -26.467f, -21.533f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveTo(80.0f, 69.533f, 80.0f, 96.0f)
                verticalLineToRelative(221.498f)
                curveToRelative(-12.732f, 14.428f, -31.825f, 32.1f, -31.999f, 66.08f)
                curveToRelative(-0.224f, 43.876f, 35.563f, 80.116f, 79.423f, 80.42f)
                lineTo(128.0f, 464.0f)
                curveToRelative(44.112f, 0.0f, 80.0f, -35.888f, 80.0f, -80.0f)
                close()
            }
        }
        .build()
        return _thermometerHalf!!
    }

private var _thermometerHalf: ImageVector? = null
