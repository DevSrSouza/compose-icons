package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Placeholder: ImageVector
    get() {
        if (_placeholder != null) {
            return _placeholder!!
        }
        _placeholder = Builder(name = "Placeholder", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, -10.7f, 4.1f)
                lineToRelative(-0.6f, 0.6f)
                lineToRelative(-0.6f, 0.6f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 10.7f, -4.1f)
                lineToRelative(0.6f, -0.6f)
                lineToRelative(0.6f, -0.6f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 224.0f, 208.0f)
                close()
                moveTo(208.0f, 196.7f)
                lineTo(59.3f, 48.0f)
                horizontalLineTo(208.0f)
                close()
                moveTo(48.0f, 59.3f)
                lineTo(196.7f, 208.0f)
                horizontalLineTo(48.0f)
                close()
            }
        }
        .build()
        return _placeholder!!
    }

private var _placeholder: ImageVector? = null
