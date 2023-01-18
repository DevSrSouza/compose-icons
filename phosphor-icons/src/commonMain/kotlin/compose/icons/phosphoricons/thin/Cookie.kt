package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.5f, 118.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -10.1f, -2.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -34.2f, -27.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.9f, -11.9f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -27.0f, -34.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.6f, 28.0f)
                lineTo(128.0f, 28.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, false, 100.0f, 99.4f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 223.5f, 118.0f)
                close()
                moveTo(193.0f, 193.1f)
                curveToRelative(-35.4f, 35.3f, -93.3f, 35.7f, -129.1f, 0.9f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 36.0f)
                horizontalLineToRelative(0.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 3.1f, 1.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.8f, 3.4f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 9.6f, 33.4f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, false, 25.1f, 10.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, false, 10.5f, 25.1f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 33.4f, 9.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.4f, 0.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 1.5f, 3.1f)
                arcTo(91.3f, 91.3f, 0.0f, false, true, 193.0f, 193.1f)
                close()
                moveTo(161.7f, 166.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, true, -11.4f, 0.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 161.7f, 166.3f)
                close()
                moveTo(97.7f, 158.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, true, -11.4f, 0.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 97.7f, 158.3f)
                close()
                moveTo(89.7f, 113.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, true, 0.0f, -11.4f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 89.7f, 113.7f)
                close()
                moveTo(141.7f, 118.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, true, -11.4f, 0.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 141.7f, 118.3f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
