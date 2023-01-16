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

public val MaterialDesignIcons.DesktopTowerMonitor: ImageVector
    get() {
        if (_desktopTowerMonitor != null) {
            return _desktopTowerMonitor!!
        }
        _desktopTowerMonitor = Builder(name = "DesktopTowerMonitor", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 6.0f)
                horizontalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 18.0f)
                moveTo(22.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                moveTo(22.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                moveTo(9.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 14.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 6.0f)
                horizontalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 7.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 15.0f)
                horizontalLineTo(9.0f)
                moveTo(12.0f, 8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _desktopTowerMonitor!!
    }

private var _desktopTowerMonitor: ImageVector? = null
