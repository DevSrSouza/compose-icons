package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.OpenInFull: ImageVector
    get() {
        if (_openInFull != null) {
            return _openInFull!!
        }
        _openInFull = Builder(name = "OpenInFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-10.0f, 10.0f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(0.0f, 8.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _openInFull!!
    }

private var _openInFull: ImageVector? = null
