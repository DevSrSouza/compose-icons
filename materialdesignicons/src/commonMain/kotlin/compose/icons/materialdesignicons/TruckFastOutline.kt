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

public val MaterialDesignIcons.TruckFastOutline: ImageVector
    get() {
        if (_truckFastOutline != null) {
            return _truckFastOutline!!
        }
        _truckFastOutline = Builder(name = "TruckFastOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.75f, 7.5f)
                horizontalLineTo(10.5f)
                lineTo(11.25f, 9.0f)
                horizontalLineTo(1.5f)
                lineTo(0.75f, 7.5f)
                moveTo(1.75f, 10.5f)
                horizontalLineTo(11.5f)
                lineTo(12.25f, 12.0f)
                horizontalLineTo(2.5f)
                lineTo(1.75f, 10.5f)
                moveTo(18.0f, 18.5f)
                curveTo(18.83f, 18.5f, 19.5f, 17.83f, 19.5f, 17.0f)
                curveTo(19.5f, 16.17f, 18.83f, 15.5f, 18.0f, 15.5f)
                curveTo(17.17f, 15.5f, 16.5f, 16.17f, 16.5f, 17.0f)
                curveTo(16.5f, 17.83f, 17.17f, 18.5f, 18.0f, 18.5f)
                moveTo(19.5f, 9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.46f)
                lineTo(19.5f, 9.5f)
                moveTo(8.0f, 18.5f)
                curveTo(8.83f, 18.5f, 9.5f, 17.83f, 9.5f, 17.0f)
                curveTo(9.5f, 16.17f, 8.83f, 15.5f, 8.0f, 15.5f)
                curveTo(7.17f, 15.5f, 6.5f, 16.17f, 6.5f, 17.0f)
                curveTo(6.5f, 17.83f, 7.17f, 18.5f, 8.0f, 18.5f)
                moveTo(20.0f, 8.0f)
                lineTo(23.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 18.66f, 19.66f, 20.0f, 18.0f, 20.0f)
                curveTo(16.34f, 20.0f, 15.0f, 18.66f, 15.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 18.66f, 9.65f, 20.0f, 8.0f, 20.0f)
                curveTo(6.34f, 20.0f, 5.0f, 18.66f, 5.0f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.76f)
                curveTo(6.31f, 14.39f, 7.11f, 14.0f, 8.0f, 14.0f)
                curveTo(8.89f, 14.0f, 9.69f, 14.39f, 10.24f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 4.89f, 3.89f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _truckFastOutline!!
    }

private var _truckFastOutline: ImageVector? = null
