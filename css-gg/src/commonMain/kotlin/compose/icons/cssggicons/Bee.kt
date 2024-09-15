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

public val CssGgIcons.Bee: ImageVector
    get() {
        if (_bee != null) {
            return _bee!!
        }
        _bee = Builder(name = "Bee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.951f, 15.571f)
                curveTo(17.77f, 17.219f, 16.92f, 18.665f, 15.681f, 19.635f)
                curveTo(15.332f, 20.469f, 14.709f, 21.16f, 13.925f, 21.595f)
                curveTo(13.703f, 22.457f, 12.92f, 23.094f, 11.988f, 23.094f)
                curveTo(11.056f, 23.094f, 10.273f, 22.457f, 10.051f, 21.595f)
                curveTo(9.267f, 21.16f, 8.644f, 20.469f, 8.295f, 19.635f)
                curveTo(7.06f, 18.669f, 6.212f, 17.229f, 6.026f, 15.588f)
                curveTo(4.935f, 16.416f, 3.38f, 16.412f, 2.286f, 15.494f)
                curveTo(1.017f, 14.429f, 0.851f, 12.537f, 1.916f, 11.268f)
                lineTo(6.01f, 6.39f)
                curveTo(6.271f, 3.318f, 8.848f, 0.906f, 11.988f, 0.906f)
                curveTo(15.117f, 0.906f, 17.686f, 3.3f, 17.963f, 6.357f)
                lineTo(22.084f, 11.268f)
                curveTo(23.149f, 12.537f, 22.983f, 14.429f, 21.714f, 15.494f)
                curveTo(20.613f, 16.418f, 19.043f, 16.416f, 17.951f, 15.571f)
                close()
                moveTo(15.625f, 12.906f)
                lineTo(13.947f, 10.906f)
                horizontalLineTo(10.053f)
                lineTo(8.375f, 12.906f)
                horizontalLineTo(15.625f)
                close()
                moveTo(17.988f, 12.609f)
                lineTo(19.02f, 13.839f)
                curveTo(19.375f, 14.262f, 20.005f, 14.317f, 20.428f, 13.962f)
                curveTo(20.851f, 13.607f, 20.907f, 12.976f, 20.552f, 12.554f)
                lineTo(17.988f, 9.498f)
                verticalLineTo(12.609f)
                close()
                moveTo(15.988f, 8.906f)
                verticalLineTo(6.906f)
                curveTo(15.988f, 4.696f, 14.197f, 2.906f, 11.988f, 2.906f)
                curveTo(9.779f, 2.906f, 7.988f, 4.696f, 7.988f, 6.906f)
                verticalLineTo(8.906f)
                horizontalLineTo(15.988f)
                close()
                moveTo(4.981f, 13.839f)
                lineTo(5.988f, 12.639f)
                verticalLineTo(9.527f)
                lineTo(3.448f, 12.554f)
                curveTo(3.093f, 12.976f, 3.149f, 13.607f, 3.572f, 13.962f)
                curveTo(3.995f, 14.317f, 4.626f, 14.262f, 4.981f, 13.839f)
                close()
                moveTo(11.988f, 18.906f)
                curveTo(9.779f, 18.906f, 7.988f, 17.115f, 7.988f, 14.906f)
                horizontalLineTo(15.988f)
                curveTo(15.988f, 17.115f, 14.197f, 18.906f, 11.988f, 18.906f)
                close()
            }
        }
        .build()
        return _bee!!
    }

private var _bee: ImageVector? = null
