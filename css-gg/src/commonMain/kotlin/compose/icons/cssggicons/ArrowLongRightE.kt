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
                moveTo(22.986f, 11.993f)
                lineTo(18.751f, 16.243f)
                lineTo(17.334f, 14.831f)
                lineTo(19.149f, 13.01f)
                lineTo(7.031f, 13.052f)
                lineTo(7.04f, 15.051f)
                lineTo(1.04f, 15.078f)
                lineTo(1.013f, 9.078f)
                lineTo(7.013f, 9.051f)
                lineTo(7.022f, 11.052f)
                lineTo(19.167f, 11.01f)
                lineTo(17.325f, 9.174f)
                lineTo(18.737f, 7.757f)
                lineTo(22.986f, 11.993f)
                close()
                moveTo(3.022f, 11.069f)
                lineTo(3.031f, 13.069f)
                lineTo(5.031f, 13.06f)
                lineTo(5.022f, 11.06f)
                lineTo(3.022f, 11.069f)
                close()
            }
        }
        .build()
        return _arrowLongRightE!!
    }

private var _arrowLongRightE: ImageVector? = null
