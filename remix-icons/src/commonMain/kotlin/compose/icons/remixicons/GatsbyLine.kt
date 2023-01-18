package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.GatsbyLine: ImageVector
    get() {
        if (_gatsbyLine != null) {
            return _gatsbyLine!!
        }
        _gatsbyLine = Builder(name = "GatsbyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.751f, 21.997f)
                curveToRelative(-5.221f, -0.128f, -9.45f, -4.257f, -9.736f, -9.438f)
                lineToRelative(-0.012f, -0.313f)
                lineToRelative(9.748f, 9.751f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(9.988f, 9.988f, 0.0f, false, true, 8.193f, 4.265f)
                lineToRelative(-1.638f, 1.148f)
                arcTo(8.003f, 8.003f, 0.0f, false, false, 4.534f, 9.12f)
                lineTo(14.88f, 19.466f)
                arcTo(8.018f, 8.018f, 0.0f, false, false, 19.748f, 14.0f)
                horizontalLineTo(15.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(22.0f)
                curveToRelative(0.0f, 4.726f, -3.279f, 8.686f, -7.685f, 9.73f)
                lineTo(2.269f, 9.686f)
                curveTo(3.314f, 5.28f, 7.274f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _gatsbyLine!!
    }

private var _gatsbyLine: ImageVector? = null
