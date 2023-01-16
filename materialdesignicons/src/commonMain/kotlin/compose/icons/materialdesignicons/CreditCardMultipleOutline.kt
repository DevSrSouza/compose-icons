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

public val MaterialDesignIcons.CreditCardMultipleOutline: ImageVector
    get() {
        if (_creditCardMultipleOutline != null) {
            return _creditCardMultipleOutline!!
        }
        _creditCardMultipleOutline = Builder(name = "CreditCardMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 6.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 18.0f, 5.0f, 17.1f, 5.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 4.89f, 5.89f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _creditCardMultipleOutline!!
    }

private var _creditCardMultipleOutline: ImageVector? = null
