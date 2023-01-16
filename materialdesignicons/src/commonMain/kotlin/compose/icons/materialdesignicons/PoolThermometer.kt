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

public val MaterialDesignIcons.PoolThermometer: ImageVector
    get() {
        if (_poolThermometer != null) {
            return _poolThermometer!!
        }
        _poolThermometer = Builder(name = "PoolThermometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                curveTo(17.9f, 6.0f, 17.0f, 6.9f, 17.0f, 8.0f)
                verticalLineTo(14.8f)
                curveTo(16.4f, 15.4f, 16.0f, 16.2f, 16.0f, 17.0f)
                curveTo(16.0f, 18.7f, 17.3f, 20.0f, 19.0f, 20.0f)
                reflectiveCurveTo(22.0f, 18.7f, 22.0f, 17.0f)
                curveTo(22.0f, 16.1f, 21.6f, 15.3f, 21.0f, 14.8f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 6.9f, 20.1f, 6.0f, 19.0f, 6.0f)
                moveTo(19.0f, 7.0f)
                curveTo(19.5f, 7.0f, 20.0f, 7.4f, 20.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 7.4f, 18.5f, 7.0f, 19.0f, 7.0f)
                moveTo(15.0f, 20.3f)
                curveTo(14.1f, 20.7f, 13.2f, 21.0f, 12.3f, 21.0f)
                curveTo(10.1f, 21.0f, 7.9f, 19.0f, 5.6f, 19.0f)
                curveTo(4.4f, 19.0f, 3.2f, 19.3f, 1.9f, 19.7f)
                verticalLineTo(17.7f)
                curveTo(3.2f, 17.3f, 4.4f, 17.0f, 5.7f, 17.0f)
                curveTo(7.9f, 17.0f, 10.1f, 19.0f, 12.4f, 19.0f)
                curveTo(13.3f, 19.0f, 14.2f, 18.7f, 15.1f, 18.3f)
                verticalLineTo(20.3f)
                moveTo(12.3f, 17.0f)
                curveTo(13.2f, 17.0f, 14.1f, 16.7f, 15.0f, 16.3f)
                verticalLineTo(14.3f)
                curveTo(14.3f, 14.6f, 13.7f, 14.8f, 13.0f, 15.0f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 4.4f, 13.4f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(16.8f)
                curveTo(16.4f, 2.8f, 15.3f, 2.0f, 14.0f, 2.0f)
                curveTo(12.3f, 2.0f, 11.0f, 3.3f, 11.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 4.4f, 6.4f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(9.8f)
                curveTo(9.4f, 2.8f, 8.3f, 2.0f, 7.0f, 2.0f)
                curveTo(5.3f, 2.0f, 4.0f, 3.3f, 4.0f, 5.0f)
                verticalLineTo(13.2f)
                curveTo(3.3f, 13.3f, 2.7f, 13.5f, 2.0f, 13.8f)
                verticalLineTo(15.8f)
                curveTo(3.2f, 15.3f, 4.4f, 15.0f, 5.7f, 15.0f)
                curveTo(7.9f, 15.0f, 10.1f, 17.0f, 12.3f, 17.0f)
                moveTo(6.0f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.8f)
                curveTo(9.3f, 14.3f, 7.7f, 13.2f, 6.0f, 13.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _poolThermometer!!
    }

private var _poolThermometer: ImageVector? = null
