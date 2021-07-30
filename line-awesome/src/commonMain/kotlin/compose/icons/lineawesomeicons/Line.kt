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

public val LineAwesomeIcons.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.625f, 5.0f)
                curveTo(7.0898f, 5.0f, 5.0f, 7.0898f, 5.0f, 9.625f)
                lineTo(5.0f, 22.375f)
                curveTo(5.0f, 24.9102f, 7.0898f, 27.0f, 9.625f, 27.0f)
                lineTo(22.375f, 27.0f)
                curveTo(24.9102f, 27.0f, 27.0f, 24.9102f, 27.0f, 22.375f)
                lineTo(27.0f, 9.625f)
                curveTo(27.0f, 7.0898f, 24.9102f, 5.0f, 22.375f, 5.0f)
                close()
                moveTo(9.625f, 7.0f)
                lineTo(22.375f, 7.0f)
                curveTo(23.8281f, 7.0f, 25.0f, 8.1719f, 25.0f, 9.625f)
                lineTo(25.0f, 22.375f)
                curveTo(25.0f, 23.8281f, 23.8281f, 25.0f, 22.375f, 25.0f)
                lineTo(9.625f, 25.0f)
                curveTo(8.1719f, 25.0f, 7.0f, 23.8281f, 7.0f, 22.375f)
                lineTo(7.0f, 9.625f)
                curveTo(7.0f, 8.1719f, 8.1719f, 7.0f, 9.625f, 7.0f)
                close()
                moveTo(16.0f, 9.2188f)
                curveTo(11.9844f, 9.2188f, 8.7188f, 11.8672f, 8.7188f, 15.125f)
                curveTo(8.7188f, 18.0469f, 11.3125f, 20.4766f, 14.8125f, 20.9375f)
                curveTo(15.0508f, 20.9883f, 15.3555f, 21.1094f, 15.4375f, 21.3125f)
                curveTo(15.5117f, 21.4961f, 15.4922f, 21.7813f, 15.4688f, 21.9688f)
                curveTo(15.4688f, 21.9688f, 15.3945f, 22.4844f, 15.375f, 22.5938f)
                curveTo(15.3438f, 22.7773f, 15.2227f, 23.3281f, 16.0f, 23.0f)
                curveTo(16.7773f, 22.6719f, 20.1914f, 20.5078f, 21.7188f, 18.75f)
                curveTo(22.7734f, 17.5938f, 23.2813f, 16.4297f, 23.2813f, 15.125f)
                curveTo(23.2813f, 11.8672f, 20.0156f, 9.2188f, 16.0f, 9.2188f)
                close()
                moveTo(11.7188f, 13.4063f)
                curveTo(11.9297f, 13.4063f, 12.0938f, 13.5703f, 12.0938f, 13.7813f)
                lineTo(12.0938f, 16.2813f)
                lineTo(13.1563f, 16.2813f)
                curveTo(13.3672f, 16.2813f, 13.5313f, 16.4766f, 13.5313f, 16.6875f)
                curveTo(13.5313f, 16.8984f, 13.3672f, 17.0625f, 13.1563f, 17.0625f)
                lineTo(11.7188f, 17.0625f)
                curveTo(11.5078f, 17.0625f, 11.3125f, 16.8984f, 11.3125f, 16.6875f)
                lineTo(11.3125f, 13.7813f)
                curveTo(11.3125f, 13.5703f, 11.5078f, 13.4063f, 11.7188f, 13.4063f)
                close()
                moveTo(14.2813f, 13.4063f)
                curveTo(14.4922f, 13.4063f, 14.6563f, 13.5703f, 14.6563f, 13.7813f)
                lineTo(14.6563f, 16.6875f)
                curveTo(14.6563f, 16.8984f, 14.4922f, 17.0625f, 14.2813f, 17.0625f)
                curveTo(14.0703f, 17.0625f, 13.875f, 16.8984f, 13.875f, 16.6875f)
                lineTo(13.875f, 13.7813f)
                curveTo(13.875f, 13.5703f, 14.0703f, 13.4063f, 14.2813f, 13.4063f)
                close()
                moveTo(15.4688f, 13.4063f)
                curveTo(15.5078f, 13.3945f, 15.5547f, 13.4063f, 15.5938f, 13.4063f)
                curveTo(15.7109f, 13.4063f, 15.8047f, 13.4648f, 15.875f, 13.5625f)
                lineTo(17.375f, 15.5625f)
                lineTo(17.375f, 13.7813f)
                curveTo(17.375f, 13.5703f, 17.5391f, 13.4063f, 17.75f, 13.4063f)
                curveTo(17.9609f, 13.4063f, 18.125f, 13.5703f, 18.125f, 13.7813f)
                lineTo(18.125f, 16.6875f)
                curveTo(18.125f, 16.8516f, 18.0313f, 16.9805f, 17.875f, 17.0313f)
                curveTo(17.8359f, 17.043f, 17.7891f, 17.0625f, 17.75f, 17.0625f)
                curveTo(17.6328f, 17.0625f, 17.5078f, 17.0039f, 17.4375f, 16.9063f)
                lineTo(15.9688f, 14.875f)
                lineTo(15.9688f, 16.6875f)
                curveTo(15.9688f, 16.8984f, 15.8047f, 17.0625f, 15.5938f, 17.0625f)
                curveTo(15.3828f, 17.0625f, 15.1875f, 16.8984f, 15.1875f, 16.6875f)
                lineTo(15.1875f, 13.7813f)
                curveTo(15.1875f, 13.6172f, 15.3125f, 13.457f, 15.4688f, 13.4063f)
                close()
                moveTo(19.0313f, 13.4063f)
                lineTo(20.4688f, 13.4063f)
                curveTo(20.6797f, 13.4063f, 20.8438f, 13.5703f, 20.8438f, 13.7813f)
                curveTo(20.8438f, 13.9922f, 20.6797f, 14.1563f, 20.4688f, 14.1563f)
                lineTo(19.4063f, 14.1563f)
                lineTo(19.4063f, 14.8438f)
                lineTo(20.4688f, 14.8438f)
                curveTo(20.6797f, 14.8438f, 20.8438f, 15.0078f, 20.8438f, 15.2188f)
                curveTo(20.8438f, 15.4297f, 20.6797f, 15.625f, 20.4688f, 15.625f)
                lineTo(19.4063f, 15.625f)
                lineTo(19.4063f, 16.2813f)
                lineTo(20.4688f, 16.2813f)
                curveTo(20.6797f, 16.2813f, 20.8438f, 16.4766f, 20.8438f, 16.6875f)
                curveTo(20.8438f, 16.8984f, 20.6797f, 17.0625f, 20.4688f, 17.0625f)
                lineTo(19.0313f, 17.0625f)
                curveTo(18.8203f, 17.0625f, 18.6563f, 16.8984f, 18.6563f, 16.6875f)
                lineTo(18.6563f, 13.7813f)
                curveTo(18.6563f, 13.5703f, 18.8203f, 13.4063f, 19.0313f, 13.4063f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
