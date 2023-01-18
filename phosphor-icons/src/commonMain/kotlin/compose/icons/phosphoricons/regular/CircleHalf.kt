package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) {
            return _circleHalf!!
        }
        _circleHalf = Builder(name = "CircleHalf", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(136.0f, 40.4f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, 16.0f, 2.9f)
                lineTo(152.0f, 212.7f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, -16.0f, 2.9f)
                close()
                moveTo(168.0f, 49.6f)
                arcToRelative(90.6f, 90.6f, 0.0f, false, true, 16.0f, 10.6f)
                lineTo(184.0f, 195.8f)
                arcToRelative(90.6f, 90.6f, 0.0f, false, true, -16.0f, 10.6f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 80.0f, -87.6f)
                lineTo(120.0f, 215.6f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(200.0f, 178.5f)
                lineTo(200.0f, 77.5f)
                arcToRelative(87.7f, 87.7f, 0.0f, false, true, 0.0f, 101.0f)
                close()
            }
        }
        .build()
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
