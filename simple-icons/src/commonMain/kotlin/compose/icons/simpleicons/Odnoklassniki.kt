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

public val SimpleIcons.Odnoklassniki: ImageVector
    get() {
        if (_odnoklassniki != null) {
            return _odnoklassniki!!
        }
        _odnoklassniki = Builder(name = "Odnoklassniki", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -6.194f, 6.195f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 6.195f, 6.192f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 6.193f, -6.192f)
                arcTo(6.2f, 6.2f, 0.0f, false, false, 12.001f, 0.0f)
                close()
                moveTo(12.0f, 3.63f)
                arcToRelative(2.567f, 2.567f, 0.0f, false, true, 2.565f, 2.565f)
                arcToRelative(2.568f, 2.568f, 0.0f, false, true, -2.564f, 2.564f)
                arcToRelative(2.568f, 2.568f, 0.0f, false, true, -2.565f, -2.564f)
                arcToRelative(2.567f, 2.567f, 0.0f, false, true, 2.565f, -2.564f)
                close()
                moveTo(6.807f, 12.6f)
                arcToRelative(1.814f, 1.814f, 0.0f, false, false, -0.91f, 3.35f)
                arcToRelative(11.611f, 11.611f, 0.0f, false, false, 3.597f, 1.49f)
                lineToRelative(-3.462f, 3.463f)
                arcToRelative(1.815f, 1.815f, 0.0f, false, false, 2.567f, 2.566f)
                lineTo(12.0f, 20.066f)
                lineToRelative(3.405f, 3.403f)
                arcToRelative(1.813f, 1.813f, 0.0f, false, false, 2.564f, 0.0f)
                curveToRelative(0.71f, -0.709f, 0.71f, -1.858f, 0.0f, -2.566f)
                lineToRelative(-3.462f, -3.462f)
                arcToRelative(11.593f, 11.593f, 0.0f, false, false, 3.596f, -1.49f)
                arcToRelative(1.814f, 1.814f, 0.0f, true, false, -1.932f, -3.073f)
                arcToRelative(7.867f, 7.867f, 0.0f, false, true, -8.34f, 0.0f)
                curveToRelative(-0.318f, -0.2f, -0.674f, -0.29f, -1.024f, -0.278f)
                close()
            }
        }
        .build()
        return _odnoklassniki!!
    }

private var _odnoklassniki: ImageVector? = null
