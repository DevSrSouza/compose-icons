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

public val MaterialDesignIcons.CalculatorVariant: ImageVector
    get() {
        if (_calculatorVariant != null) {
            return _calculatorVariant!!
        }
        _calculatorVariant = Builder(name = "CalculatorVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(13.0f, 7.1f)
                lineTo(14.1f, 6.0f)
                lineTo(15.5f, 7.4f)
                lineTo(16.9f, 6.0f)
                lineTo(18.0f, 7.1f)
                lineTo(16.6f, 8.5f)
                lineTo(18.0f, 9.9f)
                lineTo(16.9f, 11.0f)
                lineTo(15.5f, 9.6f)
                lineTo(14.1f, 11.0f)
                lineTo(13.0f, 9.9f)
                lineTo(14.4f, 8.5f)
                lineTo(13.0f, 7.1f)
                moveTo(6.2f, 7.7f)
                horizontalLineTo(11.2f)
                verticalLineTo(9.2f)
                horizontalLineTo(6.2f)
                verticalLineTo(7.7f)
                moveTo(11.5f, 16.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(16.0f)
                moveTo(18.0f, 17.2f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.7f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.2f)
                moveTo(18.0f, 14.8f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.3f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.8f)
                close()
            }
        }
        .build()
        return _calculatorVariant!!
    }

private var _calculatorVariant: ImageVector? = null
