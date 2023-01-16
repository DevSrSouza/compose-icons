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

public val MaterialDesignIcons.FuelCell: ImageVector
    get() {
        if (_fuelCell != null) {
            return _fuelCell!!
        }
        _fuelCell = Builder(name = "FuelCell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 18.1f, 2.9f, 19.0f, 4.0f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(8.1f, 22.0f, 9.0f, 21.1f, 9.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                curveTo(15.0f, 21.1f, 15.9f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 22.0f, 20.0f, 21.1f, 20.0f, 20.0f)
                verticalLineTo(19.0f)
                curveTo(21.1f, 19.0f, 22.0f, 18.1f, 22.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                moveTo(16.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                moveTo(7.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                lineTo(6.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                lineTo(7.0f, 7.0f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _fuelCell!!
    }

private var _fuelCell: ImageVector? = null
