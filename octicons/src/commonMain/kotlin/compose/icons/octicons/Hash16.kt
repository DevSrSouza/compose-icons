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

public val Octicons.Hash16: ImageVector
    get() {
        if (_hash16 != null) {
            return _hash16!!
        }
        _hash16 = Builder(name = "Hash16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.368f, 1.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.623f, 0.859f)
                lineTo(6.57f, 4.5f)
                horizontalLineToRelative(3.98f)
                lineToRelative(0.46f, -2.868f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.48f, 0.237f)
                lineTo(12.07f, 4.5f)
                horizontalLineToRelative(2.18f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(-0.64f, 4.0f)
                horizontalLineToRelative(2.56f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.8f)
                lineToRelative(-0.46f, 2.869f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.48f, -0.237f)
                lineToRelative(0.42f, -2.632f)
                horizontalLineTo(5.45f)
                lineToRelative(-0.46f, 2.869f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.48f, -0.237f)
                lineToRelative(0.42f, -2.632f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.42f)
                lineToRelative(0.64f, -4.0f)
                horizontalLineTo(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.8f)
                lineToRelative(0.46f, -2.868f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.858f, -0.622f)
                close()
                moveTo(9.67f, 10.0f)
                lineToRelative(0.64f, -4.0f)
                horizontalLineTo(6.33f)
                lineToRelative(-0.64f, 4.0f)
                close()
            }
        }
        .build()
        return _hash16!!
    }

private var _hash16: ImageVector? = null
