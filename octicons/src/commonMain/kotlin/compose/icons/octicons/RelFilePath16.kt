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

public val Octicons.RelFilePath16: ImageVector
    get() {
        if (_relFilePath16 != null) {
            return _relFilePath16!!
        }
        _relFilePath16 = Builder(name = "RelFilePath16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.94f, 3.045f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.38f, -0.59f)
                lineToRelative(-4.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.38f, 0.59f)
                lineToRelative(4.5f, -10.5f)
                close()
                moveTo(5.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _relFilePath16!!
    }

private var _relFilePath16: ImageVector? = null
