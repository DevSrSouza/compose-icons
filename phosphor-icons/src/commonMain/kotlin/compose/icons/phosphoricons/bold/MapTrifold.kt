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

public val BoldGroup.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) {
            return _mapTrifold!!
        }
        _mapTrifold = Builder(name = "MapTrifold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.5f, 46.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -10.3f, -2.1f)
                lineTo(161.5f, 59.3f)
                lineToRelative(-60.0f, -30.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-1.3f, -0.5f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-1.2f, -0.3f)
                lineTo(97.0f, 28.5f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, false, -2.8f, 0.2f)
                horizontalLineToRelative(-0.4f)
                lineToRelative(-0.6f, 0.2f)
                lineToRelative(-64.0f, 16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.1f, 56.0f)
                lineTo(20.1f, 200.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 4.6f, 9.5f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, false, 7.4f, 2.5f)
                arcToRelative(9.2f, 9.2f, 0.0f, false, false, 2.9f, -0.4f)
                lineToRelative(59.7f, -14.9f)
                lineToRelative(60.0f, 30.0f)
                horizontalLineToRelative(0.2f)
                lineToRelative(1.0f, 0.4f)
                horizontalLineToRelative(0.2f)
                lineToRelative(1.2f, 0.4f)
                horizontalLineToRelative(0.2f)
                lineToRelative(1.1f, 0.2f)
                horizontalLineToRelative(3.6f)
                lineToRelative(0.8f, -0.2f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.1f, -11.6f)
                lineTo(236.1f, 56.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 231.5f, 46.5f)
                close()
                moveTo(44.1f, 65.4f)
                lineToRelative(40.0f, -10.0f)
                lineTo(84.1f, 174.6f)
                lineToRelative(-40.0f, 10.0f)
                close()
                moveTo(148.1f, 196.6f)
                lineTo(108.1f, 176.6f)
                lineTo(108.1f, 59.4f)
                lineToRelative(40.0f, 20.0f)
                close()
                moveTo(212.1f, 190.6f)
                lineTo(172.1f, 200.6f)
                lineTo(172.1f, 81.4f)
                lineToRelative(40.0f, -10.0f)
                close()
            }
        }
        .build()
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
