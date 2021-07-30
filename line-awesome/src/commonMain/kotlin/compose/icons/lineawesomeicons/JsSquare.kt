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

public val LineAwesomeIcons.JsSquare: ImageVector
    get() {
        if (_jsSquare != null) {
            return _jsSquare!!
        }
        _jsSquare = Builder(name = "JsSquare", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(20.2441f, 15.0f)
                curveTo(18.8191f, 15.0f, 17.8984f, 15.9121f, 17.8984f, 17.1191f)
                curveTo(17.8984f, 18.4301f, 18.6672f, 19.0568f, 19.8262f, 19.5508f)
                lineTo(20.2266f, 19.7227f)
                curveTo(20.9586f, 20.0457f, 21.3945f, 20.2342f, 21.3945f, 20.7852f)
                curveTo(21.3945f, 21.2502f, 20.9677f, 21.584f, 20.3027f, 21.584f)
                curveTo(19.5147f, 21.584f, 19.0666f, 21.1665f, 18.7246f, 20.6055f)
                lineTo(17.4141f, 21.3555f)
                curveTo(17.8791f, 22.2865f, 18.8478f, 23.0f, 20.3398f, 23.0f)
                curveTo(21.8598f, 23.0f, 23.0f, 22.2116f, 23.0f, 20.7676f)
                curveTo(23.0f, 19.4186f, 22.2303f, 18.8192f, 20.8613f, 18.2402f)
                lineTo(20.4629f, 18.0684f)
                curveTo(19.7699f, 17.7644f, 19.4746f, 17.5648f, 19.4746f, 17.0898f)
                curveTo(19.4746f, 16.6998f, 19.7691f, 16.3965f, 20.2441f, 16.3965f)
                curveTo(20.7101f, 16.3965f, 21.0033f, 16.5958f, 21.2793f, 17.0898f)
                lineTo(22.5352f, 16.2832f)
                curveTo(22.0032f, 15.3522f, 21.2701f, 15.0f, 20.2441f, 15.0f)
                close()
                moveTo(14.3945f, 15.0957f)
                lineTo(14.3945f, 20.5586f)
                curveTo(14.3945f, 21.3566f, 14.0523f, 21.5645f, 13.5293f, 21.5645f)
                curveTo(12.9783f, 21.5645f, 12.7411f, 21.1853f, 12.4941f, 20.7383f)
                lineTo(11.1836f, 21.5273f)
                curveTo(11.5636f, 22.3353f, 12.3127f, 23.0f, 13.5957f, 23.0f)
                curveTo(15.0207f, 23.0f, 16.0f, 22.2392f, 16.0f, 20.5762f)
                lineTo(16.0f, 15.0957f)
                lineTo(14.3945f, 15.0957f)
                close()
            }
        }
        .build()
        return _jsSquare!!
    }

private var _jsSquare: ImageVector? = null
