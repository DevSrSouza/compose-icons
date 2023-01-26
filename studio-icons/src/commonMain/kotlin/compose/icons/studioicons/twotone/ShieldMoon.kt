package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ShieldMoon: ImageVector
    get() {
        if (_shieldMoon != null) {
            return _shieldMoon!!
        }
        _shieldMoon = Builder(name = "ShieldMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.39f)
                verticalLineToRelative(4.7f)
                curveToRelative(0.0f, 4.0f, 2.55f, 7.7f, 6.0f, 8.83f)
                curveToRelative(3.45f, -1.13f, 6.0f, -4.82f, 6.0f, -8.83f)
                verticalLineToRelative(-4.7f)
                lineToRelative(-6.0f, -2.25f)
                lineTo(6.0f, 6.39f)
                close()
                moveTo(12.21f, 7.61f)
                curveToRelative(-0.46f, 1.23f, -0.39f, 2.64f, 0.32f, 3.86f)
                curveToRelative(0.71f, 1.22f, 1.89f, 1.99f, 3.18f, 2.2f)
                curveToRelative(0.34f, 0.06f, 0.49f, 0.47f, 0.26f, 0.74f)
                curveToRelative(-1.84f, 2.17f, -5.21f, 2.1f, -6.96f, -0.07f)
                curveToRelative(-2.19f, -2.72f, -0.65f, -6.72f, 2.69f, -7.33f)
                curveTo(12.04f, 6.95f, 12.33f, 7.28f, 12.21f, 7.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(6.09f)
                curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f)
                curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(18.0f, 11.09f)
                curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f)
                curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f)
                verticalLineToRelative(-4.7f)
                lineToRelative(6.0f, -2.25f)
                lineToRelative(6.0f, 2.25f)
                verticalLineTo(11.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.01f, 14.33f)
                curveToRelative(1.75f, 2.17f, 5.12f, 2.24f, 6.96f, 0.07f)
                curveToRelative(0.23f, -0.27f, 0.08f, -0.68f, -0.26f, -0.74f)
                curveToRelative(-1.29f, -0.21f, -2.48f, -0.98f, -3.18f, -2.2f)
                curveToRelative(-0.71f, -1.22f, -0.78f, -2.63f, -0.32f, -3.86f)
                curveToRelative(0.12f, -0.33f, -0.16f, -0.66f, -0.51f, -0.6f)
                curveTo(8.36f, 7.62f, 6.81f, 11.61f, 9.01f, 14.33f)
                close()
            }
        }
        .build()
        return _shieldMoon!!
    }

private var _shieldMoon: ImageVector? = null
