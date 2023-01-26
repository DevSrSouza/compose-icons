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

public val TwotoneGroup.Token: ImageVector
    get() {
        if (_token != null) {
            return _token!!
        }
        _token = Builder(name = "Token", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.29f)
                lineToRelative(5.91f, 3.28f)
                lineTo(14.9f, 9.24f)
                curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f)
                lineTo(6.09f, 7.57f)
                lineTo(12.0f, 4.29f)
                close()
                moveTo(11.0f, 19.16f)
                lineToRelative(-6.0f, -3.33f)
                verticalLineTo(9.26f)
                lineToRelative(3.13f, 1.74f)
                curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f)
                curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f)
                verticalLineTo(19.16f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f)
                close()
                moveTo(13.0f, 19.16f)
                verticalLineToRelative(-3.28f)
                curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f)
                curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f)
                lineTo(19.0f, 9.26f)
                lineToRelative(0.0f, 6.57f)
                lineTo(13.0f, 19.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                lineToRelative(-9.0f, -5.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(10.0f)
                lineToRelative(9.0f, 5.0f)
                lineToRelative(9.0f, -5.0f)
                lineTo(21.0f, 7.0f)
                close()
                moveTo(12.0f, 4.29f)
                lineToRelative(5.91f, 3.28f)
                lineTo(14.9f, 9.24f)
                curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f)
                lineTo(6.09f, 7.57f)
                lineTo(12.0f, 4.29f)
                close()
                moveTo(11.0f, 19.16f)
                lineToRelative(-6.0f, -3.33f)
                verticalLineTo(9.26f)
                lineToRelative(3.13f, 1.74f)
                curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f)
                curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f)
                verticalLineTo(19.16f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f)
                close()
                moveTo(13.0f, 19.16f)
                verticalLineToRelative(-3.28f)
                curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f)
                curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f)
                lineTo(19.0f, 9.26f)
                lineToRelative(0.0f, 6.57f)
                lineTo(13.0f, 19.16f)
                close()
            }
        }
        .build()
        return _token!!
    }

private var _token: ImageVector? = null
