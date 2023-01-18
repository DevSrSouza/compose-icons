package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9247f, 2.5039f)
                curveTo(14.7225f, 2.5039f, 15.4607f, 2.9264f, 15.8647f, 3.6143f)
                lineTo(16.6793f, 5.0009f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 5.0009f, 22.0f, 6.4559f, 22.0f, 8.2509f)
                verticalLineTo(17.7509f)
                curveTo(22.0f, 19.5458f, 20.5449f, 21.0009f, 18.75f, 21.0009f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 21.0009f, 2.0f, 19.5458f, 2.0f, 17.7509f)
                verticalLineTo(8.2509f)
                curveTo(2.0f, 6.4559f, 3.4551f, 5.0009f, 5.25f, 5.0009f)
                horizontalLineTo(7.3304f)
                lineTo(8.205f, 3.5766f)
                curveTo(8.6143f, 2.9101f, 9.3403f, 2.5039f, 10.1224f, 2.5039f)
                horizontalLineTo(13.9247f)
                close()
                moveTo(13.9247f, 4.0039f)
                horizontalLineTo(10.1224f)
                curveTo(9.8989f, 4.0039f, 9.6892f, 4.1034f, 9.5479f, 4.2717f)
                lineTo(9.4832f, 4.3615f)
                lineTo(8.3891f, 6.1433f)
                curveTo(8.2527f, 6.3655f, 8.0107f, 6.5009f, 7.75f, 6.5009f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 6.5009f, 3.5f, 7.2844f, 3.5f, 8.2509f)
                verticalLineTo(17.7509f)
                curveTo(3.5f, 18.7174f, 4.2835f, 19.5009f, 5.25f, 19.5009f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 19.5009f, 20.5f, 18.7174f, 20.5f, 17.7509f)
                verticalLineTo(8.2509f)
                curveTo(20.5f, 7.2844f, 19.7165f, 6.5009f, 18.75f, 6.5009f)
                horizontalLineTo(16.25f)
                curveTo(15.9841f, 6.5009f, 15.738f, 6.36f, 15.6033f, 6.1307f)
                lineTo(14.5714f, 4.374f)
                curveTo(14.4367f, 4.1447f, 14.1906f, 4.0039f, 13.9247f, 4.0039f)
                close()
                moveTo(12.0f, 8.0009f)
                curveTo(14.4853f, 8.0009f, 16.5f, 10.0156f, 16.5f, 12.5009f)
                curveTo(16.5f, 14.9861f, 14.4853f, 17.0009f, 12.0f, 17.0009f)
                curveTo(9.5147f, 17.0009f, 7.5f, 14.9861f, 7.5f, 12.5009f)
                curveTo(7.5f, 10.0156f, 9.5147f, 8.0009f, 12.0f, 8.0009f)
                close()
                moveTo(12.0f, 9.5009f)
                curveTo(10.3431f, 9.5009f, 9.0f, 10.844f, 9.0f, 12.5009f)
                curveTo(9.0f, 14.1577f, 10.3431f, 15.5009f, 12.0f, 15.5009f)
                curveTo(13.6569f, 15.5009f, 15.0f, 14.1577f, 15.0f, 12.5009f)
                curveTo(15.0f, 10.844f, 13.6569f, 9.5009f, 12.0f, 9.5009f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
