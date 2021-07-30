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

public val LineAwesomeIcons.Sistrix: ImageVector
    get() {
        if (_sistrix != null) {
            return _sistrix!!
        }
        _sistrix = Builder(name = "Sistrix", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 3.0f)
                curveTo(7.262f, 3.0f, 3.0f, 7.262f, 3.0f, 12.5f)
                curveTo(3.0f, 17.738f, 7.262f, 22.0f, 12.5f, 22.0f)
                curveTo(14.7595f, 22.0f, 16.8343f, 21.2033f, 18.4668f, 19.8809f)
                lineTo(27.627f, 29.041f)
                lineTo(29.041f, 27.627f)
                lineTo(19.8809f, 18.4668f)
                curveTo(21.2033f, 16.8343f, 22.0f, 14.7595f, 22.0f, 12.5f)
                curveTo(22.0f, 7.262f, 17.738f, 3.0f, 12.5f, 3.0f)
                close()
                moveTo(12.5f, 5.0f)
                curveTo(16.636f, 5.0f, 20.0f, 8.364f, 20.0f, 12.5f)
                curveTo(20.0f, 16.636f, 16.636f, 20.0f, 12.5f, 20.0f)
                curveTo(8.364f, 20.0f, 5.0f, 16.636f, 5.0f, 12.5f)
                curveTo(5.0f, 8.364f, 8.364f, 5.0f, 12.5f, 5.0f)
                close()
            }
        }
        .build()
        return _sistrix!!
    }

private var _sistrix: ImageVector? = null
