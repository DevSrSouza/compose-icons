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

public val MaterialDesignIcons.ScatterPlot: ImageVector
    get() {
        if (_scatterPlot != null) {
            return _scatterPlot!!
        }
        _scatterPlot = Builder(name = "ScatterPlot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 11.0f)
                moveTo(11.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 3.0f)
                moveTo(16.6f, 14.6f)
                curveTo(18.25f, 14.6f, 19.6f, 15.94f, 19.6f, 17.6f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.6f, 20.6f)
                curveTo(14.94f, 20.6f, 13.6f, 19.25f, 13.6f, 17.6f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.6f, 14.6f)
                close()
            }
        }
        .build()
        return _scatterPlot!!
    }

private var _scatterPlot: ImageVector? = null
