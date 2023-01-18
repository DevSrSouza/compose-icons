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

public val FillGroup.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) {
            return _arrowsOut!!
        }
        _arrowsOut = Builder(name = "ArrowsOut", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.9f, 7.4f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.1f, 0.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, -2.3f)
                lineTo(188.0f, 79.3f)
                lineToRelative(-30.3f, 30.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(176.7f, 68.0f)
                lineTo(162.3f, 53.7f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, -8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 40.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                close()
                moveTo(98.3f, 146.3f)
                lineTo(68.0f, 176.7f)
                lineTo(53.7f, 162.3f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -8.8f, -1.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 168.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(88.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.4f, -4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -1.7f, -8.8f)
                lineTo(79.3f, 188.0f)
                lineToRelative(30.4f, -30.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                close()
                moveTo(211.1f, 160.6f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -8.8f, 1.7f)
                lineTo(188.0f, 176.7f)
                lineToRelative(-30.3f, -30.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineTo(176.7f, 188.0f)
                lineToRelative(-14.4f, 14.3f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -1.7f, 8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 216.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 211.1f, 160.6f)
                close()
                moveTo(79.3f, 68.0f)
                lineTo(93.7f, 53.7f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.7f, -8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(40.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.9f, 7.4f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 48.0f, 96.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineTo(68.0f, 79.3f)
                lineToRelative(30.3f, 30.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                close()
            }
        }
        .build()
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
