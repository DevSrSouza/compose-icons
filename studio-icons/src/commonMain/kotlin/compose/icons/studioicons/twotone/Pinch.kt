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

public val TwotoneGroup.Pinch: ImageVector
    get() {
        if (_pinch != null) {
            return _pinch!!
        }
        _pinch = Builder(name = "Pinch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 15.56f)
                lineToRelative(-4.24f, -1.89f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.5f)
                curveTo(15.0f, 7.22f, 14.78f, 7.0f, 14.5f, 7.0f)
                reflectiveCurveTo(14.0f, 7.22f, 14.0f, 7.5f)
                verticalLineToRelative(10.61f)
                lineToRelative(-4.17f, -0.89f)
                lineToRelative(3.7f, 3.78f)
                horizontalLineToRelative(6.55f)
                lineTo(21.0f, 15.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.5f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.56f)
                lineTo(3.56f, 9.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.44f)
                lineTo(8.44f, 2.5f)
                horizontalLineTo(6.0f)
                close()
                moveTo(21.89f, 13.77f)
                lineToRelative(-3.8f, -1.67f)
                curveTo(17.96f, 12.04f, 17.81f, 12.0f, 17.65f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.5f)
                curveTo(17.0f, 6.12f, 15.88f, 5.0f, 14.5f, 5.0f)
                reflectiveCurveTo(12.0f, 6.12f, 12.0f, 7.5f)
                verticalLineToRelative(8.15f)
                lineToRelative(-1.87f, -0.4f)
                curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f)
                lineTo(7.0f, 17.22f)
                lineToRelative(5.12f, 5.19f)
                curveTo(12.49f, 22.79f, 13.0f, 23.0f, 13.53f, 23.0f)
                horizontalLineToRelative(6.55f)
                curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f)
                lineToRelative(0.92f, -5.44f)
                curveTo(23.12f, 15.03f, 22.68f, 14.17f, 21.89f, 13.77f)
                close()
                moveTo(20.08f, 21.0f)
                horizontalLineToRelative(-6.55f)
                lineToRelative(-3.7f, -3.78f)
                lineTo(14.0f, 18.11f)
                verticalLineTo(7.5f)
                curveTo(14.0f, 7.22f, 14.22f, 7.0f, 14.5f, 7.0f)
                reflectiveCurveTo(15.0f, 7.22f, 15.0f, 7.5f)
                verticalLineToRelative(6.18f)
                horizontalLineToRelative(1.76f)
                lineTo(21.0f, 15.56f)
                lineTo(20.08f, 21.0f)
                close()
            }
        }
        .build()
        return _pinch!!
    }

private var _pinch: ImageVector? = null
