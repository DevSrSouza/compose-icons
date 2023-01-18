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

public val FillGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.2f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -7.3f, 13.5f)
                lineToRelative(-89.2f, 57.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 132.0f, 185.3f)
                verticalLineTo(142.7f)
                lineTo(44.7f, 198.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 20.0f, 185.3f)
                verticalLineTo(70.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 44.7f, 57.2f)
                lineTo(132.0f, 113.3f)
                verticalLineTo(70.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 24.7f, -13.5f)
                lineToRelative(89.2f, 57.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 253.2f, 128.0f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
