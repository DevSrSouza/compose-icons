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

public val ThinGroup.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) {
            return _flyingSaucer!!
        }
        _flyingSaucer = Builder(name = "FlyingSaucer", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.7f, 211.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.3f, 4.6f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.4f)
                lineToRelative(-4.0f, -23.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.3f, -4.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.6f, 3.3f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 192.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 188.0f)
                close()
                moveTo(87.9f, 184.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.6f, 3.3f)
                lineToRelative(-4.0f, 23.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.3f, 4.6f)
                horizontalLineToRelative(0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.9f, -3.4f)
                lineToRelative(4.0f, -23.5f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 87.9f, 184.8f)
                close()
                moveTo(244.0f, 112.0f)
                curveToRelative(0.0f, 29.2f, -51.0f, 52.0f, -116.0f, 52.0f)
                reflectiveCurveTo(12.0f, 141.2f, 12.0f, 112.0f)
                curveToRelative(0.0f, -20.3f, 24.8f, -38.2f, 64.8f, -46.8f)
                arcTo(60.2f, 60.2f, 0.0f, false, true, 127.2f, 36.0f)
                arcToRelative(59.5f, 59.5f, 0.0f, false, true, 42.9f, 17.3f)
                arcToRelative(60.4f, 60.4f, 0.0f, false, true, 9.5f, 12.0f)
                curveTo(219.4f, 74.0f, 244.0f, 91.8f, 244.0f, 112.0f)
                close()
                moveTo(76.0f, 96.8f)
                verticalLineToRelative(3.1f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 9.2f, 11.6f)
                arcTo(191.2f, 191.2f, 0.0f, false, false, 128.0f, 116.0f)
                arcToRelative(189.7f, 189.7f, 0.0f, false, false, 42.7f, -4.5f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 180.0f, 99.9f)
                lineTo(180.0f, 96.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, -52.7f, -52.0f)
                curveTo(99.0f, 44.4f, 76.0f, 68.1f, 76.0f, 96.8f)
                close()
                moveTo(236.0f, 112.0f)
                curveToRelative(0.0f, -15.1f, -20.1f, -29.4f, -51.9f, -37.4f)
                arcTo(61.1f, 61.1f, 0.0f, false, true, 188.0f, 96.0f)
                verticalLineToRelative(3.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -15.5f, 19.4f)
                arcTo(199.9f, 199.9f, 0.0f, false, true, 128.0f, 124.0f)
                arcToRelative(199.9f, 199.9f, 0.0f, false, true, -44.5f, -4.7f)
                arcTo(19.8f, 19.8f, 0.0f, false, true, 68.0f, 99.9f)
                horizontalLineToRelative(0.0f)
                lineTo(68.0f, 96.8f)
                arcToRelative(61.4f, 61.4f, 0.0f, false, true, 4.2f, -22.3f)
                curveTo(40.2f, 82.5f, 20.0f, 96.9f, 20.0f, 112.0f)
                curveToRelative(0.0f, 23.9f, 49.5f, 44.0f, 108.0f, 44.0f)
                reflectiveCurveTo(236.0f, 135.9f, 236.0f, 112.0f)
                close()
            }
        }
        .build()
        return _flyingSaucer!!
    }

private var _flyingSaucer: ImageVector? = null
