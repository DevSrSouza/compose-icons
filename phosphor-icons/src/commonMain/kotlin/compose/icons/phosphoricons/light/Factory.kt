package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(80.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(28.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 114.0f, 176.0f)
                close()
                moveTo(176.0f, 170.0f)
                lineTo(148.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(246.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(16.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(34.0f, 210.0f)
                lineTo(34.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.3f, -5.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.3f, 0.6f)
                lineTo(98.0f, 124.0f)
                lineTo(98.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.3f, -5.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.3f, 0.6f)
                lineTo(149.0f, 114.3f)
                lineTo(161.1f, 30.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 13.8f, -12.0f)
                horizontalLineToRelative(18.2f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 13.8f, 12.0f)
                lineToRelative(15.0f, 105.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.1f, 0.3f)
                verticalLineToRelative(0.3f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(74.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 216.0f)
                close()
                moveTo(160.0f, 122.5f)
                lineTo(170.0f, 130.0f)
                horizontalLineToRelative(39.1f)
                lineTo(195.0f, 31.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.9f, -1.7f)
                lineTo(174.9f, 30.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.9f, 1.7f)
                close()
                moveTo(46.0f, 210.0f)
                lineTo(210.0f, 210.0f)
                lineTo(210.0f, 142.0f)
                lineTo(168.0f, 142.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.6f, -1.2f)
                lineTo(150.0f, 130.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-40.0f, -30.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.3f, 5.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.3f, -0.6f)
                lineTo(46.0f, 100.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null
