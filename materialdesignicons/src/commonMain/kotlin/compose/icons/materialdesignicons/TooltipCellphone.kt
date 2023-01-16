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

public val MaterialDesignIcons.TooltipCellphone: ImageVector
    get() {
        if (_tooltipCellphone != null) {
            return _tooltipCellphone!!
        }
        _tooltipCellphone = Builder(name = "TooltipCellphone", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                moveTo(22.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 17.11f, 21.11f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 22.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 18.0f, 2.0f, 17.11f, 2.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                moveTo(16.0f, 5.09f)
                curveTo(16.0f, 4.5f, 15.5f, 4.0f, 14.86f, 4.0f)
                horizontalLineTo(9.14f)
                curveTo(8.5f, 4.0f, 8.0f, 4.5f, 8.0f, 5.09f)
                verticalLineTo(14.91f)
                curveTo(8.0f, 15.5f, 8.5f, 16.0f, 9.14f, 16.0f)
                horizontalLineTo(14.86f)
                curveTo(15.5f, 16.0f, 16.0f, 15.5f, 16.0f, 14.91f)
                verticalLineTo(5.09f)
                close()
            }
        }
        .build()
        return _tooltipCellphone!!
    }

private var _tooltipCellphone: ImageVector? = null
