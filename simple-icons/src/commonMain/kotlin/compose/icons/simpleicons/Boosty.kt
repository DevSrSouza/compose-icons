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

public val SimpleIcons.Boosty: ImageVector
    get() {
        if (_boosty != null) {
            return _boosty!!
        }
        _boosty = Builder(name = "Boosty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.661f, 14.337f)
                lineTo(6.801f, 0.0f)
                horizontalLineToRelative(6.362f)
                lineTo(11.88f, 4.444f)
                lineToRelative(-0.038f, 0.077f)
                lineToRelative(-3.378f, 11.733f)
                horizontalLineToRelative(3.15f)
                curveToRelative(-1.321f, 3.289f, -2.35f, 5.867f, -3.086f, 7.733f)
                curveToRelative(-5.816f, -0.063f, -7.442f, -4.228f, -6.02f, -9.155f)
                moveTo(8.554f, 24.0f)
                lineToRelative(7.67f, -11.035f)
                horizontalLineToRelative(-3.25f)
                lineToRelative(2.83f, -7.073f)
                curveToRelative(4.852f, 0.508f, 7.137f, 4.33f, 5.791f, 8.952f)
                curveTo(20.16f, 19.81f, 14.344f, 24.0f, 8.68f, 24.0f)
                horizontalLineToRelative(-0.127f)
                close()
            }
        }
        .build()
        return _boosty!!
    }

private var _boosty: ImageVector? = null
