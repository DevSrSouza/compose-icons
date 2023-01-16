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

public val MaterialDesignIcons.CreditCardEdit: ImageVector
    get() {
        if (_creditCardEdit != null) {
            return _creditCardEdit!!
        }
        _creditCardEdit = Builder(name = "CreditCardEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6f, 11.3f)
                curveTo(20.7f, 11.2f, 20.8f, 11.1f, 21.0f, 11.1f)
                curveTo(21.1f, 11.1f, 21.3f, 11.2f, 21.4f, 11.3f)
                lineTo(22.6f, 12.5f)
                curveTo(22.8f, 12.7f, 22.8f, 13.1f, 22.6f, 13.3f)
                lineTo(21.6f, 14.3f)
                lineTo(19.6f, 12.3f)
                lineTo(20.6f, 11.3f)
                moveTo(13.0f, 18.9f)
                lineTo(19.0f, 12.8f)
                lineTo(21.1f, 14.9f)
                lineTo(15.1f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.9f)
                moveTo(11.0f, 19.1f)
                verticalLineTo(18.1f)
                lineTo(11.6f, 17.5f)
                lineTo(18.1f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.1f)
                lineTo(22.0f, 7.1f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(3.5f, 4.0f, 3.0f, 4.2f, 2.6f, 4.6f)
                curveTo(2.2f, 5.0f, 2.0f, 5.5f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 18.5f, 2.2f, 19.0f, 2.6f, 19.4f)
                curveTo(3.0f, 19.8f, 3.5f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.1f)
                close()
            }
        }
        .build()
        return _creditCardEdit!!
    }

private var _creditCardEdit: ImageVector? = null
