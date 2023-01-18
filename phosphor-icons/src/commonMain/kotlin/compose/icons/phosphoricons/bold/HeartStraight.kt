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

public val BoldGroup.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) {
            return _heartStraight!!
        }
        _heartStraight = Builder(name = "HeartStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 226.2f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -14.2f, -5.8f)
                lineTo(30.7f, 137.3f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, true, 2.5f, -92.9f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, true, 46.0f, -15.6f)
                arcToRelative(68.8f, 68.8f, 0.0f, false, true, 44.1f, 20.0f)
                lineToRelative(4.7f, 4.7f)
                lineToRelative(6.7f, -6.8f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, true, 92.9f, 2.5f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, true, 15.6f, 46.0f)
                arcToRelative(68.8f, 68.8f, 0.0f, false, true, -20.0f, 44.1f)
                lineToRelative(-81.1f, 81.1f)
                horizontalLineToRelative(0.0f)
                arcTo(19.8f, 19.8f, 0.0f, false, true, 128.0f, 226.2f)
                close()
                moveTo(133.6f, 211.9f)
                close()
                moveTo(75.0f, 52.7f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, false, -25.7f, 9.5f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -1.6f, 58.1f)
                lineTo(128.0f, 200.6f)
                lineToRelative(78.2f, -78.2f)
                curveToRelative(15.9f, -16.0f, 17.5f, -41.6f, 3.6f, -57.1f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -58.1f, -1.6f)
                lineTo(136.5f, 78.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(106.3f, 65.8f)
                arcTo(44.2f, 44.2f, 0.0f, false, false, 75.0f, 52.7f)
                close()
            }
        }
        .build()
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
