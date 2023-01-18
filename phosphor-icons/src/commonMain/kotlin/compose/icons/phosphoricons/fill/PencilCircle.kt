package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) {
            return _pencilCircle!!
        }
        _pencilCircle = Builder(name = "PencilCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.5f, 54.5f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, -147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, 147.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, -147.0f)
                close()
                moveTo(128.0f, 170.9f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -32.3f, -9.8f)
                lineTo(111.0f, 128.0f)
                horizontalLineToRelative(34.0f)
                lineToRelative(15.3f, 33.1f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -32.3f, 9.8f)
                close()
                moveTo(168.0f, 206.4f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, true, -32.0f, 9.2f)
                lineTo(136.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(190.2f, 190.2f)
                curveToRelative(-2.0f, 2.0f, -4.1f, 3.9f, -6.2f, 5.7f)
                lineTo(184.0f, 176.0f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, false, -0.7f, -3.4f)
                lineToRelative(-48.0f, -104.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.5f, -0.9f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.1f, -0.1f, -0.2f)
                lineToRelative(-0.5f, -0.7f)
                lineTo(134.0f, 66.8f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -0.7f, -0.7f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.7f, -0.6f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.8f, -0.5f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.9f, -0.3f)
                horizontalLineToRelative(-0.3f)
                lineToRelative(-0.9f, -0.2f)
                horizontalLineToRelative(-2.4f)
                lineToRelative(-1.0f, 0.2f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.8f, 0.3f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.9f, 0.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.7f, 0.6f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.7f, 0.7f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.5f, 0.7f)
                lineToRelative(-0.2f, 0.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.5f, 0.9f)
                lineToRelative(-22.1f, 48.0f)
                horizontalLineToRelative(0.0f)
                lineTo(72.7f, 172.6f)
                arcTo(9.8f, 9.8f, 0.0f, false, false, 72.0f, 176.0f)
                verticalLineToRelative(19.9f)
                curveToRelative(-2.1f, -1.8f, -4.2f, -3.7f, -6.2f, -5.7f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 124.4f, 0.0f)
                close()
            }
        }
        .build()
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
