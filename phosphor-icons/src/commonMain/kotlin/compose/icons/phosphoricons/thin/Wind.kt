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

public val ThinGroup.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -54.3f, 9.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.4f, -5.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.1f, 2.3f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 152.0f, 164.0f)
                lineTo(40.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(152.0f, 156.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 180.0f, 184.0f)
                close()
                moveTo(148.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -54.3f, -9.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 5.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.1f, -2.3f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 120.0f, 92.0f)
                lineTo(24.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 148.0f, 72.0f)
                close()
                moveTo(208.0f, 76.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -26.3f, 18.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 5.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.1f, -2.3f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 208.0f, 124.0f)
                lineTo(32.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(208.0f, 132.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
