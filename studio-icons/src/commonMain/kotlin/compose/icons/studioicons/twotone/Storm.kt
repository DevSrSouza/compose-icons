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

public val TwotoneGroup.Storm: ImageVector
    get() {
        if (_storm != null) {
            return _storm!!
        }
        _storm = Builder(name = "Storm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.2f, 9.0f)
                curveTo(15.54f, 6.13f, 11.86f, 5.15f, 9.0f, 6.8f)
                curveToRelative(-2.67f, 1.54f, -3.7f, 4.84f, -2.5f, 7.6f)
                curveToRelative(0.09f, 0.2f, 0.19f, 0.4f, 0.3f, 0.6f)
                curveToRelative(1.66f, 2.87f, 5.33f, 3.85f, 8.2f, 2.2f)
                curveToRelative(2.67f, -1.54f, 3.7f, -4.84f, 2.5f, -7.6f)
                curveTo(17.41f, 9.4f, 17.31f, 9.2f, 17.2f, 9.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveTo(14.21f, 16.0f, 12.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveTo(14.21f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(13.1f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.93f, 8.0f)
                curveTo(16.72f, 4.18f, 11.82f, 2.87f, 8.0f, 5.07f)
                curveToRelative(-1.41f, 0.82f, -2.48f, 2.0f, -3.16f, 3.37f)
                curveTo(4.71f, 6.24f, 5.06f, 4.04f, 5.86f, 2.0f)
                horizontalLineTo(3.74f)
                curveTo(2.2f, 6.49f, 2.52f, 11.58f, 5.07f, 16.0f)
                curveToRelative(1.1f, 1.91f, 2.88f, 3.19f, 4.86f, 3.72f)
                curveToRelative(1.98f, 0.53f, 4.16f, 0.31f, 6.07f, -0.79f)
                curveToRelative(1.41f, -0.82f, 2.48f, -2.0f, 3.16f, -3.37f)
                curveToRelative(0.13f, 2.2f, -0.21f, 4.4f, -1.01f, 6.44f)
                horizontalLineToRelative(2.11f)
                curveTo(21.79f, 17.51f, 21.48f, 12.42f, 18.93f, 8.0f)
                close()
                moveTo(15.0f, 17.2f)
                curveToRelative(-2.87f, 1.65f, -6.54f, 0.67f, -8.2f, -2.2f)
                curveToRelative(-0.11f, -0.2f, -0.21f, -0.4f, -0.3f, -0.6f)
                curveTo(5.3f, 11.64f, 6.33f, 8.34f, 9.0f, 6.8f)
                curveToRelative(2.86f, -1.65f, 6.54f, -0.67f, 8.2f, 2.2f)
                curveToRelative(0.11f, 0.2f, 0.21f, 0.4f, 0.3f, 0.6f)
                curveTo(18.7f, 12.36f, 17.67f, 15.66f, 15.0f, 17.2f)
                close()
            }
        }
        .build()
        return _storm!!
    }

private var _storm: ImageVector? = null
