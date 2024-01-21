package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandVinted: ImageVector
    get() {
        if (_brandVinted != null) {
            return _brandVinted!!
        }
        _brandVinted = Builder(name = "BrandVinted", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.028f, 6.0f)
                curveToRelative(0.0f, 7.695f, -0.292f, 11.728f, 0.0f, 12.0f)
                curveToRelative(2.046f, -5.0f, 4.246f, -12.642f, 5.252f, -14.099f)
                curveToRelative(0.343f, -0.497f, 0.768f, -0.93f, 1.257f, -1.277f)
                curveToRelative(0.603f, -0.39f, 1.292f, -0.76f, 1.463f, -0.575f)
                curveToRelative(-0.07f, 2.319f, -4.023f, 15.822f, -4.209f, 16.314f)
                arcToRelative(6.135f, 6.135f, 0.0f, false, true, -3.465f, 3.386f)
                curveToRelative(-3.213f, 0.78f, -3.429f, -0.446f, -3.836f, -1.134f)
                curveToRelative(-0.95f, -2.103f, -1.682f, -14.26f, -1.445f, -15.615f)
                curveToRelative(0.05f, -0.523f, 0.143f, -1.851f, 2.491f, -2.0f)
                curveToRelative(2.359f, -0.354f, 2.547f, 1.404f, 2.492f, 3.0f)
                close()
            }
        }
        .build()
        return _brandVinted!!
    }

private var _brandVinted: ImageVector? = null
