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

public val Octicons.CheckCircle16: ImageVector
    get() {
        if (_checkCircle16 != null) {
            return _checkCircle16!!
        }
        _checkCircle16 = Builder(name = "CheckCircle16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(1.5f, 8.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -13.0f, 0.0f)
                close()
                moveTo(11.78f, 6.28f)
                lineTo(7.28f, 10.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, -1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, -0.018f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(3.97f, -3.97f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, 1.042f)
                close()
            }
        }
        .build()
        return _checkCircle16!!
    }

private var _checkCircle16: ImageVector? = null
