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

public val FilledGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.2737f)
                curveTo(5.0f, 3.5668f, 6.8261f, 2.4815f, 8.3254f, 3.2973f)
                lineTo(20.687f, 10.0235f)
                curveTo(22.2531f, 10.8756f, 22.2531f, 13.124f, 20.687f, 13.9762f)
                lineTo(8.3254f, 20.7024f)
                curveTo(6.8261f, 21.5181f, 5.0f, 20.4328f, 5.0f, 18.726f)
                verticalLineTo(5.2737f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
