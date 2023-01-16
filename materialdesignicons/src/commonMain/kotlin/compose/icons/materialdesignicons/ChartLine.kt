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

public val MaterialDesignIcons.ChartLine: ImageVector
    get() {
        if (_chartLine != null) {
            return _chartLine!!
        }
        _chartLine = Builder(name = "ChartLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 11.78f)
                lineTo(20.24f, 4.45f)
                lineTo(21.97f, 5.45f)
                lineTo(16.74f, 14.5f)
                lineTo(10.23f, 10.75f)
                lineTo(5.46f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.54f)
                lineTo(9.5f, 8.0f)
                lineTo(16.0f, 11.78f)
                close()
            }
        }
        .build()
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
