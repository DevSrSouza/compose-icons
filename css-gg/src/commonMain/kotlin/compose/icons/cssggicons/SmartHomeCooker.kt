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

public val CssGgIcons.SmartHomeCooker: ImageVector
    get() {
        if (_smartHomeCooker != null) {
            return _smartHomeCooker!!
        }
        _smartHomeCooker = Builder(name = "SmartHomeCooker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 16.0f)
                curveTo(15.0f, 17.657f, 13.657f, 19.0f, 12.0f, 19.0f)
                curveTo(10.343f, 19.0f, 9.0f, 17.657f, 9.0f, 16.0f)
                curveTo(9.0f, 14.343f, 10.343f, 13.0f, 12.0f, 13.0f)
                curveTo(13.657f, 13.0f, 15.0f, 14.343f, 15.0f, 16.0f)
                close()
                moveTo(13.0f, 16.0f)
                curveTo(13.0f, 16.552f, 12.552f, 17.0f, 12.0f, 17.0f)
                curveTo(11.448f, 17.0f, 11.0f, 16.552f, 11.0f, 16.0f)
                curveTo(11.0f, 15.448f, 11.448f, 15.0f, 12.0f, 15.0f)
                curveTo(12.552f, 15.0f, 13.0f, 15.448f, 13.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                curveTo(4.791f, 5.0f, 3.0f, 6.791f, 3.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 21.209f, 4.791f, 23.0f, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                curveTo(19.209f, 23.0f, 21.0f, 21.209f, 21.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 6.791f, 19.209f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(5.895f, 7.0f, 5.0f, 7.895f, 5.0f, 9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 7.895f, 18.105f, 7.0f, 17.0f, 7.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 20.105f, 5.895f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.105f, 21.0f, 19.0f, 20.105f, 19.0f, 19.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _smartHomeCooker!!
    }

private var _smartHomeCooker: ImageVector? = null
