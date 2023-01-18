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

public val FilledGroup.ArrowPrevious: ImageVector
    get() {
        if (_arrowPrevious != null) {
            return _arrowPrevious!!
        }
        _arrowPrevious = Builder(name = "ArrowPrevious", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(5.4872f, 3.0f, 5.0645f, 3.386f, 5.0067f, 3.8834f)
                lineTo(5.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(5.0f, 20.5523f, 5.4477f, 21.0f, 6.0f, 21.0f)
                curveTo(6.5128f, 21.0f, 6.9355f, 20.614f, 6.9933f, 20.1166f)
                lineTo(7.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(7.0f, 3.4477f, 6.5523f, 3.0f, 6.0f, 3.0f)
                close()
                moveTo(18.7071f, 3.2929f)
                curveTo(18.3466f, 2.9324f, 17.7794f, 2.9047f, 17.3871f, 3.2097f)
                lineTo(17.2929f, 3.2929f)
                lineTo(9.2929f, 11.2929f)
                curveTo(8.9324f, 11.6534f, 8.9047f, 12.2206f, 9.2097f, 12.6129f)
                lineTo(9.2929f, 12.7071f)
                lineTo(17.2929f, 20.7071f)
                curveTo(17.6834f, 21.0976f, 18.3166f, 21.0976f, 18.7071f, 20.7071f)
                curveTo(19.0676f, 20.3466f, 19.0953f, 19.7794f, 18.7903f, 19.3871f)
                lineTo(18.7071f, 19.2929f)
                lineTo(11.4142f, 12.0f)
                lineTo(18.7071f, 4.7071f)
                curveTo(19.0976f, 4.3166f, 19.0976f, 3.6834f, 18.7071f, 3.2929f)
                close()
            }
        }
        .build()
        return _arrowPrevious!!
    }

private var _arrowPrevious: ImageVector? = null
