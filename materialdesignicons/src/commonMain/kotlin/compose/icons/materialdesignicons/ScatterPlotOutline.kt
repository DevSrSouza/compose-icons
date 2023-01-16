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

public val MaterialDesignIcons.ScatterPlotOutline: ImageVector
    get() {
        if (_scatterPlotOutline != null) {
            return _scatterPlotOutline!!
        }
        _scatterPlotOutline = Builder(name = "ScatterPlotOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 3.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 18.0f)
                moveTo(7.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 12.0f)
                moveTo(11.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 10.0f)
                moveTo(11.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 4.0f)
                moveTo(16.6f, 21.6f)
                curveTo(14.39f, 21.6f, 12.6f, 19.81f, 12.6f, 17.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.6f, 13.6f)
                curveTo(18.81f, 13.6f, 20.6f, 15.39f, 20.6f, 17.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.6f, 21.6f)
                moveTo(16.6f, 15.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.6f, 17.6f)
                curveTo(14.6f, 18.7f, 15.5f, 19.6f, 16.6f, 19.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.6f, 17.6f)
                curveTo(18.6f, 16.5f, 17.7f, 15.6f, 16.6f, 15.6f)
                close()
            }
        }
        .build()
        return _scatterPlotOutline!!
    }

private var _scatterPlotOutline: ImageVector? = null
