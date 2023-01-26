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

public val SharpGroup.ScreenLockLandscape: ImageVector
    get() {
        if (_screenLockLandscape != null) {
            return _screenLockLandscape!!
        }
        _screenLockLandscape = Builder(name = "ScreenLockLandscape", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 5.0f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(22.0f)
                lineTo(23.0f, 5.0f)
                close()
                moveTo(19.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(9.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0.0f, -1.0f, -0.69f, -1.92f, -1.68f, -2.08f)
                curveTo(11.07f, 7.83f, 10.0f, 8.79f, 10.0f, 10.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 11.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(10.8f, 10.0f)
                curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f)
                reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _screenLockLandscape!!
    }

private var _screenLockLandscape: ImageVector? = null
