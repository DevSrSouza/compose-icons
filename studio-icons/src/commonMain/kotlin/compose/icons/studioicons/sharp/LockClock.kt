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

public val SharpGroup.LockClock: ImageVector
    get() {
        if (_lockClock != null) {
            return _lockClock!!
        }
        _lockClock = Builder(name = "LockClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.21f)
                curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f)
                curveTo(9.51f, 0.74f, 7.0f, 3.08f, 7.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(8.26f)
                curveTo(11.47f, 20.87f, 11.0f, 19.49f, 11.0f, 18.0f)
                curveTo(11.0f, 14.13f, 14.13f, 11.0f, 18.0f, 11.0f)
                close()
                moveTo(9.0f, 6.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(18.0f, 13.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(19.65f, 20.35f)
                lineToRelative(-2.15f, -2.15f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.79f)
                lineToRelative(1.85f, 1.85f)
                lineTo(19.65f, 20.35f)
                close()
            }
        }
        .build()
        return _lockClock!!
    }

private var _lockClock: ImageVector? = null
