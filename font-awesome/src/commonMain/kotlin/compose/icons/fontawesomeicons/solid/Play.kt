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

public val SolidGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.4f, 214.7f)
                lineTo(72.4f, 6.6f)
                curveTo(43.8f, -10.3f, 0.0f, 6.1f, 0.0f, 47.9f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 37.5f, 40.7f, 60.1f, 72.4f, 41.3f)
                lineToRelative(352.0f, -208.0f)
                curveToRelative(31.4f, -18.5f, 31.5f, -64.1f, 0.0f, -82.6f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
