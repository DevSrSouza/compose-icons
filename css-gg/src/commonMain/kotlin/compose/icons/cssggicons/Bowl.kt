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

public val CssGgIcons.Bowl: ImageVector
    get() {
        if (_bowl != null) {
            return _bowl!!
        }
        _bowl = Builder(name = "Bowl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.5468f, 3.6716f)
                curveTo(20.1563f, 3.2811f, 19.5231f, 3.2811f, 19.1326f, 3.6716f)
                lineTo(13.7687f, 9.0356f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0356f)
                horizontalLineTo(2.0084f)
                curveTo(2.2256f, 16.3663f, 6.6159f, 20.6213f, 12.0f, 20.6213f)
                curveTo(17.3841f, 20.6213f, 21.7744f, 16.3663f, 21.9916f, 11.0356f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0356f)
                horizontalLineTo(16.5971f)
                lineTo(20.5468f, 5.0858f)
                curveTo(20.9374f, 4.6953f, 20.9374f, 4.0621f, 20.5468f, 3.6716f)
                close()
                moveTo(14.1762f, 11.0356f)
                curveTo(14.1806f, 11.0356f, 14.1851f, 11.0356f, 14.1896f, 11.0356f)
                horizontalLineTo(19.9895f)
                curveTo(19.7739f, 15.2613f, 16.2793f, 18.6213f, 12.0f, 18.6213f)
                curveTo(7.7207f, 18.6213f, 4.2261f, 15.2613f, 4.0105f, 11.0356f)
                horizontalLineTo(14.1762f)
                close()
            }
        }
        .build()
        return _bowl!!
    }

private var _bowl: ImageVector? = null
