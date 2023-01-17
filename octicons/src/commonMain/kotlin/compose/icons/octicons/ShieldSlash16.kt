package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ShieldSlash16: ImageVector
    get() {
        if (_shieldSlash16 != null) {
            return _shieldSlash16!!
        }
        _shieldSlash16 = Builder(name = "ShieldSlash16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.533f, 0.133f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.066f, 0.0f)
                lineToRelative(-2.091f, 0.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.457f, 1.428f)
                lineToRelative(2.09f, -0.67f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.153f, 0.0f)
                lineToRelative(5.25f, 1.68f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.174f, 0.239f)
                lineTo(13.5f, 7.0f)
                curveToRelative(0.0f, 0.233f, -0.008f, 0.464f, -0.025f, 0.694f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.495f, 0.112f)
                curveToRelative(0.02f, -0.27f, 0.03f, -0.538f, 0.03f, -0.806f)
                lineTo(15.0f, 3.48f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.217f, -1.667f)
                lineTo(8.533f, 0.133f)
                close()
                moveTo(1.0f, 2.857f)
                lineToRelative(-0.69f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.88f, -1.214f)
                lineToRelative(14.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.88f, 1.214f)
                lineToRelative(-1.282f, -0.928f)
                curveToRelative(-0.995f, 1.397f, -2.553f, 2.624f, -4.864f, 3.608f)
                curveToRelative(-0.425f, 0.181f, -0.905f, 0.18f, -1.329f, 0.0f)
                curveToRelative(-2.447f, -1.042f, -4.049f, -2.356f, -5.032f, -3.855f)
                curveTo(1.32f, 10.182f, 1.0f, 8.566f, 1.0f, 7.0f)
                close()
                moveTo(2.5f, 3.943f)
                lineTo(2.5f, 7.0f)
                curveToRelative(0.0f, 1.358f, 0.275f, 2.666f, 1.057f, 3.86f)
                curveToRelative(0.784f, 1.194f, 2.121f, 2.34f, 4.366f, 3.297f)
                curveToRelative(0.05f, 0.02f, 0.106f, 0.02f, 0.153f, 0.0f)
                curveToRelative(2.127f, -0.905f, 3.439f, -1.982f, 4.237f, -3.108f)
                close()
            }
        }
        .build()
        return _shieldSlash16!!
    }

private var _shieldSlash16: ImageVector? = null
