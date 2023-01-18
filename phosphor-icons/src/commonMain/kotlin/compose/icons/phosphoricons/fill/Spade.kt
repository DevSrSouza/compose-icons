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

public val FillGroup.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 140.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, 56.0f)
                arcToRelative(55.2f, 55.2f, 0.0f, false, true, -25.9f, -6.4f)
                lineTo(162.0f, 225.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -1.1f, 7.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.4f, 3.3f)
                horizontalLineToRelative(-53.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.4f, -3.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -1.1f, -7.2f)
                lineToRelative(11.9f, -35.9f)
                arcTo(55.2f, 55.2f, 0.0f, false, true, 80.0f, 196.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, -56.0f)
                curveTo(24.0f, 86.4f, 121.7f, 23.3f, 125.8f, 20.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 4.4f, 0.0f)
                curveTo(134.3f, 23.3f, 232.0f, 86.4f, 232.0f, 140.0f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
