package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.1f, 216.0f)
                horizontalLineTo(58.9f)
                arcTo(18.9f, 18.9f, 0.0f, false, true, 40.0f, 197.1f)
                verticalLineTo(58.9f)
                arcTo(18.9f, 18.9f, 0.0f, false, true, 58.9f, 40.0f)
                horizontalLineTo(197.1f)
                arcTo(18.9f, 18.9f, 0.0f, false, true, 216.0f, 58.9f)
                verticalLineTo(197.1f)
                arcTo(18.9f, 18.9f, 0.0f, false, true, 197.1f, 216.0f)
                close()
                moveTo(64.0f, 192.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(64.0f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
