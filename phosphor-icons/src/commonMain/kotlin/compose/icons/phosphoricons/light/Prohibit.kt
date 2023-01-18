package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Prohibit: ImageVector
    get() {
        if (_prohibit != null) {
            return _prohibit!!
        }
        _prohibit = Builder(name = "Prohibit", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.5f, 199.7f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 56.3f, 55.5f)
                lineToRelative(-0.4f, 0.4f)
                lineToRelative(-0.4f, 0.4f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 199.7f, 200.5f)
                lineToRelative(0.4f, -0.4f)
                curveTo(200.3f, 200.0f, 200.3f, 199.8f, 200.5f, 199.7f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, true, -22.3f, 59.2f)
                lineTo(68.8f, 60.3f)
                arcTo(89.9f, 89.9f, 0.0f, false, true, 218.0f, 128.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcTo(89.3f, 89.3f, 0.0f, false, true, 60.3f, 68.8f)
                lineTo(187.2f, 195.7f)
                arcTo(89.9f, 89.9f, 0.0f, false, true, 38.0f, 128.0f)
                close()
            }
        }
        .build()
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
