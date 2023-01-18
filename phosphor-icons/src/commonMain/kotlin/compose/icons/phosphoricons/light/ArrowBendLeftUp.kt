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

public val LightGroup.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) {
            return _arrowBendLeftUp!!
        }
        _arrowBendLeftUp = Builder(name = "ArrowBendLeftUp", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, true, 98.0f, 128.0f)
                verticalLineTo(46.5f)
                lineTo(60.2f, 84.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 8.4f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineTo(110.0f, 46.5f)
                verticalLineTo(128.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, false, 90.0f, 90.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 224.0f)
                close()
            }
        }
        .build()
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
