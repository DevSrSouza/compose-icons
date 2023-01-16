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

public val MaterialDesignIcons.AccountTieHatOutline: ImageVector
    get() {
        if (_accountTieHatOutline != null) {
            return _accountTieHatOutline!!
        }
        _accountTieHatOutline = Builder(name = "AccountTieHatOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.5f)
                curveTo(6.0f, 3.1f, 8.7f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(18.0f, 3.1f, 18.0f, 4.5f)
                curveTo(18.0f, 4.9f, 17.8f, 5.2f, 17.5f, 5.5f)
                curveTo(16.6f, 4.6f, 14.5f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(7.4f, 4.6f, 6.5f, 5.5f)
                curveTo(6.2f, 5.2f, 6.0f, 4.9f, 6.0f, 4.5f)
                moveTo(12.0f, 5.0f)
                curveTo(9.8f, 5.0f, 8.1f, 5.5f, 7.4f, 6.1f)
                curveTo(8.5f, 6.6f, 10.1f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(15.5f, 6.6f, 16.6f, 6.1f)
                curveTo(15.9f, 5.5f, 14.2f, 5.0f, 12.0f, 5.0f)
                moveTo(14.0f, 8.0f)
                curveTo(14.0f, 9.1f, 13.1f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(10.0f, 9.1f, 10.0f, 8.0f)
                verticalLineTo(7.9f)
                curveTo(9.3f, 7.8f, 8.6f, 7.7f, 8.0f, 7.5f)
                verticalLineTo(8.0f)
                curveTo(8.0f, 10.2f, 9.8f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(16.0f, 10.2f, 16.0f, 8.0f)
                curveTo(16.0f, 7.8f, 16.0f, 7.6f, 15.9f, 7.4f)
                curveTo(15.3f, 7.6f, 14.6f, 7.7f, 13.9f, 7.8f)
                curveTo(14.0f, 7.9f, 14.0f, 7.9f, 14.0f, 8.0f)
                moveTo(16.4f, 13.8f)
                lineTo(15.7f, 15.0f)
                lineTo(15.5f, 15.5f)
                curveTo(17.0f, 16.0f, 18.1f, 16.6f, 18.1f, 17.0f)
                verticalLineTo(20.1f)
                horizontalLineTo(13.9f)
                lineTo(13.0f, 15.0f)
                lineTo(13.9f, 13.1f)
                curveTo(13.3f, 13.1f, 12.7f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(10.7f, 13.0f, 10.1f, 13.1f)
                lineTo(11.0f, 15.0f)
                lineTo(10.1f, 20.1f)
                horizontalLineTo(5.9f)
                verticalLineTo(17.0f)
                curveTo(5.9f, 16.6f, 7.0f, 16.0f, 8.5f, 15.5f)
                lineTo(8.3f, 15.0f)
                lineTo(7.7f, 13.8f)
                curveTo(5.7f, 14.4f, 4.0f, 15.5f, 4.0f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 15.5f, 18.3f, 14.4f, 16.4f, 13.8f)
                close()
            }
        }
        .build()
        return _accountTieHatOutline!!
    }

private var _accountTieHatOutline: ImageVector? = null
