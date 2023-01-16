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

public val MaterialDesignIcons.MonitorLock: ImageVector
    get() {
        if (_monitorLock != null) {
            return _monitorLock!!
        }
        _monitorLock = Builder(name = "MonitorLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 23.0f, 15.5f)
                verticalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.0f, 17.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 21.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 16.0f)
                verticalLineTo(15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.5f, 13.0f)
                moveTo(20.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 15.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 14.0f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                curveTo(0.89f, 18.0f, 0.0f, 17.1f, 0.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(0.0f, 2.89f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(11.53f)
                curveTo(21.41f, 11.19f, 20.73f, 11.0f, 20.0f, 11.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _monitorLock!!
    }

private var _monitorLock: ImageVector? = null
