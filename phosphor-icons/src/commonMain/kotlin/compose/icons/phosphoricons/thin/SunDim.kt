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

public val ThinGroup.SunDim: ImageVector
    get() {
        if (_sunDim != null) {
            return _sunDim!!
        }
        _sunDim = Builder(name = "SunDim", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 64.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 128.0f, 64.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 128.0f, 184.0f)
                close()
                moveTo(124.0f, 36.0f)
                lineTo(124.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(54.5f, 60.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, -5.6f)
                lineToRelative(5.7f, 5.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, 5.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.9f, 1.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, -1.1f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(28.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(65.8f, 190.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, 5.7f)
                lineToRelative(-5.7f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(5.6f, -5.7f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 65.8f, 190.2f)
                close()
                moveTo(132.0f, 220.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(201.5f, 195.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                lineToRelative(-5.7f, -5.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.7f, -5.7f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(190.2f, 65.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, -5.7f)
                lineToRelative(5.7f, -5.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                lineToRelative(-5.6f, 5.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, 1.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 190.2f, 65.8f)
                close()
            }
        }
        .build()
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
