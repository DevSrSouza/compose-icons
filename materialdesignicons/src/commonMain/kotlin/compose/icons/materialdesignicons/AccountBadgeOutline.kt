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

public val MaterialDesignIcons.AccountBadgeOutline: ImageVector
    get() {
        if (_accountBadgeOutline != null) {
            return _accountBadgeOutline!!
        }
        _accountBadgeOutline = Builder(name = "AccountBadgeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 14.3f, 9.3f, 13.0f, 12.0f, 13.0f)
                curveTo(13.5f, 13.0f, 15.9f, 13.4f, 17.7f, 14.3f)
                curveTo(16.9f, 14.6f, 16.3f, 15.0f, 15.7f, 15.5f)
                curveTo(14.6f, 15.1f, 13.3f, 14.9f, 12.0f, 14.9f)
                curveTo(9.0f, 14.9f, 5.9f, 16.4f, 5.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(14.2f)
                curveTo(14.1f, 18.5f, 14.0f, 19.0f, 14.0f, 19.5f)
                verticalLineTo(20.0f)
                moveTo(23.0f, 19.5f)
                curveTo(23.0f, 21.4f, 21.4f, 23.0f, 19.5f, 23.0f)
                reflectiveCurveTo(16.0f, 21.4f, 16.0f, 19.5f)
                reflectiveCurveTo(17.6f, 16.0f, 19.5f, 16.0f)
                reflectiveCurveTo(23.0f, 17.6f, 23.0f, 19.5f)
                moveTo(12.0f, 6.0f)
                curveTo(13.1f, 6.0f, 14.0f, 6.9f, 14.0f, 8.0f)
                reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(10.0f, 9.1f, 10.0f, 8.0f)
                reflectiveCurveTo(10.9f, 6.0f, 12.0f, 6.0f)
                moveTo(12.0f, 4.0f)
                curveTo(9.8f, 4.0f, 8.0f, 5.8f, 8.0f, 8.0f)
                reflectiveCurveTo(9.8f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(16.0f, 10.2f, 16.0f, 8.0f)
                reflectiveCurveTo(14.2f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _accountBadgeOutline!!
    }

private var _accountBadgeOutline: ImageVector? = null
