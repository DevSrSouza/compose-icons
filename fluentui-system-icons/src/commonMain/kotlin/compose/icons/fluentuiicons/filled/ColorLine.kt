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

public val FilledGroup.ColorLine: ImageVector
    get() {
        if (_colorLine != null) {
            return _colorLine!!
        }
        _colorLine = Builder(name = "ColorLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3818f, 14.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 14.0f, 2.0f, 14.8954f, 2.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1046f, 2.8954f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 22.0f, 22.0f, 21.1046f, 22.0f, 20.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 14.8954f, 21.1046f, 14.0f, 20.0f, 14.0f)
                horizontalLineTo(13.546f)
                lineTo(12.2298f, 15.314f)
                curveTo(11.8499f, 15.6932f, 11.3821f, 15.9725f, 10.868f, 16.1268f)
                lineTo(6.575f, 17.4154f)
                curveTo(5.517f, 17.733f, 4.402f, 17.1328f, 4.0844f, 16.0748f)
                curveTo(3.968f, 15.6868f, 3.9721f, 15.2725f, 4.0963f, 14.8868f)
                lineTo(4.3818f, 14.0f)
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
            }
        }
        .build()
        return _colorLine!!
    }

private var _colorLine: ImageVector? = null
