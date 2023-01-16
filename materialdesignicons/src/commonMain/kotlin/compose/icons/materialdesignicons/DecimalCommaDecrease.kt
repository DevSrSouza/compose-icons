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

public val MaterialDesignIcons.DecimalCommaDecrease: ImageVector
    get() {
        if (_decimalCommaDecrease != null) {
            return _decimalCommaDecrease!!
        }
        _decimalCommaDecrease = Builder(name = "DecimalCommaDecrease", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                lineTo(3.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 13.0f)
                moveTo(15.0f, 16.0f)
                verticalLineTo(14.0f)
                lineTo(12.0f, 17.0f)
                lineTo(15.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                moveTo(12.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 8.0f)
                moveTo(10.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 8.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 11.0f)
                close()
            }
        }
        .build()
        return _decimalCommaDecrease!!
    }

private var _decimalCommaDecrease: ImageVector? = null
