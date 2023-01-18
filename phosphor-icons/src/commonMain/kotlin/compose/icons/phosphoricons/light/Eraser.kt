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

public val LightGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 209.8f)
                horizontalLineTo(125.5f)
                lineToRelative(94.7f, -94.7f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -31.1f)
                lineTo(175.0f, 38.7f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, false, -15.6f, -6.4f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -15.5f, 6.4f)
                lineTo(87.3f, 95.3f)
                horizontalLineToRelative(0.0f)
                lineTo(30.7f, 151.9f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, false, 0.0f, 31.1f)
                lineToRelative(37.1f, 37.1f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 4.3f, 1.7f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(152.4f, 47.2f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.1f, 0.0f)
                lineToRelative(45.3f, 45.3f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 14.1f)
                lineToRelative(-52.4f, 52.3f)
                lineTo(100.0f, 99.5f)
                close()
                moveTo(74.6f, 209.8f)
                lineTo(39.2f, 174.5f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.1f)
                lineTo(91.6f, 108.0f)
                lineToRelative(59.3f, 59.4f)
                lineToRelative(-42.4f, 42.4f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
