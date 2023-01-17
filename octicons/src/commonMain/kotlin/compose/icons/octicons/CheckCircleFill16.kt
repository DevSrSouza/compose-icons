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

public val Octicons.CheckCircleFill16: ImageVector
    get() {
        if (_checkCircleFill16 != null) {
            return _checkCircleFill16!!
        }
        _checkCircleFill16 = Builder(name = "CheckCircleFill16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(11.78f, 6.28f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -0.018f, -1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -1.042f, -0.018f)
                lineTo(6.75f, 9.19f)
                lineTo(5.28f, 7.72f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, -0.018f, 1.042f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _checkCircleFill16!!
    }

private var _checkCircleFill16: ImageVector? = null
