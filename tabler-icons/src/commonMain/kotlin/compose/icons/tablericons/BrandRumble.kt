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

public val TablerIcons.BrandRumble: ImageVector
    get() {
        if (_brandRumble != null) {
            return _brandRumble!!
        }
        _brandRumble = Builder(name = "BrandRumble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.993f, 9.108f)
                curveToRelative(0.383f, 0.4f, 0.687f, 0.863f, 0.893f, 1.368f)
                arcToRelative(4.195f, 4.195f, 0.0f, false, true, 0.006f, 3.166f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, true, -0.887f, 1.372f)
                arcToRelative(20.233f, 20.233f, 0.0f, false, true, -2.208f, 2.0f)
                arcToRelative(20.615f, 20.615f, 0.0f, false, true, -2.495f, 1.669f)
                arcToRelative(21.322f, 21.322f, 0.0f, false, true, -5.622f, 2.202f)
                arcToRelative(4.213f, 4.213f, 0.0f, false, true, -3.002f, -0.404f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, -1.163f, -0.967f)
                arcToRelative(3.796f, 3.796f, 0.0f, false, true, -0.695f, -1.312f)
                curveToRelative(-1.199f, -3.902f, -1.022f, -8.312f, 0.134f, -12.23f)
                curveToRelative(0.609f, -2.057f, 2.643f, -3.349f, 4.737f, -2.874f)
                curveToRelative(3.88f, 0.88f, 7.52f, 3.147f, 10.302f, 6.01f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.044f, 13.034f)
                curveToRelative(0.67f, -0.505f, 0.67f, -1.489f, 0.0f, -2.01f)
                arcToRelative(14.824f, 14.824f, 0.0f, false, false, -1.498f, -1.044f)
                arcToRelative(15.783f, 15.783f, 0.0f, false, false, -1.62f, -0.865f)
                curveToRelative(-0.77f, -0.35f, -1.63f, 0.139f, -1.753f, 0.973f)
                arcToRelative(15.385f, 15.385f, 0.0f, false, false, -0.1f, 3.786f)
                arcToRelative(1.232f, 1.232f, 0.0f, false, false, 1.715f, 1.027f)
                arcToRelative(14.783f, 14.783f, 0.0f, false, false, 1.694f, -0.827f)
                arcToRelative(14.46f, 14.46f, 0.0f, false, false, 1.562f, -1.035f)
                verticalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _brandRumble!!
    }

private var _brandRumble: ImageVector? = null
