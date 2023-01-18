package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.9f, 114.9f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, -13.4f, -3.1f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -29.3f, -23.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.9f, -15.9f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -23.1f, -29.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 128.6f, 24.0f)
                lineTo(128.0f, 24.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 24.0f, 128.7f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 208.0f, -1.3f)
                horizontalLineToRelative(0.0f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 225.9f, 114.9f)
                close()
                moveTo(75.5f, 99.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, 17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 75.5f, 99.5f)
                close()
                moveTo(100.5f, 172.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.5f, 172.5f)
                close()
                moveTo(127.5f, 132.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 127.5f, 132.5f)
                close()
                moveTo(164.5f, 180.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.5f, 180.5f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
