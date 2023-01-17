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

public val SimpleIcons.Fantom: ImageVector
    get() {
        if (_fantom != null) {
            return _fantom!!
        }
        _fantom = Builder(name = "Fantom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9604f, 0.2299f)
                curveToRelative(0.5833f, -0.3065f, 1.4709f, -0.3065f, 2.0542f, 0.0f)
                lineToRelative(5.9522f, 3.1279f)
                curveToRelative(0.3513f, 0.1846f, 0.5442f, 0.4597f, 0.5788f, 0.7437f)
                horizontalLineToRelative(0.0057f)
                lineTo(19.5513f, 19.824f)
                curveToRelative(-0.0077f, 0.3097f, -0.2025f, 0.6174f, -0.5845f, 0.8182f)
                lineToRelative(-5.9522f, 3.1279f)
                curveToRelative(-0.5833f, 0.3065f, -1.4708f, 0.3065f, -2.0542f, 0.0f)
                lineToRelative(-5.9521f, -3.1279f)
                curveToRelative(-0.3804f, -0.1999f, -0.563f, -0.5098f, -0.572f, -0.8182f)
                arcToRelative(1.1165f, 1.1165f, 0.0f, false, true, -2.0E-4f, -0.0767f)
                lineTo(4.4361f, 4.2025f)
                arcToRelative(0.7965f, 0.7965f, 0.0f, false, true, -2.0E-4f, -0.051f)
                lineToRelative(4.0E-4f, -0.05f)
                horizontalLineToRelative(0.0026f)
                curveToRelative(0.0265f, -0.2871f, 0.2106f, -0.5552f, 0.5694f, -0.7437f)
                close()
                moveTo(18.6142f, 12.8729f)
                lineTo(13.0146f, 15.8156f)
                curveToRelative(-0.5833f, 0.3066f, -1.4709f, 0.3066f, -2.0542f, 0.0f)
                lineToRelative(-5.5874f, -2.936f)
                verticalLineToRelative(6.9132f)
                lineToRelative(5.5874f, 2.9207f)
                curveToRelative(0.3155f, 0.1678f, 0.643f, 0.3313f, 0.9632f, 0.3521f)
                lineToRelative(0.064f, 0.0021f)
                curveToRelative(0.3336f, 0.0011f, 0.6575f, -0.1674f, 0.986f, -0.327f)
                lineToRelative(5.6406f, -2.973f)
                close()
                moveTo(3.4682f, 19.4822f)
                curveToRelative(0.0f, 0.6022f, 0.0703f, 0.9982f, 0.21f, 1.2772f)
                curveToRelative(0.1158f, 0.2312f, 0.2896f, 0.4078f, 0.6068f, 0.6229f)
                lineToRelative(0.0181f, 0.0122f)
                arcToRelative(7.138f, 7.138f, 0.0f, false, false, 0.2397f, 0.153f)
                lineToRelative(0.1101f, 0.067f)
                lineToRelative(0.3381f, 0.2032f)
                lineToRelative(-0.4849f, 0.7976f)
                lineToRelative(-0.3784f, -0.2275f)
                lineToRelative(-0.0636f, -0.0388f)
                arcToRelative(8.4255f, 8.4255f, 0.0f, false, true, -0.2847f, -0.1817f)
                curveToRelative(-0.9042f, -0.6065f, -1.2414f, -1.2677f, -1.248f, -2.6433f)
                lineToRelative(-1.0E-4f, -0.0419f)
                close()
                moveTo(11.5189f, 8.6589f)
                arcToRelative(0.855f, 0.855f, 0.0f, false, false, -0.121f, 0.0514f)
                lineToRelative(-5.9521f, 3.1279f)
                arcToRelative(0.735f, 0.735f, 0.0f, false, false, -0.0179f, 0.0097f)
                lineToRelative(-0.005f, 0.0029f)
                lineToRelative(0.0093f, 0.0053f)
                lineToRelative(0.0136f, 0.0073f)
                lineToRelative(5.9522f, 3.1279f)
                arcToRelative(0.8546f, 0.8546f, 0.0f, false, false, 0.121f, 0.0514f)
                close()
                moveTo(12.4561f, 8.6589f)
                verticalLineToRelative(6.3839f)
                arcToRelative(0.8538f, 0.8538f, 0.0f, false, false, 0.121f, -0.0514f)
                lineToRelative(5.9521f, -3.128f)
                arcToRelative(0.8117f, 0.8117f, 0.0f, false, false, 0.0179f, -0.0096f)
                lineToRelative(0.005f, -0.003f)
                lineToRelative(-0.0094f, -0.0052f)
                lineToRelative(-0.0136f, -0.0073f)
                lineToRelative(-5.9521f, -3.128f)
                arcToRelative(0.8534f, 0.8534f, 0.0f, false, false, -0.121f, -0.0513f)
                close()
                moveTo(18.6142f, 5.2168f)
                lineTo(13.2748f, 8.0228f)
                lineTo(18.6142f, 10.8287f)
                close()
                moveTo(5.373f, 5.2234f)
                verticalLineToRelative(5.5987f)
                lineTo(10.7f, 8.0227f)
                close()
                moveTo(12.577f, 1.0542f)
                curveToRelative(-0.3095f, -0.1627f, -0.8695f, -0.1627f, -1.179f, 0.0f)
                lineTo(5.4458f, 4.182f)
                arcToRelative(0.6432f, 0.6432f, 0.0f, false, false, -0.0179f, 0.0097f)
                lineToRelative(-0.005f, 0.003f)
                lineToRelative(0.0093f, 0.0052f)
                lineToRelative(0.0136f, 0.0074f)
                lineToRelative(5.9522f, 3.1279f)
                curveToRelative(0.3095f, 0.1626f, 0.8695f, 0.1626f, 1.179f, 0.0f)
                lineToRelative(5.9522f, -3.128f)
                arcToRelative(0.643f, 0.643f, 0.0f, false, false, 0.0179f, -0.0097f)
                lineToRelative(0.005f, -0.0029f)
                lineToRelative(-0.0094f, -0.0053f)
                lineToRelative(-0.0136f, -0.0073f)
                close()
                moveTo(19.4939f, 1.3972f)
                lineTo(19.8723f, 1.6245f)
                lineTo(19.9359f, 1.6634f)
                curveToRelative(0.1094f, 0.0672f, 0.2f, 0.125f, 0.2847f, 0.1817f)
                curveToRelative(0.9042f, 0.6065f, 1.2414f, 1.2677f, 1.248f, 2.6433f)
                lineToRelative(1.0E-4f, 0.0419f)
                horizontalLineToRelative(-0.9368f)
                curveToRelative(0.0f, -0.6024f, -0.0704f, -0.9983f, -0.2101f, -1.2773f)
                curveToRelative(-0.1158f, -0.2312f, -0.2896f, -0.4078f, -0.6068f, -0.6228f)
                lineToRelative(-0.0181f, -0.0122f)
                arcToRelative(7.2984f, 7.2984f, 0.0f, false, false, -0.2397f, -0.1532f)
                lineToRelative(-0.1101f, -0.067f)
                lineToRelative(-0.3381f, -0.203f)
                close()
            }
        }
        .build()
        return _fantom!!
    }

private var _fantom: ImageVector? = null
