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

public val RegularGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 152.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 68.0f, 152.0f)
                close()
                moveTo(68.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 68.0f, 208.0f)
                close()
                moveTo(34.3f, 106.3f)
                lineTo(48.7f, 92.0f)
                lineTo(34.3f, 77.7f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 45.7f, 66.3f)
                lineTo(60.0f, 80.7f)
                lineTo(74.3f, 66.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 85.7f, 77.7f)
                lineTo(71.3f, 92.0f)
                lineToRelative(14.4f, 14.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(60.0f, 103.3f)
                lineTo(45.7f, 117.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 34.3f, 106.3f)
                close()
                moveTo(221.7f, 202.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(196.0f, 199.3f)
                lineToRelative(-14.3f, 14.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(184.7f, 188.0f)
                lineToRelative(-14.4f, -14.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(196.0f, 176.7f)
                lineToRelative(14.3f, -14.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(207.3f, 188.0f)
                close()
                moveTo(176.5f, 112.8f)
                curveToRelative(-6.2f, 22.4f, -25.3f, 41.7f, -46.6f, 47.0f)
                lineToRelative(-1.9f, 0.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -6.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 5.9f, -9.7f)
                curveToRelative(15.6f, -3.9f, 30.3f, -18.9f, 35.0f, -35.6f)
                curveToRelative(3.1f, -11.5f, 3.2f, -29.0f, -14.8f, -46.9f)
                lineTo(144.0f, 59.3f)
                lineTo(144.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(128.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(155.3f, 48.0f)
                lineToRelative(2.4f, 2.3f)
                curveTo(175.9f, 68.6f, 182.6f, 90.8f, 176.5f, 112.8f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
