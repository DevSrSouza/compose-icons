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

public val BoldGroup.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) {
            return _circleHalf!!
        }
        _circleHalf = Builder(name = "CircleHalf", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(140.0f, 44.9f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, true, 24.0f, 7.2f)
                lineTo(164.0f, 203.9f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, true, -24.0f, 7.2f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 72.0f, -83.1f)
                lineTo(116.0f, 211.1f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(188.0f, 186.7f)
                lineTo(188.0f, 69.3f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, true, 0.0f, 117.4f)
                close()
            }
        }
        .build()
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
