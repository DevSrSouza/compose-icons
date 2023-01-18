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

public val RemixIcons.BearSmileFill: ImageVector
    get() {
        if (_bearSmileFill != null) {
            return _bearSmileFill!!
        }
        _bearSmileFill = Builder(name = "BearSmileFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.951f, 7.897f)
                curveToRelative(0.355f, 0.967f, 0.549f, 2.013f, 0.549f, 3.103f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 3.55f, 9.897f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 6.791f, -5.744f)
                arcToRelative(9.05f, 9.05f, 0.0f, false, true, 3.32f, 0.0f)
                arcTo(4.494f, 4.494f, 0.0f, false, true, 17.5f, 2.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineTo(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.995f, 0.2f)
                lineTo(16.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.995f, 0.15f)
                lineTo(10.0f, 13.0f)
                close()
            }
        }
        .build()
        return _bearSmileFill!!
    }

private var _bearSmileFill: ImageVector? = null
