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

public val MaterialDesignIcons.AlarmPanel: ImageVector
    get() {
        if (_alarmPanel != null) {
            return _alarmPanel!!
        }
        _alarmPanel = Builder(name = "AlarmPanel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.1f, 2.9f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 21.0f, 22.0f, 20.1f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f)
                moveTo(8.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                moveTo(8.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                moveTo(8.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                moveTo(13.5f, 19.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(19.0f)
                moveTo(13.5f, 16.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(16.0f)
                moveTo(13.5f, 13.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                moveTo(19.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                moveTo(19.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                moveTo(19.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _alarmPanel!!
    }

private var _alarmPanel: ImageVector? = null
