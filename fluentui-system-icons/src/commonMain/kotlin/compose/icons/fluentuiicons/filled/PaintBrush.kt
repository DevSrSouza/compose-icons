package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.0f)
                verticalLineTo(5.2515f)
                curveTo(12.5f, 5.6658f, 12.8358f, 6.0015f, 13.25f, 6.0015f)
                curveTo(13.6642f, 6.0015f, 14.0f, 5.6658f, 14.0f, 5.2515f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.2511f)
                curveTo(15.0f, 6.6653f, 15.3358f, 7.0011f, 15.75f, 7.0011f)
                curveTo(16.1642f, 7.0011f, 16.5f, 6.6653f, 16.5f, 6.2511f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.2502f)
                curveTo(18.6645f, 2.0f, 19.0002f, 2.3358f, 19.0002f, 2.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0002f)
                verticalLineTo(2.75f)
                curveTo(5.0002f, 2.3358f, 5.336f, 2.0f, 5.7502f, 2.0f)
                horizontalLineTo(12.5f)
                close()
                moveTo(5.0002f, 12.5f)
                verticalLineTo(14.2521f)
                curveTo(5.0002f, 15.4947f, 6.0076f, 16.5021f, 7.2502f, 16.5021f)
                horizontalLineTo(9.9999f)
                verticalLineTo(20.0f)
                curveTo(9.9999f, 21.1046f, 10.8953f, 22.0f, 11.9999f, 22.0f)
                curveTo(13.1045f, 22.0f, 13.9999f, 21.1046f, 13.9999f, 20.0f)
                verticalLineTo(16.5021f)
                horizontalLineTo(16.7502f)
                curveTo(17.9929f, 16.5021f, 19.0002f, 15.4947f, 19.0002f, 14.2521f)
                verticalLineTo(12.5f)
                horizontalLineTo(5.0002f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
