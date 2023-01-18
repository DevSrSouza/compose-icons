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

public val RemixIcons.StarSmileFill: ImageVector
    get() {
        if (_starSmileFill != null) {
            return _starSmileFill!!
        }
        _starSmileFill = Builder(name = "StarSmileFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(10.0f, 12.0f)
                horizontalLineTo(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.995f, 0.2f)
                lineTo(16.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.995f, 0.15f)
                lineTo(10.0f, 12.0f)
                close()
            }
        }
        .build()
        return _starSmileFill!!
    }

private var _starSmileFill: ImageVector? = null
