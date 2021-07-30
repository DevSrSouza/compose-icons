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

public val LineAwesomeIcons.Adobe: ImageVector
    get() {
        if (_adobe != null) {
            return _adobe!!
        }
        _adobe = Builder(name = "Adobe", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(4.0f, 26.0f)
                lineTo(12.9004f, 6.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(19.0996f, 6.0f)
                lineTo(28.0f, 26.0f)
                lineTo(28.0f, 6.0f)
                lineTo(19.0996f, 6.0f)
                close()
                moveTo(16.0f, 13.4004f)
                lineTo(12.0996f, 22.0f)
                lineTo(16.1973f, 22.0f)
                lineTo(17.7969f, 26.0f)
                lineTo(21.5996f, 26.0f)
                lineTo(16.0f, 13.4004f)
                close()
            }
        }
        .build()
        return _adobe!!
    }

private var _adobe: ImageVector? = null
