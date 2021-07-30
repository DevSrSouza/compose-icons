package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 12.0f)
                curveTo(16.0f, 14.2091f, 14.2091f, 16.0f, 12.0f, 16.0f)
                curveTo(9.7909f, 16.0f, 8.0f, 14.2091f, 8.0f, 12.0f)
                curveTo(8.0f, 9.7909f, 9.7909f, 8.0f, 12.0f, 8.0f)
                curveTo(14.2091f, 8.0f, 16.0f, 9.7909f, 16.0f, 12.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveTo(17.5915f, 3.0f, 22.2898f, 6.8243f, 23.6219f, 12.0f)
                curveTo(22.2898f, 17.1757f, 17.5915f, 21.0f, 12.0f, 21.0f)
                curveTo(6.4085f, 21.0f, 1.7102f, 17.1757f, 0.3781f, 12.0f)
                curveTo(1.7102f, 6.8243f, 6.4085f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(7.5244f, 19.0f, 3.7313f, 16.0581f, 2.4572f, 12.0f)
                curveTo(3.7313f, 7.9419f, 7.5244f, 5.0f, 12.0f, 5.0f)
                curveTo(16.4756f, 5.0f, 20.2687f, 7.9419f, 21.5428f, 12.0f)
                curveTo(20.2687f, 16.0581f, 16.4756f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
