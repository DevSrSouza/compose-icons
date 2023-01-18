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

public val RegularGroup.ArrowSortDown: ImageVector
    get() {
        if (_arrowSortDown != null) {
            return _arrowSortDown!!
        }
        _arrowSortDown = Builder(name = "ArrowSortDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.6491f, 4.0068f)
                lineTo(11.7509f, 4.0f)
                curveTo(12.1306f, 4.0f, 12.4444f, 4.2821f, 12.494f, 4.6482f)
                lineTo(12.5009f, 4.75f)
                lineTo(12.5f, 17.446f)
                lineTo(15.7194f, 14.2248f)
                curveTo(15.9856f, 13.9585f, 16.4023f, 13.9341f, 16.696f, 14.1518f)
                lineTo(16.7801f, 14.2244f)
                curveTo(17.0465f, 14.4905f, 17.0709f, 14.9072f, 16.8531f, 15.2009f)
                lineTo(16.7806f, 15.2851f)
                lineTo(12.2843f, 19.7851f)
                curveTo(12.0182f, 20.0514f, 11.6015f, 20.0758f, 11.3078f, 19.8581f)
                lineTo(11.2237f, 19.7855f)
                lineTo(6.7199f, 15.2855f)
                curveTo(6.4269f, 14.9927f, 6.4267f, 14.5179f, 6.7194f, 14.2248f)
                curveTo(6.9856f, 13.9585f, 7.4023f, 13.9341f, 7.696f, 14.1518f)
                lineTo(7.7801f, 14.2244f)
                lineTo(11.0f, 17.442f)
                lineTo(11.0009f, 4.75f)
                curveTo(11.0009f, 4.3703f, 11.283f, 4.0565f, 11.6491f, 4.0068f)
                lineTo(11.7509f, 4.0f)
                lineTo(11.6491f, 4.0068f)
                close()
            }
        }
        .build()
        return _arrowSortDown!!
    }

private var _arrowSortDown: ImageVector? = null
