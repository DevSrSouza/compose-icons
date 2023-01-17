package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(284.3f, 11.7f)
                curveToRelative(-15.6f, -15.6f, -40.9f, -15.6f, -56.6f, 0.0f)
                lineToRelative(-216.0f, 216.0f)
                curveToRelative(-15.6f, 15.6f, -15.6f, 40.9f, 0.0f, 56.6f)
                lineToRelative(216.0f, 216.0f)
                curveToRelative(15.6f, 15.6f, 40.9f, 15.6f, 56.6f, 0.0f)
                lineToRelative(216.0f, -216.0f)
                curveToRelative(15.6f, -15.6f, 15.6f, -40.9f, 0.0f, -56.6f)
                lineToRelative(-216.0f, -216.0f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
