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
                moveTo(173.898f, 439.404f)
                lineToRelative(-166.4f, -166.4f)
                curveToRelative(-9.997f, -9.997f, -9.997f, -26.206f, 0.0f, -36.204f)
                lineToRelative(36.203f, -36.204f)
                curveToRelative(9.997f, -9.998f, 26.207f, -9.998f, 36.204f, 0.0f)
                lineTo(192.0f, 312.69f)
                lineTo(432.095f, 72.596f)
                curveToRelative(9.997f, -9.997f, 26.207f, -9.997f, 36.204f, 0.0f)
                lineToRelative(36.203f, 36.204f)
                curveToRelative(9.997f, 9.997f, 9.997f, 26.206f, 0.0f, 36.204f)
                lineToRelative(-294.4f, 294.401f)
                curveToRelative(-9.998f, 9.997f, -26.207f, 9.997f, -36.204f, -0.001f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
