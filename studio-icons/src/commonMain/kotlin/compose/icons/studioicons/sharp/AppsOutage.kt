package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.AppsOutage: ImageVector
    get() {
        if (_appsOutage != null) {
            return _appsOutage!!
        }
        _appsOutage = Builder(name = "AppsOutage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(16.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(19.0f, 0.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(21.76f, 0.0f, 19.0f, 0.0f)
                close()
                moveTo(19.5f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(19.5f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.07f)
                curveTo(19.67f, 11.98f, 19.34f, 12.0f, 19.0f, 12.0f)
                curveToRelative(-1.07f, 0.0f, -2.09f, -0.24f, -3.0f, -0.68f)
                verticalLineTo(14.0f)
                close()
                moveTo(10.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.68f)
                curveTo(12.24f, 7.09f, 12.0f, 6.07f, 12.0f, 5.0f)
                curveToRelative(0.0f, -0.34f, 0.02f, -0.67f, 0.07f, -1.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _appsOutage!!
    }

private var _appsOutage: ImageVector? = null
