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

public val LineAwesomeIcons.CouchSolid: ImageVector
    get() {
        if (_couchSolid != null) {
            return _couchSolid!!
        }
        _couchSolid = Builder(name = "CouchSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                curveTo(4.3555f, 7.0f, 3.0f, 8.3555f, 3.0f, 10.0f)
                lineTo(3.0f, 12.1875f)
                curveTo(1.8438f, 12.6055f, 1.0f, 13.707f, 1.0f, 15.0f)
                lineTo(1.0f, 26.0f)
                lineTo(3.0f, 26.0f)
                lineTo(3.0f, 24.0f)
                lineTo(29.0f, 24.0f)
                lineTo(29.0f, 26.0f)
                lineTo(31.0f, 26.0f)
                lineTo(31.0f, 15.0f)
                curveTo(31.0f, 13.707f, 30.1563f, 12.6055f, 29.0f, 12.1875f)
                lineTo(29.0f, 10.0f)
                curveTo(29.0f, 8.3555f, 27.6445f, 7.0f, 26.0f, 7.0f)
                close()
                moveTo(6.0f, 9.0f)
                lineTo(26.0f, 9.0f)
                curveTo(26.5547f, 9.0f, 27.0f, 9.4453f, 27.0f, 10.0f)
                lineTo(27.0f, 12.1875f)
                curveTo(25.8438f, 12.6055f, 25.0f, 13.707f, 25.0f, 15.0f)
                lineTo(25.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 15.0f)
                curveTo(7.0f, 13.707f, 6.1563f, 12.6055f, 5.0f, 12.1875f)
                lineTo(5.0f, 10.0f)
                curveTo(5.0f, 9.4453f, 5.4453f, 9.0f, 6.0f, 9.0f)
                close()
                moveTo(4.0f, 14.0f)
                curveTo(4.5547f, 14.0f, 5.0f, 14.4453f, 5.0f, 15.0f)
                lineTo(5.0f, 19.0f)
                lineTo(27.0f, 19.0f)
                lineTo(27.0f, 15.0f)
                curveTo(27.0f, 14.4453f, 27.4453f, 14.0f, 28.0f, 14.0f)
                curveTo(28.5547f, 14.0f, 29.0f, 14.4453f, 29.0f, 15.0f)
                lineTo(29.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                lineTo(3.0f, 15.0f)
                curveTo(3.0f, 14.4453f, 3.4453f, 14.0f, 4.0f, 14.0f)
                close()
            }
        }
        .build()
        return _couchSolid!!
    }

private var _couchSolid: ImageVector? = null
