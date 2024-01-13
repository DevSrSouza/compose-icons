package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandFirefox: ImageVector
    get() {
        if (_brandFirefox != null) {
            return _brandFirefox!!
        }
        _brandFirefox = Builder(name = "BrandFirefox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.028f, 7.82f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 12.823f, -3.4f)
                curveToRelative(-1.636f, -1.02f, -3.064f, -1.02f, -4.851f, -1.02f)
                horizontalLineToRelative(-1.647f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.914f, 9.485f)
                curveToRelative(-1.756f, -1.569f, -0.805f, -5.38f, 0.109f, -6.17f)
                curveToRelative(0.086f, 0.896f, 0.585f, 1.208f, 1.111f, 1.685f)
                curveToRelative(0.88f, -0.275f, 1.313f, -0.282f, 1.867f, 0.0f)
                curveToRelative(0.82f, -0.91f, 1.694f, -2.354f, 2.628f, -2.093f)
                curveToRelative(-1.082f, 1.741f, -0.07f, 3.733f, 1.371f, 4.173f)
                curveToRelative(-0.17f, 0.975f, -1.484f, 1.913f, -2.76f, 2.686f)
                curveToRelative(-1.296f, 0.938f, -0.722f, 1.85f, 0.0f, 2.234f)
                curveToRelative(0.949f, 0.506f, 3.611f, -1.0f, 4.545f, 0.354f)
                curveToRelative(-1.698f, 0.102f, -1.536f, 3.107f, -3.983f, 2.727f)
                curveToRelative(2.523f, 0.957f, 4.345f, 0.462f, 5.458f, -0.34f)
                curveToRelative(1.965f, -1.52f, 2.879f, -3.542f, 2.879f, -5.557f)
                curveToRelative(-0.014f, -1.398f, 0.194f, -2.695f, -1.26f, -4.75f)
            }
        }
        .build()
        return _brandFirefox!!
    }

private var _brandFirefox: ImageVector? = null
