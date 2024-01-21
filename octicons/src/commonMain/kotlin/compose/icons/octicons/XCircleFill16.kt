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

public val Octicons.XCircleFill16: ImageVector
    get() {
        if (_xCircleFill16 != null) {
            return _xCircleFill16!!
        }
        _xCircleFill16 = Builder(name = "XCircleFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.343f, 13.657f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 13.658f, 2.343f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 2.343f, 13.657f)
                close()
                moveTo(6.03f, 4.97f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -0.018f, 1.042f)
                lineTo(6.94f, 8.0f)
                lineTo(4.97f, 9.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.734f, -0.215f)
                lineTo(8.0f, 9.06f)
                lineToRelative(1.97f, 1.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 1.275f, -0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.215f, -0.734f)
                lineTo(9.06f, 8.0f)
                lineToRelative(1.97f, -1.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.326f, -1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.734f, 0.215f)
                lineTo(8.0f, 6.94f)
                close()
            }
        }
        .build()
        return _xCircleFill16!!
    }

private var _xCircleFill16: ImageVector? = null
