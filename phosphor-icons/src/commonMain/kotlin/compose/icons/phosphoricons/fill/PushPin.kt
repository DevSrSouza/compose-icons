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

public val FillGroup.PushPin: ImageVector
    get() {
        if (_pushPin != null) {
            return _pushPin!!
        }
        _pushPin = Builder(name = "PushPin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 107.3f)
                lineToRelative(-58.5f, 58.5f)
                curveToRelative(4.5f, 12.7f, 6.4f, 33.9f, -13.2f, 60.0f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, -11.7f, 6.4f)
                horizontalLineToRelative(-1.1f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -11.3f, -4.7f)
                lineTo(88.0f, 179.3f)
                lineTo(53.7f, 213.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(76.7f, 168.0f)
                lineTo(28.3f, 119.6f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 1.3f, -23.8f)
                curveTo(55.0f, 75.3f, 79.3f, 79.4f, 90.0f, 82.7f)
                lineTo(148.7f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 22.6f, 0.0f)
                lineTo(232.0f, 84.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.0f, 22.6f)
                close()
            }
        }
        .build()
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
