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

public val FilledGroup.ArrowNext: ImageVector
    get() {
        if (_arrowNext != null) {
            return _arrowNext!!
        }
        _arrowNext = Builder(name = "ArrowNext", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                curveTo(18.5128f, 3.0f, 18.9355f, 3.386f, 18.9933f, 3.8834f)
                lineTo(19.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 20.5523f, 18.5523f, 21.0f, 18.0f, 21.0f)
                curveTo(17.4872f, 21.0f, 17.0645f, 20.614f, 17.0067f, 20.1166f)
                lineTo(17.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(17.0f, 3.4477f, 17.4477f, 3.0f, 18.0f, 3.0f)
                close()
                moveTo(5.2929f, 3.2929f)
                curveTo(5.6534f, 2.9324f, 6.2206f, 2.9047f, 6.6129f, 3.2097f)
                lineTo(6.7071f, 3.2929f)
                lineTo(14.7071f, 11.2929f)
                curveTo(15.0676f, 11.6534f, 15.0953f, 12.2206f, 14.7903f, 12.6129f)
                lineTo(14.7071f, 12.7071f)
                lineTo(6.7071f, 20.7071f)
                curveTo(6.3166f, 21.0976f, 5.6834f, 21.0976f, 5.2929f, 20.7071f)
                curveTo(4.9324f, 20.3466f, 4.9047f, 19.7794f, 5.2097f, 19.3871f)
                lineTo(5.2929f, 19.2929f)
                lineTo(12.5858f, 12.0f)
                lineTo(5.2929f, 4.7071f)
                curveTo(4.9024f, 4.3166f, 4.9024f, 3.6834f, 5.2929f, 3.2929f)
                close()
            }
        }
        .build()
        return _arrowNext!!
    }

private var _arrowNext: ImageVector? = null
