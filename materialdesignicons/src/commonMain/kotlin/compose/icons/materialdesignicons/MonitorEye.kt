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

public val MaterialDesignIcons.MonitorEye: ImageVector
    get() {
        if (_monitorEye != null) {
            return _monitorEye!!
        }
        _monitorEye = Builder(name = "MonitorEye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 2.0f, 23.0f, 2.89f, 23.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(23.0f, 16.53f, 22.79f, 17.04f, 22.41f, 17.41f)
                curveTo(22.04f, 17.79f, 21.53f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.47f, 18.0f, 1.96f, 17.79f, 1.59f, 17.41f)
                curveTo(1.21f, 17.04f, 1.0f, 16.53f, 1.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 2.89f, 1.89f, 2.0f, 3.0f, 2.0f)
                moveTo(10.84f, 8.93f)
                curveTo(11.15f, 8.63f, 11.57f, 8.45f, 12.0f, 8.45f)
                curveTo(12.43f, 8.46f, 12.85f, 8.63f, 13.16f, 8.94f)
                curveTo(13.46f, 9.24f, 13.64f, 9.66f, 13.64f, 10.09f)
                curveTo(13.64f, 10.53f, 13.46f, 10.94f, 13.16f, 11.25f)
                curveTo(12.85f, 11.56f, 12.43f, 11.73f, 12.0f, 11.73f)
                curveTo(11.57f, 11.73f, 11.15f, 11.55f, 10.84f, 11.25f)
                curveTo(10.54f, 10.94f, 10.36f, 10.53f, 10.36f, 10.09f)
                curveTo(10.36f, 9.66f, 10.54f, 9.24f, 10.84f, 8.93f)
                moveTo(10.07f, 12.0f)
                curveTo(10.58f, 12.53f, 11.28f, 12.82f, 12.0f, 12.82f)
                curveTo(12.72f, 12.82f, 13.42f, 12.53f, 13.93f, 12.0f)
                curveTo(14.44f, 11.5f, 14.73f, 10.81f, 14.73f, 10.09f)
                curveTo(14.73f, 9.37f, 14.44f, 8.67f, 13.93f, 8.16f)
                curveTo(13.42f, 7.65f, 12.72f, 7.36f, 12.0f, 7.36f)
                curveTo(11.28f, 7.36f, 10.58f, 7.65f, 10.07f, 8.16f)
                curveTo(9.56f, 8.67f, 9.27f, 9.37f, 9.27f, 10.09f)
                curveTo(9.27f, 10.81f, 9.56f, 11.5f, 10.07f, 12.0f)
                moveTo(6.0f, 10.09f)
                curveTo(6.94f, 7.7f, 9.27f, 6.0f, 12.0f, 6.0f)
                curveTo(14.73f, 6.0f, 17.06f, 7.7f, 18.0f, 10.09f)
                curveTo(17.06f, 12.5f, 14.73f, 14.18f, 12.0f, 14.18f)
                curveTo(9.27f, 14.18f, 6.94f, 12.5f, 6.0f, 10.09f)
                close()
            }
        }
        .build()
        return _monitorEye!!
    }

private var _monitorEye: ImageVector? = null
