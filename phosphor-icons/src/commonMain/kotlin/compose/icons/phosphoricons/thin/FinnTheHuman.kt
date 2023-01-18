package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) {
            return _finnTheHuman!!
        }
        _finnTheHuman = Builder(name = "FinnTheHuman", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 100.0f)
                lineTo(88.0f, 100.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                verticalLineToRelative(-8.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 168.0f, 100.0f)
                close()
                moveTo(196.0f, 144.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(88.0f, 172.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, 28.0f)
                close()
                moveTo(172.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 140.0f)
                close()
                moveTo(100.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 140.0f)
                close()
                moveTo(208.0f, 36.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -27.7f, 24.0f)
                lineTo(75.7f, 60.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 20.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 68.0f, 68.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 68.0f, -68.0f)
                lineTo(236.0f, 64.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(228.0f, 144.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -60.0f, 60.0f)
                lineTo(88.0f, 204.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -60.0f, -60.0f)
                lineTo(28.0f, 64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(184.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                close()
            }
        }
        .build()
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
