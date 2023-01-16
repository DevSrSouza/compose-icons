package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.ChartTimelineVariantShimmer: ImageVector
    get() {
        if (_chartTimelineVariantShimmer != null) {
            return _chartTimelineVariantShimmer!!
        }
        _chartTimelineVariantShimmer = Builder(name = "ChartTimelineVariantShimmer", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                curveTo(19.5f, 8.0f, 18.7f, 9.4f, 19.1f, 10.5f)
                lineTo(15.5f, 14.1f)
                curveTo(15.2f, 14.0f, 14.8f, 14.0f, 14.5f, 14.1f)
                lineTo(11.9f, 11.5f)
                curveTo(12.3f, 10.4f, 11.5f, 9.0f, 10.0f, 9.0f)
                curveTo(8.6f, 9.0f, 7.7f, 10.4f, 8.1f, 11.5f)
                lineTo(3.5f, 16.0f)
                curveTo(2.4f, 15.7f, 1.0f, 16.5f, 1.0f, 18.0f)
                curveTo(1.0f, 19.1f, 1.9f, 20.0f, 3.0f, 20.0f)
                curveTo(4.4f, 20.0f, 5.3f, 18.6f, 4.9f, 17.5f)
                lineTo(9.4f, 12.9f)
                curveTo(9.7f, 13.0f, 10.1f, 13.0f, 10.4f, 12.9f)
                lineTo(13.0f, 15.5f)
                curveTo(12.7f, 16.5f, 13.5f, 18.0f, 15.0f, 18.0f)
                curveTo(16.5f, 18.0f, 17.3f, 16.6f, 16.9f, 15.5f)
                lineTo(20.5f, 11.9f)
                curveTo(21.6f, 12.2f, 23.0f, 11.4f, 23.0f, 10.0f)
                curveTo(23.0f, 8.9f, 22.1f, 8.0f, 21.0f, 8.0f)
                moveTo(15.0f, 9.0f)
                lineTo(15.9f, 6.9f)
                lineTo(18.0f, 6.0f)
                lineTo(15.9f, 5.1f)
                lineTo(15.0f, 3.0f)
                lineTo(14.1f, 5.1f)
                lineTo(12.0f, 6.0f)
                lineTo(14.1f, 6.9f)
                lineTo(15.0f, 9.0f)
                moveTo(3.5f, 11.0f)
                lineTo(4.0f, 9.0f)
                lineTo(6.0f, 8.5f)
                lineTo(4.0f, 8.0f)
                lineTo(3.5f, 6.0f)
                lineTo(3.0f, 8.0f)
                lineTo(1.0f, 8.5f)
                lineTo(3.0f, 9.0f)
                lineTo(3.5f, 11.0f)
                close()
            }
        }
        .build()
        return _chartTimelineVariantShimmer!!
    }

private var _chartTimelineVariantShimmer: ImageVector? = null
