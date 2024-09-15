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

public val LineAwesomeIcons.Odnoklassniki: ImageVector
    get() {
        if (_odnoklassniki != null) {
            return _odnoklassniki!!
        }
        _odnoklassniki = Builder(name = "Odnoklassniki", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.328f)
                curveTo(16.297f, 8.328f, 17.352f, 9.383f, 17.352f, 10.68f)
                curveTo(17.352f, 11.973f, 16.297f, 13.027f, 15.0f, 13.027f)
                curveTo(13.703f, 13.027f, 12.648f, 11.973f, 12.648f, 10.68f)
                curveTo(12.648f, 9.383f, 13.703f, 8.328f, 15.0f, 8.328f)
                close()
                moveTo(15.0f, 16.355f)
                curveTo(18.133f, 16.355f, 20.68f, 13.809f, 20.68f, 10.68f)
                curveTo(20.68f, 7.547f, 18.133f, 5.0f, 15.0f, 5.0f)
                curveTo(11.867f, 5.0f, 9.324f, 7.547f, 9.324f, 10.68f)
                curveTo(9.324f, 13.809f, 11.867f, 16.355f, 15.0f, 16.355f)
                close()
                moveTo(17.297f, 20.988f)
                curveTo(18.453f, 20.723f, 19.566f, 20.266f, 20.594f, 19.621f)
                curveTo(21.371f, 19.133f, 21.605f, 18.105f, 21.117f, 17.328f)
                curveTo(20.625f, 16.547f, 19.602f, 16.313f, 18.82f, 16.805f)
                curveTo(16.496f, 18.266f, 13.504f, 18.266f, 11.176f, 16.805f)
                curveTo(10.398f, 16.313f, 9.371f, 16.547f, 8.883f, 17.328f)
                curveTo(8.395f, 18.105f, 8.629f, 19.133f, 9.406f, 19.621f)
                curveTo(10.434f, 20.266f, 11.547f, 20.723f, 12.703f, 20.988f)
                lineTo(9.527f, 24.16f)
                curveTo(8.879f, 24.809f, 8.879f, 25.863f, 9.527f, 26.512f)
                curveTo(9.855f, 26.836f, 10.277f, 27.0f, 10.703f, 27.0f)
                curveTo(11.129f, 27.0f, 11.555f, 26.836f, 11.883f, 26.512f)
                lineTo(15.0f, 23.395f)
                lineTo(18.121f, 26.512f)
                curveTo(18.77f, 27.164f, 19.82f, 27.164f, 20.473f, 26.512f)
                curveTo(21.121f, 25.863f, 21.121f, 24.809f, 20.473f, 24.16f)
                curveTo(20.473f, 24.16f, 17.297f, 20.988f, 17.297f, 20.988f)
                close()
            }
        }
        .build()
        return _odnoklassniki!!
    }

private var _odnoklassniki: ImageVector? = null
