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

public val MaterialDesignIcons.KeyAlertOutline: ImageVector
    get() {
        if (_keyAlertOutline != null) {
            return _keyAlertOutline!!
        }
        _keyAlertOutline = Builder(name = "KeyAlertOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.32f)
                curveTo(3.58f, 12.17f, 2.0f, 9.72f, 2.0f, 7.0f)
                curveTo(2.0f, 3.14f, 5.14f, 0.0f, 9.0f, 0.0f)
                curveTo(12.86f, 0.0f, 16.0f, 3.14f, 16.0f, 7.0f)
                curveTo(16.0f, 9.72f, 14.42f, 12.18f, 12.0f, 13.32f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                moveTo(14.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.94f)
                lineTo(10.67f, 11.71f)
                curveTo(12.66f, 11.0f, 14.0f, 9.11f, 14.0f, 7.0f)
                curveTo(14.0f, 4.24f, 11.76f, 2.0f, 9.0f, 2.0f)
                reflectiveCurveTo(4.0f, 4.24f, 4.0f, 7.0f)
                curveTo(4.0f, 9.11f, 5.34f, 11.0f, 7.33f, 11.71f)
                lineTo(8.0f, 11.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                moveTo(12.0f, 7.0f)
                curveTo(12.0f, 8.66f, 10.66f, 10.0f, 9.0f, 10.0f)
                reflectiveCurveTo(6.0f, 8.66f, 6.0f, 7.0f)
                reflectiveCurveTo(7.34f, 4.0f, 9.0f, 4.0f)
                reflectiveCurveTo(12.0f, 5.34f, 12.0f, 7.0f)
                moveTo(9.0f, 8.0f)
                curveTo(9.55f, 8.0f, 10.0f, 7.55f, 10.0f, 7.0f)
                reflectiveCurveTo(9.55f, 6.0f, 9.0f, 6.0f)
                reflectiveCurveTo(8.0f, 6.45f, 8.0f, 7.0f)
                reflectiveCurveTo(8.45f, 8.0f, 9.0f, 8.0f)
                moveTo(20.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
            }
        }
        .build()
        return _keyAlertOutline!!
    }

private var _keyAlertOutline: ImageVector? = null
