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

public val MaterialDesignIcons.CreditCardOffOutline: ImageVector
    get() {
        if (_creditCardOffOutline != null) {
            return _creditCardOffOutline!!
        }
        _creditCardOffOutline = Builder(name = "CreditCardOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.93f, 4.2f)
                lineTo(2.21f, 2.93f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(16.73f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.78f, 2.04f, 5.57f, 2.11f, 5.38f)
                lineTo(0.93f, 4.2f)
                moveTo(20.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.82f)
                lineTo(5.82f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.6f, 21.74f, 19.13f, 21.32f, 19.5f)
                lineTo(19.82f, 18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.82f)
                lineTo(9.82f, 8.0f)
                horizontalLineTo(20.0f)
                moveTo(4.0f, 8.0f)
                horizontalLineTo(4.73f)
                lineTo(4.0f, 7.27f)
                verticalLineTo(8.0f)
                moveTo(4.0f, 12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.73f)
                lineTo(8.73f, 12.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _creditCardOffOutline!!
    }

private var _creditCardOffOutline: ImageVector? = null
