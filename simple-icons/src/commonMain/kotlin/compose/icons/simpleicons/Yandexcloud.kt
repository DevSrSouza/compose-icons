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

public val SimpleIcons.Yandexcloud: ImageVector
    get() {
        if (_yandexcloud != null) {
            return _yandexcloud!!
        }
        _yandexcloud = Builder(name = "Yandexcloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(7.163f, 20.618f)
                curveTo(4.152f, 18.927f, 2.12f, 15.702f, 2.12f, 12.0f)
                curveToRelative(0.0f, -5.46f, 4.42f, -9.88f, 9.88f, -9.88f)
                curveToRelative(1.429f, 0.0f, 2.496f, 0.536f, 3.029f, 1.187f)
                curveToRelative(0.534f, 0.65f, 0.684f, 1.715f, 0.5f, 3.253f)
                lineToRelative(-3.207f, 0.631f)
                curveToRelative(-2.905f, 0.532f, -4.506f, 2.148f, -5.06f, 5.065f)
                curveToRelative(-0.07f, 0.406f, -0.15f, 0.812f, -0.226f, 1.196f)
                curveToRelative(-0.031f, 0.157f, -0.062f, 0.312f, -0.09f, 0.46f)
                curveToRelative(-0.073f, 0.396f, -0.143f, 0.773f, -0.208f, 1.124f)
                curveToRelative(-0.093f, 0.505f, -0.177f, 0.957f, -0.247f, 1.34f)
                curveToRelative(-0.324f, 1.884f, -0.06f, 3.276f, 0.672f, 4.242f)
                close()
                moveTo(15.149f, 8.767f)
                curveToRelative(-0.087f, 0.434f, -0.167f, 0.867f, -0.247f, 1.302f)
                curveToRelative(-0.081f, 0.434f, -0.16f, 0.868f, -0.247f, 1.301f)
                curveToRelative(-0.396f, 2.05f, -1.364f, 2.996f, -3.42f, 3.391f)
                lineToRelative(-2.391f, 0.474f)
                curveToRelative(0.059f, -0.296f, 0.119f, -0.611f, 0.178f, -0.927f)
                curveToRelative(0.022f, -0.12f, 0.044f, -0.241f, 0.067f, -0.362f)
                curveToRelative(0.078f, -0.421f, 0.157f, -0.855f, 0.25f, -1.313f)
                curveToRelative(0.395f, -2.05f, 1.344f, -2.996f, 3.399f, -3.391f)
                lineToRelative(2.411f, -0.475f)
                close()
                moveTo(12.0f, 21.88f)
                curveToRelative(-1.429f, 0.0f, -2.496f, -0.536f, -3.029f, -1.187f)
                reflectiveCurveToRelative(-0.684f, -1.715f, -0.5f, -3.253f)
                lineToRelative(3.18f, -0.631f)
                curveToRelative(2.905f, -0.532f, 4.507f, -2.148f, 5.08f, -5.046f)
                curveToRelative(0.069f, -0.406f, 0.149f, -0.812f, 0.226f, -1.196f)
                curveToRelative(0.031f, -0.157f, 0.062f, -0.311f, 0.09f, -0.46f)
                curveToRelative(0.087f, -0.471f, 0.171f, -0.917f, 0.247f, -1.327f)
                curveToRelative(0.081f, -0.432f, 0.154f, -0.822f, 0.215f, -1.156f)
                curveToRelative(0.325f, -1.884f, 0.061f, -3.275f, -0.671f, -4.242f)
                curveTo(19.848f, 5.073f, 21.88f, 8.298f, 21.88f, 12.0f)
                curveToRelative(0.0f, 5.46f, -4.42f, 9.88f, -9.88f, 9.88f)
                close()
            }
        }
        .build()
        return _yandexcloud!!
    }

private var _yandexcloud: ImageVector? = null
