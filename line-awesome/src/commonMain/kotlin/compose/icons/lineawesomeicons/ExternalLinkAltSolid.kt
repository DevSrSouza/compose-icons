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

public val LineAwesomeIcons.ExternalLinkAltSolid: ImageVector
    get() {
        if (_externalLinkAltSolid != null) {
            return _externalLinkAltSolid!!
        }
        _externalLinkAltSolid = Builder(name = "ExternalLinkAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                lineTo(18.0f, 7.0f)
                lineTo(23.563f, 7.0f)
                lineTo(11.281f, 19.281f)
                lineTo(12.719f, 20.719f)
                lineTo(25.0f, 8.438f)
                lineTo(25.0f, 14.0f)
                lineTo(27.0f, 14.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(5.0f, 9.0f)
                lineTo(5.0f, 27.0f)
                lineTo(23.0f, 27.0f)
                lineTo(23.0f, 14.0f)
                lineTo(21.0f, 16.0f)
                lineTo(21.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                lineTo(18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _externalLinkAltSolid!!
    }

private var _externalLinkAltSolid: ImageVector? = null
