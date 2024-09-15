package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.JsSquare: ImageVector
    get() {
        if (_jsSquare != null) {
            return _jsSquare!!
        }
        _jsSquare = Builder(name = "JsSquare", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(20.244f, 15.0f)
                curveTo(18.819f, 15.0f, 17.898f, 15.912f, 17.898f, 17.119f)
                curveTo(17.898f, 18.43f, 18.667f, 19.057f, 19.826f, 19.551f)
                lineTo(20.227f, 19.723f)
                curveTo(20.959f, 20.046f, 21.395f, 20.234f, 21.395f, 20.785f)
                curveTo(21.395f, 21.25f, 20.968f, 21.584f, 20.303f, 21.584f)
                curveTo(19.515f, 21.584f, 19.067f, 21.166f, 18.725f, 20.605f)
                lineTo(17.414f, 21.355f)
                curveTo(17.879f, 22.286f, 18.848f, 23.0f, 20.34f, 23.0f)
                curveTo(21.86f, 23.0f, 23.0f, 22.212f, 23.0f, 20.768f)
                curveTo(23.0f, 19.419f, 22.23f, 18.819f, 20.861f, 18.24f)
                lineTo(20.463f, 18.068f)
                curveTo(19.77f, 17.764f, 19.475f, 17.565f, 19.475f, 17.09f)
                curveTo(19.475f, 16.7f, 19.769f, 16.396f, 20.244f, 16.396f)
                curveTo(20.71f, 16.396f, 21.003f, 16.596f, 21.279f, 17.09f)
                lineTo(22.535f, 16.283f)
                curveTo(22.003f, 15.352f, 21.27f, 15.0f, 20.244f, 15.0f)
                close()
                moveTo(14.395f, 15.096f)
                lineTo(14.395f, 20.559f)
                curveTo(14.395f, 21.357f, 14.052f, 21.564f, 13.529f, 21.564f)
                curveTo(12.978f, 21.564f, 12.741f, 21.185f, 12.494f, 20.738f)
                lineTo(11.184f, 21.527f)
                curveTo(11.564f, 22.335f, 12.313f, 23.0f, 13.596f, 23.0f)
                curveTo(15.021f, 23.0f, 16.0f, 22.239f, 16.0f, 20.576f)
                lineTo(16.0f, 15.096f)
                lineTo(14.395f, 15.096f)
                close()
            }
        }
        .build()
        return _jsSquare!!
    }

private var _jsSquare: ImageVector? = null
