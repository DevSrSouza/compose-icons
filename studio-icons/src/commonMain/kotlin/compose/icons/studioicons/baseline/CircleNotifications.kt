package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.CircleNotifications: ImageVector
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
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(1.0f, -1.0f)
                verticalLineToRelative(-2.61f)
                curveTo(8.0f, 9.27f, 9.03f, 7.47f, 11.0f, 7.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.57f, 0.43f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.43f, 1.0f, 1.0f)
                lineTo(13.0f, 7.0f)
                curveToRelative(1.97f, 0.47f, 3.0f, 2.28f, 3.0f, 4.39f)
                lineTo(16.0f, 14.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _circleNotifications!!
    }

private var _circleNotifications: ImageVector? = null
