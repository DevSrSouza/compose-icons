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

public val LineAwesomeIcons.LevelDownAltSolid: ImageVector
    get() {
        if (_levelDownAltSolid != null) {
            return _levelDownAltSolid!!
        }
        _levelDownAltSolid = Builder(name = "LevelDownAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 4.5f)
                lineTo(4.5f, 5.0f)
                lineTo(4.5f, 7.5f)
                lineTo(19.5f, 7.5f)
                lineTo(19.5f, 22.8555f)
                lineTo(15.7188f, 19.0742f)
                lineTo(13.5742f, 21.2188f)
                lineTo(19.9316f, 27.5762f)
                lineTo(21.0f, 28.5977f)
                lineTo(22.0684f, 27.5762f)
                lineTo(28.4258f, 21.2188f)
                lineTo(26.2813f, 19.0742f)
                lineTo(22.5f, 22.8555f)
                lineTo(22.5f, 6.0f)
                lineTo(22.5f, 4.5f)
                lineTo(21.0f, 4.5f)
                lineTo(4.5f, 4.5f)
                close()
                moveTo(5.5f, 5.5f)
                lineTo(21.0f, 5.5f)
                lineTo(21.5f, 5.5f)
                lineTo(21.5f, 6.0f)
                lineTo(21.5f, 25.2695f)
                lineTo(26.2813f, 20.4883f)
                lineTo(27.0117f, 21.2188f)
                lineTo(21.3691f, 26.8613f)
                lineTo(21.0f, 27.2148f)
                lineTo(20.6309f, 26.8613f)
                lineTo(14.9883f, 21.2188f)
                lineTo(15.7188f, 20.4883f)
                lineTo(20.5f, 25.2695f)
                lineTo(20.5f, 6.5f)
                lineTo(5.5f, 6.5f)
                lineTo(5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _levelDownAltSolid!!
    }

private var _levelDownAltSolid: ImageVector? = null
