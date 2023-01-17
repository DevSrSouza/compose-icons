package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Rss16: ImageVector
    get() {
        if (_rss16 != null) {
            return _rss16!!
        }
        _rss16 = Builder(name = "Rss16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.002f, 2.725f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.797f, -0.699f)
                curveTo(8.79f, 2.42f, 13.58f, 7.21f, 13.974f, 13.201f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.497f, 0.098f)
                arcToRelative(10.502f, 10.502f, 0.0f, false, false, -9.776f, -9.776f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.7f, -0.798f)
                close()
                moveTo(2.84f, 7.05f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, true, 6.113f, 6.111f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.49f, 0.178f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, false, -4.8f, -4.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.179f, -1.489f)
                close()
                moveTo(2.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _rss16!!
    }

private var _rss16: ImageVector? = null
