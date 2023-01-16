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

public val MaterialDesignIcons.ChartBubble: ImageVector
    get() {
        if (_chartBubble != null) {
            return _chartBubble!!
        }
        _chartBubble = Builder(name = "ChartBubble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2f, 11.2f)
                curveTo(8.97f, 11.2f, 10.4f, 12.63f, 10.4f, 14.4f)
                curveTo(10.4f, 16.17f, 8.97f, 17.6f, 7.2f, 17.6f)
                curveTo(5.43f, 17.6f, 4.0f, 16.17f, 4.0f, 14.4f)
                curveTo(4.0f, 12.63f, 5.43f, 11.2f, 7.2f, 11.2f)
                moveTo(14.8f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.8f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.8f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.8f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.8f, 16.0f)
                moveTo(15.2f, 4.0f)
                arcTo(4.8f, 4.8f, 0.0f, false, true, 20.0f, 8.8f)
                curveTo(20.0f, 11.45f, 17.85f, 13.6f, 15.2f, 13.6f)
                arcTo(4.8f, 4.8f, 0.0f, false, true, 10.4f, 8.8f)
                curveTo(10.4f, 6.15f, 12.55f, 4.0f, 15.2f, 4.0f)
                close()
            }
        }
        .build()
        return _chartBubble!!
    }

private var _chartBubble: ImageVector? = null
