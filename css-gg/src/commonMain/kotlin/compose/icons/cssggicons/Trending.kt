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
                moveTo(1.4142f, 16.4322f)
                lineTo(0.0f, 15.018f)
                lineTo(7.0711f, 7.9469f)
                lineTo(13.435f, 14.3109f)
                lineTo(17.6777f, 10.0682f)
                lineTo(15.9353f, 8.3259f)
                lineTo(22.6274f, 6.5327f)
                lineTo(20.8343f, 13.2248f)
                lineTo(19.0919f, 11.4825f)
                lineTo(13.435f, 17.1393f)
                lineTo(7.0711f, 10.7754f)
                lineTo(1.4142f, 16.4322f)
                close()
            }
        }
        .build()
        return _trending!!
    }

private var _trending: ImageVector? = null
