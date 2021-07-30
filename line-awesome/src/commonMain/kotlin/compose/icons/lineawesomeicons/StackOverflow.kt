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

public val LineAwesomeIcons.StackOverflow: ImageVector
    get() {
        if (_stackOverflow != null) {
            return _stackOverflow!!
        }
        _stackOverflow = Builder(name = "StackOverflow", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5938f, 2.8438f)
                lineTo(17.9688f, 3.9688f)
                lineTo(23.5625f, 12.1875f)
                lineTo(25.1875f, 11.0625f)
                close()
                moveTo(15.375f, 6.5313f)
                lineTo(14.0625f, 8.0313f)
                lineTo(21.5625f, 14.5313f)
                lineTo(22.875f, 13.0313f)
                close()
                moveTo(12.375f, 10.9063f)
                lineTo(11.4688f, 12.6875f)
                lineTo(20.3125f, 17.1875f)
                lineTo(21.2188f, 15.4063f)
                close()
                moveTo(10.6563f, 15.4375f)
                lineTo(10.2188f, 17.375f)
                lineTo(19.875f, 19.6563f)
                lineTo(20.3125f, 17.7188f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(6.0f, 29.0f)
                lineTo(24.0f, 29.0f)
                lineTo(24.0f, 18.0f)
                lineTo(22.0f, 18.0f)
                lineTo(22.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 18.0f)
                close()
                moveTo(10.0938f, 19.6875f)
                lineTo(9.9688f, 21.6875f)
                lineTo(19.875f, 22.25f)
                lineTo(20.0f, 20.25f)
                close()
                moveTo(10.0f, 23.0f)
                lineTo(10.0f, 25.0f)
                lineTo(19.9375f, 25.0f)
                lineTo(19.9375f, 23.0f)
                close()
            }
        }
        .build()
        return _stackOverflow!!
    }

private var _stackOverflow: ImageVector? = null
