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

public val TablerIcons.DiamondFilled: ImageVector
    get() {
        if (_diamondFilled != null) {
            return _diamondFilled!!
        }
        _diamondFilled = Builder(name = "DiamondFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.783f, 0.378f)
                lineToRelative(0.074f, 0.108f)
                lineToRelative(3.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.032f, 1.078f)
                lineToRelative(-0.08f, 0.103f)
                lineToRelative(-8.53f, 9.533f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.215f, 0.51f)
                curveToRelative(-0.4f, 0.0f, -0.785f, -0.14f, -1.11f, -0.417f)
                lineToRelative(-0.135f, -0.126f)
                lineToRelative(-8.5f, -9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.172f, -1.067f)
                lineToRelative(0.06f, -0.115f)
                lineToRelative(3.013f, -5.022f)
                lineToRelative(0.064f, -0.09f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, true, 0.155f, -0.154f)
                lineToRelative(0.089f, -0.064f)
                lineToRelative(0.088f, -0.05f)
                lineToRelative(0.05f, -0.023f)
                lineToRelative(0.06f, -0.025f)
                lineToRelative(0.109f, -0.032f)
                lineToRelative(0.112f, -0.02f)
                lineToRelative(0.117f, -0.005f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(9.114f, 7.943f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.371f, 0.343f)
                lineToRelative(-0.6f, 1.0f)
                lineToRelative(-0.06f, 0.116f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.177f, 1.07f)
                lineToRelative(2.0f, 2.2f)
                lineToRelative(0.09f, 0.088f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.323f, -0.02f)
                lineToRelative(0.087f, -0.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.02f, -1.323f)
                lineToRelative(-1.501f, -1.65f)
                lineToRelative(0.218f, -0.363f)
                lineToRelative(0.055f, -0.103f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.398f, -1.268f)
                close()
            }
        }
        .build()
        return _diamondFilled!!
    }

private var _diamondFilled: ImageVector? = null
