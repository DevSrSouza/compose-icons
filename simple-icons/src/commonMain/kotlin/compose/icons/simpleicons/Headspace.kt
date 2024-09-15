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

public val SimpleIcons.Headspace: ImageVector
    get() {
        if (_headspace != null) {
            return _headspace!!
        }
        _headspace = Builder(name = "Headspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.971f, 11.861f)
                curveToRelative(0.279f, 3.888f, -1.527f, 6.093f, -2.615f, 7.636f)
                curveToRelative(-1.694f, 1.786f, -3.84f, 4.22f, -9.291f, 4.357f)
                curveToRelative(-4.624f, 0.183f, -6.896f, -1.851f, -8.803f, -3.617f)
                curveToRelative(-2.487f, -2.734f, -3.137f, -4.351f, -3.261f, -8.375f)
                curveToRelative(-0.012f, -2.467f, 0.94f, -4.929f, 2.602f, -7.095f)
                curveTo(4.934f, 1.474f, 8.641f, 0.37f, 12.065f, 0.143f)
                curveToRelative(3.592f, -0.139f, 6.449f, 1.672f, 8.399f, 3.624f)
                curveToRelative(2.496f, 2.632f, 3.263f, 4.892f, 3.505f, 8.095f)
                close()
            }
        }
        .build()
        return _headspace!!
    }

private var _headspace: ImageVector? = null
