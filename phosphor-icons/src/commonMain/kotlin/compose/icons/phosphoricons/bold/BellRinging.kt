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

public val BoldGroup.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) {
            return _bellRinging!!
        }
        _bellRinging = Builder(name = "BellRinging", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.8f, 112.0f)
                arcToRelative(83.6f, 83.6f, 0.0f, false, false, -83.2f, -84.0f)
                horizontalLineTo(128.0f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, false, -83.8f, 84.0f)
                curveToRelative(0.0f, 33.4f, -6.8f, 52.1f, -12.5f, 61.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 0.0f, 20.1f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 49.0f, 204.0f)
                horizontalLineTo(84.2f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 87.6f, 0.0f)
                horizontalLineTo(207.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 17.3f, -10.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 0.0f, -20.1f)
                curveTo(218.6f, 164.1f, 211.8f, 145.4f, 211.8f, 112.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -19.6f, -16.0f)
                horizontalLineToRelative(39.2f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(55.6f, 180.0f)
                curveToRelative(10.3f, -21.5f, 12.6f, -48.4f, 12.6f, -68.0f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 85.9f, 69.3f)
                arcTo(59.3f, 59.3f, 0.0f, false, true, 128.0f, 52.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, true, 59.3f, 60.0f)
                curveToRelative(0.0f, 19.6f, 2.3f, 46.5f, 12.6f, 68.0f)
                close()
                moveTo(233.8f, 73.3f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, true, -5.3f, 1.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.7f, -6.7f)
                arcToRelative(100.4f, 100.4f, 0.0f, false, false, -36.5f, -40.5f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 194.1f, 7.1f)
                arcToRelative(123.7f, 123.7f, 0.0f, false, true, 45.2f, 50.2f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 233.8f, 73.3f)
                close()
                moveTo(27.5f, 74.6f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, true, -5.3f, -1.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -5.5f, -16.0f)
                arcTo(123.7f, 123.7f, 0.0f, false, true, 61.9f, 7.1f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 74.7f, 27.4f)
                arcTo(100.4f, 100.4f, 0.0f, false, false, 38.2f, 67.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 27.5f, 74.6f)
                close()
            }
        }
        .build()
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
