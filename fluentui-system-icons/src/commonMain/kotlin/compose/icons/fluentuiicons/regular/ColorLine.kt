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

public val RegularGroup.ColorLine: ImageVector
    get() {
        if (_colorLine != null) {
            return _colorLine!!
        }
        _colorLine = Builder(name = "ColorLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3809f, 14.0028f)
                curveTo(3.0555f, 14.0649f, 2.0f, 15.1592f, 2.0f, 16.5f)
                verticalLineTo(19.5f)
                curveTo(2.0f, 20.8807f, 3.1193f, 22.0f, 4.5f, 22.0f)
                horizontalLineTo(19.5f)
                curveTo(20.8807f, 22.0f, 22.0f, 20.8807f, 22.0f, 19.5f)
                verticalLineTo(16.5f)
                curveTo(22.0f, 15.1193f, 20.8807f, 14.0f, 19.5f, 14.0f)
                horizontalLineTo(13.546f)
                lineTo(12.2298f, 15.314f)
                curveTo(12.1647f, 15.379f, 12.0971f, 15.441f, 12.027f, 15.5f)
                horizontalLineTo(19.5f)
                curveTo(20.0523f, 15.5f, 20.5f, 15.9477f, 20.5f, 16.5f)
                verticalLineTo(19.5f)
                curveTo(20.5f, 20.0523f, 20.0523f, 20.5f, 19.5f, 20.5f)
                horizontalLineTo(4.5f)
                curveTo(3.9477f, 20.5f, 3.5f, 20.0523f, 3.5f, 19.5f)
                verticalLineTo(16.5f)
                curveTo(3.5f, 16.1281f, 3.703f, 15.8036f, 4.0043f, 15.6313f)
                curveTo(3.9878f, 15.3809f, 4.0185f, 15.1283f, 4.0963f, 14.8868f)
                lineTo(4.3809f, 14.0028f)
                close()
                moveTo(18.6479f, 2.944f)
                curveTo(19.9043f, 4.2012f, 19.9036f, 6.2388f, 18.6465f, 7.4951f)
                lineTo(11.5233f, 14.6063f)
                curveTo(11.2603f, 14.8688f, 10.9364f, 15.0622f, 10.5805f, 15.169f)
                lineTo(6.2875f, 16.4576f)
                curveTo(5.7585f, 16.6164f, 5.201f, 16.3163f, 5.0422f, 15.7873f)
                curveTo(4.984f, 15.5933f, 4.986f, 15.3862f, 5.0481f, 15.1933f)
                lineTo(6.4095f, 10.9653f)
                curveTo(6.5192f, 10.6248f, 6.7084f, 10.3153f, 6.9616f, 10.0626f)
                lineTo(14.0944f, 2.9414f)
                curveTo(15.3527f, 1.6852f, 17.391f, 1.6863f, 18.6479f, 2.944f)
                close()
                moveTo(15.1542f, 4.003f)
                lineTo(8.0213f, 11.1241f)
                curveTo(7.937f, 11.2084f, 7.8739f, 11.3115f, 7.8373f, 11.425f)
                lineTo(6.7676f, 14.7474f)
                lineTo(10.1493f, 13.7323f)
                curveTo(10.2679f, 13.6967f, 10.3759f, 13.6323f, 10.4635f, 13.5448f)
                lineTo(17.5855f, 6.4348f)
                curveTo(18.2573f, 5.7634f, 18.2577f, 4.6755f, 17.5869f, 4.0044f)
                curveTo(16.9154f, 3.3324f, 15.8265f, 3.3318f, 15.1542f, 4.003f)
                close()
            }
        }
        .build()
        return _colorLine!!
    }

private var _colorLine: ImageVector? = null
