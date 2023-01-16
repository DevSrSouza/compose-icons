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

public val MaterialDesignIcons.FlagVariantOffOutline: ImageVector
    get() {
        if (_flagVariantOffOutline != null) {
            return _flagVariantOffOutline!!
        }
        _flagVariantOffOutline = Builder(name = "FlagVariantOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(5.0f, 6.9f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                curveTo(7.0f, 14.0f, 7.8f, 12.4f, 10.2f, 12.1f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(7.0f, 11.5f)
                verticalLineTo(8.9f)
                lineTo(8.7f, 10.6f)
                curveTo(7.7f, 11.0f, 7.0f, 11.5f, 7.0f, 11.5f)
                moveTo(9.4f, 6.2f)
                lineTo(7.8f, 4.6f)
                curveTo(8.7f, 4.3f, 9.8f, 4.0f, 11.0f, 4.0f)
                curveTo(14.0f, 4.0f, 14.0f, 6.0f, 16.0f, 6.0f)
                curveTo(19.0f, 6.0f, 20.0f, 4.0f, 20.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 12.0f, 19.2f, 13.5f, 17.1f, 13.9f)
                lineTo(15.0f, 11.8f)
                curveTo(15.3f, 11.9f, 15.6f, 12.0f, 16.0f, 12.0f)
                curveTo(18.0f, 12.0f, 18.0f, 11.0f, 18.0f, 11.0f)
                verticalLineTo(7.5f)
                curveTo(18.0f, 7.5f, 17.0f, 8.0f, 16.0f, 8.0f)
                curveTo(14.0f, 8.0f, 13.0f, 6.0f, 11.0f, 6.0f)
                curveTo(10.5f, 6.0f, 9.9f, 6.1f, 9.4f, 6.2f)
                close()
            }
        }
        .build()
        return _flagVariantOffOutline!!
    }

private var _flagVariantOffOutline: ImageVector? = null
