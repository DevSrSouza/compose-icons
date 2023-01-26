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

public val TwotoneGroup.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = Builder(name = "SwipeRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.08f, 21.0f)
                horizontalLineToRelative(-6.55f)
                lineToRelative(-3.7f, -3.78f)
                lineTo(11.0f, 18.11f)
                verticalLineTo(7.5f)
                curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f)
                reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f)
                verticalLineToRelative(6.18f)
                horizontalLineToRelative(1.76f)
                lineTo(18.0f, 15.56f)
                lineTo(17.08f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.89f, 13.77f)
                lineToRelative(-3.8f, -1.67f)
                curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.5f)
                curveTo(14.0f, 6.12f, 12.88f, 5.0f, 11.5f, 5.0f)
                reflectiveCurveTo(9.0f, 6.12f, 9.0f, 7.5f)
                verticalLineToRelative(8.15f)
                lineToRelative(-1.87f, -0.4f)
                curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f)
                lineTo(4.0f, 17.22f)
                lineToRelative(5.12f, 5.19f)
                curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f)
                horizontalLineToRelative(6.55f)
                curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f)
                lineToRelative(0.92f, -5.44f)
                curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f)
                close()
                moveTo(17.08f, 21.0f)
                horizontalLineToRelative(-6.55f)
                lineToRelative(-3.7f, -3.78f)
                lineTo(11.0f, 18.11f)
                verticalLineTo(7.5f)
                curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f)
                reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f)
                verticalLineToRelative(6.18f)
                horizontalLineToRelative(1.76f)
                lineTo(18.0f, 15.56f)
                lineTo(17.08f, 21.0f)
                close()
                moveTo(12.0f, 2.5f)
                curveTo(7.26f, 2.5f, 4.33f, 5.02f, 3.57f, 7.0f)
                horizontalLineTo(2.0f)
                curveToRelative(0.73f, -2.88f, 4.51f, -6.0f, 10.0f, -6.0f)
                curveToRelative(3.22f, 0.0f, 6.18f, 1.13f, 8.5f, 3.02f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(5.5f)
                horizontalLineToRelative(2.91f)
                curveTo(17.79f, 3.64f, 15.03f, 2.5f, 12.0f, 2.5f)
                close()
            }
        }
        .build()
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
