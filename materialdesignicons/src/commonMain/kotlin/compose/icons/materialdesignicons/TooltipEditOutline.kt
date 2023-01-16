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

public val MaterialDesignIcons.TooltipEditOutline: ImageVector
    get() {
        if (_tooltipEditOutline != null) {
            return _tooltipEditOutline!!
        }
        _tooltipEditOutline = Builder(name = "TooltipEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 17.11f, 21.11f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 22.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 18.0f, 2.0f, 17.11f, 2.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                moveTo(4.0f, 4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.83f)
                lineTo(12.0f, 19.17f)
                lineTo(15.17f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                moveTo(15.84f, 8.2f)
                lineTo(14.83f, 9.21f)
                lineTo(12.76f, 7.18f)
                lineTo(13.77f, 6.16f)
                curveTo(13.97f, 5.95f, 14.31f, 5.94f, 14.55f, 6.16f)
                lineTo(15.84f, 7.41f)
                curveTo(16.05f, 7.62f, 16.06f, 7.96f, 15.84f, 8.2f)
                moveTo(8.0f, 11.91f)
                lineTo(12.17f, 7.72f)
                lineTo(14.24f, 9.8f)
                lineTo(10.08f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.91f)
                close()
            }
        }
        .build()
        return _tooltipEditOutline!!
    }

private var _tooltipEditOutline: ImageVector? = null
