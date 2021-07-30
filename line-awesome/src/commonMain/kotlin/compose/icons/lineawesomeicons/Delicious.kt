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

public val LineAwesomeIcons.Delicious: ImageVector
    get() {
        if (_delicious != null) {
            return _delicious!!
        }
        _delicious = Builder(name = "Delicious", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                curveTo(7.25f, 5.0f, 5.0f, 7.25f, 5.0f, 10.0f)
                lineTo(5.0f, 22.0f)
                curveTo(5.0f, 24.75f, 7.25f, 27.0f, 10.0f, 27.0f)
                lineTo(22.0f, 27.0f)
                curveTo(24.75f, 27.0f, 27.0f, 24.75f, 27.0f, 22.0f)
                lineTo(27.0f, 10.0f)
                curveTo(27.0f, 7.25f, 24.75f, 5.0f, 22.0f, 5.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.0f, 22.0f)
                curveTo(25.0f, 23.668f, 23.668f, 25.0f, 22.0f, 25.0f)
                lineTo(16.0f, 25.0f)
                lineTo(16.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                lineTo(7.0f, 10.0f)
                curveTo(7.0f, 8.332f, 8.332f, 7.0f, 10.0f, 7.0f)
                close()
            }
        }
        .build()
        return _delicious!!
    }

private var _delicious: ImageVector? = null
