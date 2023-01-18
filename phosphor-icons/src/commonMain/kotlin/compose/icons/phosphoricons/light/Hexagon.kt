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

public val LightGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 236.8f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, -6.9f, -1.8f)
                lineToRelative(-84.0f, -47.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 30.0f, 175.3f)
                lineTo(30.0f, 80.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 7.1f, -12.2f)
                lineToRelative(84.0f, -47.5f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 13.8f, 0.0f)
                lineToRelative(84.0f, 47.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 226.0f, 80.7f)
                verticalLineToRelative(94.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -7.1f, 12.2f)
                lineToRelative(-84.0f, 47.5f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 128.0f, 236.8f)
                close()
                moveTo(128.0f, 31.2f)
                lineTo(127.0f, 31.4f)
                lineTo(43.0f, 78.9f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.0f, 1.8f)
                verticalLineToRelative(94.6f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 1.0f, 1.8f)
                lineToRelative(84.0f, 47.5f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 2.0f, 0.0f)
                lineToRelative(84.0f, -47.5f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 1.0f, -1.8f)
                lineTo(214.0f, 80.7f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.0f, -1.8f)
                lineTo(129.0f, 31.4f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
