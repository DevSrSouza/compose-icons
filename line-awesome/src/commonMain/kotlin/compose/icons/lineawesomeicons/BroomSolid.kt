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

public val LineAwesomeIcons.BroomSolid: ImageVector
    get() {
        if (_broomSolid != null) {
            return _broomSolid!!
        }
        _broomSolid = Builder(name = "BroomSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.2813f, 2.2813f)
                lineTo(18.2813f, 12.2813f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 10.9688f)
                lineTo(16.9688f, 10.9375f)
                curveTo(16.3281f, 10.3672f, 15.4922f, 10.0938f, 14.6875f, 10.0938f)
                curveTo(13.8828f, 10.0938f, 13.1055f, 10.3945f, 12.5f, 11.0f)
                lineTo(12.3438f, 11.125f)
                lineTo(11.8438f, 11.625f)
                lineTo(11.5f, 11.9063f)
                lineTo(2.375f, 19.0f)
                lineTo(1.5f, 19.7188f)
                lineTo(12.2813f, 30.5f)
                lineTo(13.0f, 29.625f)
                lineTo(20.0625f, 20.5625f)
                lineTo(20.0938f, 20.5938f)
                lineTo(21.0938f, 19.5938f)
                lineTo(21.125f, 19.5938f)
                lineTo(21.1563f, 19.5625f)
                curveTo(22.2969f, 18.2773f, 22.3047f, 16.3047f, 21.0938f, 15.0938f)
                lineTo(19.7188f, 13.7188f)
                lineTo(29.7188f, 3.7188f)
                close()
                moveTo(14.6875f, 12.0938f)
                curveTo(14.9961f, 12.0859f, 15.3359f, 12.1914f, 15.5938f, 12.4063f)
                curveTo(15.6055f, 12.4141f, 15.6133f, 12.4297f, 15.625f, 12.4375f)
                lineTo(19.6875f, 16.5f)
                curveTo(20.0625f, 16.875f, 20.0977f, 17.6719f, 19.6875f, 18.1875f)
                curveTo(19.6719f, 18.207f, 19.6719f, 18.2305f, 19.6563f, 18.25f)
                lineTo(19.3438f, 18.5313f)
                lineTo(13.5625f, 12.75f)
                lineTo(13.9063f, 12.4063f)
                curveTo(14.0977f, 12.2148f, 14.3789f, 12.1016f, 14.6875f, 12.0938f)
                close()
                moveTo(12.0313f, 14.0313f)
                lineTo(17.9688f, 19.9688f)
                lineTo(12.0938f, 27.4688f)
                lineTo(10.6563f, 26.0313f)
                lineTo(12.8125f, 23.7813f)
                lineTo(11.375f, 22.4063f)
                lineTo(9.25f, 24.625f)
                lineTo(7.9375f, 23.3125f)
                lineTo(11.8125f, 19.4063f)
                lineTo(10.4063f, 18.0f)
                lineTo(6.5f, 21.875f)
                lineTo(4.5313f, 19.9063f)
                close()
            }
        }
        .build()
        return _broomSolid!!
    }

private var _broomSolid: ImageVector? = null
