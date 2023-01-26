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

public val SharpGroup.CircleNotifications: ImageVector
    get() {
        if (_circleNotifications != null) {
            return _circleNotifications!!
        }
        _circleNotifications = Builder(name = "CircleNotifications", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 18.5f)
                lineTo(12.0f, 18.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.0f)
                curveTo(13.5f, 17.83f, 12.83f, 18.5f, 12.0f, 18.5f)
                close()
                moveTo(17.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.86f, 1.28f, -3.41f, 3.0f, -3.86f)
                verticalLineTo(5.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.64f)
                curveToRelative(1.72f, 0.45f, 3.0f, 2.0f, 3.0f, 3.86f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _circleNotifications!!
    }

private var _circleNotifications: ImageVector? = null
