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

public val FillGroup.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) {
            return _arrowsIn!!
        }
        _arrowsIn = Builder(name = "ArrowsIn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 104.0f)
                lineTo(144.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.9f, -7.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 8.8f, 1.7f)
                lineTo(172.0f, 72.7f)
                lineToRelative(30.3f, -30.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(183.3f, 84.0f)
                lineToRelative(14.4f, 14.3f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 1.7f, 8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 112.0f)
                lineTo(152.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 104.0f)
                close()
                moveTo(104.0f, 144.0f)
                lineTo(64.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.4f, 4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.7f, 8.8f)
                lineTo(72.7f, 172.0f)
                lineTo(42.3f, 202.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(84.0f, 183.3f)
                lineToRelative(14.3f, 14.4f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 104.0f, 200.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, -0.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 192.0f)
                lineTo(112.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 144.0f)
                close()
                moveTo(183.3f, 172.0f)
                lineTo(197.7f, 157.7f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.7f, -8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 144.0f)
                lineTo(152.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.9f, 7.4f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, 0.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineTo(172.0f, 183.3f)
                lineToRelative(30.3f, 30.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                close()
                moveTo(107.1f, 56.6f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -8.8f, 1.7f)
                lineTo(84.0f, 72.7f)
                lineTo(53.7f, 42.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 42.3f, 53.7f)
                lineTo(72.7f, 84.0f)
                lineTo(58.3f, 98.3f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -1.7f, 8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 112.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(112.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 107.1f, 56.6f)
                close()
            }
        }
        .build()
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
