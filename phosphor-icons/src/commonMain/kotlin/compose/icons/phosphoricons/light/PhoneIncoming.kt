package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) {
            return _phoneIncoming!!
        }
        _phoneIncoming = Builder(name = "PhoneIncoming", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.2f, 160.3f)
                lineToRelative(-46.9f, -20.1f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -13.2f, 1.2f)
                lineTo(136.0f, 158.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.9f, 0.2f)
                arcToRelative(78.2f, 78.2f, 0.0f, false, true, -36.2f, -36.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.1f, -1.9f)
                lineToRelative(16.7f, -25.4f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 1.1f, -13.2f)
                lineTo(95.7f, 34.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.5f, -8.4f)
                arcTo(54.1f, 54.1f, 0.0f, false, false, 34.0f, 80.0f)
                curveToRelative(0.0f, 78.3f, 63.7f, 142.0f, 142.0f, 142.0f)
                arcToRelative(54.1f, 54.1f, 0.0f, false, false, 53.6f, -47.2f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 221.2f, 160.3f)
                close()
                moveTo(176.0f, 210.0f)
                arcTo(130.1f, 130.1f, 0.0f, false, true, 46.0f, 80.0f)
                arcTo(42.2f, 42.2f, 0.0f, false, true, 82.7f, 38.3f)
                horizontalLineToRelative(0.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.8f, 1.2f)
                lineToRelative(20.1f, 46.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.2f, 1.9f)
                lineTo(88.0f, 113.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -0.9f, 13.7f)
                arcToRelative(90.8f, 90.8f, 0.0f, false, false, 41.8f, 41.7f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, 13.8f, -1.0f)
                lineToRelative(25.0f, -16.7f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.9f, -0.2f)
                lineToRelative(46.9f, 20.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.2f, 2.0f)
                arcTo(42.2f, 42.2f, 0.0f, false, true, 176.0f, 210.0f)
                close()
                moveTo(154.1f, 97.1f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 154.0f, 96.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(81.5f)
                lineToRelative(37.8f, -37.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(174.5f, 90.0f)
                horizontalLineTo(200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(158.8f)
                lineToRelative(-1.0f, -0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-1.0f, -0.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -1.7f, -1.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, true, -0.5f, -1.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.3f, -1.0f)
                close()
            }
        }
        .build()
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null
