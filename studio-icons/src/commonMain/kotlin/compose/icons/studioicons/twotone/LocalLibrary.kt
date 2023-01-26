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

public val TwotoneGroup.LocalLibrary: ImageVector
    get() {
        if (_localLibrary != null) {
            return _localLibrary!!
        }
        _localLibrary = Builder(name = "LocalLibrary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 17.13f)
                verticalLineToRelative(-6.95f)
                curveToRelative(-2.1f, 0.38f, -4.05f, 1.35f, -5.64f, 2.83f)
                lineTo(12.0f, 14.28f)
                lineToRelative(-1.36f, -1.27f)
                curveTo(9.05f, 11.53f, 7.1f, 10.56f, 5.0f, 10.18f)
                verticalLineToRelative(6.95f)
                curveToRelative(2.53f, 0.34f, 4.94f, 1.3f, 7.0f, 2.83f)
                curveToRelative(2.07f, -1.52f, 4.47f, -2.49f, 7.0f, -2.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(8.0f, 2.79f, 8.0f, 5.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                close()
                moveTo(10.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                close()
                moveTo(3.0f, 19.0f)
                curveToRelative(3.48f, 0.0f, 6.64f, 1.35f, 9.0f, 3.55f)
                curveToRelative(2.36f, -2.19f, 5.52f, -3.55f, 9.0f, -3.55f)
                lineTo(21.0f, 8.0f)
                curveToRelative(-3.48f, 0.0f, -6.64f, 1.35f, -9.0f, 3.55f)
                curveTo(9.64f, 9.35f, 6.48f, 8.0f, 3.0f, 8.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(5.0f, 10.18f)
                curveToRelative(2.1f, 0.38f, 4.05f, 1.35f, 5.64f, 2.83f)
                lineTo(12.0f, 14.28f)
                lineToRelative(1.36f, -1.27f)
                curveToRelative(1.59f, -1.48f, 3.54f, -2.45f, 5.64f, -2.83f)
                verticalLineToRelative(6.95f)
                curveToRelative(-2.53f, 0.34f, -4.93f, 1.3f, -7.0f, 2.82f)
                curveToRelative(-2.06f, -1.52f, -4.47f, -2.49f, -7.0f, -2.83f)
                verticalLineToRelative(-6.94f)
                close()
            }
        }
        .build()
        return _localLibrary!!
    }

private var _localLibrary: ImageVector? = null
