package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Eslint: ImageVector
    get() {
        if (_eslint != null) {
            return _eslint!!
        }
        _eslint = Builder(name = "Eslint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.257f, 9.132f)
                lineTo(11.816f, 6.5f)
                arcToRelative(0.369f, 0.369f, 0.0f, false, true, 0.368f, 0.0f)
                lineToRelative(4.559f, 2.632f)
                arcToRelative(0.369f, 0.369f, 0.0f, false, true, 0.184f, 0.32f)
                verticalLineToRelative(5.263f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.184f, 0.319f)
                lineToRelative(-4.559f, 2.632f)
                arcToRelative(0.369f, 0.369f, 0.0f, false, true, -0.368f, 0.0f)
                lineToRelative(-4.559f, -2.632f)
                arcToRelative(0.369f, 0.369f, 0.0f, false, true, -0.184f, -0.32f)
                verticalLineTo(9.452f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.184f, -0.32f)
                moveTo(23.852f, 11.53f)
                lineToRelative(-5.446f, -9.475f)
                curveToRelative(-0.198f, -0.343f, -0.564f, -0.596f, -0.96f, -0.596f)
                horizontalLineTo(6.555f)
                curveToRelative(-0.396f, 0.0f, -0.762f, 0.253f, -0.96f, 0.596f)
                lineTo(0.149f, 11.509f)
                arcToRelative(1.127f, 1.127f, 0.0f, false, false, 0.0f, 1.117f)
                lineToRelative(5.447f, 9.398f)
                curveToRelative(0.197f, 0.342f, 0.563f, 0.517f, 0.959f, 0.517f)
                horizontalLineToRelative(10.893f)
                curveToRelative(0.395f, 0.0f, 0.76f, -0.17f, 0.959f, -0.512f)
                lineToRelative(5.446f, -9.413f)
                arcToRelative(1.069f, 1.069f, 0.0f, false, false, 0.0f, -1.086f)
                moveToRelative(-4.51f, 4.556f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.204f, 0.338f)
                lineTo(12.2f, 20.426f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, true, -0.392f, 0.0f)
                lineToRelative(-6.943f, -4.002f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.205f, -0.338f)
                verticalLineTo(8.08f)
                curveToRelative(0.0f, -0.14f, 0.083f, -0.269f, 0.204f, -0.338f)
                lineTo(11.8f, 3.74f)
                curveToRelative(0.12f, -0.07f, 0.272f, -0.07f, 0.392f, 0.0f)
                lineToRelative(6.943f, 4.003f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.206f, 0.338f)
                close()
            }
        }
        .build()
        return _eslint!!
    }

private var _eslint: ImageVector? = null
