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

public val TablerIcons.BrandGrindr: ImageVector
    get() {
        if (_brandGrindr != null) {
            return _brandGrindr!!
        }
        _brandGrindr = Builder(name = "BrandGrindr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 13.282f)
                curveToRelative(0.0f, 0.492f, 0.784f, 1.718f, 2.102f, 1.718f)
                curveToRelative(1.318f, 0.0f, 2.898f, -0.966f, 2.898f, -2.062f)
                curveToRelative(0.0f, -0.817f, -0.932f, -0.938f, -1.409f, -0.938f)
                curveToRelative(-0.228f, 0.0f, -3.591f, 0.111f, -3.591f, 1.282f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveToRelative(-2.984f, 0.0f, -6.471f, -2.721f, -6.63f, -2.982f)
                curveToRelative(-2.13f, -3.49f, -2.37f, -13.703f, -2.37f, -13.703f)
                lineToRelative(1.446f, -1.315f)
                curveToRelative(2.499f, 0.39f, 5.023f, 0.617f, 7.554f, 0.68f)
                arcToRelative(58.626f, 58.626f, 0.0f, false, false, 7.554f, -0.68f)
                lineToRelative(1.446f, 1.315f)
                reflectiveCurveToRelative(-0.24f, 10.213f, -2.37f, 13.704f)
                curveToRelative(-0.16f, 0.26f, -3.646f, 2.981f, -6.63f, 2.981f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 13.282f)
                curveToRelative(0.0f, 0.492f, -0.784f, 1.718f, -2.102f, 1.718f)
                curveToRelative(-1.318f, 0.0f, -2.898f, -0.966f, -2.898f, -2.062f)
                curveToRelative(0.0f, -0.817f, 0.932f, -0.938f, 1.409f, -0.938f)
                curveToRelative(0.228f, 0.0f, 3.591f, 0.111f, 3.591f, 1.282f)
                close()
            }
        }
        .build()
        return _brandGrindr!!
    }

private var _brandGrindr: ImageVector? = null
