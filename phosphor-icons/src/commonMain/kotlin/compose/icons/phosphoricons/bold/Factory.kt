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

public val BoldGroup.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(80.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 176.0f)
                close()
                moveTo(176.0f, 164.0f)
                lineTo(148.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(252.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(16.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(28.0f, 204.0f)
                lineTo(28.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.2f, -9.6f)
                lineTo(92.0f, 112.0f)
                lineTo(92.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.2f, -9.6f)
                lineToRelative(33.3f, 25.0f)
                lineToRelative(10.6f, -74.2f)
                arcTo(20.2f, 20.2f, 0.0f, false, true, 174.9f, 12.0f)
                horizontalLineToRelative(18.2f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, 19.8f, 17.2f)
                lineToRelative(15.0f, 105.1f)
                verticalLineToRelative(0.2f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, 0.1f, 0.6f)
                lineTo(228.0f, 204.0f)
                horizontalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 216.0f)
                close()
                moveTo(166.4f, 119.8f)
                lineTo(172.0f, 124.0f)
                horizontalLineToRelative(30.2f)
                lineTo(189.6f, 36.0f)
                lineTo(178.4f, 36.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(204.0f, 204.0f)
                lineTo(204.0f, 148.0f)
                lineTo(168.0f, 148.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -7.2f, -2.4f)
                lineToRelative(-14.4f, -10.8f)
                horizontalLineToRelative(0.0f)
                lineTo(116.0f, 112.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.2f, 9.6f)
                lineTo(52.0f, 112.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null
