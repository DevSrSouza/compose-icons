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

public val ThinGroup.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = Builder(name = "Function", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(170.7f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -27.5f, 23.0f)
                lineToRelative(-10.4f, 57.0f)
                horizontalLineTo(184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(131.3f)
                lineToRelative(-10.6f, 58.4f)
                arcTo(35.9f, 35.9f, 0.0f, false, true, 85.3f, 220.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(85.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.5f, -23.0f)
                lineToRelative(10.4f, -57.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(52.7f)
                lineToRelative(10.6f, -58.4f)
                arcTo(35.9f, 35.9f, 0.0f, false, true, 170.7f, 36.0f)
                horizontalLineTo(200.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 40.0f)
                close()
            }
        }
        .build()
        return _function!!
    }

private var _function: ImageVector? = null
