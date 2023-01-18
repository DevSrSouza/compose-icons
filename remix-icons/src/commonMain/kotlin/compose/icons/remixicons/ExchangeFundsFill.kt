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

public val RemixIcons.ExchangeFundsFill: ImageVector
    get() {
        if (_exchangeFundsFill != null) {
            return _exchangeFundsFill!!
        }
        _exchangeFundsFill = Builder(name = "ExchangeFundsFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.373f, 4.51f)
                arcTo(9.962f, 9.962f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                arcToRelative(9.954f, 9.954f, 0.0f, false, true, -1.793f, 5.715f)
                lineTo(17.5f, 12.0f)
                lineTo(20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 6.274f, 6.413f)
                lineToRelative(-0.9f, -1.902f)
                close()
                moveTo(18.627f, 19.49f)
                arcTo(9.962f, 9.962f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -2.125f, 0.663f, -4.095f, 1.793f, -5.715f)
                lineTo(6.5f, 12.0f)
                lineTo(4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.726f, 5.587f)
                lineToRelative(0.9f, 1.902f)
                close()
                moveTo(13.414f, 14.828f)
                lineTo(10.586f, 12.0f)
                lineToRelative(-2.829f, 2.828f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(4.243f, -4.242f)
                lineTo(13.414f, 12.0f)
                lineToRelative(2.829f, -2.828f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-4.243f, 4.242f)
                close()
            }
        }
        .build()
        return _exchangeFundsFill!!
    }

private var _exchangeFundsFill: ImageVector? = null
