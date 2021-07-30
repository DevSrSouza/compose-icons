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

public val SimpleIcons.Shenzhenmetro: ImageVector
    get() {
        if (_shenzhenmetro != null) {
            return _shenzhenmetro!!
        }
        _shenzhenmetro = Builder(name = "Shenzhenmetro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.27f, 0.0f)
                verticalLineToRelative(0.155f)
                curveToRelative(0.0f, 4.69f, 3.033f, 8.751f, 7.331f, 10.434f)
                verticalLineToRelative(2.736f)
                curveTo(3.303f, 14.99f, 0.271f, 19.019f, 0.271f, 23.768f)
                lineTo(0.271f, 24.0f)
                lineTo(4.36f, 24.0f)
                verticalLineToRelative(-0.232f)
                curveToRelative(0.0f, -2.459f, 1.278f, -4.623f, 3.24f, -5.934f)
                lineTo(7.6f, 24.0f)
                horizontalLineToRelative(3.165f)
                verticalLineToRelative(-7.384f)
                curveToRelative(0.408f, -0.065f, 0.82f, -0.098f, 1.234f, -0.1f)
                curveToRelative(0.423f, 0.0f, 0.834f, 0.038f, 1.235f, 0.1f)
                lineTo(13.234f, 24.0f)
                horizontalLineToRelative(3.165f)
                verticalLineToRelative(-6.148f)
                curveToRelative(1.925f, 1.313f, 3.163f, 3.469f, 3.163f, 5.916f)
                lineTo(19.562f, 24.0f)
                horizontalLineToRelative(4.168f)
                verticalLineToRelative(-0.232f)
                curveToRelative(0.0f, -4.691f, -3.033f, -8.751f, -7.331f, -10.434f)
                lineTo(16.399f, 10.6f)
                curveToRelative(4.298f, -1.665f, 7.33f, -5.696f, 7.33f, -10.446f)
                lineTo(23.729f, 0.001f)
                horizontalLineToRelative(-4.09f)
                verticalLineToRelative(0.154f)
                curveToRelative(0.0f, 2.458f, -1.277f, 4.622f, -3.24f, 5.934f)
                lineTo(16.399f, 0.0f)
                horizontalLineToRelative(-3.165f)
                verticalLineToRelative(7.305f)
                curveToRelative(-0.408f, 0.066f, -0.821f, 0.1f, -1.235f, 0.103f)
                arcToRelative(8.11f, 8.11f, 0.0f, false, true, -1.234f, -0.103f)
                lineTo(10.765f, 0.001f)
                lineTo(7.6f, 0.001f)
                lineTo(7.6f, 6.07f)
                curveTo(5.675f, 4.757f, 4.438f, 2.602f, 4.438f, 0.154f)
                lineTo(4.438f, 0.001f)
                close()
                moveTo(10.765f, 11.358f)
                curveToRelative(0.82f, 0.084f, 1.648f, 0.084f, 2.469f, 0.001f)
                verticalLineToRelative(1.205f)
                arcToRelative(12.236f, 12.236f, 0.0f, false, false, -2.47f, 0.0f)
                close()
            }
        }
        .build()
        return _shenzhenmetro!!
    }

private var _shenzhenmetro: ImageVector? = null
