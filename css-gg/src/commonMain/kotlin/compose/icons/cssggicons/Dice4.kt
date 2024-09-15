package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Dice4: ImageVector
    get() {
        if (_dice4 != null) {
            return _dice4!!
        }
        _dice4 = Builder(name = "Dice4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.945f, 5.055f)
                curveTo(15.84f, 5.055f, 14.945f, 5.951f, 14.945f, 7.055f)
                curveTo(14.945f, 8.16f, 15.84f, 9.055f, 16.945f, 9.055f)
                curveTo(18.05f, 9.055f, 18.945f, 8.16f, 18.945f, 7.055f)
                curveTo(18.945f, 5.951f, 18.05f, 5.055f, 16.945f, 5.055f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.945f, 16.892f)
                curveTo(14.945f, 15.788f, 15.84f, 14.892f, 16.945f, 14.892f)
                curveTo(18.05f, 14.892f, 18.945f, 15.788f, 18.945f, 16.892f)
                curveTo(18.945f, 17.997f, 18.05f, 18.892f, 16.945f, 18.892f)
                curveTo(15.84f, 18.892f, 14.945f, 17.997f, 14.945f, 16.892f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.055f, 14.892f)
                curveTo(5.951f, 14.892f, 5.055f, 15.788f, 5.055f, 16.892f)
                curveTo(5.055f, 17.997f, 5.951f, 18.892f, 7.055f, 18.892f)
                curveTo(8.16f, 18.892f, 9.055f, 17.997f, 9.055f, 16.892f)
                curveTo(9.055f, 15.788f, 8.16f, 14.892f, 7.055f, 14.892f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.055f, 7.055f)
                curveTo(5.055f, 5.951f, 5.951f, 5.055f, 7.055f, 5.055f)
                curveTo(8.16f, 5.055f, 9.055f, 5.951f, 9.055f, 7.055f)
                curveTo(9.055f, 8.16f, 8.16f, 9.055f, 7.055f, 9.055f)
                curveTo(5.951f, 9.055f, 5.055f, 8.16f, 5.055f, 7.055f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 1.0f)
                curveTo(2.343f, 1.0f, 1.0f, 2.343f, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.657f, 2.343f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(21.657f, 23.0f, 23.0f, 21.657f, 23.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.343f, 21.657f, 1.0f, 20.0f, 1.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 3.0f, 3.0f, 3.448f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.552f, 3.448f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 21.0f, 21.0f, 20.552f, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.448f, 20.552f, 3.0f, 20.0f, 3.0f)
                close()
            }
        }
        .build()
        return _dice4!!
    }

private var _dice4: ImageVector? = null
