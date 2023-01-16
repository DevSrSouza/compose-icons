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

public val MaterialDesignIcons.ChartAreaspline: ImageVector
    get() {
        if (_chartAreaspline != null) {
            return _chartAreaspline!!
        }
        _chartAreaspline = Builder(name = "ChartAreaspline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.45f, 15.18f)
                lineTo(22.0f, 7.31f)
                verticalLineTo(19.0f)
                lineTo(22.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.54f)
                lineTo(9.5f, 6.0f)
                lineTo(16.0f, 9.78f)
                lineTo(20.24f, 2.45f)
                lineTo(21.97f, 3.45f)
                lineTo(16.74f, 12.5f)
                lineTo(10.23f, 8.75f)
                lineTo(4.31f, 19.0f)
                horizontalLineTo(6.57f)
                lineTo(10.96f, 11.44f)
                lineTo(17.45f, 15.18f)
                close()
            }
        }
        .build()
        return _chartAreaspline!!
    }

private var _chartAreaspline: ImageVector? = null
