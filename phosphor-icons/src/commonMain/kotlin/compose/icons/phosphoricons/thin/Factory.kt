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

public val ThinGroup.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 176.0f)
                close()
                moveTo(176.0f, 172.0f)
                lineTo(148.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(244.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(16.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(36.0f, 212.0f)
                lineTo(36.0f, 88.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.2f, -3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.2f, 0.4f)
                lineTo(100.0f, 128.0f)
                lineTo(100.0f, 88.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.2f, -3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.2f, 0.4f)
                lineToRelative(44.1f, 33.1f)
                lineToRelative(12.6f, -87.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 174.9f, 20.0f)
                horizontalLineToRelative(18.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 11.8f, 10.3f)
                lineTo(220.0f, 135.4f)
                lineTo(220.0f, 212.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 216.0f)
                close()
                moveTo(157.8f, 123.4f)
                lineTo(169.3f, 132.0f)
                horizontalLineToRelative(42.1f)
                lineTo(197.0f, 31.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.9f, -3.4f)
                lineTo(174.9f, 28.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.9f, 3.4f)
                close()
                moveTo(44.0f, 212.0f)
                lineTo(212.0f, 212.0f)
                lineTo(212.0f, 140.0f)
                lineTo(168.0f, 140.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.4f, -0.8f)
                lineTo(108.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.2f, 3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.2f, -0.4f)
                lineTo(44.0f, 96.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null
