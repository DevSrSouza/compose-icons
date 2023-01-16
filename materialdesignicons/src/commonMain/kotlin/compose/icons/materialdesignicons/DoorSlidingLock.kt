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

public val MaterialDesignIcons.DoorSlidingLock: ImageVector
    get() {
        if (_doorSlidingLock != null) {
            return _doorSlidingLock!!
        }
        _doorSlidingLock = Builder(name = "DoorSlidingLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(21.8f, 14.1f, 20.4f, 13.0f, 19.0f, 13.0f)
                reflectiveCurveTo(16.2f, 14.1f, 16.2f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(15.6f, 17.0f, 15.0f, 17.6f, 15.0f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(15.0f, 22.4f, 15.6f, 23.0f, 16.2f, 23.0f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 23.0f, 23.0f, 22.4f, 23.0f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(23.0f, 17.6f, 22.4f, 17.0f, 21.8f, 17.0f)
                moveTo(20.5f, 17.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.5f)
                curveTo(17.5f, 14.7f, 18.2f, 14.2f, 19.0f, 14.2f)
                reflectiveCurveTo(20.5f, 14.7f, 20.5f, 15.5f)
                verticalLineTo(17.0f)
                moveTo(13.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                moveTo(9.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.44f)
                curveTo(17.61f, 11.17f, 18.29f, 11.0f, 19.0f, 11.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 3.9f, 18.1f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                moveTo(10.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _doorSlidingLock!!
    }

private var _doorSlidingLock: ImageVector? = null
