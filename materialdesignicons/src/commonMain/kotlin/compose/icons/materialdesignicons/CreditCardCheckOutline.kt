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

public val MaterialDesignIcons.CreditCardCheckOutline: ImageVector
    get() {
        if (_creditCardCheckOutline != null) {
            return _creditCardCheckOutline!!
        }
        _creditCardCheckOutline = Builder(name = "CreditCardCheckOutline", defaultWidth = 24.0.dp,
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
                moveTo(17.75f, 22.0f)
                lineTo(15.0f, 19.0f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
                lineTo(17.75f, 22.0f)
            }
        }
        .build()
        return _creditCardCheckOutline!!
    }

private var _creditCardCheckOutline: ImageVector? = null
