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

public val MaterialDesignIcons.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(5.9f, 21.5f, 2.0f, 17.2f, 2.0f, 12.0f)
                curveTo(2.0f, 6.8f, 5.9f, 2.5f, 11.0f, 2.0f)
                moveTo(13.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                curveTo(21.5f, 6.2f, 17.8f, 2.5f, 13.0f, 2.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(22.0f)
                curveTo(17.7f, 21.5f, 21.5f, 17.8f, 22.0f, 13.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
