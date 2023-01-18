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

public val FillGroup.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) {
            return _flyingSaucer!!
        }
        _flyingSaucer = Builder(name = "FlyingSaucer", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.6f, 211.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -6.6f, 9.2f)
                horizontalLineToRelative(-1.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.9f, -6.7f)
                lineToRelative(-3.9f, -23.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.8f, -2.7f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 184.0f)
                close()
                moveTo(88.5f, 180.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -9.2f, 6.5f)
                lineTo(75.4f, 211.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 6.6f, 9.2f)
                horizontalLineToRelative(1.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.9f, -6.7f)
                lineToRelative(3.9f, -23.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.5f, 180.9f)
                close()
                moveTo(248.0f, 112.0f)
                curveToRelative(0.0f, 16.2f, -13.4f, 30.9f, -37.7f, 41.3f)
                curveTo(188.2f, 162.8f, 159.0f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveToRelative(-60.2f, -5.2f, -82.3f, -14.7f)
                curveTo(21.4f, 142.9f, 8.0f, 128.2f, 8.0f, 112.0f)
                curveToRelative(0.0f, -8.4f, 3.7f, -20.8f, 21.2f, -32.5f)
                curveToRelative(11.3f, -7.6f, 26.9f, -13.8f, 45.2f, -17.9f)
                arcTo(63.6f, 63.6f, 0.0f, false, true, 173.0f, 50.5f)
                arcToRelative(64.7f, 64.7f, 0.0f, false, true, 9.1f, 11.2f)
                curveTo(223.4f, 71.1f, 248.0f, 89.7f, 248.0f, 112.0f)
                close()
                moveTo(80.0f, 96.8f)
                verticalLineToRelative(3.1f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 6.1f, 7.7f)
                arcTo(189.1f, 189.1f, 0.0f, false, false, 128.0f, 112.0f)
                arcToRelative(189.1f, 189.1f, 0.0f, false, false, 41.9f, -4.4f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 6.1f, -7.7f)
                lineTo(176.0f, 96.0f)
                arcToRelative(47.5f, 47.5f, 0.0f, false, false, -6.1f, -23.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(51.7f, 51.7f, 0.0f, false, false, -8.2f, -10.7f)
                arcTo(47.4f, 47.4f, 0.0f, false, false, 127.4f, 48.0f)
                curveTo(101.2f, 48.3f, 80.0f, 70.2f, 80.0f, 96.8f)
                close()
            }
        }
        .build()
        return _flyingSaucer!!
    }

private var _flyingSaucer: ImageVector? = null
