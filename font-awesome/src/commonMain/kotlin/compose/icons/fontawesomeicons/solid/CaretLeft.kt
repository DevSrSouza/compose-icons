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

public val SolidGroup.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = Builder(name = "CaretLeft", defaultWidth = 192.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 192.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 127.34f)
                verticalLineToRelative(257.32f)
                curveToRelative(0.0f, 17.82f, -21.54f, 26.74f, -34.14f, 14.14f)
                lineTo(29.2f, 270.14f)
                curveToRelative(-7.81f, -7.81f, -7.81f, -20.47f, 0.0f, -28.28f)
                lineToRelative(128.66f, -128.66f)
                curveToRelative(12.6f, -12.6f, 34.14f, -3.68f, 34.14f, 14.14f)
                close()
            }
        }
        .build()
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
