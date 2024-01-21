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

public val SimpleIcons.Meilisearch: ImageVector
    get() {
        if (_meilisearch != null) {
            return _meilisearch!!
        }
        _meilisearch = Builder(name = "Meilisearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.505f, 18.998f)
                lineToRelative(4.434f, -11.345f)
                arcToRelative(4.168f, 4.168f, 0.0f, false, true, 3.882f, -2.651f)
                horizontalLineToRelative(2.674f)
                lineToRelative(-4.434f, 11.345f)
                arcToRelative(4.169f, 4.169f, 0.0f, false, true, -3.883f, 2.651f)
                lineTo(6.505f, 18.998f)
                close()
                moveTo(13.01f, 18.998f)
                lineTo(17.444f, 7.653f)
                arcToRelative(4.169f, 4.169f, 0.0f, false, true, 3.883f, -2.651f)
                lineTo(24.0f, 5.002f)
                lineToRelative(-4.434f, 11.345f)
                arcToRelative(4.168f, 4.168f, 0.0f, false, true, -3.882f, 2.651f)
                lineTo(13.01f, 18.998f)
                close()
                moveTo(0.0f, 18.998f)
                lineTo(4.434f, 7.653f)
                arcToRelative(4.168f, 4.168f, 0.0f, false, true, 3.882f, -2.651f)
                horizontalLineToRelative(2.674f)
                lineTo(6.556f, 16.347f)
                arcToRelative(4.169f, 4.169f, 0.0f, false, true, -3.883f, 2.651f)
                lineTo(0.0f, 18.998f)
                close()
            }
        }
        .build()
        return _meilisearch!!
    }

private var _meilisearch: ImageVector? = null
