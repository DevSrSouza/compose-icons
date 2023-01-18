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

public val ThinGroup.Option: ImageVector
    get() {
        if (_option != null) {
            return _option!!
        }
        _option = Builder(name = "Option", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(161.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.8f, -6.6f)
                lineTo(98.6f, 78.2f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 95.1f, 76.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(95.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.7f, 6.6f)
                lineToRelative(51.6f, 103.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 161.0f, 180.0f)
                horizontalLineToRelative(63.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 184.0f)
                close()
                moveTo(152.0f, 76.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _option!!
    }

private var _option: ImageVector? = null
