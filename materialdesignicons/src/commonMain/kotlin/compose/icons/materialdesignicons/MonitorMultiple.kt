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

public val MaterialDesignIcons.MonitorMultiple: ImageVector
    get() {
        if (_monitorMultiple != null) {
            return _monitorMultiple!!
        }
        _monitorMultiple = Builder(name = "MonitorMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                moveTo(22.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(24.0f, 18.11f, 23.1f, 19.0f, 22.0f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 19.0f, 4.0f, 18.11f, 4.0f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 5.0f)
                horizontalLineTo(22.0f)
                moveTo(2.0f, 3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _monitorMultiple!!
    }

private var _monitorMultiple: ImageVector? = null
