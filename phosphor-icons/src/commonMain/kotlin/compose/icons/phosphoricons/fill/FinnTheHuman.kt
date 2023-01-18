package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) {
            return _finnTheHuman!!
        }
        _finnTheHuman = Builder(name = "FinnTheHuman", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 140.0f)
                close()
                moveTo(164.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 128.0f)
                close()
                moveTo(240.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -72.0f, 72.0f)
                lineTo(88.0f, 216.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -72.0f, -72.0f)
                lineTo(16.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 63.0f, -8.0f)
                horizontalLineToRelative(98.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 63.0f, 8.0f)
                close()
                moveTo(200.0f, 136.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                lineTo(88.0f, 104.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
