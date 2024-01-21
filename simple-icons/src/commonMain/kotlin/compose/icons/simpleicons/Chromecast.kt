package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Chromecast: ImageVector
    get() {
        if (_chromecast != null) {
            return _chromecast!!
        }
        _chromecast = Builder(name = "Chromecast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.5455f)
                verticalLineToRelative(3.2727f)
                horizontalLineToRelative(3.2727f)
                curveToRelative(0.0f, -1.811f, -1.4618f, -3.2727f, -3.2727f, -3.2727f)
                close()
                moveTo(0.0f, 14.1818f)
                verticalLineToRelative(2.1818f)
                curveToRelative(3.011f, 0.0f, 5.4545f, 2.4437f, 5.4545f, 5.4546f)
                horizontalLineToRelative(2.1819f)
                curveToRelative(0.0f, -4.2218f, -3.4146f, -7.6364f, -7.6364f, -7.6364f)
                close()
                moveTo(0.0f, 9.8182f)
                lineTo(0.0f, 12.0f)
                curveToRelative(5.4218f, 0.0f, 9.8182f, 4.3964f, 9.8182f, 9.8182f)
                lineTo(12.0f, 21.8182f)
                curveToRelative(0.0f, -6.6327f, -5.3782f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(21.8182f, 2.1818f)
                lineTo(2.1818f, 2.1818f)
                curveTo(0.9818f, 2.1818f, 0.0f, 3.1636f, 0.0f, 4.3636f)
                verticalLineToRelative(3.2728f)
                horizontalLineToRelative(2.1818f)
                lineTo(2.1818f, 4.3636f)
                horizontalLineToRelative(19.6364f)
                verticalLineToRelative(15.2728f)
                horizontalLineToRelative(-7.6364f)
                verticalLineToRelative(2.1818f)
                horizontalLineToRelative(7.6364f)
                curveToRelative(1.2f, 0.0f, 2.1818f, -0.9818f, 2.1818f, -2.1818f)
                lineTo(24.0f, 4.3636f)
                curveToRelative(0.0f, -1.2f, -0.9818f, -2.1818f, -2.1818f, -2.1818f)
                close()
            }
        }
        .build()
        return _chromecast!!
    }

private var _chromecast: ImageVector? = null
