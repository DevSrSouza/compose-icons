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

public val MaterialDesignIcons.Car2Plus: ImageVector
    get() {
        if (_car2Plus != null) {
            return _car2Plus!!
        }
        _car2Plus = Builder(name = "Car2Plus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                curveTo(8.0f, 13.6f, 9.1f, 11.5f, 10.7f, 10.0f)
                horizontalLineTo(3.0f)
                lineTo(4.5f, 5.5f)
                horizontalLineTo(15.5f)
                lineTo(16.3f, 8.0f)
                curveTo(16.9f, 8.0f, 17.5f, 8.1f, 18.0f, 8.3f)
                lineTo(16.9f, 5.0f)
                curveTo(16.7f, 4.4f, 16.1f, 4.0f, 15.5f, 4.0f)
                horizontalLineTo(4.5f)
                curveTo(3.8f, 4.0f, 3.3f, 4.4f, 3.1f, 5.0f)
                lineTo(1.0f, 11.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 19.5f, 1.5f, 20.0f, 2.0f, 20.0f)
                horizontalLineTo(3.0f)
                curveTo(3.5f, 20.0f, 4.0f, 19.5f, 4.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.3f)
                curveTo(8.1f, 17.4f, 8.0f, 16.7f, 8.0f, 16.0f)
                moveTo(4.5f, 15.0f)
                curveTo(3.7f, 15.0f, 3.0f, 14.3f, 3.0f, 13.5f)
                reflectiveCurveTo(3.7f, 12.0f, 4.5f, 12.0f)
                reflectiveCurveTo(6.0f, 12.7f, 6.0f, 13.5f)
                reflectiveCurveTo(5.3f, 15.0f, 4.5f, 15.0f)
                moveTo(16.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1f, 17.0f, 16.0f, 16.1f, 16.0f, 15.0f)
                verticalLineTo(14.0f)
                curveTo(16.0f, 12.9f, 15.1f, 12.0f, 14.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                curveTo(11.9f, 15.0f, 11.0f, 15.9f, 11.0f, 17.0f)
                verticalLineTo(20.0f)
                moveTo(23.0f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _car2Plus!!
    }

private var _car2Plus: ImageVector? = null
