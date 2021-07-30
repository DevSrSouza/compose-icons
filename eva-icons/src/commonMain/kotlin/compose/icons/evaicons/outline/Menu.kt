package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.95f, 11.0f)
                lineTo(20.05f, 11.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 21.0f, 11.95f)
                lineTo(21.0f, 12.05f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 20.05f, 13.0f)
                lineTo(3.95f, 13.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.0f, 12.05f)
                lineTo(3.0f, 11.95f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.95f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.95f, 16.0f)
                lineTo(20.05f, 16.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 21.0f, 16.95f)
                lineTo(21.0f, 17.05f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 20.05f, 18.0f)
                lineTo(3.95f, 18.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.0f, 17.05f)
                lineTo(3.0f, 16.95f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.95f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.95f, 6.0f)
                lineTo(20.05f, 6.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 21.0f, 6.95f)
                lineTo(21.0f, 7.05f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 20.05f, 8.0f)
                lineTo(3.95f, 8.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.0f, 7.05f)
                lineTo(3.0f, 6.95f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.95f, 6.0f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null
