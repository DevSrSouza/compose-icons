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

public val SimpleIcons.Otto: ImageVector
    get() {
        if (_otto != null) {
            return _otto!!
        }
        _otto = Builder(name = "Otto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.893f, 7.95f)
                curveToRelative(-1.195f, 0.0f, -2.168f, 0.37f, -2.855f, 1.132f)
                curveToRelative(0.097f, -0.265f, 0.149f, -0.588f, 0.156f, -0.968f)
                horizontalLineToRelative(-4.191f)
                curveToRelative(-0.914f, 0.0f, -1.437f, 0.402f, -1.796f, 1.437f)
                lineToRelative(0.185f, -1.437f)
                lineTo(8.157f, 8.114f)
                curveToRelative(-0.775f, 0.0f, -1.307f, 0.37f, -1.5f, 1.096f)
                curveToRelative(-0.524f, -0.84f, -1.457f, -1.26f, -2.636f, -1.26f)
                curveTo(1.779f, 7.95f, 0.32f, 9.246f, 0.059f, 12.01f)
                lineToRelative(-0.033f, 0.35f)
                curveToRelative(-0.228f, 2.47f, 1.067f, 3.69f, 3.08f, 3.69f)
                curveToRelative(2.243f, 0.0f, 3.702f, -1.307f, 3.963f, -4.072f)
                lineToRelative(0.033f, -0.348f)
                curveToRelative(0.059f, -0.634f, 0.015f, -1.185f, -0.114f, -1.655f)
                horizontalLineToRelative(1.899f)
                lineToRelative(-0.545f, 4.66f)
                curveToRelative(-0.108f, 0.925f, 0.392f, 1.35f, 1.23f, 1.35f)
                curveToRelative(0.512f, 0.0f, 0.686f, -0.034f, 0.882f, -0.066f)
                lineToRelative(0.675f, -5.944f)
                horizontalLineToRelative(2.21f)
                lineToRelative(-0.544f, 4.66f)
                curveToRelative(-0.11f, 0.925f, 0.392f, 1.35f, 1.23f, 1.35f)
                curveToRelative(0.511f, 0.0f, 0.685f, -0.034f, 0.881f, -0.066f)
                lineToRelative(0.675f, -5.944f)
                horizontalLineToRelative(1.089f)
                curveToRelative(0.376f, 0.0f, 0.68f, -0.087f, 0.915f, -0.26f)
                curveToRelative(-0.342f, 0.604f, -0.566f, 1.366f, -0.654f, 2.296f)
                lineToRelative(-0.032f, 0.348f)
                curveToRelative(-0.229f, 2.471f, 1.066f, 3.69f, 3.08f, 3.69f)
                curveToRelative(2.243f, 0.0f, 3.701f, -1.306f, 3.962f, -4.07f)
                lineToRelative(0.033f, -0.349f)
                curveToRelative(0.229f, -2.46f, -1.067f, -3.68f, -3.08f, -3.68f)
                close()
                moveTo(4.86f, 11.477f)
                lineToRelative(-0.022f, 0.262f)
                curveToRelative(-0.152f, 1.872f, -0.762f, 2.449f, -1.513f, 2.449f)
                curveToRelative(-0.675f, 0.0f, -1.153f, -0.457f, -1.055f, -1.676f)
                lineToRelative(0.021f, -0.272f)
                curveToRelative(0.153f, -1.862f, 0.762f, -2.45f, 1.513f, -2.45f)
                curveToRelative(0.664f, 0.0f, 1.154f, 0.468f, 1.056f, 1.687f)
                close()
                moveTo(21.733f, 11.477f)
                lineTo(21.711f, 11.739f)
                curveToRelative(-0.153f, 1.872f, -0.762f, 2.449f, -1.513f, 2.449f)
                curveToRelative(-0.675f, 0.0f, -1.154f, -0.457f, -1.056f, -1.676f)
                lineToRelative(0.022f, -0.272f)
                curveToRelative(0.152f, -1.862f, 0.762f, -2.45f, 1.513f, -2.45f)
                curveToRelative(0.664f, 0.0f, 1.154f, 0.468f, 1.056f, 1.687f)
                close()
            }
        }
        .build()
        return _otto!!
    }

private var _otto: ImageVector? = null
