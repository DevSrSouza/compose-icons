package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongRightE: ImageVector
    get() {
        if (_arrowLongRightE != null) {
            return _arrowLongRightE!!
        }
        _arrowLongRightE = Builder(name = "ArrowLongRightE", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.9865f, 11.9929f)
                lineTo(18.7511f, 16.2426f)
                lineTo(17.3345f, 14.8308f)
                lineTo(19.1488f, 13.0104f)
                lineTo(7.0314f, 13.0519f)
                lineTo(7.0404f, 15.0507f)
                lineTo(1.0404f, 15.0777f)
                lineTo(1.0135f, 9.0777f)
                lineTo(7.0134f, 9.0508f)
                lineTo(7.0224f, 11.0519f)
                lineTo(19.1674f, 11.0103f)
                lineTo(17.3249f, 9.174f)
                lineTo(18.7367f, 7.7574f)
                lineTo(22.9865f, 11.9929f)
                close()
                moveTo(3.0224f, 11.0687f)
                lineTo(3.0314f, 13.0687f)
                lineTo(5.0314f, 13.0597f)
                lineTo(5.0224f, 11.0597f)
                lineTo(3.0224f, 11.0687f)
                close()
            }
        }
        .build()
        return _arrowLongRightE!!
    }

private var _arrowLongRightE: ImageVector? = null
