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

public val CssGgIcons.ArrowLongRightR: ImageVector
    get() {
        if (_arrowLongRightR != null) {
            return _arrowLongRightR!!
        }
        _arrowLongRightR = Builder(name = "ArrowLongRightR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.351f, 7.725f)
                lineTo(23.601f, 11.961f)
                lineTo(19.365f, 16.211f)
                lineTo(17.949f, 14.799f)
                lineTo(19.763f, 12.978f)
                lineTo(7.897f, 13.019f)
                lineTo(4.642f, 16.275f)
                lineTo(0.399f, 12.032f)
                lineTo(4.642f, 7.789f)
                lineTo(7.871f, 11.019f)
                lineTo(19.782f, 10.978f)
                lineTo(17.94f, 9.142f)
                lineTo(19.351f, 7.725f)
                close()
                moveTo(4.642f, 13.446f)
                lineTo(6.056f, 12.032f)
                lineTo(4.642f, 10.618f)
                lineTo(3.227f, 12.032f)
                lineTo(4.642f, 13.446f)
                close()
            }
        }
        .build()
        return _arrowLongRightR!!
    }

private var _arrowLongRightR: ImageVector? = null
