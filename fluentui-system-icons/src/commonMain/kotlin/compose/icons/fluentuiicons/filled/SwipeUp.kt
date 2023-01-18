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

public val FilledGroup.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) {
            return _swipeUp!!
        }
        _swipeUp = Builder(name = "SwipeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(12.5523f, 18.0f, 13.0f, 17.5523f, 13.0f, 17.0f)
                verticalLineTo(5.415f)
                lineTo(14.2929f, 6.7071f)
                curveTo(14.6534f, 7.0676f, 15.2206f, 7.0953f, 15.6129f, 6.7903f)
                lineTo(15.7071f, 6.7071f)
                curveTo(16.0676f, 6.3466f, 16.0953f, 5.7794f, 15.7903f, 5.3871f)
                lineTo(15.7071f, 5.2929f)
                lineTo(12.7071f, 2.2929f)
                curveTo(12.3466f, 1.9324f, 11.7794f, 1.9047f, 11.3871f, 2.2097f)
                lineTo(11.2929f, 2.2929f)
                lineTo(8.2929f, 5.2929f)
                curveTo(7.9024f, 5.6834f, 7.9024f, 6.3166f, 8.2929f, 6.7071f)
                curveTo(8.6534f, 7.0676f, 9.2206f, 7.0953f, 9.6129f, 6.7903f)
                lineTo(9.7071f, 6.7071f)
                lineTo(11.0f, 5.415f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 17.5523f, 11.4477f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(14.7614f, 22.0f, 17.0f, 19.7614f, 17.0f, 17.0f)
                curveTo(17.0f, 14.9499f, 15.7662f, 13.188f, 14.0005f, 12.4163f)
                lineTo(14.0009f, 14.128f)
                curveTo(14.9071f, 14.7605f, 15.5f, 15.811f, 15.5f, 17.0f)
                curveTo(15.5f, 18.933f, 13.933f, 20.5f, 12.0f, 20.5f)
                curveTo(10.067f, 20.5f, 8.5f, 18.933f, 8.5f, 17.0f)
                curveTo(8.5f, 15.8106f, 9.0933f, 14.7598f, 10.0001f, 14.1273f)
                lineTo(10.0005f, 12.4158f)
                curveTo(8.2343f, 13.1873f, 7.0f, 14.9495f, 7.0f, 17.0f)
                curveTo(7.0f, 19.7614f, 9.2386f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
