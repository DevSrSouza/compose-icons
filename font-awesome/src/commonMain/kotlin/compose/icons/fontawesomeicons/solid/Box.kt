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

public val SolidGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.7f, 58.5f)
                lineTo(0.0f, 160.0f)
                lineTo(208.0f, 160.0f)
                lineTo(208.0f, 32.0f)
                lineTo(93.7f, 32.0f)
                curveTo(75.5f, 32.0f, 58.9f, 42.3f, 50.7f, 58.5f)
                close()
                moveTo(240.0f, 160.0f)
                lineTo(448.0f, 160.0f)
                lineTo(397.3f, 58.5f)
                curveTo(389.1f, 42.3f, 372.5f, 32.0f, 354.3f, 32.0f)
                lineTo(240.0f, 32.0f)
                lineTo(240.0f, 160.0f)
                close()
                moveTo(448.0f, 192.0f)
                lineTo(0.0f, 192.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 192.0f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
