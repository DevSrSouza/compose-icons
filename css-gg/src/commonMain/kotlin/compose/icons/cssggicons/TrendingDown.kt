package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.TrendingDown: ImageVector
    get() {
        if (_trendingDown != null) {
            return _trendingDown!!
        }
        _trendingDown = Builder(name = "TrendingDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.851f, 8.106f)
                lineTo(0.437f, 9.52f)
                lineTo(7.508f, 16.592f)
                lineTo(13.872f, 10.228f)
                lineTo(18.115f, 14.47f)
                lineTo(16.372f, 16.213f)
                lineTo(23.064f, 18.006f)
                lineTo(21.271f, 11.314f)
                lineTo(19.529f, 13.056f)
                lineTo(13.872f, 7.399f)
                lineTo(7.508f, 13.763f)
                lineTo(1.851f, 8.106f)
                close()
            }
        }
        .build()
        return _trendingDown!!
    }

private var _trendingDown: ImageVector? = null
