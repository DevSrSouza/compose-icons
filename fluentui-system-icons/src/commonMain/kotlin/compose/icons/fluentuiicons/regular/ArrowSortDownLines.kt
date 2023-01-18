package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowSortDownLines: ImageVector
    get() {
        if (_arrowSortDownLines != null) {
            return _arrowSortDownLines!!
        }
        _arrowSortDownLines = Builder(name = "ArrowSortDownLines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7509f, 4.0f)
                lineTo(8.6491f, 4.0068f)
                curveTo(8.283f, 4.0565f, 8.0009f, 4.3703f, 8.0009f, 4.75f)
                lineTo(8.0f, 17.442f)
                lineTo(4.7801f, 14.2244f)
                lineTo(4.696f, 14.1518f)
                curveTo(4.4023f, 13.9341f, 3.9856f, 13.9585f, 3.7194f, 14.2248f)
                curveTo(3.4267f, 14.5179f, 3.4269f, 14.9927f, 3.7199f, 15.2855f)
                lineTo(8.2236f, 19.7855f)
                lineTo(8.3078f, 19.8581f)
                curveTo(8.6015f, 20.0758f, 9.0182f, 20.0514f, 9.2843f, 19.7851f)
                lineTo(13.7806f, 15.2851f)
                lineTo(13.8531f, 15.2009f)
                curveTo(14.0709f, 14.9072f, 14.0465f, 14.4905f, 13.7801f, 14.2244f)
                lineTo(13.696f, 14.1518f)
                curveTo(13.4023f, 13.9341f, 12.9856f, 13.9585f, 12.7194f, 14.2248f)
                lineTo(9.5f, 17.446f)
                lineTo(9.5009f, 4.75f)
                lineTo(9.494f, 4.6482f)
                curveTo(9.4444f, 4.2821f, 9.1306f, 4.0f, 8.7509f, 4.0f)
                close()
                moveTo(12.25f, 4.5f)
                curveTo(11.8358f, 4.5f, 11.5f, 4.8358f, 11.5f, 5.25f)
                curveTo(11.5f, 5.6642f, 11.8358f, 6.0f, 12.25f, 6.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 6.0f, 21.0f, 5.6642f, 21.0f, 5.25f)
                curveTo(21.0f, 4.8358f, 20.6642f, 4.5f, 20.25f, 4.5f)
                horizontalLineTo(12.25f)
                close()
                moveTo(11.5f, 8.25f)
                curveTo(11.5f, 7.8358f, 11.8358f, 7.5f, 12.25f, 7.5f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 7.5f, 18.0f, 7.8358f, 18.0f, 8.25f)
                curveTo(18.0f, 8.6642f, 17.6642f, 9.0f, 17.25f, 9.0f)
                horizontalLineTo(12.25f)
                curveTo(11.8358f, 9.0f, 11.5f, 8.6642f, 11.5f, 8.25f)
                close()
                moveTo(12.25f, 10.5f)
                curveTo(11.8358f, 10.5f, 11.5f, 10.8358f, 11.5f, 11.25f)
                curveTo(11.5f, 11.6642f, 11.8358f, 12.0f, 12.25f, 12.0f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 12.0f, 15.0f, 11.6642f, 15.0f, 11.25f)
                curveTo(15.0f, 10.8358f, 14.6642f, 10.5f, 14.25f, 10.5f)
                horizontalLineTo(12.25f)
                close()
            }
        }
        .build()
        return _arrowSortDownLines!!
    }

private var _arrowSortDownLines: ImageVector? = null
