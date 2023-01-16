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

public val MaterialDesignIcons.MonitorShare: ImageVector
    get() {
        if (_monitorShare != null) {
            return _monitorShare!!
        }
        _monitorShare = Builder(name = "MonitorShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(23.0f, 17.11f, 22.11f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 18.0f, 1.0f, 17.11f, 1.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 2.89f, 1.89f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 2.0f, 23.0f, 2.89f, 23.0f, 4.0f)
                moveTo(13.0f, 13.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 9.0f)
                lineTo(8.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _monitorShare!!
    }

private var _monitorShare: ImageVector? = null
