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

public val ThinGroup.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) {
            return _eyeglasses!!
        }
        _eyeglasses = Builder(name = "Eyeglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -71.2f, 16.0f)
                lineTo(107.2f, 156.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 36.0f, 140.0f)
                lineTo(36.0f, 72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 56.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 28.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                lineTo(228.0f, 72.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(68.0f, 196.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 68.0f, 196.0f)
                close()
                moveTo(188.0f, 196.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 188.0f, 196.0f)
                close()
            }
        }
        .build()
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
