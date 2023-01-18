package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ArrowTrendingLines: ImageVector
    get() {
        if (_arrowTrendingLines != null) {
            return _arrowTrendingLines!!
        }
        _arrowTrendingLines = Builder(name = "ArrowTrendingLines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                curveTo(16.4477f, 4.0f, 16.0f, 3.5523f, 16.0f, 3.0f)
                curveTo(16.0f, 2.4477f, 16.4477f, 2.0f, 17.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 2.0f, 22.0f, 2.4477f, 22.0f, 3.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 7.5523f, 21.5523f, 8.0f, 21.0f, 8.0f)
                curveTo(20.4477f, 8.0f, 20.0f, 7.5523f, 20.0f, 7.0f)
                verticalLineTo(5.4142f)
                lineTo(14.2071f, 11.2071f)
                curveTo(13.8166f, 11.5976f, 13.1834f, 11.5976f, 12.7929f, 11.2071f)
                lineTo(10.0f, 8.4142f)
                lineTo(4.7071f, 13.7071f)
                curveTo(4.3166f, 14.0976f, 3.6834f, 14.0976f, 3.2929f, 13.7071f)
                curveTo(2.9024f, 13.3166f, 2.9024f, 12.6834f, 3.2929f, 12.2929f)
                lineTo(9.2929f, 6.2929f)
                curveTo(9.4804f, 6.1054f, 9.7348f, 6.0f, 10.0f, 6.0f)
                curveTo(10.2652f, 6.0f, 10.5196f, 6.1054f, 10.7071f, 6.2929f)
                lineTo(13.5f, 9.0858f)
                lineTo(18.5858f, 4.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(5.0f, 18.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.5523f, 4.5523f, 22.0f, 4.0f, 22.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 17.4477f, 3.4477f, 17.0f, 4.0f, 17.0f)
                curveTo(4.5523f, 17.0f, 5.0f, 17.4477f, 5.0f, 18.0f)
                close()
                moveTo(10.0f, 14.0f)
                curveTo(10.0f, 13.4477f, 9.5523f, 13.0f, 9.0f, 13.0f)
                curveTo(8.4477f, 13.0f, 8.0f, 13.4477f, 8.0f, 14.0f)
                verticalLineTo(21.0f)
                curveTo(8.0f, 21.5523f, 8.4477f, 22.0f, 9.0f, 22.0f)
                curveTo(9.5523f, 22.0f, 10.0f, 21.5523f, 10.0f, 21.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(14.0f, 15.0f)
                curveTo(14.5523f, 15.0f, 15.0f, 15.4477f, 15.0f, 16.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.5523f, 14.5523f, 22.0f, 14.0f, 22.0f)
                curveTo(13.4477f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                verticalLineTo(16.0f)
                curveTo(13.0f, 15.4477f, 13.4477f, 15.0f, 14.0f, 15.0f)
                close()
                moveTo(20.0f, 11.0f)
                curveTo(20.0f, 10.4477f, 19.5523f, 10.0f, 19.0f, 10.0f)
                curveTo(18.4477f, 10.0f, 18.0f, 10.4477f, 18.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(18.0f, 21.5523f, 18.4477f, 22.0f, 19.0f, 22.0f)
                curveTo(19.5523f, 22.0f, 20.0f, 21.5523f, 20.0f, 21.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _arrowTrendingLines!!
    }

private var _arrowTrendingLines: ImageVector? = null
