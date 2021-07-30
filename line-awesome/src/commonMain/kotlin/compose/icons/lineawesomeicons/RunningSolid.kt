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

public val LineAwesomeIcons.RunningSolid: ImageVector
    get() {
        if (_runningSolid != null) {
            return _runningSolid!!
        }
        _runningSolid = Builder(name = "RunningSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2188f, 5.0f)
                curveTo(18.5391f, 5.0f, 17.1563f, 6.3828f, 17.1563f, 8.0625f)
                curveTo(17.1563f, 9.7422f, 18.5391f, 11.125f, 20.2188f, 11.125f)
                curveTo(21.9023f, 11.125f, 23.3125f, 9.7422f, 23.3125f, 8.0625f)
                curveTo(23.3125f, 6.3828f, 21.9023f, 5.0f, 20.2188f, 5.0f)
                close()
                moveTo(20.2188f, 7.0f)
                curveTo(20.8203f, 7.0f, 21.3125f, 7.4648f, 21.3125f, 8.0625f)
                curveTo(21.3125f, 8.6602f, 20.8203f, 9.125f, 20.2188f, 9.125f)
                curveTo(19.6211f, 9.125f, 19.1563f, 8.6641f, 19.1563f, 8.0625f)
                curveTo(19.1563f, 7.4648f, 19.6211f, 7.0f, 20.2188f, 7.0f)
                close()
                moveTo(12.9375f, 9.0f)
                curveTo(12.457f, 9.0586f, 11.9727f, 9.2813f, 11.625f, 9.6563f)
                lineTo(8.25f, 13.3125f)
                lineTo(9.75f, 14.6875f)
                lineTo(13.0938f, 11.0313f)
                curveTo(13.1289f, 10.9961f, 13.1758f, 10.9727f, 13.2188f, 11.0f)
                lineTo(14.8125f, 12.0625f)
                lineTo(12.4688f, 15.3125f)
                curveTo(11.7344f, 16.3438f, 11.8555f, 17.7617f, 12.75f, 18.6563f)
                lineTo(16.2813f, 22.1875f)
                lineTo(13.375f, 28.0f)
                lineTo(15.625f, 28.0f)
                lineTo(18.0938f, 23.0938f)
                curveTo(18.4805f, 22.3242f, 18.3281f, 21.3906f, 17.7188f, 20.7813f)
                lineTo(14.1875f, 17.25f)
                curveTo(13.9844f, 17.0469f, 13.957f, 16.7031f, 14.125f, 16.4688f)
                lineTo(16.4688f, 13.1875f)
                lineTo(17.2813f, 13.7188f)
                lineTo(18.875f, 16.125f)
                curveTo(19.2461f, 16.6797f, 19.8633f, 17.0f, 20.5313f, 17.0f)
                lineTo(25.0f, 17.0f)
                lineTo(25.0f, 15.0f)
                lineTo(20.5313f, 15.0f)
                lineTo(18.8438f, 12.4375f)
                lineTo(18.7188f, 12.2813f)
                lineTo(18.5625f, 12.1563f)
                lineTo(14.3438f, 9.3438f)
                curveTo(13.918f, 9.0586f, 13.418f, 8.9414f, 12.9375f, 9.0f)
                close()
                moveTo(12.0625f, 19.5313f)
                lineTo(10.5938f, 21.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 23.0f)
                lineTo(10.5938f, 23.0f)
                curveTo(11.1211f, 23.0f, 11.625f, 22.7852f, 12.0f, 22.4063f)
                lineTo(13.4688f, 20.9375f)
                close()
            }
        }
        .build()
        return _runningSolid!!
    }

private var _runningSolid: ImageVector? = null
