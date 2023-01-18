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

public val LightGroup.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) {
            return _arrowUDownRight!!
        }
        _arrowUDownRight = Builder(name = "ArrowUDownRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.2f, 172.2f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(209.5f, 174.0f)
                horizontalLineTo(88.0f)
                arcTo(62.0f, 62.0f, 0.0f, false, true, 88.0f, 50.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(88.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, 100.0f)
                horizontalLineTo(209.5f)
                lineToRelative(-37.7f, -37.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineToRelative(48.0f, 48.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 228.2f, 172.2f)
                close()
            }
        }
        .build()
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
