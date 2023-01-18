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

public val BoldGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 199.5f)
                lineTo(145.5f, 30.6f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -35.0f, 0.0f)
                lineTo(16.0f, 199.5f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 24.1f, 28.6f)
                lineTo(128.0f, 196.7f)
                lineToRelative(87.9f, 31.4f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 240.0f, 199.5f)
                close()
                moveTo(140.0f, 175.5f)
                lineTo(140.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(55.5f)
                lineTo(42.1f, 201.9f)
                lineTo(128.0f, 48.6f)
                lineToRelative(85.9f, 153.3f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
