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

public val LineAwesomeIcons.QuestionSolid: ImageVector
    get() {
        if (_questionSolid != null) {
            return _questionSolid!!
        }
        _questionSolid = Builder(name = "QuestionSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(11.672f, 4.0f, 8.0f, 7.055f, 8.0f, 11.0f)
                lineTo(8.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                lineTo(14.0f, 11.0f)
                curveTo(14.0f, 10.852f, 14.09f, 10.637f, 14.438f, 10.406f)
                curveTo(14.785f, 10.176f, 15.352f, 10.0f, 16.0f, 10.0f)
                curveTo(16.652f, 10.0f, 17.219f, 10.176f, 17.563f, 10.406f)
                curveTo(17.906f, 10.637f, 18.0f, 10.836f, 18.0f, 11.0f)
                curveTo(18.0f, 11.578f, 17.813f, 11.98f, 17.438f, 12.438f)
                curveTo(17.063f, 12.895f, 16.48f, 13.367f, 15.844f, 13.906f)
                curveTo(14.566f, 14.988f, 13.0f, 16.496f, 13.0f, 19.0f)
                lineTo(13.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                lineTo(19.0f, 19.0f)
                curveTo(19.0f, 18.66f, 19.125f, 18.422f, 19.5f, 18.031f)
                curveTo(19.875f, 17.641f, 20.496f, 17.18f, 21.156f, 16.625f)
                curveTo(22.477f, 15.516f, 24.0f, 13.816f, 24.0f, 11.0f)
                curveTo(24.0f, 7.09f, 20.336f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(19.395f, 6.0f, 22.0f, 8.367f, 22.0f, 11.0f)
                curveTo(22.0f, 13.145f, 21.023f, 14.102f, 19.844f, 15.094f)
                curveTo(19.254f, 15.59f, 18.625f, 16.074f, 18.063f, 16.656f)
                curveTo(17.715f, 17.016f, 17.445f, 17.484f, 17.25f, 18.0f)
                lineTo(15.313f, 18.0f)
                curveTo(15.625f, 16.988f, 16.234f, 16.219f, 17.156f, 15.438f)
                curveTo(17.77f, 14.922f, 18.438f, 14.383f, 19.0f, 13.688f)
                curveTo(19.563f, 12.992f, 20.0f, 12.082f, 20.0f, 11.0f)
                curveTo(20.0f, 10.039f, 19.43f, 9.242f, 18.688f, 8.75f)
                curveTo(17.945f, 8.258f, 17.004f, 8.0f, 16.0f, 8.0f)
                curveTo(14.992f, 8.0f, 14.051f, 8.258f, 13.313f, 8.75f)
                curveTo(12.574f, 9.242f, 12.0f, 10.043f, 12.0f, 11.0f)
                lineTo(12.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 11.0f)
                curveTo(10.0f, 8.316f, 12.598f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(13.0f, 22.0f)
                lineTo(13.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 22.0f)
                close()
                moveTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                close()
            }
        }
        .build()
        return _questionSolid!!
    }

private var _questionSolid: ImageVector? = null
