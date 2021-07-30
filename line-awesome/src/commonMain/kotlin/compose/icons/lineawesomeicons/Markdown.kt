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

public val LineAwesomeIcons.Markdown: ImageVector
    get() {
        if (_markdown != null) {
            return _markdown!!
        }
        _markdown = Builder(name = "Markdown", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.875f, 6.0f)
                curveTo(1.3203f, 6.0f, 0.0f, 7.2539f, 0.0f, 8.8125f)
                lineTo(0.0f, 23.1875f)
                curveTo(0.0f, 24.7461f, 1.3203f, 26.0f, 2.875f, 26.0f)
                lineTo(29.125f, 26.0f)
                curveTo(30.6797f, 26.0f, 32.0f, 24.7461f, 32.0f, 23.1875f)
                lineTo(32.0f, 8.8125f)
                curveTo(32.0f, 7.2539f, 30.6797f, 6.0f, 29.125f, 6.0f)
                close()
                moveTo(2.875f, 8.0f)
                lineTo(29.125f, 8.0f)
                curveTo(29.6406f, 8.0f, 30.0f, 8.3828f, 30.0f, 8.8125f)
                lineTo(30.0f, 23.1875f)
                curveTo(30.0f, 23.6172f, 29.6406f, 24.0f, 29.125f, 24.0f)
                lineTo(2.875f, 24.0f)
                curveTo(2.3594f, 24.0f, 2.0f, 23.6172f, 2.0f, 23.1875f)
                lineTo(2.0f, 8.8125f)
                curveTo(2.0f, 8.3828f, 2.3594f, 8.0f, 2.875f, 8.0f)
                close()
                moveTo(5.0f, 11.0f)
                lineTo(5.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 14.3438f)
                lineTo(11.0f, 18.3125f)
                lineTo(14.0f, 14.3438f)
                lineTo(14.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 11.0f)
                lineTo(14.0f, 11.0f)
                lineTo(11.0f, 15.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(22.0f, 11.0f)
                lineTo(22.0f, 16.0f)
                lineTo(19.0f, 16.0f)
                lineTo(23.5f, 21.0f)
                lineTo(28.0f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.0f, 11.0f)
                close()
            }
        }
        .build()
        return _markdown!!
    }

private var _markdown: ImageVector? = null
