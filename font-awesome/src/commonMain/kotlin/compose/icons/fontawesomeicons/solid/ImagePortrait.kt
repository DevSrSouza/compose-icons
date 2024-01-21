package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ImagePortrait: ImageVector
    get() {
        if (_imagePortrait != null) {
            return _imagePortrait!!
        }
        _imagePortrait = Builder(name = "ImagePortrait", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(320.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -384.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
                close()
                moveTo(80.0f, 356.6f)
                curveToRelative(0.0f, -37.9f, 30.7f, -68.6f, 68.6f, -68.6f)
                horizontalLineToRelative(86.9f)
                curveToRelative(37.9f, 0.0f, 68.6f, 30.7f, 68.6f, 68.6f)
                curveToRelative(0.0f, 15.1f, -12.3f, 27.4f, -27.4f, 27.4f)
                horizontalLineTo(107.4f)
                curveTo(92.3f, 384.0f, 80.0f, 371.7f, 80.0f, 356.6f)
                close()
            }
        }
        .build()
        return _imagePortrait!!
    }

private var _imagePortrait: ImageVector? = null
