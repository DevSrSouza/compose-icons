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

public val LineAwesomeIcons.ExpandSolid: ImageVector
    get() {
        if (_expandSolid != null) {
            return _expandSolid!!
        }
        _expandSolid = Builder(name = "ExpandSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                lineTo(13.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(19.0f, 4.0f)
                lineTo(19.0f, 6.0f)
                lineTo(26.0f, 6.0f)
                lineTo(26.0f, 13.0f)
                lineTo(28.0f, 13.0f)
                lineTo(28.0f, 4.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(4.0f, 19.0f)
                lineTo(4.0f, 28.0f)
                lineTo(13.0f, 28.0f)
                lineTo(13.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                close()
                moveTo(26.0f, 19.0f)
                lineTo(26.0f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 19.0f)
                lineTo(26.0f, 19.0f)
                close()
            }
        }
        .build()
        return _expandSolid!!
    }

private var _expandSolid: ImageVector? = null
