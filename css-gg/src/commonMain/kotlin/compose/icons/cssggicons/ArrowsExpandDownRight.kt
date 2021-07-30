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
                curveTo(11.0f, 3.8954f, 10.1046f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 3.0f, 3.0f, 3.8954f, 3.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 10.1046f, 3.8954f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(9.0f)
                curveTo(10.1046f, 11.0f, 11.0f, 10.1046f, 11.0f, 9.0f)
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
                horizontalLineTo(17.5858f)
                lineTo(12.2218f, 13.6361f)
                curveTo(11.8313f, 13.2456f, 11.8313f, 12.6124f, 12.2218f, 12.2219f)
                curveTo(12.6124f, 11.8314f, 13.2455f, 11.8314f, 13.6361f, 12.2219f)
                lineTo(19.0f, 17.5858f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _arrowsExpandDownRight!!
    }

private var _arrowsExpandDownRight: ImageVector? = null
