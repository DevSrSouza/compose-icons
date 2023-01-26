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

public val TwotoneGroup.ScreenLockLandscape: ImageVector
    get() {
        if (_screenLockLandscape != null) {
            return _screenLockLandscape!!
        }
        _screenLockLandscape = Builder(name = "ScreenLockLandscape", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2f, 10.0f)
                curveToRelative(0.0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f)
                reflectiveCurveToRelative(-1.2f, 0.54f, -1.2f, 1.2f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, 0.89f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(10.8f, 10.0f)
                curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f)
                reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _screenLockLandscape!!
    }

private var _screenLockLandscape: ImageVector? = null