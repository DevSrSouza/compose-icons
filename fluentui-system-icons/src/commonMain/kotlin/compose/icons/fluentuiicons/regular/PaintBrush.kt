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

public val RegularGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 2.0f)
                curveTo(5.3358f, 2.0f, 5.0f, 2.3358f, 5.0f, 2.75f)
                verticalLineTo(14.2505f)
                curveTo(5.0f, 15.4932f, 6.0074f, 16.5005f, 7.25f, 16.5005f)
                horizontalLineTo(9.4998f)
                verticalLineTo(19.5f)
                curveTo(9.4998f, 20.8807f, 10.619f, 22.0f, 11.9998f, 22.0f)
                curveTo(13.3805f, 22.0f, 14.4998f, 20.8807f, 14.4998f, 19.5f)
                verticalLineTo(16.5005f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 16.5005f, 19.0f, 15.4932f, 19.0f, 14.2505f)
                verticalLineTo(2.75f)
                curveTo(19.0f, 2.3358f, 18.6642f, 2.0f, 18.25f, 2.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(6.5f, 11.0003f)
                verticalLineTo(3.5f)
                horizontalLineTo(12.4998f)
                verticalLineTo(5.2515f)
                curveTo(12.4998f, 5.6658f, 12.8355f, 6.0015f, 13.2498f, 6.0015f)
                curveTo(13.664f, 6.0015f, 13.9998f, 5.6658f, 13.9998f, 5.2515f)
                verticalLineTo(3.5f)
                horizontalLineTo(14.9998f)
                verticalLineTo(6.2511f)
                curveTo(14.9998f, 6.6653f, 15.3355f, 7.0011f, 15.7498f, 7.0011f)
                curveTo(16.164f, 7.0011f, 16.4998f, 6.6653f, 16.4998f, 6.2511f)
                verticalLineTo(3.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(11.0003f)
                horizontalLineTo(6.5f)
                close()
                moveTo(6.5f, 14.2505f)
                verticalLineTo(12.5003f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.2505f)
                curveTo(17.5f, 14.6647f, 17.1642f, 15.0005f, 16.75f, 15.0005f)
                horizontalLineTo(13.7498f)
                curveTo(13.3355f, 15.0005f, 12.9998f, 15.3363f, 12.9998f, 15.7505f)
                verticalLineTo(19.5f)
                curveTo(12.9998f, 20.0523f, 12.552f, 20.5f, 11.9998f, 20.5f)
                curveTo(11.4475f, 20.5f, 10.9998f, 20.0523f, 10.9998f, 19.5f)
                verticalLineTo(15.7505f)
                curveTo(10.9998f, 15.3363f, 10.664f, 15.0005f, 10.2498f, 15.0005f)
                horizontalLineTo(7.25f)
                curveTo(6.8358f, 15.0005f, 6.5f, 14.6647f, 6.5f, 14.2505f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
