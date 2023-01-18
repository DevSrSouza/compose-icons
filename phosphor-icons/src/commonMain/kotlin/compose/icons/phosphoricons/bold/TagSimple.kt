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

public val BoldGroup.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) {
            return _tagSimple!!
        }
        _tagSimple = Builder(name = "TagSimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.7f, 212.0f)
                horizontalLineTo(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 44.0f)
                horizontalLineTo(187.7f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 16.7f, 8.9f)
                lineTo(250.0f, 121.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.0f, 13.3f)
                lineToRelative(-45.6f, 68.5f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 187.7f, 212.0f)
                close()
                moveTo(44.0f, 188.0f)
                horizontalLineTo(185.6f)
                lineToRelative(40.0f, -60.0f)
                lineToRelative(-40.0f, -60.0f)
                horizontalLineTo(44.0f)
                close()
            }
        }
        .build()
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
