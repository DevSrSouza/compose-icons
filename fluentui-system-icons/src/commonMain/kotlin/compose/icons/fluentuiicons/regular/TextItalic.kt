package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.TextItalic: ImageVector
    get() {
        if (_textItalic != null) {
            return _textItalic!!
        }
        _textItalic = Builder(name = "TextItalic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9515f, 5.0162f)
                curveTo(12.0984f, 4.6289f, 11.9035f, 4.1959f, 11.5162f, 4.049f)
                curveTo(11.1289f, 3.9021f, 10.6959f, 4.0969f, 10.549f, 4.4842f)
                lineTo(5.049f, 18.9842f)
                curveTo(4.9021f, 19.3715f, 5.0969f, 19.8045f, 5.4842f, 19.9515f)
                curveTo(5.8715f, 20.0984f, 6.3046f, 19.9035f, 6.4514f, 19.5162f)
                lineTo(9.1837f, 12.3131f)
                lineTo(15.6858f, 19.7441f)
                curveTo(15.9585f, 20.0558f, 16.4324f, 20.0874f, 16.7441f, 19.8146f)
                curveTo(17.0558f, 19.5419f, 17.0874f, 19.068f, 16.8147f, 18.7563f)
                lineTo(10.3844f, 11.4075f)
                lineTo(19.659f, 5.379f)
                curveTo(20.0063f, 5.1533f, 20.1048f, 4.6887f, 19.8791f, 4.3415f)
                curveTo(19.6533f, 3.9942f, 19.1888f, 3.8956f, 18.8415f, 4.1214f)
                lineTo(10.1473f, 9.7726f)
                lineTo(11.9515f, 5.0162f)
                close()
            }
        }
        .build()
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
