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

public val MaterialDesignIcons.CarLightAlert: ImageVector
    get() {
        if (_carLightAlert != null) {
            return _carLightAlert!!
        }
        _carLightAlert = Builder(name = "CarLightAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                moveTo(21.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                moveTo(1.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                curveTo(5.1f, 10.3f, 5.1f, 9.6f, 5.2f, 9.0f)
                horizontalLineTo(1.0f)
                moveTo(5.0f, 13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.2f)
                curveTo(5.1f, 14.4f, 5.1f, 13.7f, 5.0f, 13.0f)
                moveTo(5.9f, 6.4f)
                curveTo(6.0f, 5.8f, 6.3f, 5.4f, 6.5f, 5.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.7f)
                curveTo(5.8f, 6.8f, 5.8f, 6.6f, 5.9f, 6.4f)
                moveTo(1.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.6f)
                curveTo(6.2f, 18.4f, 5.9f, 17.8f, 5.7f, 17.0f)
                horizontalLineTo(1.0f)
                moveTo(10.0f, 4.8f)
                curveTo(6.0f, 4.8f, 6.0f, 19.2f, 10.0f, 19.2f)
                reflectiveCurveTo(19.0f, 16.5f, 19.0f, 12.0f)
                reflectiveCurveTo(14.0f, 4.8f, 10.0f, 4.8f)
                moveTo(10.1f, 17.2f)
                curveTo(9.7f, 16.8f, 9.0f, 15.0f, 9.0f, 12.0f)
                reflectiveCurveTo(9.7f, 7.2f, 10.1f, 6.8f)
                curveTo(13.0f, 6.9f, 17.0f, 8.7f, 17.0f, 12.0f)
                reflectiveCurveTo(13.0f, 17.1f, 10.1f, 17.2f)
            }
        }
        .build()
        return _carLightAlert!!
    }

private var _carLightAlert: ImageVector? = null
