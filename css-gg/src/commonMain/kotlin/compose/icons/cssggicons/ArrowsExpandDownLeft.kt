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
                curveTo(13.0f, 3.8954f, 13.8954f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 3.0f, 21.0f, 3.8954f, 21.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 10.1046f, 20.1046f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(13.8954f, 11.0f, 13.0f, 10.1046f, 13.0f, 9.0f)
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
                horizontalLineTo(6.4142f)
                lineTo(11.7782f, 13.6361f)
                curveTo(12.1687f, 13.2456f, 12.1687f, 12.6124f, 11.7782f, 12.2219f)
                curveTo(11.3876f, 11.8314f, 10.7545f, 11.8314f, 10.3639f, 12.2219f)
                lineTo(5.0f, 17.5858f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _arrowsExpandDownLeft!!
    }

private var _arrowsExpandDownLeft: ImageVector? = null
