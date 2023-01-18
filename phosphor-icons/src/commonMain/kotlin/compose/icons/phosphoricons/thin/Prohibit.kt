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

public val ThinGroup.Prohibit: ImageVector
    get() {
        if (_prohibit != null) {
            return _prohibit!!
        }
        _prohibit = Builder(name = "Prohibit", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.0f, 198.3f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 57.7f, 56.9f)
                curveToRelative(-0.1f, 0.2f, -0.3f, 0.3f, -0.4f, 0.4f)
                lineToRelative(-0.3f, 0.4f)
                arcTo(99.9f, 99.9f, 0.0f, false, false, 198.3f, 199.0f)
                lineToRelative(0.4f, -0.3f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, -24.2f, 62.1f)
                lineTo(65.9f, 60.2f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcTo(91.6f, 91.6f, 0.0f, false, true, 60.2f, 65.9f)
                lineTo(190.1f, 195.8f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 36.0f, 128.0f)
                close()
            }
        }
        .build()
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
