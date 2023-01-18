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

public val LightGroup.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = Builder(name = "Function", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(170.7f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, -25.6f, 21.3f)
                lineTo(135.2f, 122.0f)
                horizontalLineTo(184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(133.0f)
                lineToRelative(-10.3f, 56.8f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 85.3f, 222.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(85.3f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, 25.6f, -21.3f)
                lineToRelative(9.9f, -54.7f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(51.0f)
                lineToRelative(10.3f, -56.8f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 170.7f, 34.0f)
                horizontalLineTo(200.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 40.0f)
                close()
            }
        }
        .build()
        return _function!!
    }

private var _function: ImageVector? = null
