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

public val MaterialDesignIcons.AccountTieHat: ImageVector
    get() {
        if (_accountTieHat != null) {
            return _accountTieHat!!
        }
        _accountTieHat = Builder(name = "AccountTieHat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.5f)
                curveTo(16.0f, 15.6f, 15.7f, 18.0f, 13.8f, 20.8f)
                lineTo(13.0f, 16.0f)
                lineTo(13.9f, 14.1f)
                curveTo(13.3f, 14.1f, 12.7f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(10.7f, 14.1f, 10.1f, 14.1f)
                lineTo(11.0f, 16.0f)
                lineTo(10.2f, 20.8f)
                curveTo(8.3f, 18.1f, 8.0f, 15.6f, 8.0f, 14.5f)
                curveTo(5.6f, 15.2f, 4.0f, 16.5f, 4.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 16.5f, 18.4f, 15.2f, 16.0f, 14.5f)
                moveTo(6.0f, 4.5f)
                curveTo(6.0f, 3.1f, 8.7f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(18.0f, 3.1f, 18.0f, 4.5f)
                curveTo(18.0f, 4.9f, 17.8f, 5.2f, 17.5f, 5.5f)
                curveTo(16.6f, 4.6f, 14.5f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(7.4f, 4.6f, 6.5f, 5.5f)
                curveTo(6.2f, 5.2f, 6.0f, 4.9f, 6.0f, 4.5f)
                moveTo(15.9f, 7.4f)
                curveTo(16.0f, 7.6f, 16.0f, 7.8f, 16.0f, 8.0f)
                curveTo(16.0f, 10.2f, 14.2f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(8.0f, 10.2f, 8.0f, 8.0f)
                curveTo(8.0f, 7.8f, 8.0f, 7.6f, 8.1f, 7.4f)
                curveTo(9.1f, 7.8f, 10.5f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(14.9f, 7.8f, 15.9f, 7.4f)
                moveTo(16.6f, 6.1f)
                curveTo(15.5f, 6.6f, 13.9f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(8.5f, 6.6f, 7.4f, 6.1f)
                curveTo(8.1f, 5.5f, 9.8f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(15.9f, 5.5f, 16.6f, 6.1f)
                close()
            }
        }
        .build()
        return _accountTieHat!!
    }

private var _accountTieHat: ImageVector? = null
