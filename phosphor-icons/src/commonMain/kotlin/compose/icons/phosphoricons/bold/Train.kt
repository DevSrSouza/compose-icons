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

public val BoldGroup.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 20.0f)
                lineTo(68.0f, 20.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 32.0f, 56.0f)
                lineTo(32.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-9.6f, 12.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.4f, 16.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.8f, -2.4f)
                lineTo(102.0f, 220.0f)
                horizontalLineToRelative(52.0f)
                lineToRelative(20.4f, 27.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.8f, 2.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.4f, -16.8f)
                lineTo(184.0f, 220.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(224.0f, 56.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 188.0f, 20.0f)
                close()
                moveTo(56.0f, 116.0f)
                lineTo(56.0f, 84.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(140.0f, 84.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(32.0f)
                lineTo(140.0f, 116.0f)
                close()
                moveTo(68.0f, 44.0f)
                lineTo(188.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(56.0f, 60.0f)
                lineTo(56.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 44.0f)
                close()
                moveTo(188.0f, 196.0f)
                lineTo(68.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(56.0f, 140.0f)
                lineTo(200.0f, 140.0f)
                verticalLineToRelative(44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 196.0f)
                close()
                moveTo(104.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 168.0f)
                close()
                moveTo(184.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 184.0f, 168.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
