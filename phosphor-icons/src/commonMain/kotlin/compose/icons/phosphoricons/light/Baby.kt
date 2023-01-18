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

public val LightGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(102.1f, 102.1f, 0.0f, true, false, 0.1f, 0.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 116.1f, 38.8f)
                curveTo(106.1f, 56.2f, 106.0f, 71.2f, 106.0f, 72.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                curveToRelative(0.0f, -0.1f, 0.3f, -16.8f, 12.9f, -33.9f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(92.0f, 138.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 92.0f, 138.0f)
                close()
                moveTo(174.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 128.0f)
                close()
                moveTo(159.5f, 164.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.6f, 8.3f)
                arcToRelative(54.2f, 54.2f, 0.0f, false, true, -59.8f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.7f, -10.0f)
                arcToRelative(41.9f, 41.9f, 0.0f, false, false, 46.4f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 159.5f, 164.7f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
