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

public val CssGgIcons.Options: ImageVector
    get() {
        if (_options != null) {
            return _options!!
        }
        _options = Builder(name = "Options", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 3.0f)
                curveTo(8.8638f, 3.0f, 10.4299f, 4.2748f, 10.874f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.874f)
                curveTo(10.4299f, 9.7252f, 8.8638f, 11.0f, 7.0f, 11.0f)
                curveTo(4.7909f, 11.0f, 3.0f, 9.2091f, 3.0f, 7.0f)
                curveTo(3.0f, 4.7909f, 4.7909f, 3.0f, 7.0f, 3.0f)
                close()
                moveTo(7.0f, 9.0f)
                curveTo(8.1046f, 9.0f, 9.0f, 8.1046f, 9.0f, 7.0f)
                curveTo(9.0f, 5.8954f, 8.1046f, 5.0f, 7.0f, 5.0f)
                curveTo(5.8954f, 5.0f, 5.0f, 5.8954f, 5.0f, 7.0f)
                curveTo(5.0f, 8.1046f, 5.8954f, 9.0f, 7.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 20.0f)
                curveTo(15.1362f, 20.0f, 13.5701f, 18.7252f, 13.126f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.126f)
                curveTo(13.5701f, 13.2748f, 15.1362f, 12.0f, 17.0f, 12.0f)
                curveTo(19.2091f, 12.0f, 21.0f, 13.7909f, 21.0f, 16.0f)
                curveTo(21.0f, 18.2091f, 19.2091f, 20.0f, 17.0f, 20.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveTo(18.1046f, 18.0f, 19.0f, 17.1046f, 19.0f, 16.0f)
                curveTo(19.0f, 14.8954f, 18.1046f, 14.0f, 17.0f, 14.0f)
                curveTo(15.8954f, 14.0f, 15.0f, 14.8954f, 15.0f, 16.0f)
                curveTo(15.0f, 17.1046f, 15.8954f, 18.0f, 17.0f, 18.0f)
                close()
            }
        }
        .build()
        return _options!!
    }

private var _options: ImageVector? = null
