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

public val BoldGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.8f, 183.8f)
                lineTo(98.3f, 87.7f)
                arcTo(41.9f, 41.9f, 0.0f, false, false, 100.0f, 76.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, true, false, -15.3f, 31.4f)
                lineToRelative(30.0f, 20.6f)
                lineToRelative(-30.0f, 20.6f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 100.0f, 180.0f)
                arcToRelative(41.9f, 41.9f, 0.0f, false, false, -1.7f, -11.7f)
                lineTo(136.0f, 142.5f)
                lineToRelative(89.2f, 61.1f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 6.8f, 2.1f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.9f, -5.2f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 238.8f, 183.8f)
                close()
                moveTo(71.3f, 191.3f)
                horizontalLineToRelative(0.0f)
                arcTo(15.9f, 15.9f, 0.0f, true, true, 76.0f, 180.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 71.3f, 191.3f)
                close()
                moveTo(48.7f, 87.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 48.7f, 87.3f)
                close()
                moveTo(161.5f, 110.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.1f, -16.6f)
                lineToRelative(60.6f, -41.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.6f, 19.8f)
                lineToRelative(-60.6f, 41.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.7f, -3.2f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
