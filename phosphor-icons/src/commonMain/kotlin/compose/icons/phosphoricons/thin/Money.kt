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

public val ThinGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 60.0f)
                lineTo(24.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 72.0f)
                lineTo(12.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(232.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(244.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 60.0f)
                close()
                moveTo(81.5f, 188.0f)
                lineTo(20.0f, 134.2f)
                lineTo(20.0f, 121.8f)
                lineTo(81.5f, 68.0f)
                horizontalLineToRelative(93.0f)
                lineTo(236.0f, 121.8f)
                verticalLineToRelative(12.4f)
                lineTo(174.5f, 188.0f)
                close()
                moveTo(236.0f, 72.0f)
                verticalLineToRelative(39.2f)
                lineTo(186.6f, 68.0f)
                lineTo(232.0f, 68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 72.0f)
                close()
                moveTo(24.0f, 68.0f)
                lineTo(69.4f, 68.0f)
                lineTo(20.0f, 111.2f)
                lineTo(20.0f, 72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 68.0f)
                close()
                moveTo(20.0f, 184.0f)
                lineTo(20.0f, 144.8f)
                lineTo(69.4f, 188.0f)
                lineTo(24.0f, 188.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 184.0f)
                close()
                moveTo(232.0f, 188.0f)
                lineTo(186.6f, 188.0f)
                lineTo(236.0f, 144.8f)
                lineTo(236.0f, 184.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 232.0f, 188.0f)
                close()
                moveTo(128.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
