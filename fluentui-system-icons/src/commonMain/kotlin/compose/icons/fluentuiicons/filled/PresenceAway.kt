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

public val FilledGroup.PresenceAway: ImageVector
    get() {
        if (_presenceAway != null) {
            return _presenceAway!!
        }
        _presenceAway = Builder(name = "PresenceAway", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                curveTo(24.0f, 5.3726f, 18.6274f, 0.0f, 12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(13.0f, 6.5f)
                verticalLineTo(11.3101f)
                lineTo(15.9762f, 13.8611f)
                curveTo(16.6052f, 14.4002f, 16.678f, 15.3472f, 16.1389f, 15.9762f)
                curveTo(15.5998f, 16.6052f, 14.6528f, 16.678f, 14.0238f, 16.1389f)
                lineTo(10.5238f, 13.1389f)
                curveTo(10.1913f, 12.8539f, 10.0f, 12.4379f, 10.0f, 12.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 5.6716f, 10.6716f, 5.0f, 11.5f, 5.0f)
                curveTo(12.3284f, 5.0f, 13.0f, 5.6716f, 13.0f, 6.5f)
                close()
            }
        }
        .build()
        return _presenceAway!!
    }

private var _presenceAway: ImageVector? = null
