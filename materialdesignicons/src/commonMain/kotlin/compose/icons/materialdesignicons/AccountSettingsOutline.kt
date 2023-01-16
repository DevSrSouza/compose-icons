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

public val MaterialDesignIcons.AccountSettingsOutline: ImageVector
    get() {
        if (_accountSettingsOutline != null) {
            return _accountSettingsOutline!!
        }
        _accountSettingsOutline = Builder(name = "AccountSettingsOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(14.21f, 4.0f, 16.0f, 5.79f, 16.0f, 8.0f)
                reflectiveCurveTo(14.21f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(8.0f, 10.21f, 8.0f, 8.0f)
                reflectiveCurveTo(9.79f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 6.0f)
                curveTo(10.9f, 6.0f, 10.0f, 6.9f, 10.0f, 8.0f)
                reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(14.0f, 9.11f, 14.0f, 8.0f)
                reflectiveCurveTo(13.11f, 6.0f, 12.0f, 6.0f)
                moveTo(12.0f, 13.0f)
                curveTo(14.67f, 13.0f, 20.0f, 14.33f, 20.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 14.33f, 9.33f, 13.0f, 12.0f, 13.0f)
                moveTo(12.0f, 14.9f)
                curveTo(9.03f, 14.9f, 5.9f, 16.36f, 5.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(18.1f)
                verticalLineTo(17.0f)
                curveTo(18.1f, 16.36f, 14.97f, 14.9f, 12.0f, 14.9f)
                moveTo(13.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                moveTo(17.0f, 22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                moveTo(9.0f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _accountSettingsOutline!!
    }

private var _accountSettingsOutline: ImageVector? = null
