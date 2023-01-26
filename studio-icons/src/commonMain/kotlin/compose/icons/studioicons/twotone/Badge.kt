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

public val TwotoneGroup.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.5f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(13.5f)
                close()
                moveTo(14.0f, 16.5f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(16.5f)
                close()
                moveTo(20.0f, 7.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f)
                close()
                moveTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(9.0f, 15.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                curveTo(7.5f, 14.33f, 8.17f, 15.0f, 9.0f, 15.0f)
                close()
                moveTo(11.08f, 16.18f)
                curveTo(10.44f, 15.9f, 9.74f, 15.75f, 9.0f, 15.75f)
                reflectiveCurveToRelative(-1.44f, 0.15f, -2.08f, 0.43f)
                curveTo(6.36f, 16.42f, 6.0f, 16.96f, 6.0f, 17.57f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.43f)
                curveTo(12.0f, 16.96f, 11.64f, 16.42f, 11.08f, 16.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-5.0f)
                curveTo(15.0f, 10.1f, 14.1f, 11.0f, 13.0f, 11.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveTo(7.5f, 12.67f, 8.17f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(12.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-0.43f)
                curveToRelative(0.0f, -0.6f, 0.36f, -1.15f, 0.92f, -1.39f)
                curveTo(7.56f, 15.9f, 8.26f, 15.75f, 9.0f, 15.75f)
                reflectiveCurveToRelative(1.44f, 0.15f, 2.08f, 0.43f)
                curveToRelative(0.55f, 0.24f, 0.92f, 0.78f, 0.92f, 1.39f)
                verticalLineTo(18.0f)
                close()
                moveTo(18.0f, 16.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(16.5f)
                close()
                moveTo(18.0f, 13.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
