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

public val LineAwesomeIcons.BookReaderSolid: ImageVector
    get() {
        if (_bookReaderSolid != null) {
            return _bookReaderSolid!!
        }
        _bookReaderSolid = Builder(name = "BookReaderSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(12.6992f, 4.0f, 10.0f, 6.6992f, 10.0f, 10.0f)
                curveTo(10.0f, 11.0078f, 10.2461f, 11.9453f, 10.6875f, 12.7813f)
                curveTo(8.8633f, 12.3359f, 6.6406f, 12.0f, 4.0f, 12.0f)
                lineTo(2.7188f, 12.0f)
                lineTo(6.2188f, 26.0f)
                lineTo(7.0f, 26.0f)
                curveTo(10.4063f, 26.0f, 12.5f, 26.4883f, 13.7188f, 26.9375f)
                curveTo(14.3281f, 27.1641f, 14.7148f, 27.3867f, 14.9375f, 27.5313f)
                curveTo(15.1602f, 27.6758f, 15.1875f, 27.6875f, 15.1875f, 27.6875f)
                lineTo(15.4688f, 28.0f)
                lineTo(16.5313f, 28.0f)
                lineTo(16.8125f, 27.6875f)
                curveTo(16.8125f, 27.6875f, 16.8398f, 27.6758f, 17.0625f, 27.5313f)
                curveTo(17.2852f, 27.3867f, 17.6719f, 27.1641f, 18.2813f, 26.9375f)
                curveTo(19.5f, 26.4883f, 21.5938f, 26.0f, 25.0f, 26.0f)
                lineTo(25.7813f, 26.0f)
                lineTo(29.2813f, 12.0f)
                lineTo(28.0f, 12.0f)
                curveTo(25.3711f, 12.0f, 23.1523f, 12.3164f, 21.3438f, 12.75f)
                curveTo(21.7734f, 11.9258f, 22.0f, 10.9922f, 22.0f, 10.0f)
                curveTo(22.0f, 6.6992f, 19.3008f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(18.2227f, 6.0f, 20.0f, 7.7773f, 20.0f, 10.0f)
                curveTo(20.0f, 12.2227f, 18.2227f, 14.0f, 16.0f, 14.0f)
                curveTo(13.7773f, 14.0f, 12.0f, 12.2227f, 12.0f, 10.0f)
                curveTo(12.0f, 7.7773f, 13.7773f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(5.3125f, 14.125f)
                curveTo(8.4219f, 14.2773f, 10.9609f, 14.8164f, 12.625f, 15.4375f)
                curveTo(13.9648f, 15.9375f, 14.625f, 16.3242f, 15.0f, 16.5625f)
                lineTo(15.0f, 25.3125f)
                curveTo(14.8203f, 25.2305f, 14.6563f, 25.1445f, 14.4375f, 25.0625f)
                curveTo(13.0859f, 24.5625f, 10.8672f, 24.1406f, 7.7813f, 24.0625f)
                close()
                moveTo(26.6875f, 14.125f)
                lineTo(24.2188f, 24.0625f)
                curveTo(21.1328f, 24.1406f, 18.9141f, 24.5625f, 17.5625f, 25.0625f)
                curveTo(17.3438f, 25.1445f, 17.1797f, 25.2305f, 17.0f, 25.3125f)
                lineTo(17.0f, 16.5625f)
                curveTo(17.375f, 16.3203f, 18.0313f, 15.9297f, 19.3438f, 15.4375f)
                curveTo(20.9961f, 14.8164f, 23.5391f, 14.2773f, 26.6875f, 14.125f)
                close()
            }
        }
        .build()
        return _bookReaderSolid!!
    }

private var _bookReaderSolid: ImageVector? = null
