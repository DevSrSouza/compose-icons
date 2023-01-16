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

public val MaterialDesignIcons.RoomService: ImageVector
    get() {
        if (_roomService != null) {
            return _roomService!!
        }
        _roomService = Builder(name = "RoomService", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 7.0f)
                curveTo(14.0f, 7.24f, 13.96f, 7.47f, 13.88f, 7.69f)
                curveTo(17.95f, 8.5f, 21.0f, 11.91f, 21.0f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 11.91f, 6.05f, 8.5f, 10.12f, 7.69f)
                curveTo(10.04f, 7.47f, 10.0f, 7.24f, 10.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 5.0f)
                moveTo(22.0f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _roomService!!
    }

private var _roomService: ImageVector? = null
