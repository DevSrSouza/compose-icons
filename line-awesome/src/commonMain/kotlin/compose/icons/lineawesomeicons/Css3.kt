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

public val LineAwesomeIcons.Css3: ImageVector
    get() {
        if (_css3 != null) {
            return _css3!!
        }
        _css3 = Builder(name = "Css3", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2188f, 5.0f)
                lineTo(8.0625f, 5.8125f)
                lineTo(7.5625f, 8.6875f)
                lineTo(7.3438f, 9.875f)
                lineTo(21.4688f, 9.875f)
                lineTo(21.1563f, 11.6875f)
                lineTo(7.0313f, 11.6875f)
                lineTo(6.875f, 12.5f)
                lineTo(6.375f, 15.375f)
                lineTo(6.1563f, 16.5313f)
                lineTo(20.2813f, 16.5313f)
                lineTo(19.5625f, 20.5938f)
                lineTo(14.3438f, 23.0f)
                lineTo(10.25f, 20.75f)
                lineTo(10.4688f, 19.5313f)
                lineTo(10.6875f, 18.375f)
                lineTo(5.8125f, 18.375f)
                lineTo(5.6875f, 19.1875f)
                lineTo(5.0f, 23.0f)
                lineTo(4.8438f, 23.75f)
                lineTo(5.5313f, 24.0938f)
                lineTo(13.3438f, 27.9063f)
                lineTo(13.75f, 28.0938f)
                lineTo(14.1563f, 27.9375f)
                lineTo(23.3125f, 24.0938f)
                lineTo(23.8125f, 23.9063f)
                lineTo(23.9375f, 23.3438f)
                lineTo(27.0f, 6.1875f)
                lineTo(27.2188f, 5.0f)
                close()
                moveTo(9.875f, 7.0f)
                lineTo(24.8125f, 7.0f)
                lineTo(22.0625f, 22.4688f)
                lineTo(13.7813f, 25.875f)
                lineTo(7.0938f, 22.625f)
                lineTo(7.5f, 20.375f)
                lineTo(8.2813f, 20.375f)
                lineTo(8.0313f, 21.8125f)
                lineTo(8.6563f, 22.1563f)
                lineTo(13.8125f, 25.0f)
                lineTo(14.25f, 25.25f)
                lineTo(14.7188f, 25.0313f)
                lineTo(20.875f, 22.1875f)
                lineTo(21.3438f, 21.9688f)
                lineTo(21.4375f, 21.4375f)
                lineTo(22.4688f, 15.7188f)
                lineTo(22.6875f, 14.5313f)
                lineTo(8.5625f, 14.5313f)
                lineTo(8.6875f, 13.6875f)
                lineTo(22.8438f, 13.6875f)
                lineTo(22.9688f, 12.8438f)
                lineTo(23.6563f, 9.0313f)
                lineTo(23.875f, 7.875f)
                lineTo(9.75f, 7.875f)
                close()
            }
        }
        .build()
        return _css3!!
    }

private var _css3: ImageVector? = null
