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

public val SimpleIcons.Paloaltosoftware: ImageVector
    get() {
        if (_paloaltosoftware != null) {
            return _paloaltosoftware!!
        }
        _paloaltosoftware = Builder(name = "Paloaltosoftware", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.995f, 0.005f)
                curveToRelative(-0.58f, 0.0f, -1.158f, 0.228f, -1.615f, 0.685f)
                lineTo(0.685f, 10.385f)
                curveToRelative(-0.913f, 0.913f, -0.913f, 2.318f, 0.0f, 3.231f)
                lineToRelative(0.842f, 0.843f)
                lineToRelative(8.01f, -8.15f)
                arcToRelative(3.435f, 3.435f, 0.0f, false, true, 4.847f, 0.0f)
                lineToRelative(8.079f, 8.08f)
                lineToRelative(0.842f, -0.843f)
                curveToRelative(0.914f, -0.843f, 0.915f, -2.248f, 0.072f, -3.161f)
                lineTo(13.612f, 0.69f)
                arcToRelative(2.279f, 2.279f, 0.0f, false, false, -1.617f, -0.685f)
                close()
                moveTo(11.995f, 6.468f)
                curveToRelative(-0.58f, 0.0f, -1.158f, 0.228f, -1.615f, 0.684f)
                lineTo(0.685f, 16.848f)
                curveToRelative(-0.913f, 0.913f, -0.913f, 2.318f, 0.0f, 3.23f)
                lineToRelative(3.231f, 3.232f)
                curveToRelative(0.914f, 0.913f, 2.318f, 0.913f, 3.232f, 0.0f)
                lineToRelative(4.847f, -4.846f)
                lineToRelative(4.848f, 4.846f)
                curveToRelative(0.913f, 0.913f, 2.318f, 0.913f, 3.231f, 0.0f)
                lineToRelative(3.231f, -3.231f)
                curveToRelative(0.914f, -0.843f, 0.915f, -2.318f, 0.072f, -3.231f)
                lineToRelative(-9.765f, -9.696f)
                arcToRelative(2.279f, 2.279f, 0.0f, false, false, -1.617f, -0.684f)
                close()
            }
        }
        .build()
        return _paloaltosoftware!!
    }

private var _paloaltosoftware: ImageVector? = null
