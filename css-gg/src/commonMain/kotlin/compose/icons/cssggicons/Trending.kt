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

public val CssGgIcons.Trending: ImageVector
    get() {
        if (_trending != null) {
            return _trending!!
        }
        _trending = Builder(name = "Trending", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.414f, 16.432f)
                lineTo(0.0f, 15.018f)
                lineTo(7.071f, 7.947f)
                lineTo(13.435f, 14.311f)
                lineTo(17.678f, 10.068f)
                lineTo(15.935f, 8.326f)
                lineTo(22.627f, 6.533f)
                lineTo(20.834f, 13.225f)
                lineTo(19.092f, 11.483f)
                lineTo(13.435f, 17.139f)
                lineTo(7.071f, 10.775f)
                lineTo(1.414f, 16.432f)
                close()
            }
        }
        .build()
        return _trending!!
    }

private var _trending: ImageVector? = null
