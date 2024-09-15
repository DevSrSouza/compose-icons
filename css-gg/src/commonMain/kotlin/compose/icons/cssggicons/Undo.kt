package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.339f, 4.468f)
                horizontalLineTo(7.339f)
                verticalLineTo(7.025f)
                curveTo(8.529f, 6.09f, 10.03f, 5.532f, 11.661f, 5.532f)
                curveTo(15.527f, 5.532f, 18.661f, 8.666f, 18.661f, 12.532f)
                curveTo(18.661f, 16.398f, 15.527f, 19.532f, 11.661f, 19.532f)
                curveTo(9.51f, 19.532f, 7.586f, 18.562f, 6.302f, 17.036f)
                lineTo(7.922f, 15.851f)
                curveTo(8.837f, 16.882f, 10.173f, 17.532f, 11.661f, 17.532f)
                curveTo(14.422f, 17.532f, 16.661f, 15.293f, 16.661f, 12.532f)
                curveTo(16.661f, 9.771f, 14.422f, 7.532f, 11.661f, 7.532f)
                curveTo(10.574f, 7.532f, 9.568f, 7.879f, 8.748f, 8.468f)
                lineTo(11.339f, 8.468f)
                verticalLineTo(10.468f)
                horizontalLineTo(5.339f)
                verticalLineTo(4.468f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
