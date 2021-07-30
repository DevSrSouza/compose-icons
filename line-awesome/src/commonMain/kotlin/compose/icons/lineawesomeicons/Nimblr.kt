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

public val LineAwesomeIcons.Nimblr: ImageVector
    get() {
        if (_nimblr != null) {
            return _nimblr!!
        }
        _nimblr = Builder(name = "Nimblr", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0254f, 19.0f)
                curveTo(7.0167f, 19.1665f, 7.0f, 19.3314f, 7.0f, 19.5f)
                curveTo(7.0f, 24.738f, 11.262f, 29.0f, 16.5f, 29.0f)
                curveTo(21.738f, 29.0f, 26.0f, 24.738f, 26.0f, 19.5f)
                curveTo(26.0f, 14.262f, 21.738f, 10.0f, 16.5f, 10.0f)
                curveTo(13.6935f, 10.0f, 11.1743f, 11.2303f, 9.4336f, 13.1719f)
                lineTo(7.0f, 1.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveTo(20.636f, 12.0f, 24.0f, 15.364f, 24.0f, 19.5f)
                curveTo(24.0f, 23.636f, 20.636f, 27.0f, 16.5f, 27.0f)
                curveTo(12.364f, 27.0f, 9.0f, 23.636f, 9.0f, 19.5f)
                curveTo(9.0f, 15.364f, 12.364f, 12.0f, 16.5f, 12.0f)
                close()
                moveTo(13.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 17.0f)
                close()
                moveTo(19.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 17.0f)
                close()
            }
        }
        .build()
        return _nimblr!!
    }

private var _nimblr: ImageVector? = null
