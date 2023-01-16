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

public val MaterialDesignIcons.PaletteSwatchOutline: ImageVector
    get() {
        if (_paletteSwatchOutline != null) {
            return _paletteSwatchOutline!!
        }
        _paletteSwatchOutline = Builder(name = "PaletteSwatchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 19.6f)
                lineTo(3.8f, 20.2f)
                verticalLineTo(11.2f)
                lineTo(1.4f, 17.0f)
                curveTo(1.0f, 18.1f, 1.5f, 19.2f, 2.5f, 19.6f)
                moveTo(15.2f, 4.8f)
                lineTo(20.2f, 16.8f)
                lineTo(12.9f, 19.8f)
                lineTo(7.9f, 7.9f)
                verticalLineTo(7.8f)
                lineTo(15.2f, 4.8f)
                moveTo(15.3f, 2.8f)
                curveTo(15.0f, 2.8f, 14.8f, 2.8f, 14.5f, 2.9f)
                lineTo(7.1f, 6.0f)
                curveTo(6.4f, 6.3f, 5.9f, 7.0f, 5.9f, 7.8f)
                curveTo(5.9f, 8.0f, 5.9f, 8.3f, 6.0f, 8.6f)
                lineTo(11.0f, 20.5f)
                curveTo(11.3f, 21.3f, 12.0f, 21.7f, 12.8f, 21.7f)
                curveTo(13.1f, 21.7f, 13.3f, 21.7f, 13.6f, 21.6f)
                lineTo(21.0f, 18.5f)
                curveTo(22.0f, 18.1f, 22.5f, 16.9f, 22.1f, 15.9f)
                lineTo(17.1f, 4.0f)
                curveTo(16.8f, 3.2f, 16.0f, 2.8f, 15.3f, 2.8f)
                moveTo(10.5f, 9.9f)
                curveTo(9.9f, 9.9f, 9.5f, 9.5f, 9.5f, 8.9f)
                reflectiveCurveTo(9.9f, 7.9f, 10.5f, 7.9f)
                curveTo(11.1f, 7.9f, 11.5f, 8.4f, 11.5f, 8.9f)
                reflectiveCurveTo(11.1f, 9.9f, 10.5f, 9.9f)
                moveTo(5.9f, 19.8f)
                curveTo(5.9f, 20.9f, 6.8f, 21.8f, 7.9f, 21.8f)
                horizontalLineTo(9.3f)
                lineTo(5.9f, 13.5f)
                verticalLineTo(19.8f)
                close()
            }
        }
        .build()
        return _paletteSwatchOutline!!
    }

private var _paletteSwatchOutline: ImageVector? = null
