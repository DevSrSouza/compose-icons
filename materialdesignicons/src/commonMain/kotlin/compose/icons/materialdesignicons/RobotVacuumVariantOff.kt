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

public val MaterialDesignIcons.RobotVacuumVariantOff: ImageVector
    get() {
        if (_robotVacuumVariantOff != null) {
            return _robotVacuumVariantOff!!
        }
        _robotVacuumVariantOff = Builder(name = "RobotVacuumVariantOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(17.3f, 19.2f)
                curveTo(15.8f, 20.3f, 14.0f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0f, 21.0f, 3.0f, 17.0f, 3.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 15.9f, 8.1f, 19.0f, 12.0f, 19.0f)
                curveTo(13.4f, 19.0f, 14.8f, 18.5f, 15.9f, 17.8f)
                lineTo(14.0f, 15.9f)
                curveTo(13.5f, 16.5f, 12.8f, 17.0f, 12.0f, 17.0f)
                curveTo(10.6f, 17.0f, 9.5f, 15.9f, 9.5f, 14.5f)
                curveTo(9.5f, 13.7f, 9.9f, 12.9f, 10.6f, 12.5f)
                lineTo(5.0f, 6.9f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.9f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(19.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(6.2f)
                lineTo(8.2f, 5.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 12.0f)
                curveTo(19.0f, 13.1f, 18.7f, 14.1f, 18.3f, 15.1f)
                lineTo(19.8f, 16.6f)
                curveTo(20.6f, 15.3f, 21.0f, 13.7f, 21.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                moveTo(16.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.2f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _robotVacuumVariantOff!!
    }

private var _robotVacuumVariantOff: ImageVector? = null
