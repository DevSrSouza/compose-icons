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

public val MaterialDesignIcons.ChartLineStacked: ImageVector
    get() {
        if (_chartLineStacked != null) {
            return _chartLineStacked!!
        }
        _chartLineStacked = Builder(name = "ChartLineStacked", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.45f, 15.18f)
                lineTo(22.0f, 6.81f)
                verticalLineTo(19.0f)
                lineTo(22.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.54f)
                lineTo(4.0f, 19.0f)
                horizontalLineTo(4.31f)
                lineTo(6.0f, 19.0f)
                horizontalLineTo(6.57f)
                lineTo(10.96f, 11.44f)
                lineTo(17.45f, 15.18f)
                moveTo(22.0f, 3.0f)
                lineTo(21.97f, 3.45f)
                lineTo(17.0f, 11.0f)
                lineTo(10.0f, 6.0f)
                lineTo(6.0f, 12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _chartLineStacked!!
    }

private var _chartLineStacked: ImageVector? = null
