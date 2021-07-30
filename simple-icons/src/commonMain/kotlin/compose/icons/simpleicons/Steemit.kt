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

public val SimpleIcons.Steemit: ImageVector
    get() {
        if (_steemit != null) {
            return _steemit!!
        }
        _steemit = Builder(name = "Steemit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.982f, 7.246f)
                curveToRelative(-1.0f, -1.0f, -2.163f, -1.73f, -3.4f, -2.202f)
                curveToRelative(0.721f, -2.12f, 3.277f, -2.892f, 3.277f, -2.892f)
                reflectiveCurveTo(14.895f, -0.944f, 8.31f, 0.29f)
                curveTo(6.114f, 0.64f, 4.008f, 1.988f, 2.468f, 3.768f)
                arcToRelative(9.152f, 9.152f, 0.0f, false, false, 0.991f, 12.984f)
                curveToRelative(0.598f, 0.512f, 1.934f, 1.308f, 1.958f, 1.349f)
                curveToRelative(-0.876f, 2.226f, -3.678f, 2.835f, -3.678f, 2.835f)
                reflectiveCurveToRelative(3.703f, 2.316f, 8.676f, 2.917f)
                curveToRelative(1.319f, 0.163f, 2.72f, 0.204f, 4.17f, 0.05f)
                curveToRelative(2.302f, -0.188f, 4.596f, -1.406f, 6.34f, -3.12f)
                arcToRelative(9.525f, 9.525f, 0.0f, false, false, 0.058f, -13.538f)
                close()
                moveTo(19.278f, 19.304f)
                curveToRelative(-1.41f, 1.382f, -3.515f, 2.26f, -5.137f, 2.381f)
                curveToRelative(-1.147f, 0.114f, -2.376f, 0.13f, -3.555f, -0.016f)
                curveToRelative(-1.737f, -0.212f, -2.99f, -0.69f, -4.22f, -1.154f)
                curveToRelative(0.623f, -0.601f, 1.246f, -1.43f, 1.5f, -2.145f)
                arcToRelative(1.652f, 1.652f, 0.0f, false, false, -0.05f, -1.308f)
                arcToRelative(6.995f, 6.995f, 0.0f, false, true, 1.426f, -8.077f)
                arcToRelative(7.196f, 7.196f, 0.0f, false, true, 5.931f, -1.99f)
                arcToRelative(7.142f, 7.142f, 0.0f, false, true, 4.228f, 2.047f)
                curveToRelative(2.785f, 2.795f, 2.687f, 7.524f, -0.123f, 10.262f)
                close()
            }
        }
        .build()
        return _steemit!!
    }

private var _steemit: ImageVector? = null
