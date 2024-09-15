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

public val CssGgIcons.ArrowsExpandDownRight: ImageVector
    get() {
        if (_arrowsExpandDownRight != null) {
            return _arrowsExpandDownRight!!
        }
        _arrowsExpandDownRight = Builder(name = "ArrowsExpandDownRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 5.0f)
                curveTo(11.0f, 3.895f, 10.105f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 10.105f, 3.895f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(9.0f)
                curveTo(10.105f, 11.0f, 11.0f, 10.105f, 11.0f, 9.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.586f)
                lineTo(12.222f, 13.636f)
                curveTo(11.831f, 13.246f, 11.831f, 12.612f, 12.222f, 12.222f)
                curveTo(12.612f, 11.831f, 13.245f, 11.831f, 13.636f, 12.222f)
                lineTo(19.0f, 17.586f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _arrowsExpandDownRight!!
    }

private var _arrowsExpandDownRight: ImageVector? = null
