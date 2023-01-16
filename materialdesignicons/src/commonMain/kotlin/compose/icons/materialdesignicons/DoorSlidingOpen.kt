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

public val MaterialDesignIcons.DoorSlidingOpen: ImageVector
    get() {
        if (_doorSlidingOpen != null) {
            return _doorSlidingOpen!!
        }
        _doorSlidingOpen = Builder(name = "DoorSlidingOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                moveTo(22.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                moveTo(7.0f, 5.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                moveTo(22.0f, 3.0f)
                curveTo(23.11f, 3.0f, 24.0f, 3.89f, 24.0f, 5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(5.0f)
                curveTo(0.0f, 3.89f, 0.894f, 3.0f, 2.0f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                moveTo(20.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _doorSlidingOpen!!
    }

private var _doorSlidingOpen: ImageVector? = null
