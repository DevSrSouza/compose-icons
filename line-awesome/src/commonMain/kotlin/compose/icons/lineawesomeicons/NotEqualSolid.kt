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

public val LineAwesomeIcons.NotEqualSolid: ImageVector
    get() {
        if (_notEqualSolid != null) {
            return _notEqualSolid!!
        }
        _notEqualSolid = Builder(name = "NotEqualSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.719f, 5.281f)
                lineTo(5.281f, 6.719f)
                lineTo(25.281f, 26.719f)
                lineTo(26.719f, 25.281f)
                lineTo(21.438f, 20.0f)
                lineTo(27.0f, 20.0f)
                lineTo(27.0f, 18.0f)
                lineTo(19.438f, 18.0f)
                lineTo(15.438f, 14.0f)
                lineTo(27.0f, 14.0f)
                lineTo(27.0f, 12.0f)
                lineTo(13.438f, 12.0f)
                close()
                moveTo(5.0f, 12.0f)
                lineTo(5.0f, 14.0f)
                lineTo(9.906f, 14.0f)
                lineTo(7.906f, 12.0f)
                close()
                moveTo(5.0f, 18.0f)
                lineTo(5.0f, 20.0f)
                lineTo(15.906f, 20.0f)
                lineTo(13.906f, 18.0f)
                close()
            }
        }
        .build()
        return _notEqualSolid!!
    }

private var _notEqualSolid: ImageVector? = null
