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

public val SimpleIcons.Mamp: ImageVector
    get() {
        if (_mamp != null) {
            return _mamp!!
        }
        _mamp = Builder(name = "Mamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.102f, 9.629f)
                curveToRelative(0.245f, -1.695f, 2.139f, -6.979f, 7.454f, -7.98f)
                curveToRelative(3.137f, -0.592f, 7.005f, 1.034f, 9.72f, 3.788f)
                curveToRelative(-1.354f, 0.929f, -2.259f, 1.732f, -2.944f, 2.708f)
                curveToRelative(0.511f, 1.892f, 2.018f, 2.663f, 3.078f, 2.984f)
                curveToRelative(-1.175f, -0.711f, -1.917f, -1.381f, -2.376f, -2.812f)
                curveToRelative(2.513f, -2.988f, 5.205f, -3.954f, 5.432f, -3.978f)
                curveToRelative(2.102f, 1.677f, 3.586f, 4.735f, 3.532f, 7.955f)
                curveToRelative(-0.062f, 3.728f, -2.09f, 7.569f, -4.415f, 9.121f)
                curveToRelative(-0.318f, 0.151f, -1.053f, -0.25f, -1.153f, -0.687f)
                curveToRelative(0.476f, -1.105f, 1.601f, -3.795f, 1.74f, -5.806f)
                curveToRelative(0.131f, -1.928f, -1.146f, -3.061f, -2.219f, -1.667f)
                curveToRelative(-1.489f, 2.494f, -2.139f, 5.592f, -2.789f, 8.934f)
                curveToRelative(-1.095f, 0.313f, -2.952f, 0.392f, -3.756f, -0.036f)
                curveToRelative(-0.101f, -2.068f, 0.381f, -5.601f, -0.991f, -6.84f)
                curveToRelative(-0.588f, -0.533f, -1.169f, -0.285f, -1.562f, 0.205f)
                curveToRelative(-0.992f, 1.227f, -0.972f, 4.414f, -0.78f, 6.479f)
                curveToRelative(-1.109f, 0.686f, -2.99f, 0.543f, -4.179f, 0.117f)
                curveToRelative(-0.477f, -3.245f, -1.597f, -7.202f, -2.512f, -10.23f)
                curveToRelative(-0.255f, 1.216f, -0.379f, 2.664f, -0.34f, 3.908f)
                curveToRelative(-0.611f, -0.498f, -1.308f, -3.116f, -0.94f, -6.163f)
                close()
            }
        }
        .build()
        return _mamp!!
    }

private var _mamp: ImageVector? = null
