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

public val SimpleIcons.Observable: ImageVector
    get() {
        if (_observable != null) {
            return _observable!!
        }
        _observable = Builder(name = "Observable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveToRelative(-1.065f, 0.0f, -1.988f, -0.232f, -2.77f, -0.696f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, -1.794f, -1.89f)
                arcToRelative(9.97f, 9.97f, 0.0f, false, true, -0.916f, -2.53f)
                arcTo(13.613f, 13.613f, 0.0f, false, true, 6.23f, 12.0f)
                curveToRelative(0.0f, -0.766f, 0.05f, -1.499f, 0.152f, -2.2f)
                curveToRelative(0.1f, -0.699f, 0.285f, -1.41f, 0.556f, -2.132f)
                arcTo(6.803f, 6.803f, 0.0f, false, true, 7.98f, 5.79f)
                arcToRelative(4.725f, 4.725f, 0.0f, false, true, 1.668f, -1.293f)
                curveTo(10.337f, 4.165f, 11.12f, 4.0f, 12.0f, 4.0f)
                curveToRelative(1.065f, 0.0f, 1.988f, 0.232f, 2.77f, 0.696f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, 1.794f, 1.89f)
                curveToRelative(0.418f, 0.795f, 0.723f, 1.639f, 0.916f, 2.53f)
                curveToRelative(0.192f, 0.891f, 0.29f, 1.853f, 0.29f, 2.884f)
                curveToRelative(0.0f, 0.766f, -0.05f, 1.499f, -0.152f, 2.2f)
                arcToRelative(9.812f, 9.812f, 0.0f, false, true, -0.567f, 2.132f)
                arcToRelative(7.226f, 7.226f, 0.0f, false, true, -1.042f, 1.878f)
                curveToRelative(-0.418f, 0.53f, -0.97f, 0.962f, -1.657f, 1.293f)
                curveToRelative(-0.688f, 0.332f, -1.471f, 0.497f, -2.352f, 0.497f)
                close()
                moveTo(14.037f, 14.118f)
                curveToRelative(0.551f, -0.554f, 0.858f, -1.32f, 0.848f, -2.118f)
                curveToRelative(0.0f, -0.824f, -0.276f, -1.53f, -0.827f, -2.118f)
                curveTo(13.506f, 9.294f, 12.82f, 9.0f, 12.0f, 9.0f)
                curveToRelative(-0.82f, 0.0f, -1.506f, 0.294f, -2.058f, 0.882f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 9.115f, 12.0f)
                curveToRelative(0.0f, 0.824f, 0.276f, 1.53f, 0.827f, 2.118f)
                curveToRelative(0.552f, 0.588f, 1.238f, 0.882f, 2.058f, 0.882f)
                curveToRelative(0.82f, 0.0f, 1.5f, -0.294f, 2.037f, -0.882f)
                close()
                moveTo(12.0f, 24.0f)
                curveToRelative(6.372f, 0.0f, 11.538f, -5.373f, 11.538f, -12.0f)
                reflectiveCurveTo(18.372f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.462f, 5.373f, 0.462f, 12.0f)
                reflectiveCurveTo(5.628f, 24.0f, 12.0f, 24.0f)
                close()
            }
        }
        .build()
        return _observable!!
    }

private var _observable: ImageVector? = null
