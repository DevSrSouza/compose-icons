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

public val FillGroup.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) {
            return _fastForwardCircle!!
        }
        _fastForwardCircle = Builder(name = "FastForwardCircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(184.6f, 134.6f)
                lineTo(144.6f, 162.6f)
                arcTo(8.6f, 8.6f, 0.0f, false, true, 140.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(132.0f, 128.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -3.4f, 6.6f)
                lineToRelative(-40.0f, 28.0f)
                arcTo(8.6f, 8.6f, 0.0f, false, true, 84.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(76.0f, 100.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 4.3f, -7.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.3f, 0.5f)
                lineToRelative(40.0f, 28.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 132.0f, 128.0f)
                lineTo(132.0f, 100.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 4.3f, -7.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.3f, 0.5f)
                lineToRelative(40.0f, 28.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 13.2f)
                close()
            }
        }
        .build()
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
