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

public val SimpleIcons.Biome: ImageVector
    get() {
        if (_biome != null) {
            return _biome!!
        }
        _biome = Builder(name = "Biome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 1.608f)
                lineToRelative(-5.346f, 9.259f)
                arcToRelative(12.069f, 12.069f, 0.0f, false, true, 6.326f, -0.219f)
                lineToRelative(1.807f, 0.426f)
                lineToRelative(-1.7f, 7.208f)
                lineToRelative(-1.809f, -0.427f)
                curveToRelative(-2.224f, -0.524f, -4.361f, 0.644f, -5.264f, 2.507f)
                lineToRelative(-1.672f, -0.809f)
                curveToRelative(1.276f, -2.636f, 4.284f, -4.232f, 7.364f, -3.505f)
                lineToRelative(0.847f, -3.592f)
                arcTo(10.211f, 10.211f, 0.0f, false, false, 0.0f, 22.392f)
                horizontalLineToRelative(24.0f)
                lineTo(12.0f, 1.608f)
                close()
            }
        }
        .build()
        return _biome!!
    }

private var _biome: ImageVector? = null
