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

public val BoldGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
                moveTo(60.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 58.6f, -35.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -11.2f, 21.2f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 100.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 7.4f, -1.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.2f, 21.2f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 60.0f, 128.0f)
                close()
                moveTo(132.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 58.6f, -35.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -11.2f, 21.2f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 172.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 7.4f, -1.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.2f, 21.2f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 132.0f, 128.0f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
