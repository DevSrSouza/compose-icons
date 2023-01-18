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

public val FillGroup.Prohibit: ImageVector
    get() {
        if (_prohibit != null) {
            return _prohibit!!
        }
        _prohibit = Builder(name = "Prohibit", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 128.0f)
                arcToRelative(71.3f, 71.3f, 0.0f, false, true, -15.8f, 44.9f)
                lineTo(83.1f, 71.8f)
                arcTo(71.3f, 71.3f, 0.0f, false, true, 128.0f, 56.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 200.0f, 128.0f)
                close()
                moveTo(56.0f, 128.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, 72.0f, 72.0f)
                arcToRelative(71.3f, 71.3f, 0.0f, false, false, 44.9f, -15.8f)
                lineTo(71.8f, 83.1f)
                arcTo(71.3f, 71.3f, 0.0f, false, false, 56.0f, 128.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, -88.0f, 88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
