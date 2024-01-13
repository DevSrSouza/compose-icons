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

public val SimpleIcons.Wasabi: ImageVector
    get() {
        if (_wasabi != null) {
            return _wasabi!!
        }
        _wasabi = Builder(name = "Wasabi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.483f, 3.517f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, -8.483f, 3.517f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, 3.517f, 8.483f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, 8.483f, -3.517f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 24.0f, 12.0f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, -3.517f, -8.483f)
                close()
                moveTo(21.773f, 10.904f)
                lineTo(16.613f, 6.221f)
                lineTo(11.328f, 11.205f)
                lineTo(8.554f, 13.82f)
                lineTo(8.554f, 9.932f)
                lineToRelative(4.206f, -3.994f)
                lineToRelative(3.146f, -2.969f)
                curveToRelative(3.163f, 1.379f, 5.478f, 4.365f, 5.867f, 7.935f)
                close()
                moveTo(21.685f, 13.732f)
                arcToRelative(10.632f, 10.632f, 0.0f, false, true, -1.025f, 2.951f)
                lineToRelative(-2.952f, -2.668f)
                verticalLineToRelative(-3.87f)
                close()
                moveTo(13.502f, 2.262f)
                lineTo(11.275f, 4.365f)
                lineTo(8.536f, 6.963f)
                verticalLineToRelative(-4.17f)
                arcTo(9.798f, 9.798f, 0.0f, false, true, 12.0f, 2.155f)
                curveToRelative(0.513f, 0.0f, 1.007f, 0.035f, 1.502f, 0.106f)
                close()
                moveTo(6.398f, 13.891f)
                lineToRelative(-4.083f, -3.658f)
                arcToRelative(9.744f, 9.744f, 0.0f, false, true, 1.078f, -2.987f)
                lineTo(6.398f, 9.95f)
                close()
                moveTo(6.398f, 3.923f)
                verticalLineToRelative(3.129f)
                lineToRelative(-1.75f, -1.573f)
                arcToRelative(8.623f, 8.623f, 0.0f, false, true, 1.75f, -1.556f)
                close()
                moveTo(2.209f, 13.025f)
                lineTo(7.493f, 17.761f)
                lineTo(12.795f, 12.778f)
                lineTo(15.535f, 10.18f)
                verticalLineToRelative(3.817f)
                lineToRelative(-7.423f, 7.016f)
                arcToRelative(9.823f, 9.823f, 0.0f, false, true, -5.903f, -7.988f)
                close()
                moveTo(10.515f, 21.72f)
                lineTo(15.535f, 16.966f)
                verticalLineToRelative(4.206f)
                arcToRelative(9.833f, 9.833f, 0.0f, false, true, -3.553f, 0.654f)
                curveToRelative(-0.495f, 0.0f, -0.99f, -0.035f, -1.467f, -0.106f)
                close()
                moveTo(17.691f, 20.006f)
                verticalLineToRelative(-3.11f)
                lineToRelative(1.714f, 1.555f)
                arcToRelative(9.604f, 9.604f, 0.0f, false, true, -1.714f, 1.555f)
                close()
            }
        }
        .build()
        return _wasabi!!
    }

private var _wasabi: ImageVector? = null
