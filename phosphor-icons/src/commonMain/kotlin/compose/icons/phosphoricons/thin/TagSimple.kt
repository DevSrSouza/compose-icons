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

public val ThinGroup.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) {
            return _tagSimple!!
        }
        _tagSimple = Builder(name = "TagSimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.7f, 204.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 52.0f)
                horizontalLineTo(187.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 10.0f, 5.3f)
                lineToRelative(45.6f, 68.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 4.4f)
                lineToRelative(-45.6f, 68.4f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 187.7f, 204.0f)
                close()
                moveTo(40.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(187.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.4f, -1.8f)
                horizontalLineToRelative(0.0f)
                lineTo(235.2f, 128.0f)
                lineTo(191.1f, 61.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.4f, -1.8f)
                close()
            }
        }
        .build()
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
