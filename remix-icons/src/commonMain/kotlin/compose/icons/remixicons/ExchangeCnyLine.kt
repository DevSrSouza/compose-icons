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

public val RemixIcons.ExchangeCnyLine: ImageVector
    get() {
        if (_exchangeCnyLine != null) {
            return _exchangeCnyLine!!
        }
        _exchangeCnyLine = Builder(name = "ExchangeCnyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.375f, 15.103f)
                arcTo(8.001f, 8.001f, 0.0f, false, false, 8.03f, 5.053f)
                lineToRelative(-0.992f, -1.737f)
                arcTo(9.996f, 9.996f, 0.0f, false, true, 17.0f, 3.34f)
                curveToRelative(4.49f, 2.592f, 6.21f, 8.142f, 4.117f, 12.77f)
                lineToRelative(1.342f, 0.774f)
                lineToRelative(-4.165f, 2.214f)
                lineToRelative(-0.165f, -4.714f)
                lineToRelative(1.246f, 0.719f)
                close()
                moveTo(4.625f, 8.897f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, false, 11.345f, 10.05f)
                lineToRelative(0.992f, 1.737f)
                arcTo(9.996f, 9.996f, 0.0f, false, true, 7.0f, 20.66f)
                curveTo(2.51f, 18.068f, 0.79f, 12.518f, 2.883f, 7.89f)
                lineTo(1.54f, 7.117f)
                lineToRelative(4.165f, -2.214f)
                lineToRelative(0.165f, 4.714f)
                lineToRelative(-1.246f, -0.719f)
                close()
                moveTo(13.0f, 13.536f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.586f)
                lineTo(8.464f, 8.414f)
                lineTo(9.88f, 7.0f)
                lineTo(12.0f, 9.121f)
                lineTo(14.121f, 7.0f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(-2.122f, 2.122f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _exchangeCnyLine!!
    }

private var _exchangeCnyLine: ImageVector? = null
