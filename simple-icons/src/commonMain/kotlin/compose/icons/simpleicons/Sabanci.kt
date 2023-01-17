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

public val SimpleIcons.Sabanci: ImageVector
    get() {
        if (_sabanci != null) {
            return _sabanci!!
        }
        _sabanci = Builder(name = "Sabanci", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3877f, 8.88f)
                arcToRelative(15.8031f, 15.8031f, 0.0f, false, false, -1.5366f, 0.1053f)
                curveToRelative(-1.1437f, 0.1457f, -1.5395f, 0.6461f, -1.5395f, 1.8724f)
                curveToRelative(0.0f, 0.9713f, 0.2576f, 1.44f, 0.9035f, 1.661f)
                curveToRelative(0.3132f, 0.1092f, 0.8498f, 0.155f, 1.7434f, 0.155f)
                horizontalLineToRelative(1.6998f)
                arcToRelative(8.7053f, 8.7053f, 0.0f, false, true, 0.923f, 0.0194f)
                curveToRelative(0.3787f, 0.0365f, 0.5629f, 0.2113f, 0.5629f, 0.5246f)
                curveToRelative(0.0f, 0.5463f, -0.2429f, 0.6f, -2.4283f, 0.6f)
                arcToRelative(8.499f, 8.499f, 0.0f, false, true, -1.1724f, -0.0631f)
                curveToRelative(-0.2768f, -0.0656f, -0.34f, -0.1751f, -0.3595f, -0.6365f)
                lineTo(2.3386f, 13.1181f)
                verticalLineToRelative(0.3595f)
                curveToRelative(0.0f, 0.8766f, 0.2959f, 1.3186f, 0.988f, 1.4935f)
                curveToRelative(0.4516f, 0.1214f, 1.0785f, 0.1579f, 2.4723f, 0.1579f)
                arcToRelative(23.1753f, 23.1753f, 0.0f, false, false, 2.5834f, -0.0925f)
                curveToRelative(1.1704f, -0.1263f, 1.6125f, -0.6312f, 1.6125f, -1.8672f)
                curveToRelative(0.0f, -0.6386f, -0.129f, -1.1f, -0.3766f, -1.3768f)
                curveToRelative(-0.2865f, -0.3302f, -0.6651f, -0.442f, -1.5879f, -0.4856f)
                curveToRelative(-0.4978f, -0.0195f, -0.8668f, -0.0294f, -0.9713f, -0.0294f)
                lineTo(5.308f, 11.2775f)
                arcToRelative(3.181f, 3.181f, 0.0f, false, true, -0.7284f, -0.036f)
                arcToRelative(0.471f, 0.471f, 0.0f, false, true, -0.4127f, -0.4857f)
                curveToRelative(0.0f, -0.34f, 0.1652f, -0.4716f, 0.6265f, -0.508f)
                curveToRelative(0.2866f, -0.017f, 1.117f, -0.046f, 1.6998f, -0.046f)
                curveToRelative(1.2652f, 0.0f, 1.44f, 0.0752f, 1.44f, 0.6095f)
                horizontalLineToRelative(1.804f)
                curveToRelative(0.0f, -1.0612f, -0.2037f, -1.4862f, -0.8204f, -1.717f)
                curveToRelative(-0.4711f, -0.1748f, -0.9595f, -0.211f, -2.7589f, -0.211f)
                arcToRelative(15.8031f, 15.8031f, 0.0f, false, false, -0.7702f, -0.0033f)
                close()
                moveTo(16.6094f, 8.9246f)
                lineTo(13.1491f, 15.0754f)
                horizontalLineToRelative(2.1224f)
                lineToRelative(0.59f, -1.0975f)
                horizontalLineToRelative(3.9677f)
                lineToRelative(0.6071f, 1.0975f)
                horizontalLineToRelative(2.0493f)
                lineToRelative(-3.3678f, -6.1508f)
                close()
                moveTo(17.8454f, 10.2431f)
                lineTo(19.1833f, 12.6984f)
                lineTo(16.534f, 12.6984f)
                close()
                moveTo(0.0f, 12.0012f)
                arcToRelative(6.1532f, 6.1532f, 0.0f, false, true, 11.998f, -1.928f)
                arcToRelative(6.1556f, 6.1556f, 0.0f, true, true, 0.0f, 3.8536f)
                arcTo(6.1532f, 6.1532f, 0.0f, false, true, 0.0f, 12.0012f)
                close()
            }
        }
        .build()
        return _sabanci!!
    }

private var _sabanci: ImageVector? = null
