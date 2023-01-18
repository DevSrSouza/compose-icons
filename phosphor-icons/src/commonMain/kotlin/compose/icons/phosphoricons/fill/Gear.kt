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

public val FillGroup.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.8f, 150.4f)
                lineToRelative(-14.9f, -19.8f)
                curveToRelative(0.1f, -1.8f, 0.0f, -3.7f, 0.0f, -5.1f)
                lineToRelative(14.9f, -19.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 1.3f, -6.9f)
                arcToRelative(114.8f, 114.8f, 0.0f, false, false, -10.9f, -26.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -5.8f, -4.0f)
                lineToRelative(-24.5f, -3.5f)
                lineToRelative(-3.7f, -3.7f)
                lineToRelative(-3.5f, -24.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -4.0f, -5.8f)
                arcToRelative(114.8f, 114.8f, 0.0f, false, false, -26.4f, -10.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -6.9f, 1.3f)
                lineTo(130.6f, 36.0f)
                horizontalLineToRelative(-5.2f)
                lineTo(105.6f, 21.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -6.9f, -1.3f)
                arcTo(114.8f, 114.8f, 0.0f, false, false, 72.3f, 30.8f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -4.0f, 5.8f)
                lineTo(64.8f, 61.1f)
                lineToRelative(-3.7f, 3.7f)
                lineTo(36.6f, 68.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -5.8f, 4.0f)
                arcTo(114.8f, 114.8f, 0.0f, false, false, 19.9f, 98.7f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 1.3f, 6.9f)
                lineToRelative(14.9f, 19.8f)
                verticalLineToRelative(5.1f)
                lineTo(21.2f, 150.4f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -1.3f, 6.9f)
                arcToRelative(114.8f, 114.8f, 0.0f, false, false, 10.9f, 26.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.8f, 4.0f)
                lineToRelative(24.5f, 3.5f)
                lineToRelative(3.7f, 3.7f)
                lineToRelative(3.5f, 24.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 4.0f, 5.8f)
                arcToRelative(114.8f, 114.8f, 0.0f, false, false, 26.4f, 10.9f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 2.1f, 0.3f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, -1.6f)
                lineTo(125.4f, 220.0f)
                horizontalLineToRelative(5.2f)
                lineToRelative(19.8f, 14.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 6.9f, 1.3f)
                arcToRelative(114.8f, 114.8f, 0.0f, false, false, 26.4f, -10.9f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 4.0f, -5.8f)
                lineToRelative(3.5f, -24.6f)
                curveToRelative(1.2f, -1.2f, 2.6f, -2.5f, 3.6f, -3.6f)
                lineToRelative(24.6f, -3.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.8f, -4.0f)
                arcToRelative(114.8f, 114.8f, 0.0f, false, false, 10.9f, -26.4f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 234.8f, 150.4f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
