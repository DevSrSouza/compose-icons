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

public val TablerIcons.BrandReact: ImageVector
    get() {
        if (_brandReact != null) {
            return _brandReact!!
        }
        _brandReact = Builder(name = "BrandReact", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.306f, 8.711f)
                curveToRelative(-2.602f, 0.723f, -4.306f, 1.926f, -4.306f, 3.289f)
                curveToRelative(0.0f, 2.21f, 4.477f, 4.0f, 10.0f, 4.0f)
                curveToRelative(0.773f, 0.0f, 1.526f, -0.035f, 2.248f, -0.102f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.692f, 15.289f)
                curveToRelative(2.603f, -0.722f, 4.308f, -1.926f, 4.308f, -3.289f)
                curveToRelative(0.0f, -2.21f, -4.477f, -4.0f, -10.0f, -4.0f)
                curveToRelative(-0.773f, 0.0f, -1.526f, 0.035f, -2.25f, 0.102f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.305f, 15.287f)
                curveToRelative(-0.676f, 2.615f, -0.485f, 4.693f, 0.695f, 5.373f)
                curveToRelative(1.913f, 1.105f, 5.703f, -1.877f, 8.464f, -6.66f)
                curveToRelative(0.387f, -0.67f, 0.733f, -1.339f, 1.036f, -2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.694f, 8.716f)
                curveToRelative(0.677f, -2.616f, 0.487f, -4.696f, -0.694f, -5.376f)
                curveToRelative(-1.913f, -1.105f, -5.703f, 1.877f, -8.464f, 6.66f)
                curveToRelative(-0.387f, 0.67f, -0.733f, 1.34f, -1.037f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.424f)
                curveToRelative(-1.925f, -1.892f, -3.82f, -2.766f, -5.0f, -2.084f)
                curveToRelative(-1.913f, 1.104f, -1.226f, 5.877f, 1.536f, 10.66f)
                curveToRelative(0.386f, 0.67f, 0.793f, 1.304f, 1.212f, 1.896f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.574f)
                curveToRelative(1.926f, 1.893f, 3.821f, 2.768f, 5.0f, 2.086f)
                curveToRelative(1.913f, -1.104f, 1.226f, -5.877f, -1.536f, -10.66f)
                curveToRelative(-0.375f, -0.65f, -0.78f, -1.283f, -1.212f, -1.897f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 12.866f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.732f)
                close()
            }
        }
        .build()
        return _brandReact!!
    }

private var _brandReact: ImageVector? = null
