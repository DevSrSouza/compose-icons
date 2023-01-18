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

public val RegularGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.7f, 77.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 35.0f, 65.8f)
                arcTo(81.8f, 81.8f, 0.0f, false, true, 64.1f, 52.2f)
                curveToRelative(16.1f, -4.0f, 41.1f, -5.0f, 68.3f, 13.1f)
                curveToRelative(42.4f, 28.3f, 77.2f, 1.6f, 78.6f, 0.4f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 222.3f, 67.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.0f, 78.2f)
                arcToRelative(81.8f, 81.8f, 0.0f, false, true, -29.1f, 13.6f)
                arcToRelative(81.0f, 81.0f, 0.0f, false, true, -19.7f, 2.4f)
                curveToRelative(-14.0f, 0.0f, -30.8f, -3.7f, -48.6f, -15.5f)
                curveTo(81.2f, 50.4f, 46.4f, 77.1f, 45.0f, 78.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 33.7f, 77.0f)
                close()
                moveTo(211.0f, 121.7f)
                curveToRelative(-1.4f, 1.2f, -36.2f, 27.9f, -78.6f, -0.4f)
                curveToRelative(-27.2f, -18.1f, -52.2f, -17.1f, -68.3f, -13.1f)
                arcTo(81.8f, 81.8f, 0.0f, false, false, 35.0f, 121.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 33.7f, 133.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 45.0f, 134.3f)
                curveToRelative(1.4f, -1.2f, 36.2f, -27.9f, 78.6f, 0.4f)
                curveToRelative(17.8f, 11.8f, 34.6f, 15.5f, 48.6f, 15.5f)
                arcToRelative(81.0f, 81.0f, 0.0f, false, false, 19.7f, -2.4f)
                arcTo(81.8f, 81.8f, 0.0f, false, false, 221.0f, 134.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.3f, -11.2f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 211.0f, 121.7f)
                close()
                moveTo(211.0f, 177.7f)
                curveToRelative(-1.4f, 1.2f, -36.2f, 27.9f, -78.6f, -0.4f)
                curveToRelative(-27.2f, -18.1f, -52.2f, -17.1f, -68.3f, -13.1f)
                arcTo(81.8f, 81.8f, 0.0f, false, false, 35.0f, 177.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 33.7f, 189.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 45.0f, 190.3f)
                curveToRelative(1.4f, -1.2f, 36.2f, -27.9f, 78.6f, 0.4f)
                curveToRelative(17.8f, 11.8f, 34.6f, 15.5f, 48.6f, 15.5f)
                arcToRelative(82.6f, 82.6f, 0.0f, false, false, 48.8f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.3f, -11.2f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 211.0f, 177.7f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
