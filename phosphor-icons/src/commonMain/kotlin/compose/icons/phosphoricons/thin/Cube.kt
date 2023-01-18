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

public val ThinGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.4f, 72.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, false, -4.5f, -4.4f)
                lineToRelative(-88.0f, -49.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -11.8f, 0.0f)
                lineToRelative(-88.0f, 49.5f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, false, -4.5f, 4.4f)
                horizontalLineToRelative(0.0f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 28.0f, 78.7f)
                verticalLineToRelative(98.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 6.1f, 10.5f)
                lineToRelative(88.0f, 49.5f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 5.6f, 1.5f)
                horizontalLineToRelative(0.6f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 5.6f, -1.5f)
                lineToRelative(88.0f, -49.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 6.1f, -10.5f)
                lineTo(228.0f, 78.7f)
                arcTo(12.5f, 12.5f, 0.0f, false, false, 226.4f, 72.7f)
                close()
                moveTo(126.0f, 25.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 4.0f, 0.0f)
                lineTo(215.9f, 74.0f)
                lineToRelative(-87.0f, 49.4f)
                lineTo(40.2f, 74.0f)
                close()
                moveTo(38.0f, 180.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -3.5f)
                lineTo(36.0f, 80.8f)
                lineToRelative(88.9f, 49.5f)
                lineToRelative(-0.8f, 98.9f)
                close()
                moveTo(218.0f, 180.8f)
                lineTo(132.1f, 229.1f)
                lineTo(132.9f, 130.3f)
                lineTo(220.0f, 80.9f)
                verticalLineToRelative(96.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 218.0f, 180.8f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
