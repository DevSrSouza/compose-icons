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

public val MaterialDesignIcons.ElevatorPassenger: ImageVector
    get() {
        if (_elevatorPassenger != null) {
            return _elevatorPassenger!!
        }
        _elevatorPassenger = Builder(name = "ElevatorPassenger", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(8.5f, 6.0f)
                curveTo(9.19f, 6.0f, 9.75f, 6.56f, 9.75f, 7.25f)
                reflectiveCurveTo(9.19f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveTo(7.25f, 7.94f, 7.25f, 7.25f)
                reflectiveCurveTo(7.81f, 6.0f, 8.5f, 6.0f)
                moveTo(11.0f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.5f)
                curveTo(6.0f, 10.4f, 6.9f, 9.5f, 8.0f, 9.5f)
                horizontalLineTo(9.0f)
                curveTo(10.1f, 9.5f, 11.0f, 10.4f, 11.0f, 11.5f)
                verticalLineTo(14.0f)
                moveTo(15.5f, 17.0f)
                lineTo(13.0f, 13.0f)
                horizontalLineTo(18.0f)
                lineTo(15.5f, 17.0f)
                moveTo(13.0f, 11.0f)
                lineTo(15.5f, 7.0f)
                lineTo(18.0f, 11.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _elevatorPassenger!!
    }

private var _elevatorPassenger: ImageVector? = null
