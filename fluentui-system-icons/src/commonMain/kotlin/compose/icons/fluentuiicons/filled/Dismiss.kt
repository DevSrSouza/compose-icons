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

public val FilledGroup.Dismiss: ImageVector
    get() {
        if (_dismiss != null) {
            return _dismiss!!
        }
        _dismiss = Builder(name = "Dismiss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2097f, 4.3871f)
                lineTo(4.2929f, 4.2929f)
                curveTo(4.6534f, 3.9324f, 5.2206f, 3.9047f, 5.6129f, 4.2097f)
                lineTo(5.7071f, 4.2929f)
                lineTo(12.0f, 10.585f)
                lineTo(18.2929f, 4.2929f)
                curveTo(18.6834f, 3.9024f, 19.3166f, 3.9024f, 19.7071f, 4.2929f)
                curveTo(20.0976f, 4.6834f, 20.0976f, 5.3166f, 19.7071f, 5.7071f)
                lineTo(13.415f, 12.0f)
                lineTo(19.7071f, 18.2929f)
                curveTo(20.0676f, 18.6534f, 20.0953f, 19.2206f, 19.7903f, 19.6129f)
                lineTo(19.7071f, 19.7071f)
                curveTo(19.3466f, 20.0676f, 18.7794f, 20.0953f, 18.3871f, 19.7903f)
                lineTo(18.2929f, 19.7071f)
                lineTo(12.0f, 13.415f)
                lineTo(5.7071f, 19.7071f)
                curveTo(5.3166f, 20.0976f, 4.6834f, 20.0976f, 4.2929f, 19.7071f)
                curveTo(3.9024f, 19.3166f, 3.9024f, 18.6834f, 4.2929f, 18.2929f)
                lineTo(10.585f, 12.0f)
                lineTo(4.2929f, 5.7071f)
                curveTo(3.9324f, 5.3466f, 3.9047f, 4.7794f, 4.2097f, 4.3871f)
                lineTo(4.2929f, 4.2929f)
                lineTo(4.2097f, 4.3871f)
                close()
            }
        }
        .build()
        return _dismiss!!
    }

private var _dismiss: ImageVector? = null
