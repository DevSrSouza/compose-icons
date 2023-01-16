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

public val MaterialDesignIcons.ChartSankey: ImageVector
    get() {
        if (_chartSankey != null) {
            return _chartSankey!!
        }
        _chartSankey = Builder(name = "ChartSankey", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                curveTo(8.09f, 9.0f, 10.13f, 11.0f, 12.29f, 13.21f)
                reflectiveCurveTo(17.09f, 18.0f, 22.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(17.91f, 16.0f, 15.87f, 14.0f, 13.71f, 11.79f)
                reflectiveCurveTo(8.91f, 7.0f, 4.0f, 7.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _chartSankey!!
    }

private var _chartSankey: ImageVector? = null
