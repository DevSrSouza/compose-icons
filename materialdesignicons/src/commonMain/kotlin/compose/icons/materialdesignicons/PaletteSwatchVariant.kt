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

public val MaterialDesignIcons.PaletteSwatchVariant: ImageVector
    get() {
        if (_paletteSwatchVariant != null) {
            return _paletteSwatchVariant!!
        }
        _paletteSwatchVariant = Builder(name = "PaletteSwatchVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                horizontalLineTo(6.0f)
                curveTo(3.8f, 14.0f, 2.0f, 15.8f, 2.0f, 18.0f)
                reflectiveCurveTo(3.8f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 22.0f, 22.0f, 21.1f, 22.0f, 20.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 14.9f, 21.1f, 14.0f, 20.0f, 14.0f)
                moveTo(6.0f, 20.0f)
                curveTo(4.9f, 20.0f, 4.0f, 19.1f, 4.0f, 18.0f)
                reflectiveCurveTo(4.9f, 16.0f, 6.0f, 16.0f)
                reflectiveCurveTo(8.0f, 16.9f, 8.0f, 18.0f)
                reflectiveCurveTo(7.1f, 20.0f, 6.0f, 20.0f)
                moveTo(6.3f, 12.0f)
                lineTo(13.0f, 5.3f)
                curveTo(13.8f, 4.5f, 15.0f, 4.5f, 15.8f, 5.3f)
                lineTo(18.6f, 8.1f)
                curveTo(19.4f, 8.9f, 19.4f, 10.1f, 18.6f, 10.9f)
                lineTo(17.7f, 12.0f)
                horizontalLineTo(6.3f)
                moveTo(2.0f, 13.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(9.1f, 2.0f, 10.0f, 2.9f, 10.0f, 4.0f)
                verticalLineTo(5.5f)
                lineTo(2.0f, 13.5f)
                close()
            }
        }
        .build()
        return _paletteSwatchVariant!!
    }

private var _paletteSwatchVariant: ImageVector? = null
