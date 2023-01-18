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

public val ThinGroup.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) {
            return _arrowUUpRight!!
        }
        _arrowUUpRight = Builder(name = "ArrowUUpRight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.2f, 133.2f)
                lineTo(214.3f, 92.0f)
                horizontalLineTo(88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 104.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 88.0f, 84.0f)
                horizontalLineTo(214.3f)
                lineTo(173.2f, 42.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 173.2f, 133.2f)
                close()
            }
        }
        .build()
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
