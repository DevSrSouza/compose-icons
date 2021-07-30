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

public val SimpleIcons.Ngrok: ImageVector
    get() {
        if (_ngrok != null) {
            return _ngrok!!
        }
        _ngrok = Builder(name = "Ngrok", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.951f, 7.598f)
                verticalLineToRelative(6.713f)
                horizontalLineToRelative(1.463f)
                verticalLineToRelative(-1.69f)
                lineToRelative(1.61f, 1.69f)
                lineTo(24.0f, 14.311f)
                verticalLineToRelative(-0.08f)
                lineToRelative(-2.123f, -2.153f)
                lineToRelative(2.002f, -1.846f)
                verticalLineToRelative(-0.07f)
                lineTo(21.95f, 10.162f)
                lineToRelative(-1.537f, 1.496f)
                verticalLineToRelative(-4.06f)
                close()
                moveTo(16.021f, 10.008f)
                arcToRelative(2.626f, 2.626f, 0.0f, false, false, -1.787f, 0.635f)
                arcToRelative(2.049f, 2.049f, 0.0f, false, false, -0.703f, 1.556f)
                curveToRelative(-0.002f, 0.75f, 0.311f, 1.287f, 0.7f, 1.643f)
                curveToRelative(0.526f, 0.478f, 1.221f, 0.626f, 1.767f, 0.623f)
                curveToRelative(0.666f, 0.0f, 1.34f, -0.195f, 1.805f, -0.62f)
                curveToRelative(0.521f, -0.483f, 0.713f, -1.029f, 0.713f, -1.607f)
                curveToRelative(0.0f, -0.73f, -0.31f, -1.247f, -0.71f, -1.603f)
                curveToRelative(-0.553f, -0.475f, -1.202f, -0.628f, -1.785f, -0.627f)
                close()
                moveTo(6.959f, 10.047f)
                curveToRelative(-1.188f, -0.005f, -2.1f, 0.977f, -2.104f, 2.25f)
                curveToRelative(-0.004f, 1.296f, 0.908f, 2.108f, 2.032f, 2.096f)
                curveToRelative(0.664f, 0.002f, 0.983f, -0.244f, 1.308f, -0.541f)
                verticalLineToRelative(1.193f)
                horizontalLineToRelative(-1.37f)
                lineToRelative(-1.03f, 1.158f)
                verticalLineToRelative(0.2f)
                lineTo(9.66f, 16.403f)
                verticalLineToRelative(-6.24f)
                lineTo(8.195f, 10.163f)
                verticalLineToRelative(0.435f)
                curveToRelative(-0.381f, -0.408f, -0.772f, -0.542f, -1.236f, -0.551f)
                close()
                moveTo(2.154f, 10.157f)
                lineToRelative(-0.691f, 0.786f)
                verticalLineToRelative(-0.771f)
                lineTo(0.0f, 10.172f)
                verticalLineToRelative(4.15f)
                horizontalLineToRelative(1.463f)
                verticalLineToRelative(-2.799f)
                curveToRelative(0.547f, 0.002f, 1.023f, -0.002f, 1.49f, -0.003f)
                verticalLineToRelative(2.802f)
                horizontalLineToRelative(1.465f)
                verticalLineToRelative(-2.595f)
                curveToRelative(-0.004f, -0.547f, -0.1f, -0.819f, -0.307f, -1.061f)
                arcToRelative(1.431f, 1.431f, 0.0f, false, false, -0.914f, -0.51f)
                close()
                moveTo(10.268f, 10.162f)
                verticalLineToRelative(4.15f)
                horizontalLineToRelative(1.468f)
                lineToRelative(0.002f, -2.779f)
                horizontalLineToRelative(1.065f)
                lineToRelative(1.164f, -1.314f)
                verticalLineToRelative(-0.057f)
                horizontalLineToRelative(-1.598f)
                lineToRelative(-0.635f, 0.715f)
                verticalLineToRelative(-0.715f)
                close()
                moveTo(7.322f, 11.277f)
                curveToRelative(0.504f, 0.0f, 0.96f, 0.444f, 0.948f, 0.948f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, -0.948f, 0.945f)
                curveToRelative(-0.523f, 0.0f, -0.931f, -0.403f, -0.947f, -0.945f)
                curveToRelative(-0.002f, -0.52f, 0.443f, -0.94f, 0.947f, -0.948f)
                close()
                moveTo(16.025f, 11.278f)
                curveToRelative(0.525f, 0.0f, 0.94f, 0.434f, 0.944f, 0.95f)
                curveToRelative(-0.027f, 0.544f, -0.42f, 0.95f, -0.944f, 0.95f)
                reflectiveCurveToRelative(-0.934f, -0.417f, -0.95f, -0.95f)
                arcToRelative(0.955f, 0.955f, 0.0f, false, true, 0.95f, -0.95f)
                close()
            }
        }
        .build()
        return _ngrok!!
    }

private var _ngrok: ImageVector? = null
