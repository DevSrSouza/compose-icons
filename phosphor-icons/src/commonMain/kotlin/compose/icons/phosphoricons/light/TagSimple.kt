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

public val LightGroup.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) {
            return _tagSimple!!
        }
        _tagSimple = Builder(name = "TagSimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.7f, 206.0f)
                horizontalLineTo(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineTo(64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 50.0f)
                horizontalLineTo(187.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 11.7f, 6.2f)
                lineTo(245.0f, 124.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 6.6f)
                lineToRelative(-45.6f, 68.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 187.7f, 206.0f)
                close()
                moveTo(40.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(187.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.7f, -0.9f)
                horizontalLineToRelative(0.0f)
                lineTo(232.8f, 128.0f)
                lineTo(189.4f, 62.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.7f, -0.9f)
                close()
            }
        }
        .build()
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
