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

public val FilledGroup.ArrowSortDownLines: ImageVector
    get() {
        if (_arrowSortDownLines != null) {
            return _arrowSortDownLines!!
        }
        _arrowSortDownLines = Builder(name = "ArrowSortDownLines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.0039f)
                lineTo(8.3834f, 4.0106f)
                curveTo(7.886f, 4.0684f, 7.5f, 4.4911f, 7.5f, 5.0039f)
                lineTo(7.5f, 16.5837f)
                lineTo(5.2068f, 14.2933f)
                lineTo(5.1125f, 14.2101f)
                curveTo(4.7201f, 13.9053f, 4.1529f, 13.9333f, 3.7926f, 14.2939f)
                curveTo(3.4022f, 14.6846f, 3.4025f, 15.3178f, 3.7932f, 15.7081f)
                lineTo(7.797f, 19.7081f)
                lineTo(7.8912f, 19.7913f)
                curveTo(8.2837f, 20.0961f, 8.8509f, 20.0681f, 9.2112f, 19.7075f)
                lineTo(13.2074f, 15.7075f)
                lineTo(13.2906f, 15.6132f)
                curveTo(13.5954f, 15.2208f, 13.5674f, 14.6536f, 13.2068f, 14.2933f)
                lineTo(13.1125f, 14.2101f)
                curveTo(12.7201f, 13.9053f, 12.1529f, 13.9333f, 11.7926f, 14.2939f)
                lineTo(9.5f, 16.5877f)
                lineTo(9.5f, 5.0039f)
                lineTo(9.4933f, 4.8873f)
                curveTo(9.4355f, 4.3899f, 9.0128f, 4.0039f, 8.5f, 4.0039f)
                close()
                moveTo(13.0f, 5.0f)
                curveTo(12.4477f, 5.0f, 12.0f, 5.4477f, 12.0f, 6.0f)
                curveTo(12.0f, 6.5523f, 12.4477f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 7.0f, 22.0f, 6.5523f, 22.0f, 6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(12.4477f, 8.0f, 12.0f, 8.4477f, 12.0f, 9.0f)
                curveTo(12.0f, 9.5523f, 12.4477f, 10.0f, 13.0f, 10.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 10.0f, 19.0f, 9.5523f, 19.0f, 9.0f)
                curveTo(19.0f, 8.4477f, 18.5523f, 8.0f, 18.0f, 8.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(12.0f, 11.4477f, 12.4477f, 11.0f, 13.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 11.0f, 16.0f, 11.4477f, 16.0f, 12.0f)
                curveTo(16.0f, 12.5523f, 15.5523f, 13.0f, 15.0f, 13.0f)
                horizontalLineTo(13.0f)
                curveTo(12.4477f, 13.0f, 12.0f, 12.5523f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowSortDownLines!!
    }

private var _arrowSortDownLines: ImageVector? = null
