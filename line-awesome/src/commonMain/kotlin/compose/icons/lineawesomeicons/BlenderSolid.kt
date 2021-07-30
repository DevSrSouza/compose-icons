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

public val LineAwesomeIcons.BlenderSolid: ImageVector
    get() {
        if (_blenderSolid != null) {
            return _blenderSolid!!
        }
        _blenderSolid = Builder(name = "BlenderSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveTo(6.346f, 5.0f, 5.0f, 6.346f, 5.0f, 8.0f)
                lineTo(5.0f, 13.0f)
                curveTo(5.0f, 14.654f, 6.346f, 16.0f, 8.0f, 16.0f)
                lineTo(11.2422f, 16.0f)
                lineTo(11.8691f, 21.0137f)
                curveTo(10.277f, 21.0839f, 9.0f, 22.3908f, 9.0f, 24.0f)
                lineTo(9.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                lineTo(26.0f, 24.0f)
                curveTo(26.0f, 22.4323f, 24.7865f, 21.1559f, 23.252f, 21.0254f)
                lineTo(26.957f, 5.0f)
                lineTo(14.0f, 5.0f)
                lineTo(9.8672f, 5.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(10.1172f, 7.0f)
                lineTo(10.9922f, 14.0f)
                lineTo(8.0f, 14.0f)
                curveTo(7.449f, 14.0f, 7.0f, 13.551f, 7.0f, 13.0f)
                lineTo(7.0f, 8.0f)
                curveTo(7.0f, 7.449f, 7.449f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(12.1328f, 7.0f)
                lineTo(14.0f, 7.0f)
                lineTo(24.4414f, 7.0f)
                lineTo(23.9785f, 9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 11.0f)
                lineTo(23.5176f, 11.0f)
                lineTo(23.0547f, 13.0f)
                lineTo(19.0f, 13.0f)
                lineTo(19.0f, 15.0f)
                lineTo(22.5918f, 15.0f)
                lineTo(22.1289f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 19.0f)
                lineTo(21.668f, 19.0f)
                lineTo(21.2051f, 21.0f)
                lineTo(13.8828f, 21.0f)
                lineTo(12.1328f, 7.0f)
                close()
                moveTo(12.0f, 23.0f)
                lineTo(23.0f, 23.0f)
                curveTo(23.551f, 23.0f, 24.0f, 23.449f, 24.0f, 24.0f)
                lineTo(24.0f, 25.0f)
                lineTo(11.0f, 25.0f)
                lineTo(11.0f, 24.0f)
                curveTo(11.0f, 23.449f, 11.449f, 23.0f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _blenderSolid!!
    }

private var _blenderSolid: ImageVector? = null
