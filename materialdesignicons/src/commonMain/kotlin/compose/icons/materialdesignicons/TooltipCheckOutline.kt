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

public val MaterialDesignIcons.TooltipCheckOutline: ImageVector
    get() {
        if (_tooltipCheckOutline != null) {
            return _tooltipCheckOutline!!
        }
        _tooltipCheckOutline = Builder(name = "TooltipCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(20.0f, 16.0f)
                horizontalLineTo(15.17f)
                lineTo(12.0f, 19.17f)
                lineTo(8.83f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                moveTo(10.75f, 13.71f)
                lineTo(7.25f, 10.21f)
                lineTo(8.66f, 8.79f)
                lineTo(10.75f, 10.88f)
                lineTo(15.34f, 6.3f)
                lineTo(16.75f, 7.71f)
                lineTo(10.75f, 13.71f)
                close()
            }
        }
        .build()
        return _tooltipCheckOutline!!
    }

private var _tooltipCheckOutline: ImageVector? = null
