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

public val CssGgIcons.ArrowLongUpR: ImageVector
    get() {
        if (_arrowLongUpR != null) {
            return _arrowLongUpR!!
        }
        _arrowLongUpR = Builder(name = "ArrowLongUpR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.793f, 4.609f)
                lineTo(12.068f, 0.399f)
                lineTo(16.278f, 4.674f)
                lineTo(14.854f, 6.077f)
                lineTo(13.05f, 4.246f)
                lineTo(12.981f, 16.132f)
                lineTo(16.207f, 19.358f)
                lineTo(11.964f, 23.601f)
                lineTo(7.722f, 19.358f)
                lineTo(10.981f, 16.099f)
                lineTo(11.05f, 4.209f)
                lineTo(9.197f, 6.034f)
                lineTo(7.793f, 4.609f)
                close()
                moveTo(11.964f, 20.773f)
                lineTo(13.378f, 19.358f)
                lineTo(11.964f, 17.944f)
                lineTo(10.55f, 19.358f)
                lineTo(11.964f, 20.773f)
                close()
            }
        }
        .build()
        return _arrowLongUpR!!
    }

private var _arrowLongUpR: ImageVector? = null
