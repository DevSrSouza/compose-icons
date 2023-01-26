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

public val BaselineGroup.ScreenLockRotation: ImageVector
    get() {
        if (_screenLockRotation != null) {
            return _screenLockRotation!!
        }
        _screenLockRotation = Builder(name = "ScreenLockRotation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.25f, 12.77f)
                lineToRelative(-2.57f, -2.57f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.22f, 2.22f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(4.51f, 8.17f)
                lineToRelative(5.66f, -5.66f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(1.41f, -1.41f)
                lineTo(11.23f, 0.75f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f)
                lineTo(2.75f, 7.11f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                lineToRelative(12.02f, 12.02f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f)
                lineToRelative(6.36f, -6.36f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                close()
                moveTo(8.47f, 20.48f)
                curveTo(5.2f, 18.94f, 2.86f, 15.76f, 2.5f, 12.0f)
                lineTo(1.0f, 12.0f)
                curveToRelative(0.51f, 6.16f, 5.66f, 11.0f, 11.95f, 11.0f)
                lineToRelative(0.66f, -0.03f)
                lineToRelative(-3.81f, -3.82f)
                lineToRelative(-1.33f, 1.33f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                verticalLineToRelative(-0.5f)
                curveTo(21.0f, 1.12f, 19.88f, 0.0f, 18.5f, 0.0f)
                reflectiveCurveTo(16.0f, 1.12f, 16.0f, 2.5f)
                lineTo(16.0f, 3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(16.8f, 2.5f)
                curveToRelative(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f)
                reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f)
                lineTo(20.2f, 3.0f)
                horizontalLineToRelative(-3.4f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _screenLockRotation!!
    }

private var _screenLockRotation: ImageVector? = null
