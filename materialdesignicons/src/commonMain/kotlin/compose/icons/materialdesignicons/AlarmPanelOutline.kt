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

public val MaterialDesignIcons.AlarmPanelOutline: ImageVector
    get() {
        if (_alarmPanelOutline != null) {
            return _alarmPanelOutline!!
        }
        _alarmPanelOutline = Builder(name = "AlarmPanelOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                moveTo(13.5f, 10.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.0f)
                moveTo(18.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                moveTo(18.0f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                moveTo(20.0f, 5.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                lineTo(20.0f, 5.0f)
                lineTo(20.0f, 5.0f)
                moveTo(20.0f, 3.0f)
                curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 20.1f, 21.1f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 21.0f, 2.0f, 20.1f, 2.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.9f, 2.9f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                moveTo(9.0f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                moveTo(13.5f, 13.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.0f)
                moveTo(18.0f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                moveTo(9.0f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                moveTo(13.5f, 16.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(16.0f)
                moveTo(18.0f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _alarmPanelOutline!!
    }

private var _alarmPanelOutline: ImageVector? = null
