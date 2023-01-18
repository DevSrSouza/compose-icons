package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ApprovalsApp: ImageVector
    get() {
        if (_approvalsApp != null) {
            return _approvalsApp!!
        }
        _approvalsApp = Builder(name = "ApprovalsApp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5429f, 1.7929f)
                curveTo(10.9334f, 1.4024f, 11.5666f, 1.4024f, 11.9571f, 1.7929f)
                lineTo(14.457f, 4.2928f)
                curveTo(14.6445f, 4.4803f, 14.7499f, 4.7347f, 14.7499f, 4.9999f)
                curveTo(14.7499f, 5.2651f, 14.6445f, 5.5195f, 14.457f, 5.707f)
                lineTo(11.9571f, 8.2069f)
                curveTo(11.5666f, 8.5974f, 10.9334f, 8.5974f, 10.5429f, 8.2069f)
                curveTo(10.1524f, 7.8163f, 10.1524f, 7.1832f, 10.5429f, 6.7926f)
                lineTo(11.3011f, 6.0345f)
                curveTo(7.7632f, 6.3852f, 5.0f, 9.3699f, 5.0f, 13.0f)
                curveTo(5.0f, 16.866f, 8.134f, 20.0f, 12.0f, 20.0f)
                curveTo(15.5689f, 20.0f, 18.5153f, 17.3283f, 18.9458f, 13.8763f)
                curveTo(19.0141f, 13.3282f, 19.5138f, 12.9393f, 20.0618f, 13.0077f)
                curveTo(20.6099f, 13.076f, 20.9988f, 13.5757f, 20.9304f, 14.1237f)
                curveTo(20.3767f, 18.5644f, 16.5903f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 17.9706f, 3.0f, 13.0f)
                curveTo(3.0f, 8.2452f, 6.6872f, 4.3516f, 11.3583f, 4.0225f)
                lineTo(10.5429f, 3.2071f)
                curveTo(10.1524f, 2.8166f, 10.1524f, 2.1834f, 10.5429f, 1.7929f)
                close()
                moveTo(16.2071f, 9.7929f)
                curveTo(16.5976f, 10.1834f, 16.5976f, 10.8166f, 16.2071f, 11.2071f)
                lineTo(11.7071f, 15.7071f)
                curveTo(11.3166f, 16.0976f, 10.6834f, 16.0976f, 10.2929f, 15.7071f)
                lineTo(8.2929f, 13.7071f)
                curveTo(7.9024f, 13.3166f, 7.9024f, 12.6834f, 8.2929f, 12.2929f)
                curveTo(8.6834f, 11.9024f, 9.3166f, 11.9024f, 9.7071f, 12.2929f)
                lineTo(11.0f, 13.5858f)
                lineTo(14.7929f, 9.7929f)
                curveTo(15.1834f, 9.4024f, 15.8166f, 9.4024f, 16.2071f, 9.7929f)
                close()
            }
        }
        .build()
        return _approvalsApp!!
    }

private var _approvalsApp: ImageVector? = null
