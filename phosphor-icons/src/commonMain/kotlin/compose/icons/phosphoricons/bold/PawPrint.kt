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

public val BoldGroup.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) {
            return _pawPrint!!
        }
        _pawPrint = Builder(name = "PawPrint", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.0f, 145.3f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, true, -14.9f, -18.7f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -92.2f, 0.0f)
                arcTo(31.0f, 31.0f, 0.0f, false, true, 67.0f, 145.3f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 88.0f, 228.0f)
                arcToRelative(45.3f, 45.3f, 0.0f, false, false, 17.1f, -3.4f)
                arcToRelative(59.6f, 59.6f, 0.0f, false, true, 45.8f, 0.0f)
                arcTo(45.3f, 45.3f, 0.0f, false, false, 168.0f, 228.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 21.0f, -82.7f)
                close()
                moveTo(168.0f, 204.0f)
                arcToRelative(19.1f, 19.1f, 0.0f, false, true, -7.8f, -1.6f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, false, -64.2f, 0.0f)
                horizontalLineToRelative(-0.1f)
                arcTo(19.1f, 19.1f, 0.0f, false, true, 88.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -9.5f, -37.6f)
                horizontalLineToRelative(0.1f)
                arcToRelative(55.4f, 55.4f, 0.0f, false, false, 26.4f, -33.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, 46.0f, 0.0f)
                arcToRelative(55.4f, 55.4f, 0.0f, false, false, 26.4f, 33.0f)
                horizontalLineToRelative(0.1f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 168.0f, 204.0f)
                close()
                moveTo(232.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 232.0f, 104.0f)
                close()
                moveTo(48.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 48.0f, 128.0f)
                close()
                moveTo(72.0f, 56.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 96.0f, 80.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 72.0f, 56.0f)
                close()
                moveTo(136.0f, 56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 136.0f, 56.0f)
                close()
            }
        }
        .build()
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
