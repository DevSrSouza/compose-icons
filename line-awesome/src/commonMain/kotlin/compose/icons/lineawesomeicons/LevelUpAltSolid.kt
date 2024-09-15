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
                lineTo(16.281f, 4.688f)
                lineTo(7.781f, 13.188f)
                lineTo(9.219f, 14.627f)
                lineTo(16.0f, 7.844f)
                lineTo(16.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 28.0f)
                lineTo(16.0f, 28.0f)
                lineTo(18.0f, 28.0f)
                lineTo(18.0f, 7.844f)
                lineTo(24.781f, 14.625f)
                lineTo(26.219f, 13.188f)
                lineTo(17.719f, 4.688f)
                lineTo(17.0f, 4.0f)
                close()
            }
        }
        .build()
        return _levelUpAltSolid!!
    }

private var _levelUpAltSolid: ImageVector? = null
