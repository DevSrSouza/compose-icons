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

public val CssGgIcons.ArrowLongDownR: ImageVector
    get() {
        if (_arrowLongDownR != null) {
            return _arrowLongDownR!!
        }
        _arrowLongDownR = Builder(name = "ArrowLongDownR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.242f, 4.641f)
                lineTo(11.999f, 0.399f)
                lineTo(7.756f, 4.641f)
                lineTo(11.0f, 7.886f)
                lineTo(11.013f, 19.787f)
                lineTo(9.168f, 17.952f)
                lineTo(7.758f, 19.37f)
                lineTo(12.013f, 23.601f)
                lineTo(16.244f, 19.347f)
                lineTo(14.825f, 17.936f)
                lineTo(13.013f, 19.759f)
                lineTo(13.0f, 7.883f)
                lineTo(16.242f, 4.641f)
                close()
                moveTo(10.585f, 4.641f)
                lineTo(11.999f, 3.227f)
                lineTo(13.413f, 4.641f)
                lineTo(11.999f, 6.056f)
                lineTo(10.585f, 4.641f)
                close()
            }
        }
        .build()
        return _arrowLongDownR!!
    }

private var _arrowLongDownR: ImageVector? = null
