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

public val MaterialDesignIcons.AccountCowboyHat: ImageVector
    get() {
        if (_accountCowboyHat != null) {
            return _accountCowboyHat!!
        }
        _accountCowboyHat = Builder(name = "AccountCowboyHat", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 17.8f, 7.6f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(20.0f, 17.8f, 20.0f, 20.0f)
                moveTo(8.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                curveTo(16.0f, 12.2f, 14.2f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(8.0f, 12.2f, 8.0f, 10.0f)
                moveTo(19.0f, 4.0f)
                curveTo(18.4f, 4.0f, 18.0f, 4.4f, 18.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.5f)
                lineTo(15.1f, 3.0f)
                curveTo(15.0f, 2.8f, 14.9f, 2.6f, 14.7f, 2.5f)
                curveTo(14.2f, 2.0f, 13.4f, 1.9f, 12.7f, 2.2f)
                lineTo(12.0f, 2.4f)
                lineTo(11.3f, 2.1f)
                curveTo(10.6f, 1.8f, 9.8f, 1.9f, 9.3f, 2.4f)
                curveTo(9.1f, 2.6f, 9.0f, 2.8f, 8.9f, 3.0f)
                lineTo(7.5f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 4.4f, 5.6f, 4.0f, 5.0f, 4.0f)
                reflectiveCurveTo(4.0f, 4.4f, 4.0f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(4.0f, 7.1f, 4.9f, 8.0f, 6.0f, 8.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 8.0f, 20.0f, 7.1f, 20.0f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 4.5f, 19.6f, 4.0f, 19.0f, 4.0f)
                close()
            }
        }
        .build()
        return _accountCowboyHat!!
    }

private var _accountCowboyHat: ImageVector? = null
