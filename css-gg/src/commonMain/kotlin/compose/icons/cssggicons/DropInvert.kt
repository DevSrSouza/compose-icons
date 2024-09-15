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

public val CssGgIcons.DropInvert: ImageVector
    get() {
        if (_dropInvert != null) {
            return _dropInvert!!
        }
        _dropInvert = Builder(name = "DropInvert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.136f)
                lineTo(5.636f, 7.5f)
                curveTo(2.121f, 11.015f, 2.121f, 16.713f, 5.636f, 20.228f)
                curveTo(7.393f, 21.985f, 9.697f, 22.864f, 12.0f, 22.864f)
                curveTo(12.288f, 22.864f, 12.576f, 22.85f, 12.863f, 22.823f)
                curveTo(14.871f, 22.631f, 16.826f, 21.766f, 18.364f, 20.228f)
                curveTo(21.879f, 16.713f, 21.879f, 11.015f, 18.364f, 7.5f)
                lineTo(12.0f, 1.136f)
                close()
                moveTo(7.05f, 8.914f)
                lineTo(12.0f, 3.964f)
                lineTo(12.0f, 20.864f)
                curveTo(10.209f, 20.864f, 8.417f, 20.181f, 7.05f, 18.814f)
                curveTo(4.317f, 16.08f, 4.317f, 11.648f, 7.05f, 8.914f)
                close()
            }
        }
        .build()
        return _dropInvert!!
    }

private var _dropInvert: ImageVector? = null
