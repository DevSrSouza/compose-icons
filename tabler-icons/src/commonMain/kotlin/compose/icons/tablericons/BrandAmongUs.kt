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

public val TablerIcons.BrandAmongUs: ImageVector
    get() {
        if (_brandAmongUs != null) {
            return _brandAmongUs!!
        }
        _brandAmongUs = Builder(name = "BrandAmongUs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.646f, 12.774f)
                curveToRelative(-1.939f, 0.396f, -4.467f, 0.317f, -6.234f, -0.601f)
                curveToRelative(-2.454f, -1.263f, -1.537f, -4.66f, 1.423f, -4.982f)
                curveToRelative(2.254f, -0.224f, 3.814f, -0.354f, 5.65f, 0.214f)
                curveToRelative(0.835f, 0.256f, 1.93f, 0.569f, 1.355f, 3.281f)
                curveToRelative(-0.191f, 1.067f, -1.07f, 1.904f, -2.194f, 2.088f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.84f, 7.132f)
                curveToRelative(0.083f, -0.564f, 0.214f, -1.12f, 0.392f, -1.661f)
                curveToRelative(0.456f, -0.936f, 1.095f, -2.068f, 3.985f, -2.456f)
                arcToRelative(22.464f, 22.464f, 0.0f, false, true, 2.867f, 0.08f)
                curveToRelative(1.776f, 0.14f, 2.643f, 1.234f, 3.287f, 3.368f)
                curveToRelative(0.339f, 1.157f, 0.46f, 2.342f, 0.629f, 3.537f)
                verticalLineToRelative(11.0f)
                lineToRelative(-12.704f, -0.019f)
                curveToRelative(-0.552f, -2.386f, -0.262f, -5.894f, 0.204f, -8.481f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                curveToRelative(0.991f, 0.163f, 2.105f, 0.383f, 3.069f, 0.67f)
                curveToRelative(0.255f, 0.13f, 0.52f, 0.275f, 0.534f, 0.505f)
                curveToRelative(0.264f, 3.434f, 0.57f, 7.448f, 0.278f, 9.825f)
                horizontalLineToRelative(-3.881f)
            }
        }
        .build()
        return _brandAmongUs!!
    }

private var _brandAmongUs: ImageVector? = null
