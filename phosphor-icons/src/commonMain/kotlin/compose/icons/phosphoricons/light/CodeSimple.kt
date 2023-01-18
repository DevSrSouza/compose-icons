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

public val LightGroup.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = Builder(name = "CodeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 68.5f)
                lineTo(25.0f, 128.0f)
                lineToRelative(67.0f, 59.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 88.0f, 198.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -4.0f, -1.5f)
                lineToRelative(-72.0f, -64.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, -9.0f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.0f, 9.0f)
                close()
                moveTo(244.0f, 123.5f)
                lineTo(172.0f, 59.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.0f, 9.0f)
                lineTo(231.0f, 128.0f)
                lineToRelative(-67.0f, 59.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.5f, 8.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 8.5f, 0.5f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, -9.0f)
                close()
            }
        }
        .build()
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
