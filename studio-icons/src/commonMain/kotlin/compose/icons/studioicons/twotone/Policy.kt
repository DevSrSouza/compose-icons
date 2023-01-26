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

public val TwotoneGroup.Policy: ImageVector
    get() {
        if (_policy != null) {
            return _policy!!
        }
        _policy = Builder(name = "Policy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 6.3f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 4.52f, 2.98f, 8.69f, 7.0f, 9.93f)
                curveToRelative(1.74f, -0.53f, 3.28f, -1.62f, 4.47f, -3.04f)
                lineToRelative(-1.72f, -1.72f)
                curveToRelative(-1.94f, 1.29f, -4.58f, 1.07f, -6.29f, -0.64f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0.0f, -7.07f)
                curveToRelative(1.95f, -1.95f, 5.12f, -1.95f, 7.07f, 0.0f)
                curveToRelative(1.71f, 1.71f, 1.92f, 4.35f, 0.64f, 6.29f)
                lineToRelative(1.45f, 1.45f)
                curveTo(18.49f, 14.65f, 19.0f, 12.85f, 19.0f, 11.0f)
                verticalLineTo(6.3f)
                lineToRelative(-7.0f, -3.11f)
                lineTo(5.0f, 6.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f)
                curveToRelative(0.65f, -0.16f, 1.27f, -0.38f, 1.87f, -0.65f)
                curveToRelative(1.8f, -0.82f, 3.36f, -2.13f, 4.57f, -3.74f)
                curveTo(20.04f, 16.46f, 21.0f, 13.77f, 21.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(0.0f, 1.85f, -0.51f, 3.65f, -1.38f, 5.21f)
                lineToRelative(-1.45f, -1.45f)
                curveToRelative(1.29f, -1.94f, 1.07f, -4.58f, -0.64f, -6.29f)
                curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0.0f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.0f, 7.07f)
                curveToRelative(1.71f, 1.71f, 4.35f, 1.92f, 6.29f, 0.64f)
                lineToRelative(1.72f, 1.72f)
                curveToRelative(-1.19f, 1.42f, -2.73f, 2.51f, -4.47f, 3.04f)
                curveTo(7.98f, 19.69f, 5.0f, 15.52f, 5.0f, 11.0f)
                verticalLineTo(6.3f)
                lineToRelative(7.0f, -3.11f)
                lineToRelative(7.0f, 3.11f)
                verticalLineTo(11.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveTo(15.0f, 10.34f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _policy!!
    }

private var _policy: ImageVector? = null
