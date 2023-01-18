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

public val RemixIcons.ExchangeFundsLine: ImageVector
    get() {
        if (_exchangeFundsLine != null) {
            return _exchangeFundsLine!!
        }
        _exchangeFundsLine = Builder(name = "ExchangeFundsLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.375f, 15.103f)
                arcTo(8.001f, 8.001f, 0.0f, false, false, 8.03f, 5.053f)
                lineToRelative(-0.992f, -1.737f)
                arcTo(9.996f, 9.996f, 0.0f, false, true, 17.0f, 3.34f)
                curveToRelative(4.49f, 2.592f, 6.21f, 8.142f, 4.117f, 12.77f)
                lineToRelative(1.342f, 0.774f)
                lineToRelative(-4.165f, 2.214f)
                lineToRelative(-0.165f, -4.714f)
                lineToRelative(1.246f, 0.719f)
                close()
                moveTo(4.625f, 8.897f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, false, 11.345f, 10.05f)
                lineToRelative(0.992f, 1.737f)
                arcTo(9.996f, 9.996f, 0.0f, false, true, 7.0f, 20.66f)
                curveTo(2.51f, 18.068f, 0.79f, 12.518f, 2.883f, 7.89f)
                lineTo(1.54f, 7.117f)
                lineToRelative(4.165f, -2.214f)
                lineToRelative(0.165f, 4.714f)
                lineToRelative(-1.246f, -0.719f)
                close()
                moveTo(13.415f, 14.828f)
                lineTo(10.584f, 12.0f)
                lineToRelative(-2.828f, 2.828f)
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
        return _exchangeFundsLine!!
    }

private var _exchangeFundsLine: ImageVector? = null
