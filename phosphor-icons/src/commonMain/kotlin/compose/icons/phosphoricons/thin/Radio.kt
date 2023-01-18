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

public val ThinGroup.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 76.0f)
                lineTo(59.3f, 76.0f)
                lineTo(193.1f, 35.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.2f, -7.6f)
                lineToRelative(-160.0f, 48.0f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.4f, 0.2f)
                lineToRelative(-0.4f, 0.2f)
                lineToRelative(-0.3f, 0.2f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(-0.3f, 0.2f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.2f, 0.3f)
                lineToRelative(-0.2f, 0.3f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.3f, -0.2f, 0.4f)
                reflectiveCurveToRelative(-0.1f, 0.2f, -0.1f, 0.3f)
                reflectiveCurveToRelative(-0.1f, 0.3f, -0.2f, 0.4f)
                verticalLineToRelative(0.4f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.1f, 0.4f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 84.0f)
                lineTo(216.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(160.0f, 108.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 160.0f, 108.0f)
                close()
                moveTo(160.0f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 160.0f, 172.0f)
                close()
                moveTo(100.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(64.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(96.0f, 108.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 112.0f)
                close()
                moveTo(100.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(64.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(96.0f, 140.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 144.0f)
                close()
                moveTo(100.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(64.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(96.0f, 172.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 176.0f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
