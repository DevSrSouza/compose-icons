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

public val MaterialDesignIcons.Devices: ImageVector
    get() {
        if (_devices != null) {
            return _devices!!
        }
        _devices = Builder(name = "Devices", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.1f, 1.9f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                moveTo(13.0f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.78f)
                curveTo(8.39f, 14.33f, 8.0f, 15.11f, 8.0f, 16.0f)
                curveTo(8.0f, 16.89f, 8.39f, 17.67f, 9.0f, 18.22f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.22f)
                curveTo(13.61f, 17.67f, 14.0f, 16.88f, 14.0f, 16.0f)
                reflectiveCurveTo(13.61f, 14.33f, 13.0f, 13.78f)
                verticalLineTo(12.0f)
                moveTo(11.0f, 17.5f)
                curveTo(10.17f, 17.5f, 9.5f, 16.83f, 9.5f, 16.0f)
                reflectiveCurveTo(10.17f, 14.5f, 11.0f, 14.5f)
                reflectiveCurveTo(12.5f, 15.17f, 12.5f, 16.0f)
                reflectiveCurveTo(11.83f, 17.5f, 11.0f, 17.5f)
                moveTo(22.0f, 8.0f)
                horizontalLineTo(16.0f)
                curveTo(15.5f, 8.0f, 15.0f, 8.5f, 15.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(15.0f, 19.5f, 15.5f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5f, 20.0f, 23.0f, 19.5f, 23.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(23.0f, 8.5f, 22.5f, 8.0f, 22.0f, 8.0f)
                moveTo(21.0f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _devices!!
    }

private var _devices: ImageVector? = null
