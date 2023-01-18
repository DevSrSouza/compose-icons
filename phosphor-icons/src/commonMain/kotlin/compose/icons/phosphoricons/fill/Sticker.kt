package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 32.0f)
                horizontalLineTo(88.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 32.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 2.5f, -0.4f)
                curveToRelative(26.3f, -8.8f, 76.3f, -58.8f, 85.1f, -85.1f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 0.4f, -2.5f)
                verticalLineTo(88.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 168.0f, 32.0f)
                close()
                moveTo(136.0f, 207.4f)
                verticalLineTo(176.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f)
                horizontalLineToRelative(31.4f)
                curveTo(198.2f, 157.6f, 157.6f, 198.2f, 136.0f, 207.4f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
