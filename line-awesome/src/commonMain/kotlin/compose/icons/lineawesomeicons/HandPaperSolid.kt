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

public val LineAwesomeIcons.HandPaperSolid: ImageVector
    get() {
        if (_handPaperSolid != null) {
            return _handPaperSolid!!
        }
        _handPaperSolid = Builder(name = "HandPaperSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(14.6172f, 2.0f, 13.4688f, 2.9688f, 13.125f, 4.25f)
                curveTo(12.7734f, 4.1055f, 12.4023f, 4.0f, 12.0f, 4.0f)
                curveTo(10.3555f, 4.0f, 9.0f, 5.3555f, 9.0f, 7.0f)
                lineTo(9.0f, 17.75f)
                lineTo(8.125f, 16.875f)
                curveTo(6.9609f, 15.7109f, 5.0391f, 15.7109f, 3.875f, 16.875f)
                curveTo(2.7109f, 18.0391f, 2.7109f, 19.9609f, 3.875f, 21.125f)
                lineTo(10.6563f, 27.9063f)
                curveTo(11.832f, 29.0781f, 13.457f, 30.0f, 15.375f, 30.0f)
                lineTo(20.0f, 30.0f)
                curveTo(23.8555f, 30.0f, 27.0f, 26.8555f, 27.0f, 23.0f)
                lineTo(27.0f, 11.0f)
                curveTo(27.0f, 9.3555f, 25.6445f, 8.0f, 24.0f, 8.0f)
                curveTo(23.6484f, 8.0f, 23.3164f, 8.0742f, 23.0f, 8.1875f)
                lineTo(23.0f, 7.0f)
                curveTo(23.0f, 5.3555f, 21.6445f, 4.0f, 20.0f, 4.0f)
                curveTo(19.5977f, 4.0f, 19.2266f, 4.1055f, 18.875f, 4.25f)
                curveTo(18.5313f, 2.9688f, 17.3828f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(16.5664f, 4.0f, 17.0f, 4.4336f, 17.0f, 5.0f)
                lineTo(17.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 7.0f)
                curveTo(19.0f, 6.4336f, 19.4336f, 6.0f, 20.0f, 6.0f)
                curveTo(20.5664f, 6.0f, 21.0f, 6.4336f, 21.0f, 7.0f)
                lineTo(21.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 11.0f)
                curveTo(23.0f, 10.4336f, 23.4336f, 10.0f, 24.0f, 10.0f)
                curveTo(24.5664f, 10.0f, 25.0f, 10.4336f, 25.0f, 11.0f)
                lineTo(25.0f, 23.0f)
                curveTo(25.0f, 25.7734f, 22.7734f, 28.0f, 20.0f, 28.0f)
                lineTo(15.375f, 28.0f)
                curveTo(14.1016f, 28.0f, 13.0078f, 27.3789f, 12.0938f, 26.4688f)
                lineTo(5.2813f, 19.7188f)
                curveTo(4.8828f, 19.3203f, 4.8828f, 18.6797f, 5.2813f, 18.2813f)
                curveTo(5.6797f, 17.8828f, 6.3203f, 17.8828f, 6.7188f, 18.2813f)
                lineTo(9.2813f, 20.875f)
                lineTo(11.0f, 22.5938f)
                lineTo(11.0f, 7.0f)
                curveTo(11.0f, 6.4336f, 11.4336f, 6.0f, 12.0f, 6.0f)
                curveTo(12.5664f, 6.0f, 13.0f, 6.4336f, 13.0f, 7.0f)
                lineTo(13.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 5.0f)
                curveTo(15.0f, 4.4336f, 15.4336f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _handPaperSolid!!
    }

private var _handPaperSolid: ImageVector? = null
