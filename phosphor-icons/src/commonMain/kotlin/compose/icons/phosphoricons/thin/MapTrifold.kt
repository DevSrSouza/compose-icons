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

public val ThinGroup.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) {
            return _mapTrifold!!
        }
        _mapTrifold = Builder(name = "MapTrifold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.6f, 52.8f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -3.5f, -0.7f)
                lineTo(160.6f, 67.8f)
                lineTo(97.9f, 36.4f)
                lineTo(95.1f, 36.4f)
                lineToRelative(-64.0f, 16.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.0f, 3.9f)
                lineTo(28.1f, 200.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 1.6f, 3.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.4f, 0.8f)
                horizontalLineToRelative(1.0f)
                lineToRelative(62.5f, -15.7f)
                lineToRelative(62.7f, 31.4f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.7f, 0.3f)
                horizontalLineToRelative(2.0f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.0f, -3.9f)
                lineTo(228.1f, 56.0f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 226.6f, 52.8f)
                close()
                moveTo(36.1f, 59.1f)
                lineToRelative(56.0f, -14.0f)
                lineTo(92.1f, 180.9f)
                lineToRelative(-56.0f, 14.0f)
                close()
                moveTo(156.1f, 209.5f)
                lineTo(100.1f, 181.5f)
                lineTo(100.1f, 46.5f)
                lineToRelative(56.0f, 28.0f)
                close()
                moveTo(220.1f, 196.9f)
                lineTo(164.1f, 210.9f)
                lineTo(164.1f, 75.1f)
                lineToRelative(56.0f, -14.0f)
                close()
            }
        }
        .build()
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
