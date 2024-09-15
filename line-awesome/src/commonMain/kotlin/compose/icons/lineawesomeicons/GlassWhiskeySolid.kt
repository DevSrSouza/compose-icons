package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.GlassWhiskeySolid: ImageVector
    get() {
        if (_glassWhiskeySolid != null) {
            return _glassWhiskeySolid!!
        }
        _glassWhiskeySolid = Builder(name = "GlassWhiskeySolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.818f, 7.0f)
                lineTo(8.152f, 27.0f)
                lineTo(23.848f, 27.0f)
                lineTo(27.18f, 7.0f)
                lineTo(4.818f, 7.0f)
                close()
                moveTo(7.182f, 9.0f)
                lineTo(24.82f, 9.0f)
                lineTo(23.154f, 19.0f)
                lineTo(10.67f, 19.0f)
                lineTo(11.0f, 21.0f)
                lineTo(22.82f, 21.0f)
                lineTo(22.154f, 25.0f)
                lineTo(9.848f, 25.0f)
                lineTo(7.182f, 9.0f)
                close()
            }
        }
        .build()
        return _glassWhiskeySolid!!
    }

private var _glassWhiskeySolid: ImageVector? = null
