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

public val MaterialDesignIcons.TooltipRemove: ImageVector
    get() {
        if (_tooltipRemove != null) {
            return _tooltipRemove!!
        }
        _tooltipRemove = Builder(name = "TooltipRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 17.11f, 2.9f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 22.0f)
                lineTo(16.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 18.0f, 22.0f, 17.11f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.11f, 2.0f, 20.0f, 2.0f)
                moveTo(15.54f, 12.12f)
                lineTo(14.12f, 13.54f)
                lineTo(12.0f, 11.41f)
                lineTo(9.88f, 13.54f)
                lineTo(8.47f, 12.12f)
                lineTo(10.59f, 10.0f)
                lineTo(8.46f, 7.88f)
                lineTo(9.88f, 6.47f)
                lineTo(12.0f, 8.59f)
                lineTo(14.12f, 6.47f)
                lineTo(15.54f, 7.88f)
                lineTo(13.41f, 10.0f)
                lineTo(15.54f, 12.12f)
                close()
            }
        }
        .build()
        return _tooltipRemove!!
    }

private var _tooltipRemove: ImageVector? = null
