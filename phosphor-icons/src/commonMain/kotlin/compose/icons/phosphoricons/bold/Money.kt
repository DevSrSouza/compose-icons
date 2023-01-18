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

public val BoldGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 52.0f)
                lineTo(24.0f, 52.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 4.0f, 72.0f)
                lineTo(4.0f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(232.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(252.0f, 72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 232.0f, 52.0f)
                close()
                moveTo(92.6f, 180.0f)
                lineTo(34.1f, 128.0f)
                lineTo(92.6f, 76.0f)
                horizontalLineToRelative(70.8f)
                lineToRelative(58.5f, 52.0f)
                lineToRelative(-58.5f, 52.0f)
                close()
                moveTo(228.0f, 101.3f)
                lineTo(199.6f, 76.0f)
                lineTo(228.0f, 76.0f)
                close()
                moveTo(56.4f, 76.0f)
                lineTo(28.0f, 101.3f)
                lineTo(28.0f, 76.0f)
                close()
                moveTo(28.0f, 154.7f)
                lineTo(56.4f, 180.0f)
                lineTo(28.0f, 180.0f)
                close()
                moveTo(199.6f, 180.0f)
                lineTo(228.0f, 154.7f)
                lineTo(228.0f, 180.0f)
                close()
                moveTo(128.0f, 88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 88.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
