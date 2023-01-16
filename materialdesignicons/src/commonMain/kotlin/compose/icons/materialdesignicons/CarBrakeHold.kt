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

public val MaterialDesignIcons.CarBrakeHold: ImageVector
    get() {
        if (_carBrakeHold != null) {
            return _carBrakeHold!!
        }
        _carBrakeHold = Builder(name = "CarBrakeHold", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.0f, 3.0f, 3.0f, 7.0f, 3.0f, 12.0f)
                curveTo(3.0f, 17.0f, 7.0f, 21.0f, 12.0f, 21.0f)
                curveTo(17.0f, 21.0f, 21.0f, 17.0f, 21.0f, 12.0f)
                curveTo(21.0f, 7.0f, 17.0f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 19.0f)
                curveTo(8.1f, 19.0f, 5.0f, 15.9f, 5.0f, 12.0f)
                curveTo(5.0f, 8.1f, 8.1f, 5.0f, 12.0f, 5.0f)
                curveTo(15.9f, 5.0f, 19.0f, 8.1f, 19.0f, 12.0f)
                curveTo(19.0f, 15.9f, 15.9f, 19.0f, 12.0f, 19.0f)
                moveTo(20.5f, 20.5f)
                curveTo(22.7f, 18.3f, 24.0f, 15.3f, 24.0f, 12.0f)
                curveTo(24.0f, 8.7f, 22.7f, 5.7f, 20.5f, 3.5f)
                lineTo(19.4f, 4.6f)
                curveTo(21.3f, 6.5f, 22.5f, 9.1f, 22.5f, 12.0f)
                curveTo(22.5f, 14.9f, 21.3f, 17.5f, 19.4f, 19.4f)
                lineTo(20.5f, 20.5f)
                moveTo(4.6f, 19.4f)
                curveTo(2.7f, 17.5f, 1.5f, 14.9f, 1.5f, 12.0f)
                curveTo(1.5f, 9.1f, 2.7f, 6.5f, 4.6f, 4.6f)
                lineTo(3.5f, 3.5f)
                curveTo(1.3f, 5.7f, 0.0f, 8.7f, 0.0f, 12.0f)
                curveTo(0.0f, 15.3f, 1.3f, 18.3f, 3.5f, 20.5f)
                lineTo(4.6f, 19.4f)
                moveTo(9.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _carBrakeHold!!
    }

private var _carBrakeHold: ImageVector? = null
