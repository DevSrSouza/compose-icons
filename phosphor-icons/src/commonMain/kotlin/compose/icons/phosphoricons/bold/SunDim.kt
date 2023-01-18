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

public val BoldGroup.SunDim: ImageVector
    get() {
        if (_sunDim != null) {
            return _sunDim!!
        }
        _sunDim = Builder(name = "SunDim", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 56.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 72.0f, 72.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 128.0f, 56.0f)
                close()
                moveTo(128.0f, 176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 128.0f, 176.0f)
                close()
                moveTo(116.0f, 28.0f)
                lineTo(116.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(190.2f, 65.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(5.7f, -5.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-5.7f, 5.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, 3.5f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 190.2f, 65.8f)
                close()
                moveTo(248.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
                moveTo(212.9f, 195.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, -8.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -3.5f)
                lineToRelative(-5.7f, -5.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                close()
                moveTo(140.0f, 228.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(65.8f, 190.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-5.7f, 5.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, 3.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, -8.5f, -3.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(5.7f, -5.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 65.8f, 190.2f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(20.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(43.1f, 60.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineToRelative(5.7f, 5.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -3.5f)
                close()
            }
        }
        .build()
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
