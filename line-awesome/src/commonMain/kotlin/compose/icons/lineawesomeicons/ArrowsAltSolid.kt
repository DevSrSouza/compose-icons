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

public val LineAwesomeIcons.ArrowsAltSolid: ImageVector
    get() {
        if (_arrowsAltSolid != null) {
            return _arrowsAltSolid!!
        }
        _arrowsAltSolid = Builder(name = "ArrowsAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.5859f)
                lineTo(10.293f, 7.293f)
                lineTo(11.707f, 8.707f)
                lineTo(15.0f, 5.4141f)
                lineTo(15.0f, 15.0f)
                lineTo(5.4141f, 15.0f)
                lineTo(8.707f, 11.707f)
                lineTo(7.293f, 10.293f)
                lineTo(1.5859f, 16.0f)
                lineTo(7.293f, 21.707f)
                lineTo(8.707f, 20.293f)
                lineTo(5.4141f, 17.0f)
                lineTo(15.0f, 17.0f)
                lineTo(15.0f, 26.5859f)
                lineTo(11.707f, 23.293f)
                lineTo(10.293f, 24.707f)
                lineTo(16.0f, 30.4141f)
                lineTo(21.707f, 24.707f)
                lineTo(20.293f, 23.293f)
                lineTo(17.0f, 26.5859f)
                lineTo(17.0f, 17.0f)
                lineTo(26.5859f, 17.0f)
                lineTo(23.293f, 20.293f)
                lineTo(24.707f, 21.707f)
                lineTo(30.4141f, 16.0f)
                lineTo(24.707f, 10.293f)
                lineTo(23.293f, 11.707f)
                lineTo(26.5859f, 15.0f)
                lineTo(17.0f, 15.0f)
                lineTo(17.0f, 5.4141f)
                lineTo(20.293f, 8.707f)
                lineTo(21.707f, 7.293f)
                lineTo(16.0f, 1.5859f)
                close()
            }
        }
        .build()
        return _arrowsAltSolid!!
    }

private var _arrowsAltSolid: ImageVector? = null
