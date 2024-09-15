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
                lineTo(19.5f, 22.855f)
                lineTo(15.719f, 19.074f)
                lineTo(13.574f, 21.219f)
                lineTo(19.932f, 27.576f)
                lineTo(21.0f, 28.598f)
                lineTo(22.068f, 27.576f)
                lineTo(28.426f, 21.219f)
                lineTo(26.281f, 19.074f)
                lineTo(22.5f, 22.855f)
                lineTo(22.5f, 6.0f)
                lineTo(22.5f, 4.5f)
                lineTo(21.0f, 4.5f)
                lineTo(4.5f, 4.5f)
                close()
                moveTo(5.5f, 5.5f)
                lineTo(21.0f, 5.5f)
                lineTo(21.5f, 5.5f)
                lineTo(21.5f, 6.0f)
                lineTo(21.5f, 25.27f)
                lineTo(26.281f, 20.488f)
                lineTo(27.012f, 21.219f)
                lineTo(21.369f, 26.861f)
                lineTo(21.0f, 27.215f)
                lineTo(20.631f, 26.861f)
                lineTo(14.988f, 21.219f)
                lineTo(15.719f, 20.488f)
                lineTo(20.5f, 25.27f)
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
