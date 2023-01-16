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

public val MaterialDesignIcons.ElevatorUp: ImageVector
    get() {
        if (_elevatorUp != null) {
            return _elevatorUp!!
        }
        _elevatorUp = Builder(name = "ElevatorUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                lineTo(7.0f, 2.0f)
                moveTo(17.0f, 2.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                lineTo(17.0f, 2.0f)
                moveTo(7.0f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 12.0f, 19.0f, 12.9f, 19.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 21.11f, 18.11f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 22.0f, 5.0f, 21.11f, 5.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(5.0f, 12.9f, 5.9f, 12.0f, 7.0f, 12.0f)
                moveTo(7.0f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _elevatorUp!!
    }

private var _elevatorUp: ImageVector? = null
