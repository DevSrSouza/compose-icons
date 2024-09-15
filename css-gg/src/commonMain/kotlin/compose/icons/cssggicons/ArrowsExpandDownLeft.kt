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

public val CssGgIcons.ArrowsExpandDownLeft: ImageVector
    get() {
        if (_arrowsExpandDownLeft != null) {
            return _arrowsExpandDownLeft!!
        }
        _arrowsExpandDownLeft = Builder(name = "ArrowsExpandDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 5.0f)
                curveTo(13.0f, 3.895f, 13.895f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 3.0f, 21.0f, 3.895f, 21.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 10.105f, 20.105f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(13.895f, 11.0f, 13.0f, 10.105f, 13.0f, 9.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.414f)
                lineTo(11.778f, 13.636f)
                curveTo(12.169f, 13.246f, 12.169f, 12.612f, 11.778f, 12.222f)
                curveTo(11.388f, 11.831f, 10.755f, 11.831f, 10.364f, 12.222f)
                lineTo(5.0f, 17.586f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _arrowsExpandDownLeft!!
    }

private var _arrowsExpandDownLeft: ImageVector? = null
