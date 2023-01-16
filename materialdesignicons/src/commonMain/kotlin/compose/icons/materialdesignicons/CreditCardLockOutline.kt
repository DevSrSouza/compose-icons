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

public val MaterialDesignIcons.CreditCardLockOutline: ImageVector
    get() {
        if (_creditCardLockOutline != null) {
            return _creditCardLockOutline!!
        }
        _creditCardLockOutline = Builder(name = "CreditCardLockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 15.0f)
                verticalLineTo(13.5f)
                curveTo(21.8f, 12.1f, 20.4f, 11.0f, 19.0f, 11.0f)
                reflectiveCurveTo(16.2f, 12.1f, 16.2f, 13.5f)
                verticalLineTo(15.0f)
                curveTo(15.6f, 15.0f, 15.0f, 15.6f, 15.0f, 16.2f)
                verticalLineTo(19.7f)
                curveTo(15.0f, 20.4f, 15.6f, 21.0f, 16.2f, 21.0f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 21.0f, 23.0f, 20.4f, 23.0f, 19.8f)
                verticalLineTo(16.3f)
                curveTo(23.0f, 15.6f, 22.4f, 15.0f, 21.8f, 15.0f)
                moveTo(20.5f, 15.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 12.7f, 18.2f, 12.2f, 19.0f, 12.2f)
                reflectiveCurveTo(20.5f, 12.7f, 20.5f, 13.5f)
                verticalLineTo(15.0f)
                moveTo(13.0f, 19.7f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.5f)
                curveTo(15.18f, 10.28f, 16.96f, 9.0f, 19.0f, 9.0f)
                curveTo(20.13f, 9.0f, 21.17f, 9.4f, 22.0f, 10.04f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(13.03f)
                curveTo(13.0f, 19.9f, 13.0f, 19.8f, 13.0f, 19.7f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _creditCardLockOutline!!
    }

private var _creditCardLockOutline: ImageVector? = null
