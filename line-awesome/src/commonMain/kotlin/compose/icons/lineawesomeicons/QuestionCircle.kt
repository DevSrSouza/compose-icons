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

public val LineAwesomeIcons.QuestionCircle: ImageVector
    get() {
        if (_questionCircle != null) {
            return _questionCircle!!
        }
        _questionCircle = Builder(name = "QuestionCircle", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(13.801f, 10.0f, 12.0f, 11.801f, 12.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                curveTo(14.0f, 12.883f, 14.883f, 12.0f, 16.0f, 12.0f)
                curveTo(17.117f, 12.0f, 18.0f, 12.883f, 18.0f, 14.0f)
                curveTo(18.0f, 14.766f, 17.508f, 15.445f, 16.781f, 15.688f)
                lineTo(16.375f, 15.813f)
                curveTo(15.559f, 16.082f, 15.0f, 16.863f, 15.0f, 17.719f)
                lineTo(15.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 17.719f)
                lineTo(17.406f, 17.594f)
                curveTo(18.945f, 17.082f, 20.0f, 15.621f, 20.0f, 14.0f)
                curveTo(20.0f, 11.801f, 18.199f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(15.0f, 20.0f)
                lineTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _questionCircle!!
    }

private var _questionCircle: ImageVector? = null
