package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Nordvpn: ImageVector
    get() {
        if (_nordvpn != null) {
            return _nordvpn!!
        }
        _nordvpn = Builder(name = "Nordvpn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2838f, 21.5414f)
                arcTo(11.9866f, 11.9866f, 0.0f, false, true, 0.0f, 14.4832f)
                curveTo(0.0f, 7.8418f, 5.3727f, 2.4586f, 12.0f, 2.4586f)
                curveToRelative(6.6279f, 0.0f, 12.0f, 5.3832f, 12.0f, 12.0246f)
                arcToRelative(11.9853f, 11.9853f, 0.0f, false, true, -2.2838f, 7.0582f)
                lineToRelative(-5.7636f, -9.3783f)
                lineToRelative(-0.5565f, 0.9419f)
                lineToRelative(0.5645f, 2.6186f)
                lineTo(12.0f, 8.9338f)
                lineToRelative(-2.45f, 4.1447f)
                lineToRelative(0.5707f, 2.6451f)
                lineToRelative(-2.0764f, -3.5555f)
                lineToRelative(-5.7605f, 9.3733f)
                close()
            }
        }
        .build()
        return _nordvpn!!
    }

private var _nordvpn: ImageVector? = null
