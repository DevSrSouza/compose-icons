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

public val FilledGroup.ArrowTrendingText: ImageVector
    get() {
        if (_arrowTrendingText != null) {
            return _arrowTrendingText!!
        }
        _arrowTrendingText = Builder(name = "ArrowTrendingText", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveTo(21.0f, 3.4477f, 20.5523f, 3.0f, 20.0f, 3.0f)
                lineTo(15.0f, 3.0f)
                curveTo(14.4477f, 3.0f, 14.0f, 3.4477f, 14.0f, 4.0f)
                curveTo(14.0f, 4.5523f, 14.4477f, 5.0f, 15.0f, 5.0f)
                lineTo(17.5858f, 5.0f)
                lineTo(12.5f, 10.0858f)
                lineTo(10.7071f, 8.2929f)
                curveTo(10.5196f, 8.1053f, 10.2652f, 8.0f, 10.0f, 8.0f)
                curveTo(9.7348f, 8.0f, 9.4804f, 8.1053f, 9.2929f, 8.2929f)
                lineTo(3.2929f, 14.2929f)
                curveTo(2.9024f, 14.6834f, 2.9024f, 15.3166f, 3.2929f, 15.7071f)
                curveTo(3.6834f, 16.0976f, 4.3166f, 16.0976f, 4.7071f, 15.7071f)
                lineTo(10.0f, 10.4142f)
                lineTo(11.7929f, 12.2071f)
                curveTo(11.9463f, 12.3605f, 12.1445f, 12.459f, 12.3567f, 12.4897f)
                curveTo(12.6528f, 12.2955f, 12.9853f, 12.1522f, 13.3418f, 12.0724f)
                lineTo(19.0f, 6.4142f)
                lineTo(19.0f, 9.0f)
                curveTo(19.0f, 9.5523f, 19.4477f, 10.0f, 20.0f, 10.0f)
                curveTo(20.5523f, 10.0f, 21.0f, 9.5523f, 21.0f, 9.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(14.0f, 13.0f)
                curveTo(12.8954f, 13.0f, 12.0f, 13.8954f, 12.0f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(12.0f, 22.1046f, 12.8954f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1046f, 23.0f, 23.0f, 22.1046f, 23.0f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 13.8954f, 22.1046f, 13.0f, 21.0f, 13.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(14.0f, 16.5f)
                curveTo(14.0f, 16.2239f, 14.2239f, 16.0f, 14.5f, 16.0f)
                horizontalLineTo(20.5f)
                curveTo(20.7761f, 16.0f, 21.0f, 16.2239f, 21.0f, 16.5f)
                curveTo(21.0f, 16.7761f, 20.7761f, 17.0f, 20.5f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(14.2239f, 17.0f, 14.0f, 16.7761f, 14.0f, 16.5f)
                close()
                moveTo(14.0f, 19.5f)
                curveTo(14.0f, 19.2239f, 14.2239f, 19.0f, 14.5f, 19.0f)
                horizontalLineTo(20.5f)
                curveTo(20.7761f, 19.0f, 21.0f, 19.2239f, 21.0f, 19.5f)
                curveTo(21.0f, 19.7761f, 20.7761f, 20.0f, 20.5f, 20.0f)
                horizontalLineTo(14.5f)
                curveTo(14.2239f, 20.0f, 14.0f, 19.7761f, 14.0f, 19.5f)
                close()
            }
        }
        .build()
        return _arrowTrendingText!!
    }

private var _arrowTrendingText: ImageVector? = null
