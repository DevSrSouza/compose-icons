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

public val MaterialDesignIcons.MowerOn: ImageVector
    get() {
        if (_mowerOn != null) {
            return _mowerOn!!
        }
        _mowerOn = Builder(name = "MowerOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(18.5f, 14.0f)
                curveTo(17.5f, 14.0f, 16.7f, 14.4f, 16.1f, 15.0f)
                horizontalLineTo(9.4f)
                lineTo(5.7f, 3.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.3f)
                lineTo(7.0f, 14.0f)
                horizontalLineTo(6.5f)
                curveTo(4.6f, 14.0f, 3.0f, 15.6f, 3.0f, 17.5f)
                reflectiveCurveTo(4.6f, 21.0f, 6.5f, 21.0f)
                curveTo(7.9f, 21.0f, 9.1f, 20.2f, 9.7f, 19.0f)
                horizontalLineTo(15.4f)
                curveTo(16.0f, 20.2f, 17.2f, 21.0f, 18.6f, 21.0f)
                curveTo(20.5f, 21.0f, 22.1f, 19.4f, 22.1f, 17.5f)
                reflectiveCurveTo(20.4f, 14.0f, 18.5f, 14.0f)
                moveTo(6.5f, 19.0f)
                curveTo(5.7f, 19.0f, 5.0f, 18.3f, 5.0f, 17.5f)
                reflectiveCurveTo(5.7f, 16.0f, 6.5f, 16.0f)
                reflectiveCurveTo(8.0f, 16.7f, 8.0f, 17.5f)
                reflectiveCurveTo(7.3f, 19.0f, 6.5f, 19.0f)
                moveTo(18.5f, 19.0f)
                curveTo(17.7f, 19.0f, 17.0f, 18.3f, 17.0f, 17.5f)
                reflectiveCurveTo(17.7f, 16.0f, 18.5f, 16.0f)
                reflectiveCurveTo(20.0f, 16.7f, 20.0f, 17.5f)
                reflectiveCurveTo(19.3f, 19.0f, 18.5f, 19.0f)
                moveTo(9.5f, 12.0f)
                lineTo(10.1f, 14.0f)
                horizontalLineTo(15.0f)
                lineTo(14.6f, 13.1f)
                curveTo(14.3f, 12.4f, 13.5f, 12.0f, 12.8f, 12.0f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _mowerOn!!
    }

private var _mowerOn: ImageVector? = null
