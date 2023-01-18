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

public val FilledGroup.PresenceBusy: ImageVector
    get() {
        if (_presenceBusy != null) {
            return _presenceBusy!!
        }
        _presenceBusy = Builder(name = "PresenceBusy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 18.6274f, 18.6274f, 24.0f, 12.0f, 24.0f)
                curveTo(5.3726f, 24.0f, 0.0f, 18.6274f, 0.0f, 12.0f)
                curveTo(0.0f, 5.3726f, 5.3726f, 0.0f, 12.0f, 0.0f)
                curveTo(18.6274f, 0.0f, 24.0f, 5.3726f, 24.0f, 12.0f)
                close()
            }
        }
        .build()
        return _presenceBusy!!
    }

private var _presenceBusy: ImageVector? = null
