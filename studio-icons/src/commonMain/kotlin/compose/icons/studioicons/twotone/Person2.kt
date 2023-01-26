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

public val TwotoneGroup.Person2: ImageVector
    get() {
        if (_person2 != null) {
            return _person2!!
        }
        _person2 = Builder(name = "Person2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9f, 7.59f)
                curveTo(13.74f, 6.67f, 12.94f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(-1.74f, 0.67f, -1.9f, 1.59f)
                lineTo(9.78f, 10.0f)
                horizontalLineToRelative(4.44f)
                lineTo(13.9f, 7.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.48f, 16.34f)
                curveTo(16.29f, 15.73f, 14.37f, 15.0f, 12.0f, 15.0f)
                curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f)
                curveTo(6.2f, 16.5f, 6.0f, 16.84f, 6.0f, 17.22f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.78f)
                curveTo(18.0f, 16.84f, 17.8f, 16.5f, 17.48f, 16.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.39f, 14.56f)
                curveTo(16.71f, 13.7f, 14.53f, 13.0f, 12.0f, 13.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(4.61f, 15.07f, 4.0f, 16.1f, 4.0f, 17.22f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.78f)
                curveTo(20.0f, 16.1f, 19.39f, 15.07f, 18.39f, 14.56f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-0.78f)
                curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f)
                curveTo(7.71f, 15.73f, 9.63f, 15.0f, 12.0f, 15.0f)
                curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f)
                curveTo(17.8f, 16.5f, 18.0f, 16.84f, 18.0f, 17.22f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.78f, 12.0f)
                horizontalLineToRelative(4.44f)
                curveToRelative(1.21f, 0.0f, 2.14f, -1.06f, 1.98f, -2.26f)
                lineToRelative(-0.32f, -2.45f)
                curveTo(15.57f, 5.39f, 13.92f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(8.43f, 5.39f, 8.12f, 7.29f)
                lineTo(7.8f, 9.74f)
                curveTo(7.64f, 10.94f, 8.57f, 12.0f, 9.78f, 12.0f)
                close()
                moveTo(10.1f, 7.59f)
                curveTo(10.26f, 6.67f, 11.06f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(1.74f, 0.67f, 1.9f, 1.59f)
                lineTo(14.22f, 10.0f)
                horizontalLineTo(9.78f)
                lineTo(10.1f, 7.59f)
                close()
            }
        }
        .build()
        return _person2!!
    }

private var _person2: ImageVector? = null
