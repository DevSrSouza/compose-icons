package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.2f, 24.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.6f, 1.8f)
                curveTo(120.3f, 41.6f, 120.0f, 55.9f, 120.0f, 56.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 9.7f, 7.8f)
                curveToRelative(3.7f, -0.7f, 6.2f, -4.2f, 6.3f, -8.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 8.8f, -7.8f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 7.2f, 8.3f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, -0.3f)
                curveToRelative(0.0f, -0.6f, 0.1f, -10.8f, 5.4f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.6f, -5.4f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 24.1f, 131.7f)
                curveTo(26.0f, 186.8f, 71.2f, 231.1f, 126.3f, 232.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 7.9f, -207.8f)
                close()
                moveTo(80.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 128.0f)
                close()
                moveTo(159.0f, 174.7f)
                arcToRelative(56.3f, 56.3f, 0.0f, false, true, -62.0f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -2.2f, -11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.1f, -2.3f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, false, 44.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.1f, 2.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 159.0f, 174.7f)
                close()
                moveTo(164.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 140.0f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
