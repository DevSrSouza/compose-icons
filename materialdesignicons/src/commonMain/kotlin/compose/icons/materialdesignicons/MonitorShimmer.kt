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

public val MaterialDesignIcons.MonitorShimmer: ImageVector
    get() {
        if (_monitorShimmer != null) {
            return _monitorShimmer!!
        }
        _monitorShimmer = Builder(name = "MonitorShimmer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 2.0f, 1.0f, 2.89f, 1.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(1.0f, 17.11f, 1.9f, 18.0f, 3.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                curveTo(22.11f, 18.0f, 23.0f, 17.11f, 23.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.89f, 22.1f, 2.0f, 21.0f, 2.0f)
                moveTo(15.0f, 5.5f)
                lineTo(14.38f, 6.87f)
                lineTo(13.0f, 7.5f)
                lineTo(14.38f, 8.13f)
                lineTo(15.0f, 9.5f)
                lineTo(15.63f, 8.13f)
                lineTo(17.0f, 7.5f)
                lineTo(15.63f, 6.87f)
                lineTo(15.0f, 5.5f)
                moveTo(10.5f, 7.5f)
                lineTo(9.41f, 9.91f)
                lineTo(7.0f, 11.0f)
                lineTo(9.41f, 12.09f)
                lineTo(10.5f, 14.5f)
                lineTo(11.6f, 12.09f)
                lineTo(14.0f, 11.0f)
                lineTo(11.6f, 9.91f)
                lineTo(10.5f, 7.5f)
            }
        }
        .build()
        return _monitorShimmer!!
    }

private var _monitorShimmer: ImageVector? = null
