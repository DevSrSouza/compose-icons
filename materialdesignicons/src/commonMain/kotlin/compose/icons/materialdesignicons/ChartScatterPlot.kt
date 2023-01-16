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

public val MaterialDesignIcons.ChartScatterPlot: ImageVector
    get() {
        if (_chartScatterPlot != null) {
            return _chartScatterPlot!!
        }
        _chartScatterPlot = Builder(name = "ChartScatterPlot", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                moveTo(9.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 10.0f)
                moveTo(13.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 2.0f)
                moveTo(18.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _chartScatterPlot!!
    }

private var _chartScatterPlot: ImageVector? = null
