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

public val CssGgIcons.Shutterstock: ImageVector
    get() {
        if (_shutterstock != null) {
            return _shutterstock!!
        }
        _shutterstock = Builder(name = "Shutterstock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(12.0f, 17.552f, 12.448f, 18.0f, 13.0f, 18.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 18.0f, 18.0f, 17.552f, 18.0f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 12.448f, 17.552f, 12.0f, 17.0f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                curveTo(11.552f, 6.0f, 12.0f, 6.448f, 12.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 12.0f, 6.0f, 11.552f, 6.0f, 11.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 6.448f, 6.448f, 6.0f, 7.0f, 6.0f)
                horizontalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 2.0f)
                curveTo(3.343f, 2.0f, 2.0f, 3.343f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.657f, 3.343f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.657f, 22.0f, 22.0f, 20.657f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.343f, 20.657f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.0f, 4.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 4.0f, 4.0f, 4.448f, 4.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(4.0f, 19.552f, 4.448f, 20.0f, 5.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 20.0f, 20.0f, 19.552f, 20.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 4.448f, 19.552f, 4.0f, 19.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shutterstock!!
    }

private var _shutterstock: ImageVector? = null
