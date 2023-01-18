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

public val RemixIcons.RedPacketLine: ImageVector
    get() {
        if (_redPacketLine != null) {
            return _redPacketLine!!
        }
        _redPacketLine = Builder(name = "RedPacketLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.173f, 9.763f)
                arcTo(9.98f, 9.98f, 0.0f, false, false, 19.0f, 7.141f)
                lineTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(3.141f)
                arcToRelative(9.98f, 9.98f, 0.0f, false, false, 4.827f, 2.622f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.346f, 0.0f)
                close()
                moveTo(14.381f, 11.763f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, -4.762f, 0.0f)
                arcTo(11.94f, 11.94f, 0.0f, false, true, 5.0f, 9.749f)
                lineTo(5.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 9.748f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, -4.619f, 2.016f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _redPacketLine!!
    }

private var _redPacketLine: ImageVector? = null
