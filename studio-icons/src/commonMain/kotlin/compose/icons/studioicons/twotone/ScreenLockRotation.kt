package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ScreenLockRotation: ImageVector
    get() {
        if (_screenLockRotation != null) {
            return _screenLockRotation!!
        }
        _screenLockRotation = Builder(name = "ScreenLockRotation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.3f, 13.77f)
                lineToRelative(-2.57f, -2.57f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.22f, 2.22f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(3.56f, 9.17f)
                lineToRelative(5.66f, -5.66f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.45f, -2.45f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f)
                lineTo(1.8f, 8.11f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                lineToRelative(12.02f, 12.02f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f)
                lineToRelative(6.36f, -6.36f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                close()
                moveTo(7.52f, 21.48f)
                curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f)
                lineTo(0.05f, 13.0f)
                curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f)
                lineToRelative(0.66f, -0.03f)
                lineToRelative(-3.81f, -3.82f)
                lineToRelative(-1.33f, 1.33f)
                close()
                moveTo(15.05f, 10.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(21.05f, 5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(15.05f, 4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(15.85f, 3.5f)
                curveToRelative(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f)
                reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f)
                lineTo(19.25f, 4.0f)
                horizontalLineToRelative(-3.4f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _screenLockRotation!!
    }

private var _screenLockRotation: ImageVector? = null
