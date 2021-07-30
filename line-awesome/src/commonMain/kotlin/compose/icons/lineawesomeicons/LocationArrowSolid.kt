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

public val LineAwesomeIcons.LocationArrowSolid: ImageVector
    get() {
        if (_locationArrowSolid != null) {
            return _locationArrowSolid!!
        }
        _locationArrowSolid = Builder(name = "LocationArrowSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.4375f)
                lineTo(15.0938f, 6.625f)
                lineTo(7.0938f, 25.625f)
                lineTo(6.1875f, 27.75f)
                lineTo(8.3438f, 26.9375f)
                lineTo(16.0f, 24.0625f)
                lineTo(23.6563f, 26.9375f)
                lineTo(25.8125f, 27.75f)
                lineTo(24.9063f, 25.625f)
                lineTo(16.9063f, 6.625f)
                close()
                moveTo(16.0f, 9.5313f)
                lineTo(22.1875f, 24.25f)
                lineTo(16.3438f, 22.0625f)
                lineTo(16.0f, 21.9375f)
                lineTo(15.6563f, 22.0625f)
                lineTo(9.8125f, 24.25f)
                close()
            }
        }
        .build()
        return _locationArrowSolid!!
    }

private var _locationArrowSolid: ImageVector? = null
