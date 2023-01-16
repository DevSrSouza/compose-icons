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

public val MaterialDesignIcons.CreditCardFastOutline: ImageVector
    get() {
        if (_creditCardFastOutline != null) {
            return _creditCardFastOutline!!
        }
        _creditCardFastOutline = Builder(name = "CreditCardFastOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                curveTo(2.45f, 8.0f, 2.0f, 7.55f, 2.0f, 7.0f)
                reflectiveCurveTo(2.45f, 6.0f, 3.0f, 6.0f)
                horizontalLineTo(5.54f)
                curveTo(5.19f, 6.6f, 5.0f, 7.29f, 5.0f, 8.0f)
                horizontalLineTo(3.0f)
                moveTo(5.0f, 13.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 13.0f, 1.0f, 12.55f, 1.0f, 12.0f)
                reflectiveCurveTo(1.45f, 11.0f, 2.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                moveTo(1.0f, 18.0f)
                curveTo(0.448f, 18.0f, 0.0f, 17.55f, 0.0f, 17.0f)
                reflectiveCurveTo(0.448f, 16.0f, 1.0f, 16.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 16.71f, 5.19f, 17.4f, 5.54f, 18.0f)
                horizontalLineTo(1.0f)
                moveTo(21.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(7.89f, 6.0f, 7.0f, 6.89f, 7.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(7.0f, 17.11f, 7.89f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(21.0f)
                curveTo(22.11f, 18.0f, 23.0f, 17.11f, 23.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(23.0f, 6.89f, 22.11f, 6.0f, 21.0f, 6.0f)
                moveTo(21.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                moveTo(9.0f, 16.0f)
                lineTo(9.0f, 12.0f)
                horizontalLineTo(21.0f)
                lineTo(21.0f, 16.0f)
                lineTo(9.0f, 16.0f)
                close()
            }
        }
        .build()
        return _creditCardFastOutline!!
    }

private var _creditCardFastOutline: ImageVector? = null
