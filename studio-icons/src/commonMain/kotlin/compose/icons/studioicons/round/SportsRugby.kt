package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SportsRugby: ImageVector
    get() {
        if (_sportsRugby != null) {
            return _sportsRugby!!
        }
        _sportsRugby = Builder(name = "SportsRugby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.49f, 3.51f)
                curveToRelative(-0.56f, -0.56f, -2.15f, -0.97f, -4.16f, -0.97f)
                curveToRelative(-3.08f, 0.0f, -7.15f, 0.96f, -9.98f, 3.79f)
                curveTo(1.66f, 11.03f, 2.1f, 19.07f, 3.51f, 20.49f)
                curveToRelative(0.56f, 0.56f, 2.15f, 0.97f, 4.16f, 0.97f)
                curveToRelative(3.08f, 0.0f, 7.15f, -0.96f, 9.98f, -3.79f)
                curveTo(22.34f, 12.97f, 21.9f, 4.93f, 20.49f, 3.51f)
                close()
                moveTo(7.76f, 7.76f)
                curveToRelative(2.64f, -2.64f, 6.35f, -3.12f, 8.03f, -3.19f)
                curveToRelative(-2.05f, 0.94f, -4.46f, 2.45f, -6.61f, 4.61f)
                curveToRelative(-2.16f, 2.16f, -3.67f, 4.58f, -4.61f, 6.63f)
                curveTo(4.66f, 13.33f, 5.44f, 10.07f, 7.76f, 7.76f)
                close()
                moveTo(16.24f, 16.24f)
                curveToRelative(-2.64f, 2.64f, -6.35f, 3.12f, -8.03f, 3.19f)
                curveToRelative(2.05f, -0.94f, 4.46f, -2.45f, 6.61f, -4.61f)
                curveToRelative(2.16f, -2.16f, 3.67f, -4.58f, 4.62f, -6.63f)
                curveTo(19.34f, 10.67f, 18.56f, 13.93f, 16.24f, 16.24f)
                close()
            }
        }
        .build()
        return _sportsRugby!!
    }

private var _sportsRugby: ImageVector? = null
