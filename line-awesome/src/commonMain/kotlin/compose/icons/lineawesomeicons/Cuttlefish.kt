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

public val LineAwesomeIcons.Cuttlefish: ImageVector
    get() {
        if (_cuttlefish != null) {
            return _cuttlefish!!
        }
        _cuttlefish = Builder(name = "Cuttlefish", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                curveTo(9.831f, 3.0f, 4.0f, 8.831f, 4.0f, 16.0f)
                curveTo(4.0f, 23.169f, 9.832f, 29.0f, 17.0f, 29.0f)
                curveTo(20.641f, 29.0f, 24.017f, 27.535f, 26.502f, 24.875f)
                lineTo(27.377f, 23.939f)
                lineTo(26.307f, 23.232f)
                curveTo(23.222f, 20.468f, 21.938f, 17.495f, 21.785f, 17.123f)
                curveTo(20.619f, 18.684f, 18.789f, 20.0f, 17.0f, 20.0f)
                curveTo(14.791f, 20.0f, 13.0f, 18.209f, 13.0f, 16.0f)
                curveTo(13.0f, 13.791f, 14.791f, 12.0f, 17.0f, 12.0f)
                curveTo(18.793f, 12.0f, 20.628f, 13.321f, 21.795f, 14.887f)
                curveTo(21.932f, 14.58f, 23.679f, 10.736f, 26.307f, 8.768f)
                lineTo(27.377f, 8.061f)
                lineTo(26.502f, 7.125f)
                curveTo(24.015f, 4.465f, 20.641f, 3.0f, 17.0f, 3.0f)
                close()
                moveTo(17.0f, 5.0f)
                curveTo(19.751f, 5.0f, 22.323f, 5.989f, 24.34f, 7.803f)
                curveTo(23.069f, 8.95f, 22.039f, 10.37f, 21.295f, 11.582f)
                curveTo(20.073f, 10.667f, 18.59f, 10.0f, 17.0f, 10.0f)
                curveTo(13.692f, 10.0f, 11.0f, 12.692f, 11.0f, 16.0f)
                curveTo(11.0f, 19.308f, 13.692f, 22.0f, 17.0f, 22.0f)
                curveTo(18.591f, 22.0f, 20.075f, 21.33f, 21.297f, 20.414f)
                curveTo(22.005f, 21.515f, 23.01f, 22.843f, 24.375f, 24.164f)
                curveTo(22.353f, 25.999f, 19.767f, 27.0f, 17.0f, 27.0f)
                curveTo(10.935f, 27.0f, 6.0f, 22.065f, 6.0f, 16.0f)
                curveTo(6.0f, 9.935f, 10.934f, 5.0f, 17.0f, 5.0f)
                close()
            }
        }
        .build()
        return _cuttlefish!!
    }

private var _cuttlefish: ImageVector? = null
