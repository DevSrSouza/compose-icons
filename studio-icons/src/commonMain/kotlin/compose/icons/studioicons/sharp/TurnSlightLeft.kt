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

public val SharpGroup.TurnSlightLeft: ImageVector
    get() {
        if (_turnSlightLeft != null) {
            return _turnSlightLeft!!
        }
        _turnSlightLeft = Builder(name = "TurnSlightLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.66f, 6.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-5.66f, 0.0f)
                lineToRelative(0.0f, 5.66f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.25f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(0.0f, 7.59f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -8.41f)
                lineToRelative(-5.59f, -5.59f)
                close()
            }
        }
        .build()
        return _turnSlightLeft!!
    }

private var _turnSlightLeft: ImageVector? = null
