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

public val SolidGroup.Notdef: ImageVector
    get() {
        if (_notdef != null) {
            return _notdef!!
        }
        _notdef = Builder(name = "Notdef", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 390.3f)
                lineTo(153.5f, 256.0f)
                lineTo(64.0f, 121.7f)
                lineTo(64.0f, 390.3f)
                close()
                moveTo(102.5f, 448.0f)
                lineTo(281.5f, 448.0f)
                lineTo(192.0f, 313.7f)
                lineTo(102.5f, 448.0f)
                close()
                moveTo(230.5f, 256.0f)
                lineTo(320.0f, 390.3f)
                lineTo(320.0f, 121.7f)
                lineTo(230.5f, 256.0f)
                close()
                moveTo(281.5f, 64.0f)
                lineTo(102.5f, 64.0f)
                lineTo(192.0f, 198.3f)
                lineTo(281.5f, 64.0f)
                close()
                moveTo(0.0f, 48.0f)
                curveTo(0.0f, 21.5f, 21.5f, 0.0f, 48.0f, 0.0f)
                lineTo(336.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineTo(384.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _notdef!!
    }

private var _notdef: ImageVector? = null
