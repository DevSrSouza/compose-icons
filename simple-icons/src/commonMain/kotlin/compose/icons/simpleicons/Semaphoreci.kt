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

public val SimpleIcons.Semaphoreci: ImageVector
    get() {
        if (_semaphoreci != null) {
            return _semaphoreci!!
        }
        _semaphoreci = Builder(name = "Semaphoreci", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5031f, 13.2549f)
                lineToRelative(-4.1578f, -4.2283f)
                arcToRelative(3.0381f, 3.0381f, 0.0f, false, false, -4.3591f, 0.0f)
                lineTo(9.6943f, 12.374f)
                arcToRelative(1.207f, 1.207f, 0.0f, false, true, -1.7213f, 0.0f)
                lineToRelative(-1.631f, -1.6587f)
                lineToRelative(4.1578f, -4.2287f)
                arcToRelative(6.5325f, 6.5325f, 0.0f, false, true, 9.3423f, 0.0f)
                lineTo(24.0f, 10.7153f)
                close()
                moveTo(8.8288f, 19.4792f)
                arcToRelative(6.5295f, 6.5295f, 0.0f, false, true, -4.671f, -1.9657f)
                lineTo(0.0f, 13.295f)
                lineToRelative(2.4867f, -2.5287f)
                lineToRelative(4.1574f, 4.2182f)
                arcToRelative(3.0561f, 3.0561f, 0.0f, false, false, 4.3591f, 0.0f)
                lineToRelative(3.2919f, -3.3481f)
                arcToRelative(1.207f, 1.207f, 0.0f, false, true, 1.7213f, 0.0f)
                lineToRelative(1.631f, 1.6587f)
                lineToRelative(-4.1473f, 4.2287f)
                arcToRelative(6.5186f, 6.5186f, 0.0f, false, true, -4.6714f, 1.9556f)
                close()
            }
        }
        .build()
        return _semaphoreci!!
    }

private var _semaphoreci: ImageVector? = null
