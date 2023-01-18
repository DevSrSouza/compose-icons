package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 24.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 104.0f, 104.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.1f, 24.0f)
                close()
                moveTo(180.5f, 86.1f)
                lineTo(152.4f, 148.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -4.2f, 4.0f)
                lineTo(88.8f, 177.8f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.1f, 0.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, -2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.7f, -8.8f)
                lineToRelative(25.5f, -59.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 4.0f, -4.2f)
                lineToRelative(62.1f, -28.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 10.6f, 10.6f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
