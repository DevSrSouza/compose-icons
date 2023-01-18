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

public val ThinGroup.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = Builder(name = "CodeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.7f, 67.0f)
                lineTo(22.0f, 128.0f)
                lineToRelative(68.7f, 61.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.3f, 5.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -3.0f, 1.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.7f, -1.0f)
                lineToRelative(-72.0f, -64.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.0f, -6.0f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.4f, 6.0f)
                close()
                moveTo(242.7f, 125.0f)
                lineTo(170.7f, 61.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.4f, 6.0f)
                lineTo(234.0f, 128.0f)
                lineToRelative(-68.7f, 61.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.3f, 5.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 3.0f, 1.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.7f, -1.0f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
