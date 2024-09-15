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

public val LineAwesomeIcons.ChevronLeftSolid: ImageVector
    get() {
        if (_chevronLeftSolid != null) {
            return _chevronLeftSolid!!
        }
        _chevronLeftSolid = Builder(name = "ChevronLeftSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 2.594f)
                lineTo(19.031f, 3.281f)
                lineTo(7.031f, 15.281f)
                lineTo(6.344f, 16.0f)
                lineTo(7.031f, 16.719f)
                lineTo(19.031f, 28.719f)
                lineTo(19.75f, 29.406f)
                lineTo(20.469f, 28.719f)
                lineTo(24.063f, 25.094f)
                lineTo(24.75f, 24.406f)
                lineTo(24.063f, 23.688f)
                lineTo(16.375f, 16.0f)
                lineTo(24.063f, 8.313f)
                lineTo(24.75f, 7.594f)
                lineTo(24.063f, 6.906f)
                lineTo(20.469f, 3.281f)
                close()
                moveTo(19.75f, 5.438f)
                lineTo(21.938f, 7.625f)
                lineTo(14.25f, 15.281f)
                lineTo(13.531f, 16.0f)
                lineTo(14.25f, 16.719f)
                lineTo(21.938f, 24.375f)
                lineTo(19.75f, 26.563f)
                lineTo(9.188f, 16.0f)
                close()
            }
        }
        .build()
        return _chevronLeftSolid!!
    }

private var _chevronLeftSolid: ImageVector? = null
