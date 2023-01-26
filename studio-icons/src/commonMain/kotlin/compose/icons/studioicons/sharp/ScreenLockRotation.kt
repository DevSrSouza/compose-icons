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

public val SharpGroup.ScreenLockRotation: ImageVector
    get() {
        if (_screenLockRotation != null) {
            return _screenLockRotation!!
        }
        _screenLockRotation = Builder(name = "ScreenLockRotation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.52f, 21.48f)
                curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f)
                lineTo(0.05f, 13.0f)
                curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f)
                lineToRelative(0.66f, -0.03f)
                lineToRelative(-3.81f, -3.82f)
                lineToRelative(-1.33f, 1.33f)
                close()
                moveTo(20.05f, 4.0f)
                verticalLineToRelative(-0.36f)
                curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f)
                curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f)
                lineTo(15.05f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                lineTo(21.05f, 4.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(19.25f, 4.0f)
                horizontalLineToRelative(-3.4f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f)
                reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f)
                lineTo(19.25f, 4.0f)
                close()
                moveTo(19.73f, 11.2f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.22f, 2.22f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(3.56f, 9.17f)
                lineToRelative(5.66f, -5.66f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(1.41f, -1.41f)
                lineTo(9.22f, 0.69f)
                lineTo(0.74f, 9.17f)
                lineToRelative(14.14f, 14.14f)
                lineToRelative(8.48f, -8.48f)
                close()
            }
        }
        .build()
        return _screenLockRotation!!
    }

private var _screenLockRotation: ImageVector? = null
