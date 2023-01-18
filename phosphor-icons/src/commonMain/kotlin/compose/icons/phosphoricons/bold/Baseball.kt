package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(77.0f, 194.7f)
                arcToRelative(110.4f, 110.4f, 0.0f, false, false, 8.2f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.7f, -12.2f)
                curveToRelative(-1.4f, 2.3f, -2.9f, 4.6f, -4.5f, 6.8f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 0.0f, -98.6f)
                curveToRelative(1.6f, 2.2f, 3.1f, 4.5f, 4.5f, 6.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.3f, 5.9f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, 6.1f, -1.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.3f, -16.4f)
                arcToRelative(110.4f, 110.4f, 0.0f, false, false, -8.2f, -12.0f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, true, 102.0f, 0.0f)
                arcToRelative(110.4f, 110.4f, 0.0f, false, false, -8.2f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.3f, 16.4f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, 6.1f, 1.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.3f, -5.9f)
                curveToRelative(1.4f, -2.3f, 2.9f, -4.6f, 4.5f, -6.8f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 0.0f, 98.6f)
                curveToRelative(-1.6f, -2.2f, -3.1f, -4.5f, -4.5f, -6.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.7f, 12.2f)
                arcToRelative(110.4f, 110.4f, 0.0f, false, false, 8.2f, 12.0f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, true, -102.0f, 0.0f)
                close()
                moveTo(170.2f, 151.9f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -11.9f, -10.5f)
                arcToRelative(114.3f, 114.3f, 0.0f, false, true, 0.0f, -27.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.9f, 3.0f)
                arcToRelative(79.1f, 79.1f, 0.0f, false, false, 0.0f, 21.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 170.2f, 151.9f)
                close()
                moveTo(99.2f, 114.5f)
                arcTo(122.2f, 122.2f, 0.0f, false, true, 100.0f, 128.0f)
                arcToRelative(122.2f, 122.2f, 0.0f, false, true, -0.8f, 13.5f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 87.3f, 152.0f)
                lineTo(85.8f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.5f, -13.4f)
                arcTo(73.1f, 73.1f, 0.0f, false, false, 76.0f, 128.0f)
                arcToRelative(92.4f, 92.4f, 0.0f, false, false, -0.6f, -10.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 10.4f, -13.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 99.2f, 114.5f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
