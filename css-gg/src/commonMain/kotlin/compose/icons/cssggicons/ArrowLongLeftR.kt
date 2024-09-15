package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongLeftR: ImageVector
    get() {
        if (_arrowLongLeftR != null) {
            return _arrowLongLeftR!!
        }
        _arrowLongLeftR = Builder(name = "ArrowLongLeftR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.649f, 7.725f)
                lineTo(0.399f, 11.961f)
                lineTo(4.634f, 16.211f)
                lineTo(6.051f, 14.799f)
                lineTo(4.237f, 12.978f)
                lineTo(16.103f, 13.019f)
                lineTo(19.358f, 16.275f)
                lineTo(23.601f, 12.032f)
                lineTo(19.358f, 7.789f)
                lineTo(16.129f, 11.019f)
                lineTo(4.218f, 10.978f)
                lineTo(6.061f, 9.142f)
                lineTo(4.649f, 7.725f)
                close()
                moveTo(17.944f, 12.032f)
                lineTo(19.358f, 10.618f)
                lineTo(20.773f, 12.032f)
                lineTo(19.358f, 13.446f)
                lineTo(17.944f, 12.032f)
                close()
            }
        }
        .build()
        return _arrowLongLeftR!!
    }

private var _arrowLongLeftR: ImageVector? = null
