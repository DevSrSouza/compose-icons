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

public val MaterialDesignIcons.TooltipImageOutline: ImageVector
    get() {
        if (_tooltipImageOutline != null) {
            return _tooltipImageOutline!!
        }
        _tooltipImageOutline = Builder(name = "TooltipImageOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 18.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 22.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 16.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
                moveTo(4.0f, 4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.83f)
                lineTo(12.0f, 19.17f)
                lineTo(15.17f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                moveTo(7.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 6.0f)
                moveTo(6.0f, 14.0f)
                lineTo(11.0f, 9.0f)
                lineTo(13.0f, 11.0f)
                lineTo(18.0f, 6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _tooltipImageOutline!!
    }

private var _tooltipImageOutline: ImageVector? = null
