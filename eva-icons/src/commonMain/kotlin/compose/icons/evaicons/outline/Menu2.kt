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

public val OutlineGroup.Menu2: ImageVector
    get() {
        if (_menu2 != null) {
            return _menu2!!
        }
        _menu2 = Builder(name = "Menu2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(4.0f, 12.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.94f, 11.0f)
                lineTo(20.06f, 11.0f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 21.0f, 11.94f)
                lineTo(21.0f, 12.06f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 20.06f, 13.0f)
                lineTo(7.94f, 13.0f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 7.0f, 12.06f)
                lineTo(7.0f, 11.94f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 7.94f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.94f, 16.0f)
                lineTo(20.06f, 16.0f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 21.0f, 16.94f)
                lineTo(21.0f, 17.06f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 20.06f, 18.0f)
                lineTo(3.94f, 18.0f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 3.0f, 17.06f)
                lineTo(3.0f, 16.94f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 3.94f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.94f, 6.0f)
                lineTo(20.06f, 6.0f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 21.0f, 6.94f)
                lineTo(21.0f, 7.06f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 20.06f, 8.0f)
                lineTo(3.94f, 8.0f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 3.0f, 7.06f)
                lineTo(3.0f, 6.94f)
                arcTo(0.94f, 0.94f, 0.0f, false, true, 3.94f, 6.0f)
                close()
            }
        }
        .build()
        return _menu2!!
    }

private var _menu2: ImageVector? = null
