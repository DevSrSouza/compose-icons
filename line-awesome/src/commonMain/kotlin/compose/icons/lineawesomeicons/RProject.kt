package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.RProject: ImageVector
    get() {
        if (_rProject != null) {
            return _rProject!!
        }
        _rProject = Builder(name = "RProject", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(8.268f, 5.0f, 2.0f, 9.253f, 2.0f, 14.5f)
                curveTo(2.0f, 19.285f, 7.2178f, 23.2327f, 14.0f, 23.8926f)
                lineTo(14.0f, 26.0f)
                lineTo(18.0f, 26.0f)
                lineTo(18.0f, 23.8926f)
                curveTo(19.3239f, 23.7638f, 20.5865f, 23.5122f, 21.7637f, 23.1504f)
                lineTo(23.3301f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(25.3008f, 21.5859f)
                curveTo(28.1781f, 19.8461f, 30.0f, 17.3212f, 30.0f, 14.5f)
                curveTo(30.0f, 9.253f, 23.732f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(17.5f, 8.0f)
                curveTo(23.299f, 8.0f, 28.0f, 11.134f, 28.0f, 15.0f)
                curveTo(28.0f, 17.1301f, 26.5681f, 19.0345f, 24.3164f, 20.3184f)
                curveTo(24.0893f, 20.1306f, 23.8391f, 19.9759f, 23.5664f, 19.8594f)
                curveTo(25.534f, 19.3785f, 27.0f, 17.6156f, 27.0f, 15.5f)
                curveTo(27.0f, 13.015f, 24.985f, 11.0f, 22.5f, 11.0f)
                lineTo(14.0f, 11.0f)
                lineTo(14.0f, 21.5938f)
                curveTo(9.9241f, 20.632f, 7.0f, 18.0468f, 7.0f, 15.0f)
                curveTo(7.0f, 11.134f, 11.701f, 8.0f, 17.5f, 8.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(21.5f, 14.0f)
                curveTo(22.328f, 14.0f, 23.0f, 14.672f, 23.0f, 15.5f)
                curveTo(23.0f, 16.328f, 22.328f, 17.0f, 21.5f, 17.0f)
                lineTo(18.0f, 17.0f)
                lineTo(18.0f, 14.0f)
                close()
                moveTo(18.0f, 20.0f)
                lineTo(19.1289f, 20.0f)
                curveTo(19.6869f, 20.0f, 20.1988f, 20.304f, 20.4668f, 20.793f)
                lineTo(20.918f, 21.6133f)
                curveTo(19.9964f, 21.825f, 19.0175f, 21.9504f, 18.0f, 21.9824f)
                lineTo(18.0f, 20.0f)
                close()
            }
        }
        .build()
        return _rProject!!
    }

private var _rProject: ImageVector? = null
