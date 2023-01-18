package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Heart2Line: ImageVector
    get() {
        if (_heart2Line != null) {
            return _heart2Line!!
        }
        _heart2Line = Builder(name = "Heart2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.243f, 4.757f)
                curveToRelative(2.262f, 2.268f, 2.34f, 5.88f, 0.236f, 8.236f)
                lineToRelative(-8.48f, 8.492f)
                lineToRelative(-8.478f, -8.492f)
                curveToRelative(-2.104f, -2.356f, -2.025f, -5.974f, 0.236f, -8.236f)
                curveToRelative(2.265f, -2.264f, 5.888f, -2.34f, 8.244f, -0.228f)
                curveToRelative(2.349f, -2.109f, 5.979f, -2.039f, 8.242f, 0.228f)
                close()
                moveTo(5.172f, 6.172f)
                curveToRelative(-1.49f, 1.49f, -1.565f, 3.875f, -0.192f, 5.451f)
                lineTo(12.0f, 18.654f)
                lineToRelative(7.02f, -7.03f)
                curveToRelative(1.374f, -1.577f, 1.299f, -3.959f, -0.193f, -5.454f)
                curveToRelative(-1.487f, -1.49f, -3.881f, -1.562f, -5.453f, -0.186f)
                lineToRelative(-4.202f, 4.203f)
                lineToRelative(-1.415f, -1.414f)
                lineToRelative(2.825f, -2.827f)
                lineToRelative(-0.082f, -0.069f)
                curveToRelative(-1.575f, -1.265f, -3.877f, -1.157f, -5.328f, 0.295f)
                close()
            }
        }
        .build()
        return _heart2Line!!
    }

private var _heart2Line: ImageVector? = null
