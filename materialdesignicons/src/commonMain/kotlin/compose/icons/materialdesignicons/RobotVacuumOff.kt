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

public val MaterialDesignIcons.RobotVacuumOff: ImageVector
    get() {
        if (_robotVacuumOff != null) {
            return _robotVacuumOff!!
        }
        _robotVacuumOff = Builder(name = "RobotVacuumOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(18.0f, 19.9f)
                curveTo(16.3f, 21.2f, 14.2f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 10.0f, 2.6f, 8.1f, 3.7f, 6.5f)
                lineTo(5.2f, 7.9f)
                curveTo(4.4f, 9.2f, 4.0f, 10.6f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4f, 7.6f, 20.0f, 12.0f, 20.0f)
                curveTo(13.7f, 20.0f, 15.3f, 19.4f, 16.6f, 18.5f)
                lineTo(13.7f, 15.6f)
                curveTo(13.2f, 15.9f, 12.6f, 16.0f, 12.0f, 16.0f)
                curveTo(10.9f, 16.0f, 9.9f, 15.6f, 9.2f, 14.8f)
                lineTo(7.8f, 16.2f)
                curveTo(6.6f, 15.1f, 6.0f, 13.6f, 6.0f, 12.0f)
                curveTo(6.0f, 10.8f, 6.3f, 9.7f, 6.9f, 8.8f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 13.4f, 19.6f, 14.7f, 19.0f, 15.8f)
                lineTo(20.5f, 17.3f)
                curveTo(21.5f, 15.8f, 22.0f, 14.0f, 22.0f, 12.0f)
                curveTo(22.0f, 10.0f, 21.4f, 8.1f, 20.3f, 6.5f)
                lineTo(18.8f, 7.9f)
                curveTo(19.6f, 9.2f, 20.0f, 10.6f, 20.0f, 12.0f)
                moveTo(12.0f, 4.0f)
                curveTo(14.1f, 4.0f, 16.2f, 4.8f, 17.7f, 6.3f)
                lineTo(19.1f, 4.9f)
                curveTo(17.2f, 3.1f, 14.7f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1f, 2.0f, 8.3f, 2.5f, 6.7f, 3.5f)
                lineTo(8.2f, 5.0f)
                curveTo(9.3f, 4.3f, 10.7f, 4.0f, 12.0f, 4.0f)
                moveTo(17.5f, 14.3f)
                curveTo(17.8f, 13.6f, 18.0f, 12.8f, 18.0f, 12.0f)
                curveTo(18.0f, 8.7f, 15.3f, 6.0f, 12.0f, 6.0f)
                curveTo(11.2f, 6.0f, 10.4f, 6.2f, 9.7f, 6.5f)
                lineTo(11.4f, 8.2f)
                curveTo(11.6f, 8.1f, 11.8f, 8.0f, 12.0f, 8.0f)
                curveTo(12.6f, 8.0f, 13.0f, 8.4f, 13.0f, 9.0f)
                curveTo(13.0f, 9.2f, 12.9f, 9.4f, 12.8f, 9.6f)
                lineTo(17.5f, 14.3f)
                close()
            }
        }
        .build()
        return _robotVacuumOff!!
    }

private var _robotVacuumOff: ImageVector? = null
