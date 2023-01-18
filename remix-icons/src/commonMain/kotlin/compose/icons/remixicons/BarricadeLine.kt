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

public val RemixIcons.BarricadeLine: ImageVector
    get() {
        if (_barricadeLine != null) {
            return _barricadeLine!!
        }
        _barricadeLine = Builder(name = "BarricadeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.493f, 19.0f)
                horizontalLineToRelative(11.014f)
                lineToRelative(-0.667f, -3.0f)
                lineTo(7.16f, 16.0f)
                lineToRelative(-0.667f, 3.0f)
                close()
                moveTo(19.556f, 19.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.444f)
                lineTo(7.826f, 3.783f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.802f, 3.0f)
                horizontalLineToRelative(6.396f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.976f, 0.783f)
                lineTo(19.556f, 19.0f)
                close()
                moveTo(7.604f, 14.0f)
                horizontalLineToRelative(8.792f)
                lineToRelative(-0.89f, -4.0f)
                lineTo(8.494f, 10.0f)
                lineToRelative(-0.889f, 4.0f)
                close()
                moveTo(8.938f, 8.0f)
                horizontalLineToRelative(6.124f)
                lineToRelative(-0.666f, -3.0f)
                lineTo(9.604f, 5.0f)
                lineToRelative(-0.666f, 3.0f)
                close()
            }
        }
        .build()
        return _barricadeLine!!
    }

private var _barricadeLine: ImageVector? = null
