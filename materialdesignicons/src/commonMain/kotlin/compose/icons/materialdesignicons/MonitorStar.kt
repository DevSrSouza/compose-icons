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

public val MaterialDesignIcons.MonitorStar: ImageVector
    get() {
        if (_monitorStar != null) {
            return _monitorStar!!
        }
        _monitorStar = Builder(name = "MonitorStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 18.0f, 1.0f, 17.1f, 1.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 2.89f, 1.89f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                moveTo(12.97f, 9.0f)
                horizontalLineTo(16.0f)
                lineTo(13.53f, 10.76f)
                lineTo(14.47f, 13.67f)
                lineTo(12.0f, 11.87f)
                lineTo(9.53f, 13.67f)
                lineTo(10.47f, 10.76f)
                lineTo(8.0f, 9.0f)
                horizontalLineTo(11.03f)
                lineTo(12.0f, 6.0f)
                lineTo(12.97f, 9.0f)
                close()
            }
        }
        .build()
        return _monitorStar!!
    }

private var _monitorStar: ImageVector? = null
