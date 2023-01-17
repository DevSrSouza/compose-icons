package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Play16: ImageVector
    get() {
        if (_play16 != null) {
            return _play16!!
        }
        _play16 = Builder(name = "Play16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(1.5f, 8.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -13.0f, 0.0f)
                close()
                moveTo(6.379f, 5.227f)
                lineTo(10.643f, 7.786f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.428f)
                lineToRelative(-4.264f, 2.559f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 6.0f, 10.559f)
                lineTo(6.0f, 5.442f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.379f, -0.215f)
                close()
            }
        }
        .build()
        return _play16!!
    }

private var _play16: ImageVector? = null
