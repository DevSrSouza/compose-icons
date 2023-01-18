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

public val ThinGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.7f, 38.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 34.6f, 0.0f)
                lineToRelative(88.0f, 152.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 216.0f, 220.0f)
                horizontalLineTo(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -17.3f, -30.0f)
                lineToRelative(88.0f, -152.0f)
                moveTo(128.0f, 36.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -10.4f, 6.0f)
                lineToRelative(-88.0f, 152.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 12.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 40.0f, 212.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.4f, -6.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, -12.0f)
                lineToRelative(-88.0f, -152.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 128.0f, 36.0f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
