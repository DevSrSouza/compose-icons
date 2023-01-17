package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Hourglass16: ImageVector
    get() {
        if (_hourglass16 != null) {
            return _hourglass16!!
        }
        _hourglass16 = Builder(name = "Hourglass16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 1.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(1.25f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -1.9f, 3.8f)
                lineToRelative(-0.333f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.4f)
                lineToRelative(0.333f, 0.25f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 1.9f, 3.8f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-1.25f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 1.9f, -3.8f)
                lineToRelative(0.333f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.4f)
                lineTo(5.4f, 7.55f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -1.9f, -3.8f)
                verticalLineTo(2.5f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(11.0f, 2.5f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 1.023f, 0.482f, 1.986f, 1.3f, 2.6f)
                lineToRelative(0.333f, 0.25f)
                curveToRelative(0.934f, 0.7f, 0.934f, 2.1f, 0.0f, 2.8f)
                lineToRelative(-0.333f, 0.25f)
                arcToRelative(3.251f, 3.251f, 0.0f, false, false, -1.3f, 2.6f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.25f)
                arcToRelative(3.251f, 3.251f, 0.0f, false, false, -1.3f, -2.6f)
                lineToRelative(-0.333f, -0.25f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 0.0f, -2.8f)
                lineToRelative(0.333f, -0.25f)
                arcToRelative(3.251f, 3.251f, 0.0f, false, false, 1.3f, -2.6f)
                close()
            }
        }
        .build()
        return _hourglass16!!
    }

private var _hourglass16: ImageVector? = null
