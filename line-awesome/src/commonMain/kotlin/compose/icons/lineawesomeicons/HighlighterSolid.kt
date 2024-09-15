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

public val LineAwesomeIcons.HighlighterSolid: ImageVector
    get() {
        if (_highlighterSolid != null) {
            return _highlighterSolid!!
        }
        _highlighterSolid = Builder(name = "HighlighterSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.625f, 3.063f)
                lineTo(22.906f, 3.688f)
                lineTo(7.563f, 17.0f)
                lineTo(7.063f, 17.469f)
                lineTo(7.313f, 18.125f)
                curveTo(7.313f, 18.125f, 8.438f, 21.125f, 6.281f, 23.281f)
                lineTo(6.281f, 23.313f)
                lineTo(6.25f, 23.344f)
                lineTo(6.094f, 23.531f)
                lineTo(5.969f, 23.656f)
                lineTo(2.0f, 27.531f)
                lineTo(7.375f, 29.0f)
                lineTo(9.438f, 26.938f)
                lineTo(9.656f, 26.75f)
                lineTo(9.688f, 26.719f)
                lineTo(9.719f, 26.719f)
                curveTo(11.875f, 24.563f, 14.875f, 25.688f, 14.875f, 25.688f)
                lineTo(15.531f, 25.938f)
                lineTo(16.0f, 25.438f)
                lineTo(29.313f, 10.094f)
                lineTo(29.938f, 9.375f)
                close()
                moveTo(23.5f, 5.813f)
                lineTo(27.188f, 9.5f)
                lineTo(18.438f, 19.563f)
                lineTo(13.438f, 14.563f)
                close()
                moveTo(11.938f, 15.875f)
                lineTo(17.125f, 21.063f)
                lineTo(15.188f, 23.313f)
                lineTo(9.688f, 17.813f)
                close()
                moveTo(9.563f, 20.5f)
                lineTo(12.5f, 23.438f)
                curveTo(11.258f, 23.484f, 9.754f, 23.875f, 8.344f, 25.25f)
                curveTo(8.324f, 25.27f, 8.301f, 25.262f, 8.281f, 25.281f)
                lineTo(8.031f, 25.5f)
                lineTo(7.5f, 24.969f)
                lineTo(7.719f, 24.719f)
                lineTo(7.75f, 24.656f)
                curveTo(9.125f, 23.246f, 9.516f, 21.742f, 9.563f, 20.5f)
                close()
            }
        }
        .build()
        return _highlighterSolid!!
    }

private var _highlighterSolid: ImageVector? = null
