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

public val MaterialDesignIcons.DecimalCommaIncrease: ImageVector
    get() {
        if (_decimalCommaIncrease != null) {
            return _decimalCommaIncrease!!
        }
        _decimalCommaIncrease = Builder(name = "DecimalCommaIncrease", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 8.0f)
                verticalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.0f)
                moveTo(10.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 8.0f)
                moveTo(16.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 8.0f)
                verticalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 14.0f)
                moveTo(15.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 8.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 11.0f)
                moveTo(19.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                lineTo(22.0f, 17.0f)
                moveTo(5.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                lineTo(3.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 13.0f)
                close()
            }
        }
        .build()
        return _decimalCommaIncrease!!
    }

private var _decimalCommaIncrease: ImageVector? = null
