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

public val BoldGroup.Bandaids: ImageVector
    get() {
        if (_bandaids != null) {
            return _bandaids!!
        }
        _bandaids = Builder(name = "Bandaids", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.2f, 128.0f)
                lineToRelative(24.9f, -24.9f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -62.2f, -62.2f)
                lineTo(128.0f, 65.8f)
                lineTo(103.1f, 40.9f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -62.2f, 62.2f)
                lineTo(65.8f, 128.0f)
                lineTo(40.9f, 152.9f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 62.2f, 62.2f)
                lineTo(128.0f, 190.2f)
                lineToRelative(24.9f, 24.9f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 62.2f, -62.2f)
                close()
                moveTo(169.9f, 57.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, true, true, 28.2f, 28.2f)
                lineTo(173.3f, 111.0f)
                lineTo(145.0f, 82.7f)
                close()
                moveTo(156.3f, 128.0f)
                lineTo(128.0f, 156.3f)
                lineTo(99.7f, 128.0f)
                lineTo(128.0f, 99.7f)
                close()
                moveTo(57.9f, 86.1f)
                arcTo(19.9f, 19.9f, 0.0f, true, true, 86.1f, 57.9f)
                lineTo(111.0f, 82.7f)
                lineTo(82.7f, 111.0f)
                close()
                moveTo(86.1f, 198.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, true, true, -28.2f, -28.2f)
                lineTo(82.7f, 145.0f)
                lineTo(111.0f, 173.3f)
                close()
                moveTo(198.1f, 198.1f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -28.2f, 0.0f)
                lineTo(145.0f, 173.3f)
                lineTo(173.3f, 145.0f)
                lineToRelative(24.8f, 24.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, 28.2f)
                close()
            }
        }
        .build()
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
