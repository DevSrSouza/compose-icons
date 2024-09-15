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
                moveTo(16.0f, 4.438f)
                lineTo(15.094f, 6.625f)
                lineTo(7.094f, 25.625f)
                lineTo(6.188f, 27.75f)
                lineTo(8.344f, 26.938f)
                lineTo(16.0f, 24.063f)
                lineTo(23.656f, 26.938f)
                lineTo(25.813f, 27.75f)
                lineTo(24.906f, 25.625f)
                lineTo(16.906f, 6.625f)
                close()
                moveTo(16.0f, 9.531f)
                lineTo(22.188f, 24.25f)
                lineTo(16.344f, 22.063f)
                lineTo(16.0f, 21.938f)
                lineTo(15.656f, 22.063f)
                lineTo(9.813f, 24.25f)
                close()
            }
        }
        .build()
        return _locationArrowSolid!!
    }

private var _locationArrowSolid: ImageVector? = null
