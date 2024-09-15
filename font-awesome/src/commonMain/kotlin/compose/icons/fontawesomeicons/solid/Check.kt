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

public val SolidGroup.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.9f, 439.4f)
                lineToRelative(-166.4f, -166.4f)
                curveToRelative(-10.0f, -10.0f, -10.0f, -26.21f, 0.0f, -36.2f)
                lineToRelative(36.2f, -36.2f)
                curveToRelative(10.0f, -10.0f, 26.21f, -10.0f, 36.2f, 0.0f)
                lineTo(192.0f, 312.69f)
                lineTo(432.1f, 72.6f)
                curveToRelative(10.0f, -10.0f, 26.21f, -10.0f, 36.2f, 0.0f)
                lineToRelative(36.2f, 36.2f)
                curveToRelative(10.0f, 10.0f, 10.0f, 26.21f, 0.0f, 36.2f)
                lineToRelative(-294.4f, 294.4f)
                curveToRelative(-10.0f, 10.0f, -26.21f, 10.0f, -36.2f, -0.0f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
