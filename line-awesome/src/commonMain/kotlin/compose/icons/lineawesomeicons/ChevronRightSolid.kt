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

public val LineAwesomeIcons.ChevronRightSolid: ImageVector
    get() {
        if (_chevronRightSolid != null) {
            return _chevronRightSolid!!
        }
        _chevronRightSolid = Builder(name = "ChevronRightSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.25f, 2.594f)
                lineTo(11.531f, 3.281f)
                lineTo(7.938f, 6.906f)
                lineTo(7.25f, 7.594f)
                lineTo(7.938f, 8.313f)
                lineTo(15.625f, 16.0f)
                lineTo(7.938f, 23.688f)
                lineTo(7.25f, 24.406f)
                lineTo(7.938f, 25.094f)
                lineTo(11.531f, 28.719f)
                lineTo(12.25f, 29.406f)
                lineTo(12.969f, 28.719f)
                lineTo(24.969f, 16.719f)
                lineTo(25.656f, 16.0f)
                lineTo(24.969f, 15.281f)
                lineTo(12.969f, 3.281f)
                close()
                moveTo(12.25f, 5.438f)
                lineTo(22.813f, 16.0f)
                lineTo(12.25f, 26.563f)
                lineTo(10.063f, 24.375f)
                lineTo(17.75f, 16.719f)
                lineTo(18.469f, 16.0f)
                lineTo(17.75f, 15.281f)
                lineTo(10.063f, 7.625f)
                close()
            }
        }
        .build()
        return _chevronRightSolid!!
    }

private var _chevronRightSolid: ImageVector? = null
