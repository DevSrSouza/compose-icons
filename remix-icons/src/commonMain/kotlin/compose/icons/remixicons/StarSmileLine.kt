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

public val RemixIcons.StarSmileLine: ImageVector
    get() {
        if (_starSmileLine != null) {
            return _starSmileLine!!
        }
        _starSmileLine = Builder(name = "StarSmileLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.5f)
                lineToRelative(4.226f, 6.183f)
                lineToRelative(7.187f, 2.109f)
                lineToRelative(-4.575f, 5.93f)
                lineToRelative(0.215f, 7.486f)
                lineTo(12.0f, 19.69f)
                lineToRelative(-7.053f, 2.518f)
                lineToRelative(0.215f, -7.486f)
                lineToRelative(-4.575f, -5.93f)
                lineToRelative(7.187f, -2.109f)
                lineTo(12.0f, 0.5f)
                close()
                moveTo(12.0f, 4.044f)
                lineTo(9.022f, 8.402f)
                lineTo(3.957f, 9.887f)
                lineToRelative(3.225f, 4.178f)
                lineToRelative(-0.153f, 5.275f)
                lineTo(12.0f, 17.566f)
                lineToRelative(4.97f, 1.774f)
                lineToRelative(-0.152f, -5.275f)
                lineToRelative(3.224f, -4.178f)
                lineToRelative(-5.064f, -1.485f)
                lineTo(12.0f, 4.044f)
                close()
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _starSmileLine!!
    }

private var _starSmileLine: ImageVector? = null
