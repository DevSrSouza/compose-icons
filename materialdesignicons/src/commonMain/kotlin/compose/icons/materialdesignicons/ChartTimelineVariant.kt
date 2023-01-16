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

public val MaterialDesignIcons.ChartTimelineVariant: ImageVector
    get() {
        if (_chartTimelineVariant != null) {
            return _chartTimelineVariant!!
        }
        _chartTimelineVariant = Builder(name = "ChartTimelineVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                lineTo(3.5f, 14.07f)
                lineTo(8.07f, 9.5f)
                curveTo(7.89f, 8.85f, 8.06f, 8.11f, 8.59f, 7.59f)
                curveTo(9.37f, 6.8f, 10.63f, 6.8f, 11.41f, 7.59f)
                curveTo(11.94f, 8.11f, 12.11f, 8.85f, 11.93f, 9.5f)
                lineTo(14.5f, 12.07f)
                lineTo(15.0f, 12.0f)
                curveTo(15.18f, 12.0f, 15.35f, 12.0f, 15.5f, 12.07f)
                lineTo(19.07f, 8.5f)
                curveTo(19.0f, 8.35f, 19.0f, 8.18f, 19.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 10.0f)
                curveTo(20.82f, 10.0f, 20.65f, 10.0f, 20.5f, 9.93f)
                lineTo(16.93f, 13.5f)
                curveTo(17.0f, 13.65f, 17.0f, 13.82f, 17.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 14.0f)
                lineTo(13.07f, 13.5f)
                lineTo(10.5f, 10.93f)
                curveTo(10.18f, 11.0f, 9.82f, 11.0f, 9.5f, 10.93f)
                lineTo(4.93f, 15.5f)
                lineTo(5.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 14.0f)
                close()
            }
        }
        .build()
        return _chartTimelineVariant!!
    }

private var _chartTimelineVariant: ImageVector? = null
