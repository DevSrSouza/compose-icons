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

public val LightGroup.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) {
            return _shuffleSimple!!
        }
        _shuffleSimple = Builder(name = "ShuffleSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 48.0f)
                lineTo(214.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(202.0f, 62.5f)
                lineToRelative(-47.1f, 47.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.5f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, -8.5f)
                lineTo(193.5f, 54.0f)
                lineTo(168.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(41.2f)
                lineToRelative(1.0f, 0.3f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.1f, 0.1f)
                lineToRelative(1.0f, 0.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 1.7f, 1.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, true, 0.5f, 1.0f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.3f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 214.0f, 48.0f)
                close()
                moveTo(208.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(25.5f)
                lineTo(52.2f, 43.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineTo(193.5f, 202.0f)
                lineTo(168.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(41.2f)
                lineToRelative(1.0f, -0.3f)
                horizontalLineToRelative(0.1f)
                lineToRelative(1.0f, -0.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 1.7f, -1.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.5f, -1.0f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.1f, -0.1f)
                lineToRelative(0.3f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.1f, -1.1f)
                lineTo(214.0f, 168.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 162.0f)
                close()
                moveTo(101.1f, 146.4f)
                lineTo(43.8f, 203.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineToRelative(57.4f, -57.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, -8.5f)
                close()
            }
        }
        .build()
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
