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

public val SimpleIcons.Sefaria: ImageVector
    get() {
        if (_sefaria != null) {
            return _sefaria!!
        }
        _sefaria = Builder(name = "Sefaria", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.615f, 15.412f)
                curveToRelative(-0.62f, 2.915f, -2.733f, 4.152f, -7.425f, 4.152f)
                curveToRelative(-11.54f, 0.0f, -7.45f, -9.28f, -5.84f, -11.186f)
                curveToRelative(0.678f, -0.85f, 1.152f, -1.553f, 2.874f, -1.553f)
                horizontalLineToRelative(3.273f)
                curveToRelative(4.567f, 0.0f, 5.437f, 0.217f, 6.582f, 2.55f)
                curveToRelative(0.617f, 1.258f, 0.975f, 3.971f, 0.536f, 6.036f)
                moveToRelative(1.238f, -5.79f)
                curveToRelative(-0.385f, -2.492f, -0.889f, -5.202f, -3.052f, -6.706f)
                curveToRelative(-1.31f, -0.911f, -2.663f, -0.981f, -4.177f, -0.981f)
                curveToRelative(-1.026f, 0.0f, -4.666f, -0.041f, -6.257f, -0.041f)
                curveTo(5.833f, 1.893f, 4.779f, 0.618f, 4.779f, 0.0f)
                curveTo(3.777f, 1.234f, 3.001f, 2.597f, 3.272f, 4.245f)
                curveToRelative(0.244f, 1.484f, 1.261f, 2.433f, 2.75f, 2.622f)
                curveTo(4.338f, 9.25f, 2.81f, 11.994f, 2.881f, 14.9f)
                curveToRelative(0.046f, 1.83f, 0.467f, 9.1f, 8.686f, 9.1f)
                horizontalLineToRelative(1.497f)
                curveToRelative(3.507f, 0.0f, 5.632f, -2.606f, 6.25f, -3.614f)
                curveToRelative(1.822f, -2.963f, 2.122f, -7.548f, 1.537f, -10.764f)
                close()
            }
        }
        .build()
        return _sefaria!!
    }

private var _sefaria: ImageVector? = null
