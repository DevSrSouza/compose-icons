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

public val LineAwesomeIcons.ThListSolid: ImageVector
    get() {
        if (_thListSolid != null) {
            return _thListSolid!!
        }
        _thListSolid = Builder(name = "ThListSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(4.0f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(28.0f, 6.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(13.0f, 8.0f)
                lineTo(26.0f, 8.0f)
                lineTo(26.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(6.0f, 14.0f)
                lineTo(11.0f, 14.0f)
                lineTo(11.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                close()
                moveTo(13.0f, 14.0f)
                lineTo(26.0f, 14.0f)
                lineTo(26.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                close()
                moveTo(6.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                lineTo(11.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                close()
                moveTo(13.0f, 20.0f)
                lineTo(26.0f, 20.0f)
                lineTo(26.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                close()
            }
        }
        .build()
        return _thListSolid!!
    }

private var _thListSolid: ImageVector? = null
