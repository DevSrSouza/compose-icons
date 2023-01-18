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

public val RemixIcons.VipCrown2Line: ImageVector
    get() {
        if (_vipCrown2Line != null) {
            return _vipCrown2Line!!
        }
        _vipCrown2Line = Builder(name = "VipCrown2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.492f, 8.065f)
                lineTo(4.778f, 19.0f)
                horizontalLineToRelative(14.444f)
                lineToRelative(1.286f, -10.935f)
                lineToRelative(-4.01f, 2.673f)
                lineTo(12.0f, 4.441f)
                lineToRelative(-4.498f, 6.297f)
                lineToRelative(-4.01f, -2.673f)
                close()
                moveTo(2.801f, 5.2f)
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
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _vipCrown2Line!!
    }

private var _vipCrown2Line: ImageVector? = null
