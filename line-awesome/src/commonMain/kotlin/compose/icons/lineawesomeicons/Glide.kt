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

public val LineAwesomeIcons.Glide: ImageVector
    get() {
        if (_glide != null) {
            return _glide!!
        }
        _glide = Builder(name = "Glide", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(15.922f, 9.0f)
                curveTo(12.783f, 9.0f, 11.193f, 12.098f, 11.193f, 14.406f)
                curveTo(11.193f, 16.801f, 12.594f, 18.129f, 14.971f, 18.129f)
                curveTo(15.299f, 18.129f, 15.273f, 18.102f, 15.273f, 18.229f)
                curveTo(14.813f, 21.744f, 12.801f, 21.858f, 12.801f, 20.807f)
                curveTo(12.801f, 19.739f, 14.026f, 19.209f, 14.039f, 19.143f)
                curveTo(14.03f, 18.81f, 12.756f, 18.391f, 12.432f, 18.391f)
                curveTo(11.508f, 18.391f, 11.0f, 19.835f, 11.0f, 20.605f)
                curveTo(11.0f, 22.019f, 11.892f, 23.0f, 13.332f, 23.0f)
                curveTo(15.442f, 23.0f, 16.984f, 20.824f, 17.461f, 18.986f)
                curveTo(17.873f, 17.336f, 17.766f, 17.261f, 17.998f, 17.143f)
                curveTo(18.874f, 16.701f, 19.224f, 16.408f, 20.213f, 16.408f)
                curveTo(20.699f, 16.408f, 21.045f, 16.51f, 21.82f, 16.637f)
                curveTo(21.899f, 16.64f, 22.0f, 16.56f, 22.0f, 16.482f)
                curveTo(22.0f, 16.259f, 21.09f, 14.833f, 20.885f, 14.754f)
                curveTo(20.789f, 14.715f, 20.57f, 14.652f, 20.465f, 14.652f)
                curveTo(19.454f, 14.652f, 19.114f, 15.113f, 18.26f, 15.594f)
                lineTo(18.236f, 15.57f)
                curveTo(18.424f, 14.283f, 18.877f, 13.066f, 18.877f, 11.744f)
                curveTo(18.877f, 9.791f, 17.835f, 9.0f, 15.922f, 9.0f)
                close()
                moveTo(16.061f, 10.516f)
                curveTo(16.561f, 10.516f, 16.6f, 10.879f, 16.6f, 11.299f)
                curveTo(16.6f, 11.684f, 16.528f, 12.072f, 16.449f, 12.453f)
                curveTo(16.195f, 13.67f, 15.942f, 14.896f, 15.693f, 16.113f)
                curveTo(15.632f, 16.389f, 15.331f, 16.328f, 15.094f, 16.328f)
                curveTo(14.052f, 16.328f, 13.758f, 15.192f, 13.758f, 14.338f)
                curveTo(13.758f, 13.055f, 14.248f, 11.356f, 15.443f, 10.699f)
                curveTo(15.631f, 10.59f, 15.847f, 10.516f, 16.061f, 10.516f)
                close()
            }
        }
        .build()
        return _glide!!
    }

private var _glide: ImageVector? = null
