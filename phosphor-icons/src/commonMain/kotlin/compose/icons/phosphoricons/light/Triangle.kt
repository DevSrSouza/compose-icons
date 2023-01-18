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

public val LightGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(109.0f, 37.0f)
                arcToRelative(21.9f, 21.9f, 0.0f, false, true, 38.0f, 0.0f)
                lineToRelative(88.0f, 152.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -19.0f, 33.0f)
                horizontalLineTo(40.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -19.0f, -33.0f)
                lineTo(109.0f, 37.0f)
                moveToRelative(10.3f, 6.0f)
                lineTo(31.4f, 195.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 40.0f, 210.0f)
                horizontalLineTo(216.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 8.6f, -15.0f)
                lineTo(136.7f, 43.0f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, -17.4f, 0.0f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
