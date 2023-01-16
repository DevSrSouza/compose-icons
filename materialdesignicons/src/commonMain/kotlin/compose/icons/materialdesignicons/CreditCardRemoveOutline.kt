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

public val MaterialDesignIcons.CreditCardRemoveOutline: ImageVector
    get() {
        if (_creditCardRemoveOutline != null) {
            return _creditCardRemoveOutline!!
        }
        _creditCardRemoveOutline = Builder(name = "CreditCardRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 18.66f, 13.04f, 18.33f, 13.09f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                curveTo(19.7f, 13.0f, 20.37f, 13.13f, 21.0f, 13.35f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.89f, 20.11f, 4.0f, 19.0f, 4.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 4.0f, 1.0f, 4.89f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.1f, 1.89f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13.0f, 19.34f, 13.0f, 19.0f)
                moveTo(3.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.47f, 21.12f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 16.88f)
                lineTo(16.88f, 15.47f)
                lineTo(19.0f, 17.59f)
                lineTo(21.12f, 15.46f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }
        .build()
        return _creditCardRemoveOutline!!
    }

private var _creditCardRemoveOutline: ImageVector? = null
