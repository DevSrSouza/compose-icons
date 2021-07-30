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

public val SimpleIcons.Googleclassroom: ImageVector
    get() {
        if (_googleclassroom != null) {
            return _googleclassroom!!
        }
        _googleclassroom = Builder(name = "Googleclassroom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6367f, 1.6367f)
                curveTo(0.7322f, 1.6367f, 0.0f, 2.369f, 0.0f, 3.2734f)
                verticalLineToRelative(17.4532f)
                curveToRelative(0.0f, 0.9045f, 0.7322f, 1.6367f, 1.6367f, 1.6367f)
                horizontalLineToRelative(20.7266f)
                curveToRelative(0.9045f, 0.0f, 1.6367f, -0.7322f, 1.6367f, -1.6367f)
                lineTo(24.0f, 3.2734f)
                curveToRelative(0.0f, -0.9045f, -0.7322f, -1.6367f, -1.6367f, -1.6367f)
                lineTo(1.6367f, 1.6367f)
                close()
                moveTo(2.1817f, 3.8184f)
                horizontalLineToRelative(19.6367f)
                verticalLineToRelative(16.3632f)
                horizontalLineToRelative(-2.7266f)
                verticalLineToRelative(-1.0898f)
                horizontalLineToRelative(-4.9102f)
                verticalLineToRelative(1.0898f)
                horizontalLineToRelative(-12.0f)
                lineTo(2.1816f, 3.8184f)
                close()
                moveTo(12.0f, 8.1816f)
                curveToRelative(-0.9046f, 0.0f, -1.6367f, 0.7322f, -1.6367f, 1.6368f)
                curveToRelative(0.0f, 0.9045f, 0.7321f, 1.6367f, 1.6367f, 1.6367f)
                curveToRelative(0.9046f, 0.0f, 1.6367f, -0.7322f, 1.6367f, -1.6367f)
                curveToRelative(0.0f, -0.9046f, -0.7321f, -1.6368f, -1.6367f, -1.6368f)
                close()
                moveTo(7.6367f, 10.0918f)
                curveToRelative(-0.6773f, 0.0f, -1.2285f, 0.5493f, -1.2285f, 1.2266f)
                curveToRelative(0.0f, 0.6772f, 0.5512f, 1.2265f, 1.2285f, 1.2265f)
                curveToRelative(0.6773f, 0.0f, 1.2266f, -0.5493f, 1.2266f, -1.2265f)
                curveToRelative(0.0f, -0.6773f, -0.5493f, -1.2266f, -1.2266f, -1.2266f)
                close()
                moveTo(16.3633f, 10.0918f)
                curveToRelative(-0.6773f, 0.0f, -1.2266f, 0.5493f, -1.2266f, 1.2266f)
                curveToRelative(0.0f, 0.6772f, 0.5493f, 1.2265f, 1.2266f, 1.2265f)
                curveToRelative(0.6773f, 0.0f, 1.2285f, -0.5493f, 1.2285f, -1.2265f)
                curveToRelative(0.0f, -0.6773f, -0.5512f, -1.2266f, -1.2285f, -1.2266f)
                close()
                moveTo(12.0f, 12.5449f)
                curveToRelative(-1.179f, 0.0f, -2.4128f, 0.4012f, -3.1484f, 1.0059f)
                curveToRelative(-0.384f, -0.1198f, -0.8043f, -0.1875f, -1.2149f, -0.1875f)
                curveToRelative(-1.3136f, 0.0f, -2.7285f, 0.695f, -2.7285f, 1.5586f)
                verticalLineToRelative(0.8965f)
                horizontalLineToRelative(14.1836f)
                verticalLineToRelative(-0.8965f)
                curveToRelative(0.0f, -0.8637f, -1.4149f, -1.5586f, -2.7285f, -1.5586f)
                curveToRelative(-0.4106f, 0.0f, -0.831f, 0.0677f, -1.2149f, 0.1875f)
                curveToRelative(-0.7356f, -0.6047f, -1.9694f, -1.0059f, -3.1484f, -1.0059f)
                close()
            }
        }
        .build()
        return _googleclassroom!!
    }

private var _googleclassroom: ImageVector? = null
