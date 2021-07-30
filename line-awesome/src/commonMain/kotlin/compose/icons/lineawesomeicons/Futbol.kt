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

public val LineAwesomeIcons.Futbol: ImageVector
    get() {
        if (_futbol != null) {
            return _futbol!!
        }
        _futbol = Builder(name = "Futbol", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.6016f, 5.0f, 17.1758f, 5.0625f, 17.75f, 5.1563f)
                lineTo(16.0f, 6.4063f)
                lineTo(14.25f, 5.1563f)
                curveTo(14.8203f, 5.0664f, 15.4023f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.8125f, 5.8438f)
                lineTo(15.4063f, 8.4688f)
                lineTo(16.0f, 8.9063f)
                lineTo(16.5938f, 8.4688f)
                lineTo(20.1875f, 5.8438f)
                curveTo(21.7852f, 6.5078f, 23.1953f, 7.5234f, 24.3125f, 8.8125f)
                lineTo(22.9375f, 13.0938f)
                lineTo(22.7188f, 13.7813f)
                lineTo(23.3125f, 14.1875f)
                lineTo(26.9375f, 16.8438f)
                curveTo(26.8047f, 18.6055f, 26.2656f, 20.2578f, 25.4063f, 21.6875f)
                lineTo(20.125f, 21.6875f)
                lineTo(19.9063f, 22.375f)
                lineTo(18.5f, 26.7188f)
                curveTo(17.6992f, 26.9063f, 16.8594f, 27.0f, 16.0f, 27.0f)
                curveTo(15.1055f, 27.0f, 14.2383f, 26.8867f, 13.4063f, 26.6875f)
                lineTo(12.0313f, 22.4063f)
                lineTo(11.8125f, 21.7188f)
                lineTo(6.5938f, 21.7188f)
                curveTo(5.7188f, 20.2813f, 5.1992f, 18.6211f, 5.0625f, 16.8438f)
                lineTo(8.6563f, 14.2188f)
                lineTo(9.25f, 13.8125f)
                lineTo(9.0313f, 13.125f)
                lineTo(7.625f, 8.875f)
                curveTo(8.75f, 7.5547f, 10.1836f, 6.5156f, 11.8125f, 5.8438f)
                close()
                moveTo(16.0f, 10.0938f)
                lineTo(15.4063f, 10.5313f)
                lineTo(10.8438f, 13.8438f)
                lineTo(10.2813f, 14.2813f)
                lineTo(10.5f, 14.9688f)
                lineTo(12.25f, 20.3125f)
                lineTo(12.4688f, 21.0f)
                lineTo(19.5313f, 21.0f)
                lineTo(19.75f, 20.3125f)
                lineTo(21.5f, 14.9688f)
                lineTo(21.7188f, 14.2813f)
                lineTo(21.1563f, 13.8438f)
                lineTo(16.5938f, 10.5313f)
                close()
                moveTo(25.75f, 10.9063f)
                curveTo(26.2969f, 11.9531f, 26.6563f, 13.1016f, 26.8438f, 14.3125f)
                lineTo(25.0625f, 13.0313f)
                close()
                moveTo(6.2188f, 10.9688f)
                lineTo(6.9063f, 13.0313f)
                lineTo(5.1563f, 14.3125f)
                curveTo(5.3398f, 13.125f, 5.6875f, 12.0f, 6.2188f, 10.9688f)
                close()
                moveTo(16.0f, 12.5938f)
                lineTo(19.375f, 15.0313f)
                lineTo(18.0938f, 19.0f)
                lineTo(13.9063f, 19.0f)
                lineTo(12.625f, 15.0313f)
                close()
                moveTo(21.5938f, 23.6875f)
                lineTo(23.8438f, 23.6875f)
                curveTo(22.9922f, 24.5664f, 22.0117f, 25.293f, 20.9063f, 25.8438f)
                close()
                moveTo(8.1563f, 23.7188f)
                lineTo(10.3438f, 23.7188f)
                lineTo(11.0313f, 25.8125f)
                curveTo(9.9609f, 25.2695f, 8.9883f, 24.5625f, 8.1563f, 23.7188f)
                close()
            }
        }
        .build()
        return _futbol!!
    }

private var _futbol: ImageVector? = null
