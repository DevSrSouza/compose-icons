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

public val BoldGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 100.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 88.0f)
                lineTo(180.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(76.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 100.0f)
                close()
                moveTo(76.0f, 152.0f)
                lineTo(180.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(76.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(236.0f, 56.0f)
                lineTo(236.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.7f, 10.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -11.7f, 0.5f)
                lineTo(192.0f, 205.4f)
                lineToRelative(-26.6f, 13.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.8f, 0.0f)
                lineTo(128.0f, 205.4f)
                lineToRelative(-26.6f, 13.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -10.8f, 0.0f)
                lineTo(64.0f, 205.4f)
                lineTo(37.4f, 218.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -11.7f, -0.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 20.0f, 208.0f)
                lineTo(20.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(212.0f, 60.0f)
                lineTo(44.0f, 60.0f)
                lineTo(44.0f, 188.6f)
                lineToRelative(14.6f, -7.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 10.8f, 0.0f)
                lineTo(96.0f, 194.6f)
                lineToRelative(26.6f, -13.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 10.8f, 0.0f)
                lineTo(160.0f, 194.6f)
                lineToRelative(26.6f, -13.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 10.8f, 0.0f)
                lineToRelative(14.6f, 7.3f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
