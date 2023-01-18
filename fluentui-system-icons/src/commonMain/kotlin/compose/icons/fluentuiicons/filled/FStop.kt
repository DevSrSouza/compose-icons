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

public val FilledGroup.FStop: ImageVector
    get() {
        if (_fStop != null) {
            return _fStop!!
        }
        _fStop = Builder(name = "FStop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4418f, 6.5698f)
                curveTo(13.7536f, 4.7432f, 15.6304f, 3.6333f, 17.3813f, 4.2401f)
                lineTo(17.9727f, 4.445f)
                curveTo(18.4946f, 4.6259f, 19.0642f, 4.3494f, 19.2451f, 3.8276f)
                curveTo(19.4259f, 3.3057f, 19.1495f, 2.7361f, 18.6276f, 2.5553f)
                lineTo(18.0362f, 2.3503f)
                curveTo(15.1181f, 1.3391f, 11.9901f, 3.1889f, 11.4703f, 6.2332f)
                lineTo(10.7418f, 10.5001f)
                horizontalLineTo(7.0001f)
                curveTo(6.4478f, 10.5001f, 6.0001f, 10.9479f, 6.0001f, 11.5001f)
                curveTo(6.0001f, 12.0524f, 6.4478f, 12.5001f, 7.0001f, 12.5001f)
                horizontalLineTo(10.4004f)
                lineTo(9.7104f, 16.5416f)
                curveTo(9.3632f, 18.575f, 7.1149f, 19.6595f, 5.3074f, 18.6653f)
                lineTo(5.2321f, 18.6239f)
                curveTo(4.7482f, 18.3578f, 4.1401f, 18.5343f, 3.874f, 19.0182f)
                curveTo(3.6078f, 19.5022f, 3.7843f, 20.1102f, 4.2683f, 20.3764f)
                lineTo(4.3436f, 20.4178f)
                curveTo(7.356f, 22.0746f, 11.1032f, 20.2672f, 11.6818f, 16.8782f)
                lineTo(12.4293f, 12.5001f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 12.5001f, 17.0f, 12.0524f, 17.0f, 11.5001f)
                curveTo(17.0f, 10.9479f, 16.5523f, 10.5001f, 16.0f, 10.5001f)
                horizontalLineTo(12.7708f)
                lineTo(13.4418f, 6.5698f)
                close()
            }
        }
        .build()
        return _fStop!!
    }

private var _fStop: ImageVector? = null
