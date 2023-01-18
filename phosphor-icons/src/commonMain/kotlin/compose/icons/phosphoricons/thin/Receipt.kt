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

public val ThinGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(76.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(180.0f, 100.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 184.0f, 104.0f)
                close()
                moveTo(180.0f, 132.0f)
                lineTo(76.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(180.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 56.0f)
                lineTo(228.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.8f, 3.6f)
                lineTo(192.0f, 196.5f)
                lineToRelative(-30.2f, 15.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -3.6f, 0.0f)
                lineTo(128.0f, 196.5f)
                lineTo(97.8f, 211.6f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -3.6f, 0.0f)
                lineTo(64.0f, 196.5f)
                lineTo(33.8f, 211.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.9f, -0.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 28.0f, 208.0f)
                lineTo(28.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(216.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(220.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 201.5f)
                lineToRelative(26.2f, -13.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.6f, 0.0f)
                lineTo(96.0f, 203.5f)
                lineToRelative(30.2f, -15.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 3.6f, 0.0f)
                lineTo(160.0f, 203.5f)
                lineToRelative(30.2f, -15.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.6f, 0.0f)
                lineTo(220.0f, 201.5f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
