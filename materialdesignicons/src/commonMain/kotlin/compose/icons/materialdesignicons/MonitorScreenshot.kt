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

public val MaterialDesignIcons.MonitorScreenshot: ImageVector
    get() {
        if (_monitorScreenshot != null) {
            return _monitorScreenshot!!
        }
        _monitorScreenshot = Builder(name = "MonitorScreenshot", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                moveTo(19.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                moveTo(21.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 2.0f, 1.0f, 2.89f, 1.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.89f, 22.1f, 2.0f, 21.0f, 2.0f)
            }
        }
        .build()
        return _monitorScreenshot!!
    }

private var _monitorScreenshot: ImageVector? = null
