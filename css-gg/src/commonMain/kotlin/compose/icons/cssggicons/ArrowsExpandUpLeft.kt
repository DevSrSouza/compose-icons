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

public val CssGgIcons.ArrowsExpandUpLeft: ImageVector
    get() {
        if (_arrowsExpandUpLeft != null) {
            return _arrowsExpandUpLeft!!
        }
        _arrowsExpandUpLeft = Builder(name = "ArrowsExpandUpLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                horizontalLineTo(3.0f)
                lineTo(3.0f, 3.0f)
                lineTo(11.0f, 3.0f)
                verticalLineTo(5.0f)
                lineTo(6.4142f, 5.0f)
                lineTo(11.7781f, 10.3639f)
                curveTo(12.1686f, 10.7545f, 12.1686f, 11.3876f, 11.7781f, 11.7782f)
                curveTo(11.3876f, 12.1687f, 10.7544f, 12.1687f, 10.3639f, 11.7782f)
                lineTo(5.0f, 6.4142f)
                lineTo(5.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 13.0f)
                curveTo(20.1046f, 13.0f, 21.0f, 13.8954f, 21.0f, 15.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.1046f, 20.1046f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(13.8954f, 21.0f, 13.0f, 20.1046f, 13.0f, 19.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 13.8954f, 13.8954f, 13.0f, 15.0f, 13.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(19.0f, 15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _arrowsExpandUpLeft!!
    }

private var _arrowsExpandUpLeft: ImageVector? = null
