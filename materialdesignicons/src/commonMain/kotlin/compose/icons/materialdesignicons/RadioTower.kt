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

public val MaterialDesignIcons.RadioTower: ImageVector
    get() {
        if (_radioTower != null) {
            return _radioTower!!
        }
        _radioTower = Builder(name = "RadioTower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                curveTo(14.0f, 12.5f, 13.82f, 12.94f, 13.53f, 13.29f)
                lineTo(16.7f, 22.0f)
                horizontalLineTo(14.57f)
                lineTo(12.0f, 14.93f)
                lineTo(9.43f, 22.0f)
                horizontalLineTo(7.3f)
                lineTo(10.47f, 13.29f)
                curveTo(10.18f, 12.94f, 10.0f, 12.5f, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                moveTo(12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 12.0f)
                curveTo(8.0f, 12.5f, 8.1f, 13.0f, 8.28f, 13.46f)
                lineTo(7.4f, 15.86f)
                curveTo(6.53f, 14.81f, 6.0f, 13.47f, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 12.0f)
                curveTo(18.0f, 13.47f, 17.47f, 14.81f, 16.6f, 15.86f)
                lineTo(15.72f, 13.46f)
                curveTo(15.9f, 13.0f, 16.0f, 12.5f, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 8.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                curveTo(4.0f, 14.36f, 5.0f, 16.5f, 6.64f, 17.94f)
                lineTo(5.92f, 19.94f)
                curveTo(3.54f, 18.11f, 2.0f, 15.23f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                curveTo(22.0f, 15.23f, 20.46f, 18.11f, 18.08f, 19.94f)
                lineTo(17.36f, 17.94f)
                curveTo(19.0f, 16.5f, 20.0f, 14.36f, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _radioTower!!
    }

private var _radioTower: ImageVector? = null
