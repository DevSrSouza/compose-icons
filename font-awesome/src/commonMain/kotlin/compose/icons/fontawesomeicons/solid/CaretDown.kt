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

public val SolidGroup.CaretDown: ImageVector
    get() {
        if (_caretDown != null) {
            return _caretDown!!
        }
        _caretDown = Builder(name = "CaretDown", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.3f, 192.0f)
                horizontalLineToRelative(257.3f)
                curveToRelative(17.8f, 0.0f, 26.7f, 21.5f, 14.1f, 34.1f)
                lineTo(174.1f, 354.8f)
                curveToRelative(-7.8f, 7.8f, -20.5f, 7.8f, -28.3f, 0.0f)
                lineTo(17.2f, 226.1f)
                curveTo(4.6f, 213.5f, 13.5f, 192.0f, 31.3f, 192.0f)
                close()
            }
        }
        .build()
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
