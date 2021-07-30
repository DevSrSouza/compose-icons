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

public val SimpleIcons.Webrtc: ImageVector
    get() {
        if (_webrtc != null) {
            return _webrtc!!
        }
        _webrtc = Builder(name = "Webrtc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 0.3598f)
                curveToRelative(-2.8272f, 0.0f, -5.1456f, 2.1733f, -5.3793f, 4.94f)
                arcToRelative(5.4117f, 5.4117f, 0.0f, false, false, -1.2207f, -0.1401f)
                curveTo(2.418f, 5.1597f, 0.0f, 7.5779f, 0.0f, 10.5603f)
                curveToRelative(0.0f, 2.2203f, 1.341f, 4.1274f, 3.2568f, 4.957f)
                arcToRelative(5.3734f, 5.3734f, 0.0f, false, false, -0.7372f, 2.7227f)
                curveToRelative(0.0f, 2.9823f, 2.4175f, 5.4002f, 5.4002f, 5.4002f)
                curveToRelative(1.6627f, 0.0f, 3.1492f, -0.7522f, 4.1397f, -1.934f)
                curveToRelative(0.9906f, 1.1818f, 2.4773f, 1.934f, 4.1398f, 1.934f)
                curveToRelative(2.983f, 0.0f, 5.4004f, -2.418f, 5.4004f, -5.4002f)
                curveToRelative(0.0f, -0.9719f, -0.258f, -1.883f, -0.7073f, -2.6708f)
                curveTo(22.7283f, 14.7068f, 24.0f, 12.8418f, 24.0f, 10.6795f)
                curveToRelative(0.0f, -2.9823f, -2.4175f, -5.4006f, -5.3998f, -5.4006f)
                curveToRelative(-0.417f, 0.0f, -0.8223f, 0.049f, -1.2121f, 0.1384f)
                curveTo(17.2112f, 2.5949f, 14.867f, 0.3598f, 11.9998f, 0.3598f)
                close()
                moveTo(6.2828f, 7.2281f)
                horizontalLineToRelative(10.5924f)
                curveToRelative(0.7458f, 0.0f, 1.352f, 0.605f, 1.352f, 1.3487f)
                verticalLineToRelative(7.6463f)
                curveToRelative(0.0f, 0.7438f, -0.6062f, 1.3482f, -1.352f, 1.3482f)
                horizontalLineToRelative(-3.6085f)
                lineToRelative(-7.24f, 3.5491f)
                lineToRelative(1.1008f, -3.5491f)
                horizontalLineToRelative(-0.8447f)
                curveToRelative(-0.7458f, 0.0f, -1.3522f, -0.6044f, -1.3522f, -1.3482f)
                lineTo(4.9306f, 8.5768f)
                curveToRelative(0.0f, -0.7438f, 0.6064f, -1.3487f, 1.3522f, -1.3487f)
                close()
            }
        }
        .build()
        return _webrtc!!
    }

private var _webrtc: ImageVector? = null
