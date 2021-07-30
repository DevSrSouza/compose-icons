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

public val LineAwesomeIcons.Gitter: ImageVector
    get() {
        if (_gitter != null) {
            return _gitter!!
        }
        _gitter = Builder(name = "Gitter", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                lineTo(6.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                close()
                moveTo(12.0f, 6.0f)
                lineTo(12.0f, 30.0f)
                lineTo(14.0f, 30.0f)
                lineTo(14.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(18.0f, 30.0f)
                lineTo(20.0f, 30.0f)
                lineTo(20.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                close()
                moveTo(24.0f, 6.0f)
                lineTo(24.0f, 19.0f)
                lineTo(26.0f, 19.0f)
                lineTo(26.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                close()
            }
        }
        .build()
        return _gitter!!
    }

private var _gitter: ImageVector? = null
