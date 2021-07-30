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

public val SimpleIcons.Webdriverio: ImageVector
    get() {
        if (_webdriverio != null) {
            return _webdriverio!!
        }
        _webdriverio = Builder(name = "Webdriverio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.875f, 0.0f)
                curveTo(0.836f, 0.0f, 0.0f, 0.836f, 0.0f, 1.875f)
                verticalLineToRelative(20.25f)
                curveTo(0.0f, 23.164f, 0.836f, 24.0f, 1.875f, 24.0f)
                horizontalLineToRelative(20.25f)
                curveTo(23.164f, 24.0f, 24.0f, 23.164f, 24.0f, 22.125f)
                lineTo(24.0f, 1.875f)
                curveTo(24.0f, 0.836f, 23.164f, 0.0f, 22.125f, 0.0f)
                close()
                moveTo(2.25f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 18.0f)
                lineTo(2.25f, 18.0f)
                close()
                moveTo(9.335f, 6.0f)
                lineTo(10.125f, 6.0f)
                lineTo(5.29f, 18.0f)
                lineTo(4.499f, 18.0f)
                close()
                moveTo(16.125f, 6.0f)
                curveToRelative(3.314f, 0.0f, 6.0f, 2.686f, 6.0f, 6.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                curveToRelative(0.0f, -3.314f, 2.686f, -6.0f, 6.0f, -6.0f)
                close()
                moveTo(16.125f, 6.75f)
                curveToRelative(-2.899f, 0.0f, -5.25f, 2.351f, -5.25f, 5.25f)
                curveToRelative(0.0f, 2.899f, 2.351f, 5.25f, 5.25f, 5.25f)
                curveToRelative(2.899f, 0.0f, 5.25f, -2.351f, 5.25f, -5.25f)
                curveToRelative(0.0f, -2.899f, -2.351f, -5.25f, -5.25f, -5.25f)
                close()
            }
        }
        .build()
        return _webdriverio!!
    }

private var _webdriverio: ImageVector? = null
