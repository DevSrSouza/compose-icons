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

public val BoldGroup.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) {
            return _pinwheel!!
        }
        _pinwheel = Builder(name = "Pinwheel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.5f, 215.5f)
                lineToRelative(-43.9f, -43.9f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 35.6f, -81.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.4f, -7.2f)
                lineToRelative(-35.7f, 13.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 90.6f, 15.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.2f, 15.4f)
                lineToRelative(13.0f, 35.7f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -80.6f, 82.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 6.2f, 6.8f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, 5.1f, 1.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 4.1f, -0.7f)
                lineToRelative(35.7f, -13.0f)
                arcToRelative(63.9f, 63.9f, 0.0f, false, false, 82.5f, 80.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.2f, -15.4f)
                lineToRelative(-13.0f, -35.7f)
                arcToRelative(60.9f, 60.9f, 0.0f, false, false, 15.7f, 3.2f)
                lineToRelative(56.2f, 56.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.5f, 215.5f)
                close()
                moveTo(129.4f, 39.7f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, true, 19.3f, 53.1f)
                arcToRelative(38.6f, 38.6f, 0.0f, false, true, -11.9f, 14.9f)
                lineTo(110.7f, 35.9f)
                arcTo(39.8f, 39.8f, 0.0f, false, true, 129.4f, 39.7f)
                close()
                moveTo(39.7f, 110.6f)
                arcTo(39.8f, 39.8f, 0.0f, false, true, 62.2f, 89.9f)
                arcToRelative(40.8f, 40.8f, 0.0f, false, true, 13.7f, -2.4f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, true, 16.9f, 3.8f)
                arcToRelative(38.6f, 38.6f, 0.0f, false, true, 14.9f, 11.9f)
                lineTo(35.9f, 129.3f)
                arcTo(39.5f, 39.5f, 0.0f, false, true, 39.7f, 110.6f)
                close()
                moveTo(110.6f, 200.3f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, true, -19.3f, -53.1f)
                arcToRelative(38.6f, 38.6f, 0.0f, false, true, 11.9f, -14.9f)
                lineToRelative(26.1f, 71.8f)
                arcTo(39.8f, 39.8f, 0.0f, false, true, 110.6f, 200.3f)
                close()
                moveTo(132.3f, 136.8f)
                lineTo(204.1f, 110.7f)
                arcToRelative(40.4f, 40.4f, 0.0f, false, true, -26.3f, 39.4f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, true, -13.3f, 2.4f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(39.9f, 39.9f, 0.0f, false, true, -17.2f, -3.8f)
                arcTo(38.6f, 38.6f, 0.0f, false, true, 132.3f, 136.8f)
                close()
            }
        }
        .build()
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
