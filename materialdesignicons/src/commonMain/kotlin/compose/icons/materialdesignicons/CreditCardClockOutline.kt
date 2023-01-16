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

public val MaterialDesignIcons.CreditCardClockOutline: ImageVector
    get() {
        if (_creditCardClockOutline != null) {
            return _creditCardClockOutline!!
        }
        _creditCardClockOutline = Builder(name = "CreditCardClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.82f)
                lineTo(19.94f, 18.23f)
                lineTo(19.19f, 19.53f)
                lineTo(16.0f, 17.69f)
                verticalLineTo(14.0f)
                moveTo(24.0f, 17.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 17.0f, 24.0f)
                curveTo(14.21f, 24.0f, 11.8f, 22.36f, 10.67f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(12.1f)
                curveTo(23.24f, 13.36f, 24.0f, 15.09f, 24.0f, 17.0f)
                moveTo(10.0f, 17.0f)
                curveTo(10.0f, 15.04f, 10.81f, 13.27f, 12.1f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.07f)
                curveTo(10.0f, 17.67f, 10.0f, 17.34f, 10.0f, 17.0f)
                moveTo(17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 22.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 12.0f)
                moveTo(20.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _creditCardClockOutline!!
    }

private var _creditCardClockOutline: ImageVector? = null
