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

public val MaterialDesignIcons.TruckOutline: ImageVector
    get() {
        if (_truckOutline != null) {
            return _truckOutline!!
        }
        _truckOutline = Builder(name = "TruckOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(6.0f, 18.5f)
                curveTo(6.83f, 18.5f, 7.5f, 17.83f, 7.5f, 17.0f)
                curveTo(7.5f, 16.17f, 6.83f, 15.5f, 6.0f, 15.5f)
                curveTo(5.17f, 15.5f, 4.5f, 16.17f, 4.5f, 17.0f)
                curveTo(4.5f, 17.83f, 5.17f, 18.5f, 6.0f, 18.5f)
                moveTo(20.0f, 8.0f)
                lineTo(23.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 18.66f, 19.66f, 20.0f, 18.0f, 20.0f)
                curveTo(16.34f, 20.0f, 15.0f, 18.66f, 15.0f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 18.66f, 7.66f, 20.0f, 6.0f, 20.0f)
                curveTo(4.34f, 20.0f, 3.0f, 18.66f, 3.0f, 17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.89f, 1.89f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                moveTo(3.0f, 6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.76f)
                curveTo(4.31f, 14.39f, 5.11f, 14.0f, 6.0f, 14.0f)
                curveTo(6.89f, 14.0f, 7.69f, 14.39f, 8.24f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _truckOutline!!
    }

private var _truckOutline: ImageVector? = null
