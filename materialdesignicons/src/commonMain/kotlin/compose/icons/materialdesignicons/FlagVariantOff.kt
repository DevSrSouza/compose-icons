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

public val MaterialDesignIcons.FlagVariantOff: ImageVector
    get() {
        if (_flagVariantOff != null) {
            return _flagVariantOff!!
        }
        _flagVariantOff = Builder(name = "FlagVariantOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(10.2f, 12.1f)
                curveTo(7.8f, 12.4f, 7.0f, 14.0f, 7.0f, 14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.9f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(20.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 4.0f, 19.0f, 6.0f, 16.0f, 6.0f)
                curveTo(14.0f, 6.0f, 14.0f, 4.0f, 11.0f, 4.0f)
                curveTo(9.8f, 4.0f, 8.7f, 4.3f, 7.8f, 4.6f)
                lineTo(17.1f, 13.9f)
                curveTo(19.2f, 13.5f, 20.0f, 12.0f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _flagVariantOff!!
    }

private var _flagVariantOff: ImageVector? = null
