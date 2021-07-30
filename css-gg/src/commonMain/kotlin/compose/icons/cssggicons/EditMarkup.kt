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

public val CssGgIcons.EditMarkup: ImageVector
    get() {
        if (_editMarkup != null) {
            return _editMarkup!!
        }
        _editMarkup = Builder(name = "EditMarkup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 24.0f)
                curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                curveTo(24.0f, 5.3726f, 18.6274f, 0.0f, 12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(18.5793f, 19.531f)
                curveTo(20.6758f, 17.698f, 22.0f, 15.0036f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 14.9616f, 3.2874f, 17.6225f, 5.3332f, 19.4535f)
                lineTo(7.0f, 10.9738f)
                horizontalLineTo(9.1703f)
                lineTo(12.0f, 6.0725f)
                lineTo(14.8297f, 10.9738f)
                horizontalLineTo(17.0f)
                lineTo(18.5793f, 19.531f)
                close()
                moveTo(16.0919f, 21.1272f)
                lineTo(15.2056f, 12.9738f)
                horizontalLineTo(8.7944f)
                lineTo(7.9081f, 21.1272f)
                curveTo(9.1572f, 21.688f, 10.5421f, 22.0f, 12.0f, 22.0f)
                curveTo(13.4579f, 22.0f, 14.8428f, 21.688f, 16.0919f, 21.1272f)
                close()
            }
        }
        .build()
        return _editMarkup!!
    }

private var _editMarkup: ImageVector? = null
