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

public val TwotoneGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.98f, 18.25f)
                curveToRelative(-0.29f, -0.9f, -0.57f, -1.94f, -0.76f, -3.0f)
                lineTo(6.0f, 16.07f)
                verticalLineToRelative(2.98f)
                lineTo(7.98f, 18.25f)
                close()
                moveTo(12.0f, 4.36f)
                curveToRelative(0.0f, 0.0f, -3.0f, 2.02f, -3.0f, 8.64f)
                curveToRelative(0.0f, 2.25f, 1.0f, 5.0f, 1.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.0f, 1.0f, -2.75f, 1.0f, -5.0f)
                curveTo(15.0f, 6.38f, 12.0f, 4.36f, 12.0f, 4.36f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(14.0f, 12.1f, 13.1f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(18.0f, 19.05f)
                verticalLineToRelative(-2.98f)
                lineToRelative(-1.22f, -0.81f)
                curveToRelative(-0.19f, 1.05f, -0.47f, 2.1f, -0.76f, 3.0f)
                lineTo(18.0f, 19.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f)
                close()
                moveTo(7.98f, 18.25f)
                curveToRelative(-0.29f, -0.9f, -0.57f, -1.94f, -0.76f, -3.0f)
                lineTo(6.0f, 16.07f)
                verticalLineToRelative(2.98f)
                lineTo(7.98f, 18.25f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(0.0f, 0.0f, 5.0f, 2.0f, 5.0f, 11.0f)
                lineToRelative(2.11f, 1.41f)
                curveToRelative(0.56f, 0.37f, 0.89f, 1.0f, 0.89f, 1.66f)
                verticalLineTo(22.0f)
                lineToRelative(-5.0f, -2.0f)
                horizontalLineTo(9.0f)
                lineToRelative(-5.0f, 2.0f)
                verticalLineToRelative(-5.93f)
                curveToRelative(0.0f, -0.67f, 0.33f, -1.29f, 0.89f, -1.66f)
                lineTo(7.0f, 13.0f)
                curveTo(7.0f, 4.0f, 12.0f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.36f)
                curveToRelative(0.0f, 0.0f, -3.0f, 2.02f, -3.0f, 8.64f)
                curveToRelative(0.0f, 2.25f, 1.0f, 5.0f, 1.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.0f, 1.0f, -2.75f, 1.0f, -5.0f)
                curveTo(15.0f, 6.38f, 12.0f, 4.36f, 12.0f, 4.36f)
                close()
                moveTo(18.0f, 19.05f)
                verticalLineToRelative(-2.98f)
                lineToRelative(-1.22f, -0.81f)
                curveToRelative(-0.19f, 1.05f, -0.47f, 2.1f, -0.76f, 3.0f)
                lineTo(18.0f, 19.05f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
