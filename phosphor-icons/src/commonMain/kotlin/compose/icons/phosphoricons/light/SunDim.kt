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

public val LightGroup.SunDim: ImageVector
    get() {
        if (_sunDim != null) {
            return _sunDim!!
        }
        _sunDim = Builder(name = "SunDim", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 62.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, 66.0f, 66.0f)
                arcTo(66.1f, 66.1f, 0.0f, false, false, 128.0f, 62.0f)
                close()
                moveTo(128.0f, 182.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 54.0f, -54.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 128.0f, 182.0f)
                close()
                moveTo(122.0f, 36.0f)
                lineTo(122.0f, 28.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(53.0f, 61.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 61.5f, 53.0f)
                lineToRelative(5.7f, 5.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.3f, 1.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -4.2f, -1.7f)
                close()
                moveTo(42.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(28.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 42.0f, 128.0f)
                close()
                moveTo(67.2f, 188.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                lineTo(61.5f, 203.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -4.2f, 1.7f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 53.0f, 203.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, -8.5f)
                lineToRelative(5.7f, -5.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 67.2f, 188.8f)
                close()
                moveTo(134.0f, 220.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(203.0f, 194.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -4.3f, 1.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -4.2f, -1.7f)
                lineToRelative(-5.7f, -5.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, -8.5f)
                close()
                moveTo(234.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 234.0f, 128.0f)
                close()
                moveTo(203.0f, 53.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                lineToRelative(-5.7f, 5.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -4.2f, 1.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.3f, -1.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, -8.5f)
                lineToRelative(5.7f, -5.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 203.0f, 53.0f)
                close()
            }
        }
        .build()
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
