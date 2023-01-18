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

public val BoldGroup.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) {
            return _tennisBall!!
        }
        _tennisBall = Builder(name = "TennisBall", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.9f, 129.4f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 0.1f, -1.3f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, -0.1f, -1.2f)
                arcTo(107.6f, 107.6f, 0.0f, false, false, 129.1f, 20.1f)
                horizontalLineToRelative(-2.5f)
                arcTo(107.6f, 107.6f, 0.0f, false, false, 20.1f, 126.6f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, -0.1f, 1.3f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 0.1f, 1.1f)
                arcTo(107.6f, 107.6f, 0.0f, false, false, 127.0f, 235.9f)
                horizontalLineToRelative(2.4f)
                arcTo(107.6f, 107.6f, 0.0f, false, false, 235.9f, 129.4f)
                close()
                moveTo(68.6f, 68.6f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, true, 46.2f, -23.5f)
                arcToRelative(84.3f, 84.3f, 0.0f, false, true, -69.7f, 69.7f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 68.6f, 68.6f)
                close()
                moveTo(44.8f, 139.1f)
                arcToRelative(108.2f, 108.2f, 0.0f, false, false, 94.3f, -94.3f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, 72.1f, 72.1f)
                arcToRelative(108.2f, 108.2f, 0.0f, false, false, -94.3f, 94.3f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, -72.1f, -72.1f)
                close()
                moveTo(141.2f, 210.9f)
                arcToRelative(84.3f, 84.3f, 0.0f, false, true, 69.7f, -69.7f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, -69.7f, 69.7f)
                close()
            }
        }
        .build()
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
