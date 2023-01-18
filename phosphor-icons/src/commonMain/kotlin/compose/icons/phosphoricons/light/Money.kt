package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 58.0f)
                lineTo(24.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 72.0f)
                lineTo(10.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(232.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(246.0f, 72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 58.0f)
                close()
                moveTo(82.3f, 186.0f)
                lineTo(22.0f, 133.3f)
                lineTo(22.0f, 122.7f)
                lineTo(82.3f, 70.0f)
                horizontalLineToRelative(91.4f)
                lineTo(234.0f, 122.7f)
                verticalLineToRelative(10.6f)
                lineTo(173.7f, 186.0f)
                close()
                moveTo(234.0f, 72.0f)
                verticalLineToRelative(34.8f)
                lineTo(192.0f, 70.0f)
                horizontalLineToRelative(40.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 234.0f, 72.0f)
                close()
                moveTo(24.0f, 70.0f)
                lineTo(64.0f, 70.0f)
                lineTo(22.0f, 106.8f)
                lineTo(22.0f, 72.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 70.0f)
                close()
                moveTo(22.0f, 184.0f)
                lineTo(22.0f, 149.2f)
                lineTo(64.0f, 186.0f)
                lineTo(24.0f, 186.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 184.0f)
                close()
                moveTo(232.0f, 186.0f)
                lineTo(192.0f, 186.0f)
                lineToRelative(42.0f, -36.8f)
                lineTo(234.0f, 184.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 232.0f, 186.0f)
                close()
                moveTo(128.0f, 90.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 90.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 128.0f, 154.0f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
