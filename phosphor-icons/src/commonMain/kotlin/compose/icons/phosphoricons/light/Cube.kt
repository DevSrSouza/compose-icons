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

public val LightGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.2f, 71.8f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, -5.2f, -5.1f)
                lineTo(134.9f, 17.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -13.8f, 0.0f)
                lineToRelative(-88.0f, 49.5f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, -5.2f, 5.1f)
                horizontalLineToRelative(-0.1f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 26.0f, 78.7f)
                verticalLineToRelative(98.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.1f, 12.2f)
                lineToRelative(88.0f, 49.5f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, 6.1f, 1.8f)
                horizontalLineToRelative(1.7f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, 6.0f, -1.8f)
                lineToRelative(88.0f, -49.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.1f, -12.2f)
                lineTo(230.0f, 78.7f)
                arcTo(14.5f, 14.5f, 0.0f, false, false, 228.2f, 71.8f)
                close()
                moveTo(127.0f, 27.4f)
                lineToRelative(1.0f, -0.2f)
                lineToRelative(1.0f, 0.2f)
                lineTo(211.8f, 74.0f)
                lineToRelative(-82.9f, 47.1f)
                lineTo(44.3f, 74.0f)
                close()
                moveTo(39.0f, 179.1f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -1.0f, -1.8f)
                lineTo(38.0f, 84.2f)
                lineToRelative(84.9f, 47.3f)
                lineToRelative(-0.8f, 94.3f)
                close()
                moveTo(217.0f, 179.1f)
                lineTo(134.1f, 225.7f)
                lineTo(134.9f, 131.5f)
                lineTo(218.0f, 84.3f)
                verticalLineToRelative(93.0f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 217.0f, 179.1f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
