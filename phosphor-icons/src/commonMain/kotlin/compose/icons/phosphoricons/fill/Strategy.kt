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

public val FillGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 104.0f, 188.0f)
                close()
                moveTo(34.3f, 117.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(60.0f, 103.3f)
                lineToRelative(14.3f, 14.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(71.3f, 92.0f)
                lineTo(85.7f, 77.7f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 74.3f, 66.3f)
                lineTo(60.0f, 80.7f)
                lineTo(45.7f, 66.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 34.3f, 77.7f)
                lineTo(48.7f, 92.0f)
                lineTo(34.3f, 106.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 34.3f, 117.7f)
                close()
                moveTo(207.3f, 188.0f)
                lineTo(221.7f, 173.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineTo(196.0f, 176.7f)
                lineToRelative(-14.3f, -14.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineTo(184.7f, 188.0f)
                lineToRelative(-14.4f, 14.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(196.0f, 199.3f)
                lineToRelative(14.3f, 14.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                close()
                moveTo(157.7f, 50.3f)
                lineTo(155.3f, 48.0f)
                lineTo(176.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(128.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(144.0f, 59.3f)
                lineToRelative(2.3f, 2.4f)
                curveToRelative(18.0f, 17.9f, 17.9f, 35.4f, 14.8f, 46.9f)
                curveToRelative(-4.7f, 16.7f, -19.4f, 31.7f, -35.0f, 35.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -5.9f, 9.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 160.0f)
                lineToRelative(1.9f, -0.2f)
                curveToRelative(21.3f, -5.3f, 40.4f, -24.6f, 46.6f, -47.0f)
                reflectiveCurveTo(175.9f, 68.6f, 157.7f, 50.3f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
