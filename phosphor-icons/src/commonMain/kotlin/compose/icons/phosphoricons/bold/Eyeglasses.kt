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

public val BoldGroup.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) {
            return _eyeglasses!!
        }
        _eyeglasses = Builder(name = "Eyeglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(50.5f)
                arcTo(47.8f, 47.8f, 0.0f, false, false, 142.8f, 148.0f)
                lineTo(113.2f, 148.0f)
                arcTo(47.8f, 47.8f, 0.0f, false, false, 44.0f, 122.5f)
                lineTo(44.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 20.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 95.3f, 8.0f)
                horizontalLineToRelative(25.4f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 95.3f, -8.0f)
                lineTo(236.0f, 72.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(68.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 68.0f, 188.0f)
                close()
                moveTo(188.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 188.0f, 188.0f)
                close()
            }
        }
        .build()
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
