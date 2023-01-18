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

public val RemixIcons.VipCrown2Fill: ImageVector
    get() {
        if (_vipCrown2Fill != null) {
            return _vipCrown2Fill!!
        }
        _vipCrown2Fill = Builder(name = "VipCrown2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8f, 5.2f)
                lineTo(7.0f, 8.0f)
                lineToRelative(4.186f, -5.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.628f, 0.0f)
                lineTo(17.0f, 8.0f)
                lineToRelative(4.2f, -2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.547f, 0.95f)
                lineToRelative(-1.643f, 13.967f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, 0.883f)
                horizontalLineTo(3.889f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineTo(1.253f, 6.149f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.8f, 5.2f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _vipCrown2Fill!!
    }

private var _vipCrown2Fill: ImageVector? = null
