package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.VisaFill: ImageVector
    get() {
        if (_visaFill != null) {
            return _visaFill!!
        }
        _visaFill = Builder(name = "VisaFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 6.0f)
                lineTo(1.0f, 4.0f)
                close()
                moveTo(1.0f, 18.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.622f, 14.914f)
                lineToRelative(-0.174f, -0.87f)
                horizontalLineToRelative(-1.949f)
                lineToRelative(-0.31f, 0.863f)
                lineToRelative(-1.562f, 0.003f)
                curveToRelative(1.005f, -2.406f, 1.75f, -4.19f, 2.236f, -5.348f)
                curveToRelative(0.127f, -0.303f, 0.353f, -0.457f, 0.685f, -0.455f)
                curveToRelative(0.254f, 0.002f, 0.669f, 0.002f, 1.245f, 0.0f)
                lineTo(21.0f, 14.912f)
                lineToRelative(-1.378f, 0.003f)
                close()
                moveTo(17.938f, 12.852f)
                horizontalLineToRelative(1.256f)
                lineToRelative(-0.47f, -2.18f)
                lineToRelative(-0.786f, 2.18f)
                close()
                moveTo(7.872f, 9.106f)
                lineToRelative(1.57f, 0.002f)
                lineToRelative(-2.427f, 5.806f)
                lineToRelative(-1.59f, -0.001f)
                curveToRelative(-0.537f, -2.07f, -0.932f, -3.606f, -1.184f, -4.605f)
                curveToRelative(-0.077f, -0.307f, -0.23f, -0.521f, -0.526f, -0.622f)
                curveToRelative(-0.263f, -0.09f, -0.701f, -0.23f, -1.315f, -0.419f)
                verticalLineToRelative(-0.16f)
                horizontalLineToRelative(2.509f)
                curveToRelative(0.434f, 0.0f, 0.687f, 0.21f, 0.769f, 0.64f)
                lineToRelative(0.62f, 3.289f)
                lineToRelative(1.574f, -3.93f)
                close()
                moveTo(11.599f, 9.108f)
                lineToRelative(-1.24f, 5.805f)
                lineToRelative(-1.495f, -0.002f)
                lineToRelative(1.24f, -5.805f)
                lineToRelative(1.495f, 0.002f)
                close()
                moveTo(14.631f, 9.0f)
                curveToRelative(0.446f, 0.0f, 1.01f, 0.138f, 1.334f, 0.267f)
                lineToRelative(-0.262f, 1.204f)
                curveToRelative(-0.293f, -0.118f, -0.775f, -0.277f, -1.18f, -0.27f)
                curveToRelative(-0.59f, 0.009f, -0.954f, 0.256f, -0.954f, 0.493f)
                curveToRelative(0.0f, 0.384f, 0.632f, 0.578f, 1.284f, 0.999f)
                curveToRelative(0.743f, 0.48f, 0.84f, 0.91f, 0.831f, 1.378f)
                curveToRelative(-0.01f, 0.971f, -0.831f, 1.929f, -2.564f, 1.929f)
                curveToRelative(-0.791f, -0.012f, -1.076f, -0.078f, -1.72f, -0.306f)
                lineToRelative(0.272f, -1.256f)
                curveToRelative(0.656f, 0.274f, 0.935f, 0.361f, 1.495f, 0.361f)
                curveToRelative(0.515f, 0.0f, 0.956f, -0.207f, 0.96f, -0.568f)
                curveToRelative(0.002f, -0.257f, -0.155f, -0.384f, -0.732f, -0.702f)
                curveToRelative(-0.577f, -0.317f, -1.385f, -0.756f, -1.375f, -1.64f)
                curveTo(12.033f, 9.759f, 13.107f, 9.0f, 14.63f, 9.0f)
                close()
            }
        }
        .build()
        return _visaFill!!
    }

private var _visaFill: ImageVector? = null
