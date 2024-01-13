package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Paste: ImageVector
    get() {
        if (_paste != null) {
            return _paste!!
        }
        _paste = Builder(name = "Paste", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.6f, 48.0f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 48.0f, 0.0f, 76.7f, 0.0f, 112.0f)
                verticalLineTo(384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(400.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(112.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineTo(80.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(72.4f)
                curveTo(202.0f, 108.4f, 227.6f, 96.0f, 256.0f, 96.0f)
                horizontalLineToRelative(62.0f)
                curveToRelative(-7.1f, -27.6f, -32.2f, -48.0f, -62.0f, -48.0f)
                horizontalLineTo(215.4f)
                curveTo(211.6f, 20.9f, 188.2f, 0.0f, 160.0f, 0.0f)
                reflectiveCurveToRelative(-51.6f, 20.9f, -55.4f, 48.0f)
                close()
                moveTo(144.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
                close()
                moveTo(448.0f, 464.0f)
                horizontalLineTo(256.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(140.1f, 0.0f)
                lineTo(464.0f, 243.9f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(256.0f, 512.0f)
                horizontalLineTo(448.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(243.9f)
                curveToRelative(0.0f, -12.7f, -5.1f, -24.9f, -14.1f, -33.9f)
                lineToRelative(-67.9f, -67.9f)
                curveToRelative(-9.0f, -9.0f, -21.2f, -14.1f, -33.9f, -14.1f)
                horizontalLineTo(256.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _paste!!
    }

private var _paste: ImageVector? = null
