package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) {
            return _finnTheHuman!!
        }
        _finnTheHuman = Builder(name = "FinnTheHuman", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 96.0f)
                lineTo(88.0f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                verticalLineToRelative(-8.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 168.0f, 96.0f)
                close()
                moveTo(192.0f, 144.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(88.0f, 168.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 24.0f, 24.0f)
                close()
                moveTo(176.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 140.0f)
                close()
                moveTo(104.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 140.0f)
                close()
                moveTo(208.0f, 32.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -31.0f, 24.0f)
                lineTo(79.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -63.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, 72.0f, 72.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, 72.0f, -72.0f)
                lineTo(240.0f, 64.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(224.0f, 144.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, 56.0f)
                lineTo(88.0f, 200.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, -56.0f)
                lineTo(32.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(184.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
