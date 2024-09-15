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
                curveTo(16.0f, 14.209f, 14.209f, 16.0f, 12.0f, 16.0f)
                curveTo(9.791f, 16.0f, 8.0f, 14.209f, 8.0f, 12.0f)
                curveTo(8.0f, 9.791f, 9.791f, 8.0f, 12.0f, 8.0f)
                curveTo(14.209f, 8.0f, 16.0f, 9.791f, 16.0f, 12.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveTo(17.591f, 3.0f, 22.29f, 6.824f, 23.622f, 12.0f)
                curveTo(22.29f, 17.176f, 17.591f, 21.0f, 12.0f, 21.0f)
                curveTo(6.408f, 21.0f, 1.71f, 17.176f, 0.378f, 12.0f)
                curveTo(1.71f, 6.824f, 6.408f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(7.524f, 19.0f, 3.731f, 16.058f, 2.457f, 12.0f)
                curveTo(3.731f, 7.942f, 7.524f, 5.0f, 12.0f, 5.0f)
                curveTo(16.476f, 5.0f, 20.269f, 7.942f, 21.543f, 12.0f)
                curveTo(20.269f, 16.058f, 16.476f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
