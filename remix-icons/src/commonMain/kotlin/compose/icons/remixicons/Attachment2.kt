package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Attachment2: ImageVector
    get() {
        if (_attachment2 != null) {
            return _attachment2!!
        }
        _attachment2 = Builder(name = "Attachment2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 7.757f)
                lineToRelative(-5.656f, 5.657f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(5.657f, -5.656f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 12.0f, 4.929f)
                lineToRelative(-5.657f, 5.657f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 7.071f, 7.07f)
                lineTo(19.071f, 12.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.657f, 5.657f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -9.9f, -9.9f)
                lineToRelative(5.658f, -5.656f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.07f, 7.07f)
                lineTo(12.0f, 16.244f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 7.757f, 12.0f)
                lineToRelative(5.657f, -5.657f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _attachment2!!
    }

private var _attachment2: ImageVector? = null
