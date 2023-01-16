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

public val MaterialDesignIcons.DecimalIncrease: ImageVector
    get() {
        if (_decimalIncrease != null) {
            return _decimalIncrease!!
        }
        _decimalIncrease = Builder(name = "DecimalIncrease", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                lineTo(19.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                lineTo(22.0f, 17.0f)
                moveTo(9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 8.0f)
                verticalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 5.0f)
                moveTo(9.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 8.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 7.0f)
                moveTo(16.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 8.0f)
                verticalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 5.0f)
                moveTo(16.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 8.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 7.0f)
                moveTo(4.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _decimalIncrease!!
    }

private var _decimalIncrease: ImageVector? = null