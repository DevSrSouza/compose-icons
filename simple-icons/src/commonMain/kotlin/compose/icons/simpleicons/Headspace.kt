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
                moveTo(23.9711f, 11.8612f)
                curveToRelative(0.279f, 3.8878f, -1.5272f, 6.0933f, -2.6155f, 7.6357f)
                curveToRelative(-1.694f, 1.7856f, -3.8397f, 4.2203f, -9.291f, 4.3565f)
                curveToRelative(-4.6237f, 0.1827f, -6.8957f, -1.8508f, -8.8034f, -3.617f)
                curveToRelative(-2.487f, -2.7336f, -3.1366f, -4.3512f, -3.261f, -8.3752f)
                curveToRelative(-0.0118f, -2.467f, 0.9397f, -4.9292f, 2.6025f, -7.0954f)
                curveTo(4.934f, 1.4736f, 8.6408f, 0.3699f, 12.0646f, 0.1426f)
                curveToRelative(3.5923f, -0.1392f, 6.4493f, 1.6723f, 8.3993f, 3.624f)
                curveToRelative(2.4963f, 2.632f, 3.2629f, 4.8923f, 3.5054f, 8.0946f)
                close()
            }
        }
        .build()
        return _headspace!!
    }

private var _headspace: ImageVector? = null
