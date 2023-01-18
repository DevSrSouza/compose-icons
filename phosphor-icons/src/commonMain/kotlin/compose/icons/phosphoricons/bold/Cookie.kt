package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.4f, 111.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -16.8f, -3.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -24.4f, -19.3f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -19.8f, -19.8f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -19.3f, -24.4f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 128.6f, 20.0f)
                lineTo(128.0f, 20.0f)
                arcToRelative(107.9f, 107.9f, 0.0f, true, false, 76.3f, 184.4f)
                arcTo(107.0f, 107.0f, 0.0f, false, false, 236.0f, 127.3f)
                horizontalLineToRelative(0.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 228.4f, 111.8f)
                close()
                moveTo(187.3f, 187.5f)
                curveToRelative(-32.3f, 32.2f, -85.1f, 32.5f, -117.8f, 0.7f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 123.8f, 44.1f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, 39.6f, 48.5f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, 48.5f, 39.6f)
                arcTo(83.2f, 83.2f, 0.0f, false, true, 187.3f, 187.5f)
                close()
                moveTo(167.3f, 160.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.6f, 0.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 167.3f, 160.7f)
                close()
                moveTo(103.3f, 152.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.6f, 0.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 103.3f, 152.7f)
                close()
                moveTo(72.7f, 119.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.6f, 0.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 72.7f, 119.3f)
                close()
                moveTo(147.3f, 135.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -22.6f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 147.3f, 135.3f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
