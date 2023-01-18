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

public val RegularGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.7f, 73.5f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 222.0f, 71.2f)
                lineTo(171.4f, 93.7f)
                lineTo(142.0f, 40.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -28.0f, 0.0f)
                lineToRelative(-29.4f, 53.0f)
                lineTo(34.0f, 71.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 11.9f, 89.5f)
                lineTo(37.3f, 197.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 7.4f, 10.1f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 8.3f, 2.3f)
                arcToRelative(15.2f, 15.2f, 0.0f, false, false, 4.2f, -0.6f)
                arcToRelative(265.5f, 265.5f, 0.0f, false, true, 141.5f, 0.0f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 12.5f, -1.7f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, 7.4f, -10.1f)
                lineTo(244.1f, 89.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 238.7f, 73.5f)
                close()
                moveTo(203.0f, 194.2f)
                arcToRelative(281.2f, 281.2f, 0.0f, false, false, -150.1f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(27.5f, 85.9f)
                lineToRelative(50.6f, 22.4f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 20.4f, -6.8f)
                lineToRelative(29.5f, -53.0f)
                lineToRelative(29.5f, 53.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 20.4f, 6.8f)
                lineToRelative(50.6f, -22.4f)
                close()
                moveTo(168.0f, 162.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -8.0f, 7.2f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(309.8f, 309.8f, 0.0f, false, false, -62.4f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.8f, -7.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 7.2f, -8.8f)
                arcToRelative(312.7f, 312.7f, 0.0f, false, true, 65.6f, 0.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 168.0f, 162.5f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
