package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UtensilSpoon: ImageVector
    get() {
        if (_utensilSpoon != null) {
            return _utensilSpoon!!
        }
        _utensilSpoon = Builder(name = "UtensilSpoon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.1f, 31.9f)
                curveToRelative(-55.0f, -55.1f, -164.9f, -34.5f, -227.8f, 28.5f)
                curveToRelative(-49.3f, 49.3f, -55.1f, 110.0f, -28.8f, 160.4f)
                lineTo(9.0f, 413.2f)
                curveToRelative(-11.6f, 10.5f, -12.1f, 28.5f, -1.0f, 39.5f)
                lineTo(59.3f, 504.0f)
                curveToRelative(11.0f, 11.0f, 29.1f, 10.5f, 39.5f, -1.1f)
                lineToRelative(192.4f, -214.4f)
                curveToRelative(50.4f, 26.3f, 111.1f, 20.5f, 160.4f, -28.8f)
                curveToRelative(63.0f, -62.9f, 83.6f, -172.8f, 28.5f, -227.8f)
                close()
            }
        }
        .build()
        return _utensilSpoon!!
    }

private var _utensilSpoon: ImageVector? = null
