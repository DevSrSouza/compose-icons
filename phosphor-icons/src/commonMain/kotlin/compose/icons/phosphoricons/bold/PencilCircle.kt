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

public val BoldGroup.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) {
            return _pencilCircle!!
        }
        _pencilCircle = Builder(name = "PencilCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.2f, 221.4f)
                arcToRelative(112.0f, 112.0f, 0.0f, false, false, 22.2f, -17.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, -152.8f, 0.0f)
                arcToRelative(111.4f, 111.4f, 0.0f, false, false, 22.1f, 17.0f)
                lineToRelative(0.8f, 0.4f)
                arcToRelative(107.8f, 107.8f, 0.0f, false, false, 52.2f, 14.1f)
                horizontalLineToRelative(2.6f)
                arcToRelative(107.8f, 107.8f, 0.0f, false, false, 52.2f, -14.1f)
                close()
                moveTo(106.1f, 148.0f)
                horizontalLineToRelative(43.8f)
                lineToRelative(7.5f, 16.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -5.4f, -0.4f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -24.0f, 9.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -24.0f, -9.2f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -5.4f, 0.4f)
                close()
                moveTo(117.2f, 124.0f)
                lineTo(128.0f, 100.6f)
                lineTo(138.8f, 124.0f)
                close()
                moveTo(92.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(11.1f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, true, -24.0f, -7.2f)
                close()
                moveTo(140.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(3.9f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, true, -24.0f, 7.2f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 144.0f, 58.8f)
                lineTo(188.0f, 176.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -1.1f, -5.0f)
                lineToRelative(-48.0f, -104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.8f, 0.0f)
                lineToRelative(-48.0f, 104.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -1.1f, 5.0f)
                verticalLineToRelative(10.8f)
                arcTo(83.5f, 83.5f, 0.0f, false, true, 44.0f, 128.0f)
                close()
            }
        }
        .build()
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
