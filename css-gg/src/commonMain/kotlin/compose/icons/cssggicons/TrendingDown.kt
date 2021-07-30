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
                moveTo(1.851f, 8.1063f)
                lineTo(0.4368f, 9.5205f)
                lineTo(7.5079f, 16.5916f)
                lineTo(13.8719f, 10.2276f)
                lineTo(18.1145f, 14.4702f)
                lineTo(16.3721f, 16.2126f)
                lineTo(23.0642f, 18.0058f)
                lineTo(21.2711f, 11.3136f)
                lineTo(19.5287f, 13.056f)
                lineTo(13.8719f, 7.3992f)
                lineTo(7.5079f, 13.7631f)
                lineTo(1.851f, 8.1063f)
                close()
            }
        }
        .build()
        return _trendingDown!!
    }

private var _trendingDown: ImageVector? = null
