package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) {
            return _phoneOutgoing!!
        }
        _phoneOutgoing = Builder(name = "PhoneOutgoing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(223.6f, 174.1f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 176.0f, 216.0f)
                arcTo(136.0f, 136.0f, 0.0f, false, true, 40.0f, 80.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 81.9f, 32.4f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 8.3f, 4.8f)
                lineToRelative(20.1f, 46.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.6f, 7.5f)
                lineTo(93.0f, 117.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.5f, 7.8f)
                arcToRelative(83.6f, 83.6f, 0.0f, false, false, 39.0f, 38.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.9f, -0.6f)
                lineToRelative(25.0f, -16.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 7.6f, -0.7f)
                lineToRelative(46.8f, 20.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 223.6f, 174.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 158.4f)
                lineToRelative(-46.9f, -20.0f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -15.1f, 1.3f)
                lineToRelative(-25.1f, 16.7f)
                arcToRelative(76.5f, 76.5f, 0.0f, false, true, -35.2f, -35.0f)
                horizontalLineToRelative(0.0f)
                lineTo(116.3f, 96.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 1.4f, -15.1f)
                lineTo(97.6f, 34.0f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, -16.7f, -9.6f)
                arcTo(56.2f, 56.2f, 0.0f, false, false, 32.0f, 80.0f)
                curveToRelative(0.0f, 79.4f, 64.6f, 144.0f, 144.0f, 144.0f)
                arcToRelative(56.2f, 56.2f, 0.0f, false, false, 55.6f, -48.9f)
                arcTo(16.3f, 16.3f, 0.0f, false, false, 222.0f, 158.4f)
                close()
                moveTo(176.0f, 208.0f)
                arcTo(128.1f, 128.1f, 0.0f, false, true, 48.0f, 80.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 82.9f, 40.3f)
                lineTo(103.0f, 87.2f)
                lineTo(86.3f, 112.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.0f, 15.7f)
                arcToRelative(92.5f, 92.5f, 0.0f, false, false, 42.8f, 42.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.7f, -1.1f)
                lineToRelative(25.0f, -16.7f)
                lineToRelative(46.9f, 20.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 176.0f, 208.0f)
                close()
                moveTo(154.3f, 101.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(188.7f, 56.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(67.3f)
                lineToRelative(-34.3f, 34.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                close()
            }
        }
        .build()
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
