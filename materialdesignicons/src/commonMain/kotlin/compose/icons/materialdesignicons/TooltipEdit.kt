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

public val MaterialDesignIcons.TooltipEdit: ImageVector
    get() {
        if (_tooltipEdit != null) {
            return _tooltipEdit!!
        }
        _tooltipEdit = Builder(name = "TooltipEdit", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(9.08f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.91f)
                lineTo(13.17f, 6.72f)
                lineTo(15.24f, 8.8f)
                lineTo(9.08f, 15.0f)
                moveTo(16.84f, 7.2f)
                lineTo(15.83f, 8.21f)
                lineTo(13.76f, 6.18f)
                lineTo(14.77f, 5.16f)
                curveTo(14.97f, 4.95f, 15.31f, 4.94f, 15.55f, 5.16f)
                lineTo(16.84f, 6.41f)
                curveTo(17.05f, 6.62f, 17.06f, 6.96f, 16.84f, 7.2f)
                close()
            }
        }
        .build()
        return _tooltipEdit!!
    }

private var _tooltipEdit: ImageVector? = null
