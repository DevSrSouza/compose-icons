package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) {
            return _finnTheHuman!!
        }
        _finnTheHuman = Builder(name = "FinnTheHuman", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 88.0f)
                lineTo(88.0f, 88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -44.0f, 44.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(212.0f, 132.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 168.0f, 88.0f)
                close()
                moveTo(188.0f, 148.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(88.0f, 168.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(68.0f, 132.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(176.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 140.0f)
                close()
                moveTo(112.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 140.0f)
                close()
                moveTo(212.0f, 28.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -33.9f, 24.0f)
                lineTo(77.9f, 52.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 8.0f, 64.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, 76.0f, 76.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, 76.0f, -76.0f)
                lineTo(248.0f, 64.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 212.0f, 28.0f)
                close()
                moveTo(224.0f, 152.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, 52.0f)
                lineTo(84.0f, 204.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, -52.0f)
                lineTo(32.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 76.0f)
                lineTo(188.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
