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

public val CssGgIcons.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.319f, 14.4326f)
                curveTo(20.7628f, 11.2941f, 20.542f, 6.7535f, 17.6569f, 3.8683f)
                curveTo(14.5327f, 0.7441f, 9.4673f, 0.7441f, 6.3432f, 3.8683f)
                curveTo(3.219f, 6.9925f, 3.219f, 12.0578f, 6.3432f, 15.182f)
                curveTo(9.2283f, 18.0672f, 13.769f, 18.2879f, 16.9075f, 15.8442f)
                curveTo(16.921f, 15.8595f, 16.9351f, 15.8745f, 16.9497f, 15.8891f)
                lineTo(21.1924f, 20.1317f)
                curveTo(21.5829f, 20.5223f, 22.2161f, 20.5223f, 22.6066f, 20.1317f)
                curveTo(22.9971f, 19.7412f, 22.9971f, 19.1081f, 22.6066f, 18.7175f)
                lineTo(18.364f, 14.4749f)
                curveTo(18.3493f, 14.4603f, 18.3343f, 14.4462f, 18.319f, 14.4326f)
                close()
                moveTo(16.2426f, 5.2825f)
                curveTo(18.5858f, 7.6256f, 18.5858f, 11.4246f, 16.2426f, 13.7678f)
                curveTo(13.8995f, 16.1109f, 10.1005f, 16.1109f, 7.7574f, 13.7678f)
                curveTo(5.4142f, 11.4246f, 5.4142f, 7.6256f, 7.7574f, 5.2825f)
                curveTo(10.1005f, 2.9394f, 13.8995f, 2.9394f, 16.2426f, 5.2825f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
