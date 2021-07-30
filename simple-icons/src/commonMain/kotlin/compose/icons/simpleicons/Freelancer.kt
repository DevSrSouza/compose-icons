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

public val SimpleIcons.Freelancer: ImageVector
    get() {
        if (_freelancer != null) {
            return _freelancer!!
        }
        _freelancer = Builder(name = "Freelancer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.096f, 3.076f)
                lineToRelative(1.634f, 2.292f)
                lineTo(24.0f, 3.076f)
                moveTo(5.503f, 20.924f)
                lineToRelative(4.474f, -4.374f)
                lineToRelative(-2.692f, -2.89f)
                moveToRelative(6.133f, -10.584f)
                lineTo(11.027f, 5.23f)
                lineToRelative(4.022f, 0.15f)
                moveTo(4.124f, 3.077f)
                lineToRelative(0.857f, 1.76f)
                lineToRelative(4.734f, 0.294f)
                moveToRelative(-3.058f, 7.072f)
                lineToRelative(3.497f, -6.522f)
                lineTo(0.0f, 5.13f)
                moveToRelative(7.064f, 7.485f)
                lineToRelative(3.303f, 3.548f)
                lineToRelative(3.643f, -3.57f)
                lineToRelative(1.13f, -6.652f)
                lineToRelative(-4.439f, -0.228f)
                close()
            }
        }
        .build()
        return _freelancer!!
    }

private var _freelancer: ImageVector? = null
