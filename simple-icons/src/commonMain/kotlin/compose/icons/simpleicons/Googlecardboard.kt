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

public val SimpleIcons.Googlecardboard: ImageVector
    get() {
        if (_googlecardboard != null) {
            return _googlecardboard!!
        }
        _googlecardboard = Builder(name = "Googlecardboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.087f, 4.235f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, false, -2.183f, 0.91f)
                arcTo(3.133f, 3.133f, 0.0f, false, false, 0.0f, 7.35f)
                verticalLineToRelative(9.296f)
                arcToRelative(3.13f, 3.13f, 0.0f, false, false, 0.903f, 2.206f)
                arcToRelative(3.066f, 3.066f, 0.0f, false, false, 2.184f, 0.913f)
                horizontalLineToRelative(4.28f)
                arcToRelative(3.078f, 3.078f, 0.0f, false, false, 2.713f, -1.645f)
                lineToRelative(1.209f, -2.276f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, true, 0.703f, -0.42f)
                arcToRelative(0.783f, 0.783f, 0.0f, false, true, 0.701f, 0.42f)
                lineToRelative(1.21f, 2.276f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, 2.718f, 1.645f)
                horizontalLineToRelative(4.292f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, false, 2.184f, -0.913f)
                arcTo(3.13f, 3.13f, 0.0f, false, false, 24.0f, 16.646f)
                lineTo(24.0f, 7.35f)
                curveToRelative(0.0f, -0.825f, -0.324f, -1.618f, -0.904f, -2.205f)
                arcToRelative(3.065f, 3.065f, 0.0f, false, false, -2.183f, -0.91f)
                close()
                moveTo(6.582f, 9.891f)
                curveToRelative(1.138f, 0.0f, 2.06f, 0.937f, 2.06f, 2.092f)
                curveToRelative(0.0f, 1.157f, -0.922f, 2.093f, -2.06f, 2.093f)
                curveToRelative(-1.139f, 0.0f, -2.061f, -0.936f, -2.061f, -2.093f)
                curveToRelative(0.0f, -1.155f, 0.922f, -2.092f, 2.06f, -2.092f)
                close()
                moveTo(17.414f, 9.891f)
                curveToRelative(1.139f, 0.0f, 2.061f, 0.937f, 2.061f, 2.092f)
                curveToRelative(0.0f, 1.157f, -0.922f, 2.093f, -2.06f, 2.093f)
                curveToRelative(-1.14f, 0.0f, -2.063f, -0.936f, -2.063f, -2.093f)
                curveToRelative(0.0f, -1.155f, 0.923f, -2.092f, 2.062f, -2.092f)
                close()
            }
        }
        .build()
        return _googlecardboard!!
    }

private var _googlecardboard: ImageVector? = null
