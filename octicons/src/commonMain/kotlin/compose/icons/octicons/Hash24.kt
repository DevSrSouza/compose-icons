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

public val Octicons.Hash24: ImageVector
    get() {
        if (_hash24 != null) {
            return _hash24!!
        }
        _hash24 = Builder(name = "Hash24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.618f, 1.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.623f, 0.859f)
                lineTo(9.46f, 7.5f)
                horizontalLineToRelative(6.48f)
                lineToRelative(0.82f, -5.118f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.48f, 0.237f)
                lineTo(17.46f, 7.5f)
                horizontalLineToRelative(3.79f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.03f)
                lineToRelative(-0.96f, 6.0f)
                horizontalLineToRelative(3.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(-0.78f, 4.869f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.48f, -0.237f)
                lineToRelative(0.74f, -4.632f)
                horizontalLineTo(8.02f)
                lineToRelative(-0.78f, 4.869f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.48f, -0.237f)
                lineTo(6.5f, 16.5f)
                horizontalLineTo(2.745f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineTo(6.74f)
                lineToRelative(0.96f, -6.0f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(4.19f)
                lineToRelative(0.82f, -5.118f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.858f, -0.622f)
                close()
                moveTo(14.741f, 15.0f)
                lineToRelative(0.96f, -6.0f)
                horizontalLineTo(9.22f)
                lineToRelative(-0.96f, 6.0f)
                close()
            }
        }
        .build()
        return _hash24!!
    }

private var _hash24: ImageVector? = null
