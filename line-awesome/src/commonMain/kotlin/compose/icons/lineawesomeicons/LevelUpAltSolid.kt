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

public val LineAwesomeIcons.LevelUpAltSolid: ImageVector
    get() {
        if (_levelUpAltSolid != null) {
            return _levelUpAltSolid!!
        }
        _levelUpAltSolid = Builder(name = "LevelUpAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                lineTo(16.2813f, 4.6875f)
                lineTo(7.7813f, 13.1875f)
                lineTo(9.2188f, 14.627f)
                lineTo(16.0f, 7.8438f)
                lineTo(16.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 28.0f)
                lineTo(16.0f, 28.0f)
                lineTo(18.0f, 28.0f)
                lineTo(18.0f, 7.8438f)
                lineTo(24.7813f, 14.625f)
                lineTo(26.2188f, 13.1875f)
                lineTo(17.7188f, 4.6875f)
                lineTo(17.0f, 4.0f)
                close()
            }
        }
        .build()
        return _levelUpAltSolid!!
    }

private var _levelUpAltSolid: ImageVector? = null
