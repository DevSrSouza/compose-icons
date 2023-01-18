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

public val ThinGroup.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) {
            return _pencilCircle!!
        }
        _pencilCircle = Builder(name = "PencilCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.7f, 57.3f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 57.3f, 198.7f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.7f, 57.3f)
                close()
                moveTo(104.7f, 132.0f)
                horizontalLineToRelative(46.6f)
                lineToRelative(17.3f, 37.4f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -40.6f, 8.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -40.6f, -8.2f)
                close()
                moveTo(108.4f, 124.0f)
                lineTo(128.0f, 81.5f)
                lineTo(147.6f, 124.0f)
                close()
                moveTo(132.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(16.8f)
                arcToRelative(90.8f, 90.8f, 0.0f, false, true, -40.0f, 11.1f)
                close()
                moveTo(84.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(27.9f)
                arcToRelative(90.8f, 90.8f, 0.0f, false, true, -40.0f, -11.1f)
                close()
                moveTo(193.1f, 193.1f)
                arcTo(102.9f, 102.9f, 0.0f, false, true, 180.0f, 203.9f)
                lineTo(180.0f, 176.0f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -0.4f, -1.7f)
                lineToRelative(-48.0f, -104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.2f, 0.0f)
                lineToRelative(-48.0f, 104.0f)
                arcTo(3.3f, 3.3f, 0.0f, false, false, 76.0f, 176.0f)
                verticalLineToRelative(27.9f)
                arcToRelative(102.9f, 102.9f, 0.0f, false, true, -13.1f, -10.8f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 130.2f, 0.0f)
                close()
            }
        }
        .build()
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
