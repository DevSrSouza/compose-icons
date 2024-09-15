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

public val LineAwesomeIcons.ChevronDownSolid: ImageVector
    get() {
        if (_chevronDownSolid != null) {
            return _chevronDownSolid!!
        }
        _chevronDownSolid = Builder(name = "ChevronDownSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.906f, 6.594f)
                lineTo(6.188f, 7.281f)
                lineTo(2.281f, 11.188f)
                lineTo(1.594f, 11.906f)
                lineTo(16.0f, 26.313f)
                lineTo(30.406f, 11.906f)
                lineTo(29.719f, 11.188f)
                lineTo(25.813f, 7.281f)
                lineTo(25.094f, 6.594f)
                lineTo(16.0f, 15.688f)
                close()
                moveTo(6.875f, 9.438f)
                lineTo(15.281f, 17.813f)
                lineTo(16.0f, 18.5f)
                lineTo(16.719f, 17.813f)
                lineTo(25.125f, 9.438f)
                lineTo(27.563f, 11.875f)
                lineTo(16.0f, 23.469f)
                lineTo(4.438f, 11.875f)
                close()
            }
        }
        .build()
        return _chevronDownSolid!!
    }

private var _chevronDownSolid: ImageVector? = null
