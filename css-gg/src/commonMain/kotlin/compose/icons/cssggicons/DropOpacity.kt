package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.DropOpacity: ImageVector
    get() {
        if (_dropOpacity != null) {
            return _dropOpacity!!
        }
        _dropOpacity = Builder(name = "DropOpacity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.945f, 21.956f)
                curveTo(12.588f, 23.593f, 8.425f, 23.017f, 5.636f, 20.228f)
                curveTo(2.121f, 16.713f, 2.121f, 11.015f, 5.636f, 7.5f)
                lineTo(12.0f, 1.136f)
                lineTo(18.364f, 7.5f)
                curveTo(19.252f, 8.388f, 19.916f, 9.416f, 20.355f, 10.512f)
                curveTo(21.654f, 13.755f, 20.991f, 17.601f, 18.364f, 20.228f)
                curveTo(17.638f, 20.954f, 16.819f, 21.53f, 15.945f, 21.956f)
                close()
                moveTo(7.05f, 8.914f)
                lineTo(12.0f, 3.964f)
                lineTo(16.95f, 8.914f)
                curveTo(18.274f, 10.238f, 18.957f, 11.962f, 18.998f, 13.697f)
                horizontalLineTo(5.002f)
                curveTo(5.043f, 11.962f, 5.726f, 10.238f, 7.05f, 8.914f)
                close()
            }
        }
        .build()
        return _dropOpacity!!
    }

private var _dropOpacity: ImageVector? = null
