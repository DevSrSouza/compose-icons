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

public val MaterialDesignIcons.MowerBagOn: ImageVector
    get() {
        if (_mowerBagOn != null) {
            return _mowerBagOn!!
        }
        _mowerBagOn = Builder(name = "MowerBagOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                moveTo(22.0f, 6.3f)
                lineTo(20.6f, 4.9f)
                lineTo(17.0f, 8.4f)
                lineTo(18.4f, 9.8f)
                curveTo(18.4f, 9.8f, 21.9f, 6.3f, 22.0f, 6.3f)
                moveTo(10.8f, 12.0f)
                lineTo(11.9f, 14.0f)
                horizontalLineTo(17.0f)
                lineTo(16.5f, 13.1f)
                curveTo(16.2f, 12.4f, 15.5f, 12.0f, 14.7f, 12.0f)
                horizontalLineTo(10.8f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(11.4f)
                lineTo(4.6f, 3.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.4f)
                lineTo(7.4f, 12.1f)
                lineTo(2.3f, 10.1f)
                curveTo(2.1f, 10.0f, 1.7f, 10.0f, 1.4f, 10.2f)
                curveTo(1.2f, 10.4f, 1.0f, 10.7f, 1.0f, 11.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 18.5f, 1.5f, 19.0f, 2.0f, 19.0f)
                horizontalLineTo(5.3f)
                curveTo(5.9f, 20.2f, 7.1f, 21.0f, 8.5f, 21.0f)
                reflectiveCurveTo(11.1f, 20.2f, 11.7f, 19.0f)
                horizontalLineTo(17.2f)
                curveTo(17.6f, 20.2f, 18.7f, 21.0f, 20.0f, 21.0f)
                curveTo(21.7f, 21.0f, 23.0f, 19.7f, 23.0f, 18.0f)
                reflectiveCurveTo(21.7f, 15.0f, 20.0f, 15.0f)
                moveTo(5.0f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.5f)
                lineTo(7.3f, 14.2f)
                curveTo(6.1f, 14.6f, 5.2f, 15.7f, 5.0f, 17.0f)
                moveTo(8.5f, 19.0f)
                curveTo(7.7f, 19.0f, 7.0f, 18.3f, 7.0f, 17.5f)
                reflectiveCurveTo(7.7f, 16.0f, 8.5f, 16.0f)
                reflectiveCurveTo(10.0f, 16.7f, 10.0f, 17.5f)
                reflectiveCurveTo(9.3f, 19.0f, 8.5f, 19.0f)
                moveTo(20.0f, 19.0f)
                curveTo(19.5f, 19.0f, 19.0f, 18.5f, 19.0f, 18.0f)
                reflectiveCurveTo(19.5f, 17.0f, 20.0f, 17.0f)
                reflectiveCurveTo(21.0f, 17.5f, 21.0f, 18.0f)
                reflectiveCurveTo(20.5f, 19.0f, 20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _mowerBagOn!!
    }

private var _mowerBagOn: ImageVector? = null
