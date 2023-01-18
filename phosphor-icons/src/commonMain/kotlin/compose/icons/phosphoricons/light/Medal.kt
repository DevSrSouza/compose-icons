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

public val LightGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 96.0f)
                arcTo(86.0f, 86.0f, 0.0f, true, false, 74.0f, 162.9f)
                lineTo(74.0f, 240.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.8f, 5.1f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 5.9f, 0.3f)
                lineTo(128.0f, 222.7f)
                lineToRelative(45.3f, 22.7f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 2.7f, 0.6f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 3.2f, -0.9f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 182.0f, 240.0f)
                lineTo(182.0f, 162.9f)
                arcTo(85.9f, 85.9f, 0.0f, false, false, 214.0f, 96.0f)
                close()
                moveTo(54.0f, 96.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, 74.0f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 54.0f, 96.0f)
                close()
                moveTo(170.0f, 230.3f)
                lineToRelative(-39.3f, -19.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -5.4f, 0.0f)
                lineTo(86.0f, 230.3f)
                lineTo(86.0f, 171.0f)
                arcToRelative(85.7f, 85.7f, 0.0f, false, false, 84.0f, 0.0f)
                close()
                moveTo(128.0f, 150.0f)
                arcTo(54.0f, 54.0f, 0.0f, true, false, 74.0f, 96.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 128.0f, 150.0f)
                close()
                moveTo(128.0f, 54.0f)
                arcTo(42.0f, 42.0f, 0.0f, true, true, 86.0f, 96.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 54.0f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
