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

public val MaterialDesignIcons.ElevatorPassengerOffOutline: ImageVector
    get() {
        if (_elevatorPassengerOffOutline != null) {
            return _elevatorPassengerOffOutline!!
        }
        _elevatorPassengerOffOutline = Builder(name = "ElevatorPassengerOffOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.0f, 4.9f)
                curveTo(3.0f, 4.94f, 3.0f, 4.97f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(19.03f, 21.0f, 19.06f, 21.0f, 19.1f, 21.0f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(5.0f, 19.0f)
                verticalLineTo(6.89f)
                lineTo(7.65f, 9.54f)
                curveTo(6.71f, 9.71f, 6.0f, 10.5f, 6.0f, 11.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.89f)
                lineTo(17.11f, 19.0f)
                horizontalLineTo(5.0f)
                moveTo(8.2f, 5.0f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(17.8f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.2f)
                moveTo(18.0f, 11.0f)
                horizontalLineTo(14.2f)
                lineTo(13.46f, 10.26f)
                lineTo(15.5f, 7.0f)
                lineTo(18.0f, 11.0f)
                moveTo(17.31f, 14.11f)
                lineTo(16.2f, 13.0f)
                horizontalLineTo(18.0f)
                lineTo(17.31f, 14.11f)
                close()
            }
        }
        .build()
        return _elevatorPassengerOffOutline!!
    }

private var _elevatorPassengerOffOutline: ImageVector? = null
