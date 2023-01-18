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

public val RemixIcons.BoxingLine: ImageVector
    get() {
        if (_boxingLine != null) {
            return _boxingLine!!
        }
        _boxingLine = Builder(name = "BoxingLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 2.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 22.0f, 7.5f)
                lineTo(22.0f, 10.0f)
                curveToRelative(0.0f, 0.888f, -0.386f, 1.686f, -1.0f, 2.235f)
                lineTo(21.0f, 17.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -2.0f, 2.829f)
                lineTo(19.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.17f)
                arcTo(3.001f, 3.001f, 0.0f, false, true, 3.0f, 17.0f)
                lineTo(3.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(9.5f)
                close()
                moveTo(9.5f, 11.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, 0.993f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, -0.883f)
                lineTo(19.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-6.036f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.5f, 16.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.493f, -1.356f)
                lineTo(11.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.356f, -1.493f)
                lineTo(9.5f, 11.0f)
                close()
                moveTo(16.5f, 4.0f)
                lineTo(7.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.163f, 2.0f)
                lineTo(19.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, -0.883f)
                lineTo(20.0f, 10.0f)
                lineTo(20.0f, 7.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.308f, -3.495f)
                lineTo(16.5f, 4.0f)
                close()
            }
        }
        .build()
        return _boxingLine!!
    }

private var _boxingLine: ImageVector? = null
