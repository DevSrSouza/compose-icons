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

public val FilledGroup.PersonTag: ImageVector
    get() {
        if (_personTag != null) {
            return _personTag!!
        }
        _personTag = Builder(name = "PersonTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0001f, 14.0002f)
                verticalLineTo(16.9351f)
                curveTo(11.0001f, 17.72f, 11.3087f, 18.473f, 11.8587f, 19.0329f)
                lineTo(14.1151f, 21.33f)
                curveTo(12.9353f, 21.7782f, 11.5611f, 22.0013f, 10.0004f, 22.0013f)
                curveTo(6.5794f, 22.0013f, 4.0564f, 20.9292f, 2.5143f, 18.7648f)
                curveTo(2.1823f, 18.2989f, 2.0039f, 17.7411f, 2.0039f, 17.169f)
                verticalLineTo(16.2491f)
                curveTo(2.0039f, 15.007f, 3.0108f, 14.0002f, 4.2528f, 14.0002f)
                horizontalLineTo(11.0001f)
                close()
                moveTo(15.0004f, 7.0049f)
                curveTo(15.0004f, 4.2435f, 12.7618f, 2.0049f, 10.0004f, 2.0049f)
                curveTo(7.2389f, 2.0049f, 5.0004f, 4.2435f, 5.0004f, 7.0049f)
                curveTo(5.0004f, 9.7663f, 7.2389f, 12.0049f, 10.0004f, 12.0049f)
                curveTo(12.7618f, 12.0049f, 15.0004f, 9.7663f, 15.0004f, 7.0049f)
                close()
                moveTo(16.5722f, 22.4043f)
                lineTo(12.5721f, 18.3321f)
                curveTo(12.2054f, 17.9589f, 12.0001f, 17.4573f, 12.0001f, 16.9351f)
                verticalLineTo(13.9986f)
                curveTo(12.0001f, 12.8966f, 12.8958f, 12.0032f, 14.0015f, 12.0025f)
                lineTo(16.9186f, 12.0004f)
                curveTo(17.4464f, 12.0f, 17.9531f, 12.2073f, 18.3286f, 12.5771f)
                lineTo(22.4042f, 16.5912f)
                curveTo(23.1932f, 17.3684f, 23.1987f, 18.6364f, 22.4163f, 19.4198f)
                lineTo(19.4237f, 22.4164f)
                curveTo(18.6361f, 23.205f, 17.3534f, 23.1996f, 16.5722f, 22.4043f)
                close()
                moveTo(14.9964f, 16.0003f)
                curveTo(15.5479f, 16.0003f, 15.9951f, 15.5525f, 15.9951f, 15.0003f)
                curveTo(15.9951f, 14.448f, 15.5479f, 14.0003f, 14.9964f, 14.0003f)
                curveTo(14.4448f, 14.0003f, 13.9977f, 14.448f, 13.9977f, 15.0003f)
                curveTo(13.9977f, 15.5525f, 14.4448f, 16.0003f, 14.9964f, 16.0003f)
                close()
            }
        }
        .build()
        return _personTag!!
    }

private var _personTag: ImageVector? = null
