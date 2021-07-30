package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Pushed: ImageVector
    get() {
        if (_pushed != null) {
            return _pushed!!
        }
        _pushed = Builder(name = "Pushed", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5313f, 4.0039f)
                curveTo(20.4095f, 3.9941f, 20.2878f, 4.0007f, 20.168f, 4.0234f)
                lineTo(5.6309f, 6.4023f)
                curveTo(4.8219f, 6.5473f, 4.2384f, 7.3833f, 4.4844f, 8.3633f)
                lineTo(10.1152f, 27.0254f)
                curveTo(10.4632f, 28.1664f, 12.0819f, 28.3224f, 12.6719f, 27.4004f)
                lineTo(14.5625f, 23.0723f)
                lineTo(27.3906f, 10.6777f)
                curveTo(28.2696f, 9.7777f, 27.62f, 8.3793f, 26.457f, 8.2773f)
                lineTo(20.9551f, 7.7969f)
                lineTo(21.7051f, 6.0059f)
                curveTo(22.1925f, 4.9042f, 21.3835f, 4.0726f, 20.5313f, 4.0039f)
                close()
                moveTo(20.3711f, 5.1543f)
                curveTo(20.6441f, 5.1163f, 20.7734f, 5.2878f, 20.6504f, 5.5508f)
                lineTo(19.75f, 7.6895f)
                lineTo(10.2441f, 6.8164f)
                lineTo(20.3711f, 5.1543f)
                close()
                moveTo(5.9688f, 7.5762f)
                lineTo(19.2949f, 8.793f)
                lineTo(14.1016f, 21.1523f)
                lineTo(5.6406f, 8.0625f)
                curveTo(5.4746f, 7.7895f, 5.6958f, 7.5282f, 5.9688f, 7.5762f)
                close()
                moveTo(20.4883f, 8.9043f)
                lineTo(26.4141f, 9.4258f)
                curveTo(26.6291f, 9.4838f, 26.7217f, 9.7078f, 26.5547f, 9.8848f)
                lineTo(15.6816f, 20.3555f)
                lineTo(20.4883f, 8.9043f)
                close()
                moveTo(6.7559f, 11.9102f)
                lineTo(13.5977f, 22.498f)
                curveTo(13.2227f, 23.301f, 11.7129f, 26.7363f, 11.7129f, 26.7363f)
                curveTo(11.5739f, 26.9503f, 11.288f, 26.9038f, 11.207f, 26.6738f)
                lineTo(6.7559f, 11.9102f)
                close()
            }
        }
        .build()
        return _pushed!!
    }

private var _pushed: ImageVector? = null
