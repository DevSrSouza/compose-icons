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

public val SimpleIcons.Nubank: ImageVector
    get() {
        if (_nubank != null) {
            return _nubank!!
        }
        _nubank = Builder(name = "Nubank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2795f, 5.4336f)
                curveToRelative(-1.1815f, 0.0f, -2.1846f, 0.4628f, -2.9432f, 1.252f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.0541f, -0.0022f, -0.1074f, -0.002f, -0.162f, -0.002f)
                curveToRelative(-1.5436f, 0.0f, -2.9925f, 0.8835f, -3.699f, 2.2559f)
                curveToRelative(-0.3088f, 0.5996f, -0.4234f, 1.2442f, -0.459f, 1.9003f)
                curveToRelative(-0.0321f, 0.589f, 0.0f, 1.1863f, 0.0f, 1.7696f)
                verticalLineToRelative(5.6523f)
                lineTo(3.184f, 18.2617f)
                reflectiveCurveToRelative(0.0022f, -2.784f, 0.0f, -5.1777f)
                curveToRelative(-0.0014f, -1.6112f, -0.0118f, -3.0471f, 0.0f, -3.3418f)
                curveToRelative(0.056f, -1.3937f, 0.4372f, -2.3053f, 1.1484f, -3.0508f)
                curveToRelative(2.3585f, 0.0018f, 3.8852f, 1.6091f, 3.9705f, 4.168f)
                curveToRelative(0.0196f, 0.5874f, 0.0254f, 3.7304f, 0.0254f, 3.7304f)
                verticalLineToRelative(3.672f)
                horizontalLineToRelative(3.1678f)
                verticalLineToRelative(-4.965f)
                curveToRelative(0.0f, -1.5007f, 0.0127f, -2.8006f, -0.0918f, -3.6952f)
                curveToRelative(-0.292f, -2.5f, -1.821f, -4.168f, -4.1248f, -4.168f)
                close()
                moveTo(15.6698f, 5.7344f)
                lineToRelative(-3.166f, 0.0039f)
                verticalLineToRelative(4.9648f)
                curveToRelative(0.0f, 1.5009f, -0.0127f, 2.8007f, 0.0919f, 3.6953f)
                curveToRelative(0.2921f, 2.5001f, 1.821f, 4.168f, 4.1248f, 4.168f)
                curveToRelative(1.1815f, 0.0f, 2.1846f, -0.4628f, 2.9432f, -1.252f)
                curveToRelative(3.0E-4f, -3.0E-4f, 0.0016f, 4.0E-4f, 0.002f, 0.0f)
                curveToRelative(0.0542f, 0.0023f, 0.1093f, 0.002f, 0.164f, 0.002f)
                curveToRelative(1.5435f, 0.0f, 2.9905f, -0.8835f, 3.6971f, -2.2558f)
                curveToRelative(0.3088f, -0.5997f, 0.4233f, -1.2442f, 0.459f, -1.9004f)
                curveToRelative(0.032f, -0.5889f, 0.0f, -1.1862f, 0.0f, -1.7695f)
                lineTo(23.9858f, 5.7383f)
                lineTo(20.816f, 5.7383f)
                reflectiveCurveToRelative(-0.0022f, 2.784f, 0.0f, 5.1777f)
                curveToRelative(0.0015f, 1.6113f, 0.0119f, 3.047f, 0.0f, 3.3418f)
                curveToRelative(-0.056f, 1.3935f, -0.4372f, 2.3053f, -1.1483f, 3.0508f)
                curveToRelative(-2.3586f, -0.0018f, -3.8853f, -1.6091f, -3.9706f, -4.168f)
                curveToRelative(-0.0196f, -0.5874f, -0.0273f, -2.0437f, -0.0273f, -3.7324f)
                close()
            }
        }
        .build()
        return _nubank!!
    }

private var _nubank: ImageVector? = null
