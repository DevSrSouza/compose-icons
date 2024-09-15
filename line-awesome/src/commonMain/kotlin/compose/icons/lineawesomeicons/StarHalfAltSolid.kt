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

public val LineAwesomeIcons.StarHalfAltSolid: ImageVector
    get() {
        if (_starHalfAltSolid != null) {
            return _starHalfAltSolid!!
        }
        _starHalfAltSolid = Builder(name = "StarHalfAltSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.375f)
                lineTo(15.094f, 4.406f)
                lineTo(11.844f, 11.719f)
                lineTo(3.906f, 12.531f)
                lineTo(1.656f, 12.781f)
                lineTo(3.344f, 14.281f)
                lineTo(9.25f, 19.625f)
                lineTo(7.594f, 27.438f)
                lineTo(7.125f, 29.625f)
                lineTo(7.156f, 29.625f)
                lineTo(9.094f, 28.5f)
                lineTo(16.0f, 24.531f)
                lineTo(22.906f, 28.5f)
                lineTo(24.875f, 29.625f)
                lineTo(24.406f, 27.438f)
                lineTo(22.75f, 19.625f)
                lineTo(28.656f, 14.281f)
                lineTo(30.344f, 12.781f)
                lineTo(28.094f, 12.531f)
                lineTo(20.156f, 11.719f)
                lineTo(16.906f, 4.406f)
                close()
                moveTo(16.0f, 7.281f)
                lineTo(18.563f, 13.063f)
                lineTo(18.813f, 13.563f)
                lineTo(19.375f, 13.625f)
                lineTo(25.688f, 14.281f)
                lineTo(20.969f, 18.531f)
                lineTo(20.531f, 18.906f)
                lineTo(20.656f, 19.469f)
                lineTo(21.969f, 25.656f)
                lineTo(16.5f, 22.5f)
                lineTo(16.0f, 22.219f)
                close()
            }
        }
        .build()
        return _starHalfAltSolid!!
    }

private var _starHalfAltSolid: ImageVector? = null
