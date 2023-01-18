package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) {
            return _checkCircle!!
        }
        _checkCircle = Builder(name = "CheckCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.7f, 95.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.4f, 17.0f)
                lineToRelative(-58.7f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.3f, 3.3f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -8.3f, -3.3f)
                lineToRelative(-29.3f, -28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.6f, -17.4f)
                lineToRelative(21.0f, 20.1f)
                lineToRelative(50.4f, -48.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.7f, 95.7f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -84.0f, 84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
