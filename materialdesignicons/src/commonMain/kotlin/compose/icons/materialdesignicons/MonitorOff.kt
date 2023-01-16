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

public val MaterialDesignIcons.MonitorOff: ImageVector
    get() {
        if (_monitorOff != null) {
            return _monitorOff!!
        }
        _monitorOff = Builder(name = "MonitorOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 16.0f)
                verticalLineTo(4.0f)
                lineTo(0.0f, 3.0f)
                lineTo(1.41f, 1.58f)
                lineTo(22.16f, 22.34f)
                lineTo(20.75f, 23.75f)
                lineTo(15.0f, 18.0f)
                horizontalLineTo(14.0f)
                moveTo(3.0f, 16.0f)
                horizontalLineTo(13.0f)
                lineTo(3.0f, 6.0f)
                verticalLineTo(16.0f)
                moveTo(21.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 18.0f)
                horizontalLineTo(20.66f)
                lineTo(18.66f, 16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.66f)
                lineTo(4.66f, 2.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _monitorOff!!
    }

private var _monitorOff: ImageVector? = null
