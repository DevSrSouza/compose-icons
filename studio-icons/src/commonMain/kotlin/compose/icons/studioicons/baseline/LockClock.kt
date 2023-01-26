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

public val BaselineGroup.LockClock: ImageVector
    get() {
        if (_lockClock != null) {
            return _lockClock!!
        }
        _lockClock = Builder(name = "LockClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 14.2f)
                lineToRelative(2.9f, 1.7f)
                lineToRelative(-0.8f, 1.3f)
                lineTo(13.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.2f)
                close()
                moveTo(22.0f, 14.0f)
                curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-2.02f, 0.0f, -3.86f, -0.76f, -5.27f, -2.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(-1.15f, 0.0f, -2.0f, -0.85f, -2.0f, -2.0f)
                lineTo(2.0f, 9.0f)
                curveToRelative(0.0f, -1.12f, 0.89f, -1.96f, 2.0f, -2.0f)
                verticalLineToRelative(-0.5f)
                curveTo(4.0f, 4.01f, 6.01f, 2.0f, 8.5f, 2.0f)
                curveToRelative(2.34f, 0.0f, 4.24f, 1.79f, 4.46f, 4.08f)
                curveToRelative(0.34f, -0.05f, 0.69f, -0.08f, 1.04f, -0.08f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.74f)
                curveTo(10.88f, 4.99f, 9.8f, 4.0f, 8.5f, 4.0f)
                curveTo(7.12f, 4.0f, 6.0f, 5.12f, 6.0f, 6.5f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _lockClock!!
    }

private var _lockClock: ImageVector? = null
