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

public val CssGgIcons.Erase: ImageVector
    get() {
        if (_erase != null) {
            return _erase!!
        }
        _erase = Builder(name = "Erase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 12.899f)
                curveTo(2.719f, 13.681f, 2.719f, 14.947f, 3.5f, 15.728f)
                lineTo(7.358f, 19.586f)
                horizontalLineTo(4.086f)
                curveTo(3.533f, 19.586f, 3.086f, 20.034f, 3.086f, 20.586f)
                curveTo(3.086f, 21.138f, 3.533f, 21.586f, 4.086f, 21.586f)
                horizontalLineTo(20.086f)
                curveTo(20.638f, 21.586f, 21.086f, 21.138f, 21.086f, 20.586f)
                curveTo(21.086f, 20.034f, 20.638f, 19.586f, 20.086f, 19.586f)
                horizontalLineTo(10.956f)
                lineTo(20.471f, 10.071f)
                curveTo(21.252f, 9.29f, 21.252f, 8.024f, 20.471f, 7.243f)
                lineTo(16.228f, 3.0f)
                curveTo(15.447f, 2.219f, 14.181f, 2.219f, 13.399f, 3.0f)
                lineTo(3.5f, 12.899f)
                close()
                moveTo(7.826f, 11.402f)
                lineTo(4.914f, 14.314f)
                lineTo(9.157f, 18.556f)
                lineTo(12.068f, 15.645f)
                lineTo(7.826f, 11.402f)
                close()
                moveTo(9.24f, 9.988f)
                lineTo(13.483f, 14.231f)
                lineTo(19.056f, 8.657f)
                lineTo(14.814f, 4.414f)
                lineTo(9.24f, 9.988f)
                close()
            }
        }
        .build()
        return _erase!!
    }

private var _erase: ImageVector? = null
