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

public val LineAwesomeIcons.ChevronUpSolid: ImageVector
    get() {
        if (_chevronUpSolid != null) {
            return _chevronUpSolid!!
        }
        _chevronUpSolid = Builder(name = "ChevronUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.688f)
                lineTo(1.594f, 20.094f)
                lineTo(2.281f, 20.813f)
                lineTo(6.188f, 24.719f)
                lineTo(6.906f, 25.406f)
                lineTo(16.0f, 16.313f)
                lineTo(25.094f, 25.406f)
                lineTo(25.813f, 24.719f)
                lineTo(29.719f, 20.813f)
                lineTo(30.406f, 20.094f)
                close()
                moveTo(16.0f, 8.531f)
                lineTo(27.563f, 20.125f)
                lineTo(25.125f, 22.563f)
                lineTo(16.719f, 14.188f)
                lineTo(16.0f, 13.5f)
                lineTo(15.281f, 14.188f)
                lineTo(6.875f, 22.563f)
                lineTo(4.438f, 20.125f)
                close()
            }
        }
        .build()
        return _chevronUpSolid!!
    }

private var _chevronUpSolid: ImageVector? = null
