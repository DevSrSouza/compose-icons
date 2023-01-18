package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) {
            return _trainSimple!!
        }
        _trainSimple = Builder(name = "TrainSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 28.0f)
                lineTo(68.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 40.0f, 56.0f)
                lineTo(40.0f, 184.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(88.0f, 212.0f)
                lineTo(68.8f, 237.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.8f, 5.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.2f, -1.6f)
                lineTo(98.0f, 212.0f)
                horizontalLineToRelative(60.0f)
                lineToRelative(22.8f, 30.4f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 184.0f, 244.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, -0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.8f, -5.6f)
                lineTo(168.0f, 212.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(216.0f, 56.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 188.0f, 28.0f)
                close()
                moveTo(68.0f, 36.0f)
                lineTo(188.0f, 36.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(68.0f)
                lineTo(48.0f, 124.0f)
                lineTo(48.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 68.0f, 36.0f)
                close()
                moveTo(188.0f, 204.0f)
                lineTo(68.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(48.0f, 132.0f)
                lineTo(208.0f, 132.0f)
                verticalLineToRelative(52.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 188.0f, 204.0f)
                close()
                moveTo(92.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 172.0f)
                close()
                moveTo(180.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 180.0f, 172.0f)
                close()
            }
        }
        .build()
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null
