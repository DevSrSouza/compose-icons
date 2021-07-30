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

public val LineAwesomeIcons.ExclamationSolid: ImageVector
    get() {
        if (_exclamationSolid != null) {
            return _exclamationSolid!!
        }
        _exclamationSolid = Builder(name = "ExclamationSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                lineTo(13.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                close()
                moveTo(13.0f, 22.0f)
                lineTo(13.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 22.0f)
                close()
                moveTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                close()
            }
        }
        .build()
        return _exclamationSolid!!
    }

private var _exclamationSolid: ImageVector? = null
