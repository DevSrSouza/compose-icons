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

public val Octicons.ShieldCheck16: ImageVector
    get() {
        if (_shieldCheck16 != null) {
            return _shieldCheck16!!
        }
        _shieldCheck16 = Builder(name = "ShieldCheck16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.533f, 0.133f)
                lineToRelative(5.25f, 1.68f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 15.0f, 3.48f)
                lineTo(15.0f, 7.0f)
                curveToRelative(0.0f, 1.566f, -0.32f, 3.182f, -1.303f, 4.682f)
                curveToRelative(-0.983f, 1.498f, -2.585f, 2.813f, -5.032f, 3.855f)
                arcToRelative(1.697f, 1.697f, 0.0f, false, true, -1.33f, 0.0f)
                curveToRelative(-2.447f, -1.042f, -4.049f, -2.357f, -5.032f, -3.855f)
                curveTo(1.32f, 10.182f, 1.0f, 8.566f, 1.0f, 7.0f)
                lineTo(1.0f, 3.48f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.217f, -1.667f)
                lineToRelative(5.25f, -1.68f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 1.066f, 0.0f)
                close()
                moveTo(7.923f, 1.562f)
                lineTo(7.924f, 1.563f)
                lineTo(2.674f, 3.243f)
                arcToRelative(0.251f, 0.251f, 0.0f, false, false, -0.174f, 0.237f)
                lineTo(2.5f, 7.0f)
                curveToRelative(0.0f, 1.36f, 0.275f, 2.666f, 1.057f, 3.859f)
                curveToRelative(0.784f, 1.194f, 2.121f, 2.342f, 4.366f, 3.298f)
                arcToRelative(0.196f, 0.196f, 0.0f, false, false, 0.154f, 0.0f)
                curveToRelative(2.245f, -0.957f, 3.582f, -2.103f, 4.366f, -3.297f)
                curveTo(13.225f, 9.666f, 13.5f, 8.358f, 13.5f, 7.0f)
                lineTo(13.5f, 3.48f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.174f, -0.238f)
                lineToRelative(-5.25f, -1.68f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.153f, 0.0f)
                close()
                moveTo(11.28f, 6.28f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.326f, -1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.734f, 0.215f)
                lineToRelative(0.97f, 0.97f)
                lineToRelative(2.97f, -2.97f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, 1.042f)
                close()
            }
        }
        .build()
        return _shieldCheck16!!
    }

private var _shieldCheck16: ImageVector? = null
