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

public val LightGroup.NumberNine: ImageVector
    get() {
        if (_numberNine != null) {
            return _numberNine!!
        }
        _numberNine = Builder(name = "NumberNine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.6f, 119.1f)
                lineToRelative(0.3f, -0.6f)
                arcTo(60.7f, 60.7f, 0.0f, false, false, 190.0f, 88.0f)
                arcToRelative(61.9f, 61.9f, 0.0f, true, false, -38.0f, 57.2f)
                lineToRelative(-45.4f, 75.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 2.1f, 8.2f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 3.0f, 0.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.2f, -2.9f)
                lineTo(181.0f, 120.2f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.1f, 0.1f, -0.2f)
                close()
                moveTo(128.0f, 138.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, true, 42.9f, -24.3f)
                lineToRelative(-0.2f, 0.3f)
                arcTo(50.1f, 50.1f, 0.0f, false, true, 128.0f, 138.0f)
                close()
            }
        }
        .build()
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
