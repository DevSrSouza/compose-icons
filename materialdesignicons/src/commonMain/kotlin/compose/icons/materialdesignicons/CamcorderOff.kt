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

public val MaterialDesignIcons.CamcorderOff: ImageVector
    get() {
        if (_camcorderOff != null) {
            return _camcorderOff!!
        }
        _camcorderOff = Builder(name = "CamcorderOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(9.4f, 8.8f)
                lineTo(2.4f, 1.8f)
                lineTo(1.1f, 3.0f)
                lineTo(2.7f, 4.6f)
                curveTo(2.2f, 5.3f, 2.0f, 6.1f, 2.0f, 7.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(11.1f, 22.0f, 12.0f, 21.1f, 12.0f, 20.0f)
                verticalLineTo(13.9f)
                lineTo(13.0f, 14.9f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(5.0f, 20.0f)
                curveTo(4.5f, 20.0f, 4.0f, 19.5f, 4.0f, 19.0f)
                reflectiveCurveTo(4.5f, 18.0f, 5.0f, 18.0f)
                reflectiveCurveTo(6.0f, 18.5f, 6.0f, 19.0f)
                reflectiveCurveTo(5.5f, 20.0f, 5.0f, 20.0f)
                moveTo(7.0f, 10.0f)
                curveTo(5.3f, 10.0f, 4.0f, 8.7f, 4.0f, 7.0f)
                curveTo(4.0f, 6.7f, 4.1f, 6.4f, 4.2f, 6.1f)
                lineTo(8.0f, 9.9f)
                curveTo(7.6f, 9.9f, 7.3f, 10.0f, 7.0f, 10.0f)
                moveTo(7.2f, 4.0f)
                lineTo(5.5f, 2.3f)
                curveTo(6.0f, 2.1f, 6.5f, 2.0f, 7.0f, 2.0f)
                curveTo(9.8f, 2.0f, 12.0f, 4.2f, 12.0f, 7.0f)
                verticalLineTo(8.8f)
                lineTo(10.0f, 6.8f)
                curveTo(9.9f, 5.3f, 8.7f, 4.1f, 7.2f, 4.0f)
                moveTo(20.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.1f, 21.1f, 16.0f, 20.0f, 16.0f)
                horizontalLineTo(19.2f)
                lineTo(17.2f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _camcorderOff!!
    }

private var _camcorderOff: ImageVector? = null
