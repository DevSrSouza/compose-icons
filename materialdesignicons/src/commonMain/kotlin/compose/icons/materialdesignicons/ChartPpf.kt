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

public val MaterialDesignIcons.ChartPpf: ImageVector
    get() {
        if (_chartPpf != null) {
            return _chartPpf!!
        }
        _chartPpf = Builder(name = "ChartPpf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(8.2f, 8.0f, 11.36f, 9.18f, 13.57f, 11.15f)
                curveTo(15.64f, 13.0f, 16.83f, 15.5f, 17.0f, 18.0f)
                horizontalLineTo(18.97f)
                arcTo(14.0f, 12.5f, 0.0f, false, false, 5.0f, 6.0f)
                moveTo(22.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _chartPpf!!
    }

private var _chartPpf: ImageVector? = null
