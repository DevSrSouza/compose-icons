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

public val LineAwesomeIcons.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5938f, 5.3438f)
                lineTo(4.0313f, 7.2188f)
                lineTo(5.9688f, 16.0f)
                lineTo(4.0313f, 24.7813f)
                lineTo(3.5938f, 26.6563f)
                lineTo(5.375f, 25.9375f)
                lineTo(27.375f, 16.9375f)
                lineTo(29.6563f, 16.0f)
                lineTo(27.375f, 15.0625f)
                lineTo(5.375f, 6.0625f)
                close()
                moveTo(6.375f, 8.6563f)
                lineTo(21.9063f, 15.0f)
                lineTo(7.7813f, 15.0f)
                close()
                moveTo(7.7813f, 17.0f)
                lineTo(21.9063f, 17.0f)
                lineTo(6.375f, 23.3438f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
