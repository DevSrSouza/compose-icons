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

public val FillGroup.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) {
            return _bellRinging!!
        }
        _bellRinging = Builder(name = "BellRinging", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.6f, 74.1f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, true, -3.5f, -0.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.6f, -10.7f)
                arcTo(111.7f, 111.7f, 0.0f, false, true, 68.3f, 17.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.5f, 13.6f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, false, -35.0f, 38.8f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 34.6f, 74.1f)
                close()
                moveTo(228.5f, 62.6f)
                arcToRelative(111.7f, 111.7f, 0.0f, false, false, -40.8f, -45.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.5f, 13.6f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, true, 35.0f, 38.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.2f, 4.5f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, 3.5f, -0.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 228.5f, 62.6f)
                close()
                moveTo(220.8f, 175.9f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 0.1f, 16.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.9f, 8.0f)
                lineTo(168.0f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -80.0f, 0.0f)
                lineTo(49.0f, 200.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.9f, -8.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 0.1f, -16.1f)
                curveToRelative(5.9f, -10.2f, 13.0f, -29.6f, 13.0f, -63.9f)
                arcTo(79.9f, 79.9f, 0.0f, false, true, 128.0f, 32.0f)
                horizontalLineToRelative(0.6f)
                arcToRelative(79.7f, 79.7f, 0.0f, false, true, 79.2f, 80.0f)
                curveTo(207.8f, 146.3f, 214.9f, 165.7f, 220.8f, 175.9f)
                close()
                moveTo(152.0f, 200.0f)
                lineTo(104.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
