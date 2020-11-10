package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Prismic: VectorAsset
    get() {
        if (_prismic != null) {
            return _prismic!!
        }
        _prismic = VectorAssetBuilder(name = "Prismic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.83f, 3.866f)
                lineTo(6.785f, 3.866f)
                arcToRelative(2.915f, 2.915f, 0.0f, false, false, -2.92f, 2.92f)
                verticalLineToRelative(8.553f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, 3.13f, 1.043f)
                arcToRelative(1.965f, 1.965f, 0.0f, false, true, -0.21f, -0.835f)
                lineTo(6.785f, 8.663f)
                curveToRelative(-0.104f, -0.104f, -0.104f, -2.607f, 1.044f, -4.797f)
                close()
                moveTo(20.24f, 7.829f)
                lineTo(20.24f, 6.786f)
                arcToRelative(2.915f, 2.915f, 0.0f, false, false, -2.92f, -2.92f)
                lineTo(8.872f, 3.866f)
                arcTo(7.912f, 7.912f, 0.0f, false, false, 7.83f, 6.995f)
                curveToRelative(0.21f, -0.209f, 0.522f, -0.209f, 0.835f, -0.209f)
                horizontalLineToRelative(6.78f)
                curveToRelative(0.104f, 0.0f, 2.607f, 0.0f, 4.797f, 1.043f)
                close()
                moveTo(16.173f, 20.241f)
                horizontalLineToRelative(1.043f)
                arcToRelative(2.915f, 2.915f, 0.0f, false, false, 2.92f, -2.92f)
                lineTo(20.136f, 8.871f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, -3.13f, -1.043f)
                curveToRelative(0.21f, 0.209f, 0.21f, 0.521f, 0.21f, 0.834f)
                verticalLineToRelative(6.78f)
                curveToRelative(0.0f, 0.104f, 0.0f, 2.607f, -1.043f, 4.798f)
                close()
                moveTo(3.761f, 16.173f)
                verticalLineToRelative(1.043f)
                arcToRelative(2.915f, 2.915f, 0.0f, false, false, 2.92f, 2.92f)
                horizontalLineToRelative(8.448f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, 1.043f, -3.129f)
                curveToRelative(-0.208f, 0.209f, -0.521f, 0.209f, -0.834f, 0.209f)
                lineTo(8.56f, 17.216f)
                curveToRelative(-0.104f, 0.0f, -2.607f, 0.0f, -4.797f, -1.043f)
                close()
                moveTo(13.253f, 0.007f)
                horizontalLineToRelative(-7.51f)
                curveTo(2.614f, 0.007f, 0.007f, 2.614f, 0.007f, 5.743f)
                curveToRelative(0.0f, 0.0f, 0.209f, 5.528f, 2.399f, 8.135f)
                curveToRelative(0.104f, 0.209f, 0.313f, 0.313f, 0.521f, 0.522f)
                lineTo(2.927f, 6.682f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, true, 3.86f, -3.86f)
                horizontalLineToRelative(1.668f)
                curveToRelative(0.313f, -0.417f, 0.626f, -0.73f, 0.939f, -1.042f)
                curveToRelative(0.939f, -0.73f, 2.399f, -1.356f, 3.86f, -1.773f)
                close()
                moveTo(23.996f, 13.253f)
                verticalLineToRelative(-7.51f)
                curveToRelative(0.0f, -3.129f, -2.607f, -5.736f, -5.736f, -5.736f)
                curveToRelative(0.0f, 0.0f, -5.528f, 0.208f, -8.136f, 2.398f)
                arcToRelative(1.257f, 1.257f, 0.0f, false, false, -0.521f, 0.522f)
                horizontalLineToRelative(7.718f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, true, 3.859f, 3.859f)
                verticalLineToRelative(1.669f)
                curveToRelative(0.417f, 0.313f, 0.73f, 0.626f, 1.043f, 0.939f)
                curveToRelative(0.73f, 0.938f, 1.356f, 2.398f, 1.773f, 3.859f)
                close()
                moveTo(10.75f, 23.995f)
                horizontalLineToRelative(7.51f)
                curveToRelative(3.128f, 0.0f, 5.736f, -2.607f, 5.736f, -5.736f)
                curveToRelative(0.0f, 0.0f, -0.209f, -5.528f, -2.399f, -8.135f)
                curveToRelative(-0.104f, -0.209f, -0.313f, -0.313f, -0.521f, -0.522f)
                verticalLineToRelative(7.718f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, true, -3.86f, 3.86f)
                horizontalLineToRelative(-1.668f)
                curveToRelative(-0.313f, 0.417f, -0.626f, 0.73f, -0.939f, 1.042f)
                curveToRelative(-0.939f, 0.73f, -2.399f, 1.356f, -3.86f, 1.773f)
                close()
                moveTo(0.007f, 10.75f)
                verticalLineToRelative(7.509f)
                curveToRelative(0.0f, 3.129f, 2.607f, 5.736f, 5.736f, 5.736f)
                curveToRelative(0.0f, 0.0f, 5.528f, -0.208f, 8.136f, -2.398f)
                curveToRelative(0.208f, -0.105f, 0.313f, -0.313f, 0.521f, -0.522f)
                lineTo(6.786f, 21.075f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, true, -3.859f, -3.859f)
                verticalLineToRelative(-1.669f)
                curveToRelative(-0.417f, -0.313f, -0.73f, -0.626f, -1.043f, -0.939f)
                curveTo(1.05f, 13.67f, 0.424f, 12.21f, 0.007f, 10.75f)
                close()
            }
        }
        .build()
        return _prismic!!
    }

private var _prismic: VectorAsset? = null
