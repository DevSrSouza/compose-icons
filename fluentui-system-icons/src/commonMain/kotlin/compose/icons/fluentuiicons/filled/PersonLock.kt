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

public val FilledGroup.PersonLock: ImageVector
    get() {
        if (_personLock != null) {
            return _personLock!!
        }
        _personLock = Builder(name = "PersonLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.05f)
                verticalLineTo(14.0002f)
                horizontalLineTo(4.2528f)
                curveTo(3.0108f, 14.0002f, 2.0039f, 15.007f, 2.0039f, 16.2491f)
                verticalLineTo(17.169f)
                curveTo(2.0039f, 17.7411f, 2.1823f, 18.2989f, 2.5143f, 18.7648f)
                curveTo(4.0564f, 20.9292f, 6.5794f, 22.0013f, 10.0004f, 22.0013f)
                curveTo(10.7149f, 22.0013f, 11.3903f, 21.9546f, 12.0259f, 21.8608f)
                curveTo(12.0088f, 21.743f, 12.0f, 21.6225f, 12.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(12.0f, 15.2905f, 12.8589f, 14.2816f, 14.0f, 14.05f)
                close()
                moveTo(10.0004f, 2.0049f)
                curveTo(12.7618f, 2.0049f, 15.0004f, 4.2435f, 15.0004f, 7.0049f)
                curveTo(15.0004f, 9.7663f, 12.7618f, 12.0049f, 10.0004f, 12.0049f)
                curveTo(7.2389f, 12.0049f, 5.0004f, 9.7663f, 5.0004f, 7.0049f)
                curveTo(5.0004f, 4.2435f, 7.2389f, 2.0049f, 10.0004f, 2.0049f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 12.6193f, 16.1193f, 11.5f, 17.5f, 11.5f)
                curveTo(18.8807f, 11.5f, 20.0f, 12.6193f, 20.0f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.5f)
                curveTo(21.3284f, 15.0f, 22.0f, 15.6716f, 22.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(22.0f, 22.3284f, 21.3284f, 23.0f, 20.5f, 23.0f)
                horizontalLineTo(14.5f)
                curveTo(13.6716f, 23.0f, 13.0f, 22.3284f, 13.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 15.6716f, 13.6716f, 15.0f, 14.5f, 15.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(16.5f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(14.0f)
                curveTo(18.5f, 13.4477f, 18.0523f, 13.0f, 17.5f, 13.0f)
                curveTo(16.9477f, 13.0f, 16.5f, 13.4477f, 16.5f, 14.0f)
                close()
                moveTo(18.5f, 19.0f)
                curveTo(18.5f, 18.4477f, 18.0523f, 18.0f, 17.5f, 18.0f)
                curveTo(16.9477f, 18.0f, 16.5f, 18.4477f, 16.5f, 19.0f)
                curveTo(16.5f, 19.5523f, 16.9477f, 20.0f, 17.5f, 20.0f)
                curveTo(18.0523f, 20.0f, 18.5f, 19.5523f, 18.5f, 19.0f)
                close()
            }
        }
        .build()
        return _personLock!!
    }

private var _personLock: ImageVector? = null
