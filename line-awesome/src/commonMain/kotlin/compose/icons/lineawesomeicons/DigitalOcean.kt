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

public val LineAwesomeIcons.DigitalOcean: ImageVector
    get() {
        if (_digitalOcean != null) {
            return _digitalOcean!!
        }
        _digitalOcean = Builder(name = "DigitalOcean", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.831f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                curveTo(8.0f, 11.582f, 11.582f, 8.0f, 16.0f, 8.0f)
                curveTo(20.418f, 8.0f, 24.0f, 11.582f, 24.0f, 16.0f)
                curveTo(24.0f, 20.418f, 20.418f, 24.0f, 16.0f, 24.0f)
                lineTo(16.0f, 29.0f)
                curveTo(23.169f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.169f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 24.0f)
                lineTo(16.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                lineTo(10.0f, 24.0f)
                lineTo(16.0f, 24.0f)
                close()
                moveTo(10.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 28.0f)
                lineTo(10.0f, 28.0f)
                lineTo(10.0f, 24.0f)
                close()
                moveTo(6.0f, 24.0f)
                lineTo(6.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                close()
            }
        }
        .build()
        return _digitalOcean!!
    }

private var _digitalOcean: ImageVector? = null
