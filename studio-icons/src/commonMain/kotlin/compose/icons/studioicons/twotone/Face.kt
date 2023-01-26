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

public val TwotoneGroup.Face: ImageVector
    get() {
        if (_face != null) {
            return _face!!
        }
        _face = Builder(name = "Face", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 8.0f)
                curveToRelative(0.46f, 0.0f, 0.91f, -0.05f, 1.34f, -0.12f)
                curveTo(17.44f, 5.56f, 14.9f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-0.46f, 0.0f, -0.91f, 0.05f, -1.34f, 0.12f)
                curveTo(12.06f, 6.44f, 14.6f, 8.0f, 17.5f, 8.0f)
                close()
                moveTo(8.08f, 5.03f)
                curveTo(6.37f, 6.0f, 5.05f, 7.58f, 4.42f, 9.47f)
                curveToRelative(1.71f, -0.97f, 3.03f, -2.55f, 3.66f, -4.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.9f, 0.0f, 5.44f, 1.56f, 6.84f, 3.88f)
                curveToRelative(-0.43f, 0.07f, -0.88f, 0.12f, -1.34f, 0.12f)
                curveToRelative(-2.9f, 0.0f, -5.44f, -1.56f, -6.84f, -3.88f)
                curveToRelative(0.43f, -0.07f, 0.88f, -0.12f, 1.34f, -0.12f)
                close()
                moveTo(8.08f, 5.03f)
                curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f)
                curveTo(5.05f, 7.58f, 6.37f, 6.0f, 8.08f, 5.03f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.01f, -0.15f)
                curveToRelative(2.6f, -0.98f, 4.68f, -2.99f, 5.74f, -5.55f)
                curveToRelative(1.83f, 2.26f, 4.62f, 3.7f, 7.75f, 3.7f)
                curveToRelative(0.75f, 0.0f, 1.47f, -0.09f, 2.17f, -0.24f)
                curveToRelative(0.21f, 0.71f, 0.33f, 1.46f, 0.33f, 2.24f)
                curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                moveToRelative(-1.25f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                moveToRelative(-1.25f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
            }
        }
        .build()
        return _face!!
    }

private var _face: ImageVector? = null
