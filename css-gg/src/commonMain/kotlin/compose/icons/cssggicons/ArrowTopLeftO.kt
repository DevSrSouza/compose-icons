package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowTopLeftO: ImageVector
    get() {
        if (_arrowTopLeftO != null) {
            return _arrowTopLeftO!!
        }
        _arrowTopLeftO = Builder(name = "ArrowTopLeftO", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.9633f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.9633f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.9633f)
                horizontalLineTo(11.4142f)
                lineTo(16.7438f, 15.2929f)
                lineTo(15.3296f, 16.7071f)
                lineTo(10.0f, 11.3775f)
                lineTo(10.0f, 13.9633f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 12.0f)
                curveTo(23.0f, 5.9249f, 18.0751f, 1.0f, 12.0f, 1.0f)
                curveTo(5.9249f, 1.0f, 1.0f, 5.9249f, 1.0f, 12.0f)
                curveTo(1.0f, 18.0751f, 5.9249f, 23.0f, 12.0f, 23.0f)
                curveTo(18.0751f, 23.0f, 23.0f, 18.0751f, 23.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 7.0294f, 16.9706f, 3.0f, 12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 7.0294f, 3.0f, 12.0f)
                curveTo(3.0f, 16.9706f, 7.0294f, 21.0f, 12.0f, 21.0f)
                curveTo(16.9706f, 21.0f, 21.0f, 16.9706f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowTopLeftO!!
    }

private var _arrowTopLeftO: ImageVector? = null
