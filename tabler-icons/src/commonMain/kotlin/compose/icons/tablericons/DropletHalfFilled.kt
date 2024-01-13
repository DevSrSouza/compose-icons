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

public val TablerIcons.DropletHalfFilled: ImageVector
    get() {
        if (_dropletHalfFilled != null) {
            return _dropletHalfFilled!!
        }
        _dropletHalfFilled = Builder(name = "DropletHalfFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(0.07f, 0.003f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, true, 1.825f, 0.907f)
                lineToRelative(0.108f, 0.148f)
                lineToRelative(4.92f, 7.306f)
                curveToRelative(1.952f, 3.267f, 1.191f, 7.42f, -1.796f, 9.836f)
                curveToRelative(-2.968f, 2.402f, -7.285f, 2.402f, -10.254f, 0.0f)
                curveToRelative(-2.917f, -2.36f, -3.711f, -6.376f, -1.901f, -9.65f)
                lineToRelative(0.134f, -0.232f)
                lineToRelative(4.893f, -7.26f)
                curveToRelative(0.185f, -0.275f, 0.426f, -0.509f, 0.709f, -0.686f)
                arcToRelative(2.426f, 2.426f, 0.0f, false, true, 1.066f, -0.36f)
                lineToRelative(0.226f, -0.012f)
                close()
                moveTo(11.0f, 5.149f)
                lineToRelative(-4.206f, 6.24f)
                curveToRelative(-1.44f, 2.41f, -0.88f, 5.463f, 1.337f, 7.257f)
                arcToRelative(6.101f, 6.101f, 0.0f, false, false, 2.869f, 1.276f)
                verticalLineToRelative(-14.773f)
                close()
            }
        }
        .build()
        return _dropletHalfFilled!!
    }

private var _dropletHalfFilled: ImageVector? = null
