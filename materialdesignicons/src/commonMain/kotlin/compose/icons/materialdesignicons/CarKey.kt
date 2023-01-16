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

public val MaterialDesignIcons.CarKey: ImageVector
    get() {
        if (_carKey != null) {
            return _carKey!!
        }
        _carKey = Builder(name = "CarKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 0.0f)
                curveTo(7.3f, 0.0f, 6.0f, 1.3f, 6.0f, 3.0f)
                reflectiveCurveTo(7.3f, 6.0f, 9.0f, 6.0f)
                curveTo(10.3f, 6.0f, 11.4f, 5.2f, 11.8f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.8f)
                curveTo(11.4f, 0.8f, 10.3f, 0.0f, 9.0f, 0.0f)
                moveTo(9.0f, 2.0f)
                curveTo(9.6f, 2.0f, 10.0f, 2.4f, 10.0f, 3.0f)
                reflectiveCurveTo(9.6f, 4.0f, 9.0f, 4.0f)
                reflectiveCurveTo(8.0f, 3.6f, 8.0f, 3.0f)
                reflectiveCurveTo(8.4f, 2.0f, 9.0f, 2.0f)
                moveTo(6.5f, 8.0f)
                curveTo(5.8f, 8.0f, 5.3f, 8.4f, 5.1f, 9.0f)
                lineTo(3.0f, 15.0f)
                verticalLineTo(23.0f)
                curveTo(3.0f, 23.6f, 3.4f, 24.0f, 4.0f, 24.0f)
                horizontalLineTo(5.0f)
                curveTo(5.6f, 24.0f, 6.0f, 23.6f, 6.0f, 23.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                curveTo(18.0f, 23.6f, 18.4f, 24.0f, 19.0f, 24.0f)
                horizontalLineTo(20.0f)
                curveTo(20.6f, 24.0f, 21.0f, 23.6f, 21.0f, 23.0f)
                verticalLineTo(15.0f)
                lineTo(18.9f, 9.0f)
                curveTo(18.7f, 8.4f, 18.1f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(6.5f)
                moveTo(6.5f, 9.5f)
                horizontalLineTo(17.5f)
                lineTo(19.0f, 14.0f)
                horizontalLineTo(5.0f)
                lineTo(6.5f, 9.5f)
                moveTo(6.5f, 16.0f)
                curveTo(7.3f, 16.0f, 8.0f, 16.7f, 8.0f, 17.5f)
                reflectiveCurveTo(7.3f, 19.0f, 6.5f, 19.0f)
                reflectiveCurveTo(5.0f, 18.3f, 5.0f, 17.5f)
                reflectiveCurveTo(5.7f, 16.0f, 6.5f, 16.0f)
                moveTo(17.5f, 16.0f)
                curveTo(18.3f, 16.0f, 19.0f, 16.7f, 19.0f, 17.5f)
                reflectiveCurveTo(18.3f, 19.0f, 17.5f, 19.0f)
                reflectiveCurveTo(16.0f, 18.3f, 16.0f, 17.5f)
                reflectiveCurveTo(16.7f, 16.0f, 17.5f, 16.0f)
                close()
            }
        }
        .build()
        return _carKey!!
    }

private var _carKey: ImageVector? = null
