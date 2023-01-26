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

public val TwotoneGroup.Support: ImageVector
    get() {
        if (_support != null) {
            return _support!!
        }
        _support = Builder(name = "Support", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.3f, 7.32f)
                lineTo(9.13f, 4.54f)
                curveTo(7.02f, 5.35f, 5.35f, 7.02f, 4.54f, 9.13f)
                lineToRelative(2.78f, 1.15f)
                curveTo(7.83f, 8.9f, 8.92f, 7.82f, 10.3f, 7.32f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.32f, 13.72f)
                lineToRelative(-2.78f, 1.15f)
                curveToRelative(0.81f, 2.1f, 2.48f, 3.78f, 4.59f, 4.59f)
                lineToRelative(1.17f, -2.78f)
                curveTo(8.91f, 16.18f, 7.83f, 15.09f, 7.32f, 13.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.67f, 10.27f)
                lineToRelative(2.78f, -1.15f)
                curveToRelative(-0.81f, -2.1f, -2.48f, -3.77f, -4.58f, -4.58f)
                lineToRelative(-1.15f, 2.78f)
                curveTo(15.09f, 7.83f, 16.17f, 8.9f, 16.67f, 10.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.68f, 13.71f)
                curveToRelative(-0.5f, 1.37f, -1.58f, 2.46f, -2.95f, 2.97f)
                lineToRelative(1.15f, 2.78f)
                curveToRelative(2.1f, -0.81f, 3.77f, -2.48f, 4.58f, -4.58f)
                lineTo(16.68f, 13.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.87f, 4.54f)
                curveToRelative(2.1f, 0.81f, 3.77f, 2.48f, 4.58f, 4.58f)
                lineToRelative(-2.78f, 1.15f)
                curveToRelative(-0.51f, -1.36f, -1.58f, -2.44f, -2.95f, -2.94f)
                lineTo(14.87f, 4.54f)
                close()
                moveTo(9.13f, 4.54f)
                lineToRelative(1.17f, 2.78f)
                curveToRelative(-1.38f, 0.5f, -2.47f, 1.59f, -2.98f, 2.97f)
                lineTo(4.54f, 9.13f)
                curveTo(5.35f, 7.02f, 7.02f, 5.35f, 9.13f, 4.54f)
                close()
                moveTo(9.13f, 19.46f)
                curveToRelative(-2.1f, -0.81f, -3.78f, -2.48f, -4.59f, -4.59f)
                lineToRelative(2.78f, -1.15f)
                curveToRelative(0.51f, 1.38f, 1.59f, 2.46f, 2.97f, 2.96f)
                lineTo(9.13f, 19.46f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveTo(9.0f, 13.66f, 9.0f, 12.0f)
                close()
                moveTo(14.88f, 19.46f)
                lineToRelative(-1.15f, -2.78f)
                curveToRelative(1.37f, -0.51f, 2.45f, -1.59f, 2.95f, -2.97f)
                lineToRelative(2.78f, 1.17f)
                curveTo(18.65f, 16.98f, 16.98f, 18.65f, 14.88f, 19.46f)
                close()
            }
        }
        .build()
        return _support!!
    }

private var _support: ImageVector? = null
