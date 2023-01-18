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

public val FilledGroup.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.659f, 13.5926f)
                curveTo(1.7803f, 12.7139f, 1.7803f, 11.2893f, 2.659f, 10.4106f)
                lineTo(10.4106f, 2.659f)
                curveTo(11.2893f, 1.7803f, 12.7139f, 1.7803f, 13.5926f, 2.659f)
                lineTo(21.3442f, 10.4106f)
                curveTo(22.2229f, 11.2893f, 22.2229f, 12.7139f, 21.3442f, 13.5926f)
                lineTo(13.5926f, 21.3442f)
                curveTo(12.7139f, 22.2229f, 11.2893f, 22.2229f, 10.4106f, 21.3442f)
                lineTo(2.659f, 13.5926f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
