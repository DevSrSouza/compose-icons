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

public val TwotoneGroup.Stadium: ImageVector
    get() {
        if (_stadium != null) {
            return _stadium!!
        }
        _stadium = Builder(name = "Stadium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 10.04f)
                curveTo(6.38f, 10.53f, 8.77f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveToRelative(5.62f, -0.47f, 7.0f, -0.96f)
                curveTo(19.0f, 9.86f, 16.22f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(5.0f, 9.86f, 5.0f, 10.04f)
                close()
                moveTo(20.0f, 11.8f)
                curveToRelative(-1.82f, 0.73f, -4.73f, 1.2f, -8.0f, 1.2f)
                reflectiveCurveToRelative(-6.18f, -0.47f, -8.0f, -1.2f)
                verticalLineToRelative(6.78f)
                curveToRelative(0.61f, 0.41f, 2.36f, 1.01f, 5.0f, 1.28f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.86f)
                curveToRelative(2.64f, -0.27f, 4.39f, -0.87f, 5.0f, -1.28f)
                verticalLineTo(11.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(3.0f, 7.0f)
                verticalLineTo(3.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(18.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(4.0f, -2.0f)
                lineTo(18.0f, 3.0f)
                close()
                moveTo(11.0f, 2.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(4.0f, -2.0f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.0f, 4.0f)
                curveToRelative(-5.05f, -0.15f, -9.0f, -1.44f, -9.0f, -3.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.66f, 4.48f, -3.0f, 10.0f, -3.0f)
                reflectiveCurveToRelative(10.0f, 1.34f, 10.0f, 3.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.56f, -3.95f, 2.85f, -9.0f, 3.0f)
                lineTo(13.0f, 18.0f)
                close()
                moveTo(5.0f, 10.04f)
                curveTo(6.38f, 10.53f, 8.77f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveToRelative(5.62f, -0.47f, 7.0f, -0.96f)
                curveTo(19.0f, 9.86f, 16.22f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(5.0f, 9.86f, 5.0f, 10.04f)
                close()
                moveTo(20.0f, 11.8f)
                curveToRelative(-1.82f, 0.73f, -4.73f, 1.2f, -8.0f, 1.2f)
                reflectiveCurveToRelative(-6.18f, -0.47f, -8.0f, -1.2f)
                verticalLineToRelative(6.78f)
                curveToRelative(0.61f, 0.41f, 2.36f, 1.01f, 5.0f, 1.28f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.86f)
                curveToRelative(2.64f, -0.27f, 4.39f, -0.87f, 5.0f, -1.28f)
                verticalLineTo(11.8f)
                close()
            }
        }
        .build()
        return _stadium!!
    }

private var _stadium: ImageVector? = null
