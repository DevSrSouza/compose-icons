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

public val MaterialDesignIcons.HorseVariantFast: ImageVector
    get() {
        if (_horseVariantFast != null) {
            return _horseVariantFast!!
        }
        _horseVariantFast = Builder(name = "HorseVariantFast", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                verticalLineTo(16.0f)
                lineTo(20.0f, 17.0f)
                lineTo(16.91f, 11.5f)
                curveTo(16.65f, 11.04f, 15.92f, 11.27f, 16.0f, 11.81f)
                lineTo(17.0f, 21.0f)
                lineTo(7.0f, 17.0f)
                lineTo(8.15f, 8.94f)
                curveTo(8.64f, 5.53f, 11.56f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(23.0f)
                lineTo(21.42f, 5.37f)
                curveTo(22.36f, 5.88f, 23.0f, 6.86f, 23.0f, 8.0f)
                moveTo(4.0f, 5.0f)
                horizontalLineTo(7.58f)
                curveTo(8.08f, 4.24f, 8.7f, 3.57f, 9.41f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 3.0f, 3.0f, 3.45f, 3.0f, 4.0f)
                reflectiveCurveTo(3.45f, 5.0f, 4.0f, 5.0f)
                moveTo(5.84f, 11.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 11.0f, 1.0f, 11.45f, 1.0f, 12.0f)
                reflectiveCurveTo(1.45f, 13.0f, 2.0f, 13.0f)
                horizontalLineTo(5.55f)
                lineTo(5.84f, 11.0f)
                moveTo(3.0f, 9.0f)
                horizontalLineTo(6.12f)
                lineTo(6.17f, 8.66f)
                curveTo(6.25f, 8.08f, 6.39f, 7.53f, 6.58f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 7.0f, 2.0f, 7.45f, 2.0f, 8.0f)
                reflectiveCurveTo(2.45f, 9.0f, 3.0f, 9.0f)
                close()
            }
        }
        .build()
        return _horseVariantFast!!
    }

private var _horseVariantFast: ImageVector? = null
