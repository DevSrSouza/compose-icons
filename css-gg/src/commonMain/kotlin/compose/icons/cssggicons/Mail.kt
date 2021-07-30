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

public val CssGgIcons.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0098f, 5.8379f)
                curveTo(3.0098f, 5.2856f, 3.4575f, 4.8379f, 4.0098f, 4.8379f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 4.8379f, 21.0f, 5.2856f, 21.0f, 5.8379f)
                verticalLineTo(17.1621f)
                curveTo(21.0f, 18.2667f, 20.1046f, 19.1621f, 19.0f, 19.1621f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 19.1621f, 3.0f, 18.2667f, 3.0f, 17.1621f)
                verticalLineTo(6.1621f)
                curveTo(3.0f, 6.1145f, 3.0033f, 6.0676f, 3.0098f, 6.0218f)
                verticalLineTo(5.8379f)
                close()
                moveTo(5.0f, 8.0617f)
                verticalLineTo(17.1621f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.062f)
                lineTo(14.1215f, 12.9405f)
                curveTo(12.9499f, 14.1121f, 11.0504f, 14.1121f, 9.8788f, 12.9405f)
                lineTo(5.0f, 8.0617f)
                close()
                moveTo(6.5723f, 6.8055f)
                horizontalLineTo(17.428f)
                lineTo(12.7073f, 11.5263f)
                curveTo(12.3168f, 11.9168f, 11.6836f, 11.9168f, 11.2931f, 11.5263f)
                lineTo(6.5723f, 6.8055f)
                close()
            }
        }
        .build()
        return _mail!!
    }

private var _mail: ImageVector? = null
