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

public val SimpleIcons.Enpass: ImageVector
    get() {
        if (_enpass != null) {
            return _enpass!!
        }
        _enpass = Builder(name = "Enpass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.023f, 1.3366f)
                curveToRelative(2.6912f, 0.0f, 5.3825f, -0.008f, 8.0745f, 0.004f)
                arcToRelative(3.8428f, 3.8428f, 0.0f, false, true, 2.9636f, 1.3079f)
                arcTo(3.7223f, 3.7223f, 0.0f, false, true, 24.0f, 4.9469f)
                arcToRelative(9.6627f, 9.6627f, 0.0f, false, true, -0.2783f, 2.319f)
                curveToRelative(-0.3571f, 2.0539f, -0.7288f, 4.1038f, -1.0939f, 6.155f)
                curveToRelative(-0.3147f, 1.7665f, -0.6162f, 3.5355f, -0.9474f, 5.3006f)
                curveToRelative(-0.4644f, 2.038f, -2.1287f, 3.5843f, -4.1953f, 3.8978f)
                arcToRelative(6.3255f, 6.3255f, 0.0f, false, true, -0.7428f, 0.0444f)
                curveToRelative(-3.1458f, 0.003f, -6.2916f, 0.003f, -9.4375f, 0.0f)
                curveToRelative(-2.4536f, -0.0049f, -4.551f, -1.7673f, -4.9784f, -4.1834f)
                arcTo(3553.0608f, 3553.0608f, 0.0f, false, false, 0.4209f, 7.9092f)
                curveTo(0.2949f, 7.2115f, 0.1559f, 6.5178f, 0.057f, 5.8148f)
                curveToRelative(-0.3576f, -2.05f, 1.0018f, -4.0057f, 3.048f, -4.3848f)
                arcToRelative(5.003f, 5.003f, 0.0f, false, true, 0.9713f, -0.0888f)
                curveToRelative(2.6489f, -0.0075f, 5.2978f, -0.009f, 7.9467f, -0.0046f)
                close()
                moveTo(9.8874f, 18.0225f)
                curveToRelative(-0.0302f, 0.6861f, 0.5343f, 1.2506f, 1.2204f, 1.2204f)
                horizontalLineToRelative(1.7472f)
                curveToRelative(0.7367f, 0.071f, 1.3552f, -0.548f, 1.2834f, -1.2847f)
                curveToRelative(0.0f, -1.3775f, 0.0f, -2.7556f, -0.0067f, -4.133f)
                arcToRelative(0.385f, 0.385f, 0.0f, false, true, 0.218f, -0.385f)
                curveToRelative(1.7016f, -1.0082f, 2.525f, -3.025f, 2.0155f, -4.936f)
                curveToRelative(-0.66f, -2.3766f, -3.103f, -3.7856f, -5.4906f, -3.1664f)
                arcToRelative(4.2099f, 4.2099f, 0.0f, false, false, -3.0345f, 2.5005f)
                curveToRelative(-0.7947f, 2.0883f, -0.0042f, 4.4472f, 1.8883f, 5.635f)
                arcToRelative(0.2895f, 0.2895f, 0.0f, false, true, 0.1636f, 0.287f)
                curveToRelative(-0.0073f, 1.4795f, -0.0046f, 2.7056f, -0.0046f, 4.2622f)
                close()
            }
        }
        .build()
        return _enpass!!
    }

private var _enpass: ImageVector? = null
