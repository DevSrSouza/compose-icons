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

public val SimpleIcons.Upcloud: ImageVector
    get() {
        if (_upcloud != null) {
            return _upcloud!!
        }
        _upcloud = Builder(name = "Upcloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1155f, 12.9964f)
                arcToRelative(1.8845f, 1.8845f, 0.0f, true, true, 0.0f, 3.769f)
                lineTo(8.6643f, 16.7654f)
                lineTo(8.6643f, 11.87f)
                horizontalLineToRelative(0.888f)
                verticalLineToRelative(4.0072f)
                horizontalLineToRelative(12.5849f)
                arcToRelative(1.0078f, 1.0078f, 0.0f, false, false, 0.9964f, -0.9964f)
                arcToRelative(1.0317f, 1.0317f, 0.0f, false, false, -1.0397f, -0.9964f)
                lineTo(10.397f, 13.8844f)
                verticalLineToRelative(-0.888f)
                close()
                moveTo(13.4296f, 7.2347f)
                lineTo(8.6643f, 7.2347f)
                verticalLineToRelative(1.9927f)
                horizontalLineToRelative(0.888f)
                lineTo(9.5523f, 8.1011f)
                horizontalLineToRelative(3.899f)
                arcToRelative(1.0078f, 1.0078f, 0.0f, false, true, 0.9964f, 0.9964f)
                arcToRelative(1.0653f, 1.0653f, 0.0f, false, true, -1.018f, 1.0397f)
                lineTo(1.8845f, 10.1372f)
                arcToRelative(1.8845f, 1.8845f, 0.0f, true, false, 0.0f, 3.769f)
                horizontalLineToRelative(5.8917f)
                verticalLineToRelative(-0.8881f)
                lineTo(1.8845f, 13.0181f)
                arcToRelative(0.9964f, 0.9964f, 0.0f, false, true, 0.0f, -1.9928f)
                horizontalLineToRelative(11.5668f)
                arcToRelative(1.8999f, 1.8999f, 0.0f, false, false, 1.8844f, -1.8845f)
                arcToRelative(1.9375f, 1.9375f, 0.0f, false, false, -1.9061f, -1.9061f)
                close()
            }
        }
        .build()
        return _upcloud!!
    }

private var _upcloud: ImageVector? = null
