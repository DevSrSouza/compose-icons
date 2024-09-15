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

public val LineAwesomeIcons.CheckSolid: ImageVector
    get() {
        if (_checkSolid != null) {
            return _checkSolid!!
        }
        _checkSolid = Builder(name = "CheckSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.281f, 6.281f)
                lineTo(11.0f, 23.563f)
                lineTo(3.719f, 16.281f)
                lineTo(2.281f, 17.719f)
                lineTo(10.281f, 25.719f)
                lineTo(11.0f, 26.406f)
                lineTo(11.719f, 25.719f)
                lineTo(29.719f, 7.719f)
                close()
            }
        }
        .build()
        return _checkSolid!!
    }

private var _checkSolid: ImageVector? = null
