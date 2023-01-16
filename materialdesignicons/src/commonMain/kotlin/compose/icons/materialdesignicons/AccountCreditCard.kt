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

public val MaterialDesignIcons.AccountCreditCard: ImageVector
    get() {
        if (_accountCreditCard != null) {
            return _accountCreditCard!!
        }
        _accountCreditCard = Builder(name = "AccountCreditCard", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                curveTo(9.2f, 12.0f, 11.0f, 10.2f, 11.0f, 8.0f)
                reflectiveCurveTo(9.2f, 4.0f, 7.0f, 4.0f)
                reflectiveCurveTo(3.0f, 5.8f, 3.0f, 8.0f)
                reflectiveCurveTo(4.8f, 12.0f, 7.0f, 12.0f)
                moveTo(11.0f, 20.0f)
                verticalLineTo(14.7f)
                curveTo(9.9f, 14.3f, 8.5f, 14.0f, 7.0f, 14.0f)
                curveTo(3.1f, 14.0f, 0.0f, 15.8f, 0.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                moveTo(22.0f, 4.0f)
                horizontalLineTo(15.0f)
                curveTo(13.9f, 4.0f, 13.0f, 4.9f, 13.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(13.0f, 19.1f, 13.9f, 20.0f, 15.0f, 20.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1f, 20.0f, 24.0f, 19.1f, 24.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 4.9f, 23.1f, 4.0f, 22.0f, 4.0f)
                moveTo(18.0f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _accountCreditCard!!
    }

private var _accountCreditCard: ImageVector? = null
