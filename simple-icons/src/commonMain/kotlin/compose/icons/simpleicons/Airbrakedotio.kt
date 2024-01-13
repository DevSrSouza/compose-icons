package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Airbrakedotio: ImageVector
    get() {
        if (_airbrakedotio != null) {
            return _airbrakedotio!!
        }
        _airbrakedotio = Builder(name = "Airbrakedotio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.815f, 0.576f)
                lineTo(24.0f, 23.424f)
                horizontalLineToRelative(-6.072f)
                lineTo(10.679f, 0.576f)
                close()
                moveTo(9.359f, 0.576f)
                lineTo(11.231f, 6.505f)
                lineTo(8.784f, 14.256f)
                curveToRelative(1.038f, 0.183f, 2.09f, 0.28f, 3.144f, 0.288f)
                curveToRelative(0.576f, 0.0f, 1.175f, -0.048f, 1.824f, -0.096f)
                lineToRelative(1.151f, 3.912f)
                arcToRelative(28.7f, 28.7f, 0.0f, false, true, -2.951f, 0.169f)
                arcToRelative(26.568f, 26.568f, 0.0f, false, true, -4.32f, -0.361f)
                lineTo(5.88f, 23.424f)
                lineTo(0.0f, 23.424f)
                lineTo(8.181f, 0.576f)
                close()
            }
        }
        .build()
        return _airbrakedotio!!
    }

private var _airbrakedotio: ImageVector? = null
