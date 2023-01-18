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

public val LightGroup.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = Builder(name = "Folders", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 66.0f)
                lineTo(154.7f, 66.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -1.2f, -0.4f)
                lineTo(125.7f, 44.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -8.4f, -2.8f)
                lineTo(72.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 58.0f, 56.0f)
                lineTo(58.0f, 74.0f)
                lineTo(40.0f, 74.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 88.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(192.9f, 214.0f)
                arcTo(13.1f, 13.1f, 0.0f, false, false, 206.0f, 200.9f)
                lineTo(206.0f, 182.0f)
                horizontalLineToRelative(18.9f)
                arcTo(13.1f, 13.1f, 0.0f, false, false, 238.0f, 168.9f)
                lineTo(238.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 66.0f)
                close()
                moveTo(194.0f, 200.9f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -1.1f, 1.1f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(85.3f, 86.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.2f, 0.4f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 8.4f, 2.8f)
                lineTo(192.0f, 110.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(226.0f, 168.9f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -1.1f, 1.1f)
                lineTo(206.0f, 170.0f)
                lineTo(206.0f, 112.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(122.7f, 98.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -1.2f, -0.4f)
                lineTo(93.7f, 76.8f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 85.3f, 74.0f)
                lineTo(70.0f, 74.0f)
                lineTo(70.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(45.3f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.2f, 0.4f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 8.4f, 2.8f)
                lineTo(224.0f, 78.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _folders!!
    }

private var _folders: ImageVector? = null
