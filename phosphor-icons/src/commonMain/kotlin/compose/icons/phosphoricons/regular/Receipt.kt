package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(180.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(76.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 68.0f, 104.0f)
                close()
                moveTo(76.0f, 144.0f)
                lineTo(180.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(76.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 208.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.8f, 6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, 0.4f)
                lineTo(192.0f, 200.9f)
                lineToRelative(-28.4f, 14.3f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.2f, 0.0f)
                lineTo(128.0f, 200.9f)
                lineTo(99.6f, 215.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -7.2f, 0.0f)
                lineTo(64.0f, 200.9f)
                lineTo(35.6f, 215.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -0.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 24.0f, 208.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(216.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 195.1f)
                lineToRelative(20.4f, -10.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 7.2f, 0.0f)
                lineTo(96.0f, 199.1f)
                lineToRelative(28.4f, -14.3f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 7.2f, 0.0f)
                lineTo(160.0f, 199.1f)
                lineToRelative(28.4f, -14.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 7.2f, 0.0f)
                lineTo(216.0f, 195.1f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
