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

public val ThinGroup.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) {
            return _pawPrint!!
        }
        _pawPrint = Builder(name = "PawPrint", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 84.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 212.0f, 84.0f)
                close()
                moveTo(212.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 212.0f, 124.0f)
                close()
                moveTo(68.0f, 108.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 68.0f, 108.0f)
                close()
                moveTo(44.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 44.0f, 124.0f)
                close()
                moveTo(92.0f, 84.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 68.0f, 60.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 92.0f, 84.0f)
                close()
                moveTo(92.0f, 44.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 76.0f, 60.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 92.0f, 44.0f)
                close()
                moveTo(164.0f, 84.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 164.0f, 84.0f)
                close()
                moveTo(164.0f, 44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 44.0f)
                close()
                moveTo(185.2f, 152.3f)
                arcToRelative(39.0f, 39.0f, 0.0f, false, true, -18.8f, -23.5f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -76.8f, 0.0f)
                arcToRelative(39.0f, 39.0f, 0.0f, false, true, -18.7f, 23.5f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 88.0f, 220.0f)
                arcToRelative(36.8f, 36.8f, 0.0f, false, false, 14.0f, -2.8f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, true, 52.0f, 0.0f)
                arcToRelative(36.8f, 36.8f, 0.0f, false, false, 14.0f, 2.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 17.2f, -67.7f)
                close()
                moveTo(168.0f, 212.0f)
                arcToRelative(27.7f, 27.7f, 0.0f, false, true, -11.0f, -2.2f)
                arcToRelative(75.1f, 75.1f, 0.0f, false, false, -29.0f, -5.8f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, false, -29.1f, 5.8f)
                arcTo(26.9f, 26.9f, 0.0f, false, true, 88.0f, 212.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -13.3f, -52.6f)
                arcToRelative(47.6f, 47.6f, 0.0f, false, false, 22.6f, -28.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 61.4f, 0.0f)
                arcToRelative(47.6f, 47.6f, 0.0f, false, false, 22.6f, 28.3f)
                horizontalLineToRelative(0.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 168.0f, 212.0f)
                close()
            }
        }
        .build()
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
