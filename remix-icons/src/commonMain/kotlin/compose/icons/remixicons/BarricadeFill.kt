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

public val RemixIcons.BarricadeFill: ImageVector
    get() {
        if (_barricadeFill != null) {
            return _barricadeFill!!
        }
        _barricadeFill = Builder(name = "BarricadeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.556f, 19.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.444f)
                lineToRelative(0.89f, -4.0f)
                horizontalLineToRelative(13.333f)
                lineToRelative(0.889f, 4.0f)
                close()
                moveTo(17.333f, 9.0f)
                lineToRelative(0.89f, 4.0f)
                lineTo(5.777f, 13.0f)
                lineToRelative(0.889f, -4.0f)
                horizontalLineToRelative(10.666f)
                close()
                moveTo(16.889f, 7.0f)
                lineTo(7.11f, 7.0f)
                lineToRelative(0.715f, -3.217f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.802f, 3.0f)
                horizontalLineToRelative(6.396f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.976f, 0.783f)
                lineTo(16.889f, 7.0f)
                close()
            }
        }
        .build()
        return _barricadeFill!!
    }

private var _barricadeFill: ImageVector? = null
