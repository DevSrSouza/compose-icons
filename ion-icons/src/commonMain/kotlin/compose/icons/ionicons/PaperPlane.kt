package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(473.0f, 39.05f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -25.5f, -5.46f)
                lineTo(47.47f, 185.0f)
                lineToRelative(-0.08f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 1.0f, 45.16f)
                lineToRelative(0.41f, 0.13f)
                lineToRelative(137.3f, 58.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.54f, -3.59f)
                lineTo(422.0f, 80.0f)
                arcToRelative(7.07f, 7.07f, 0.0f, false, true, 10.0f, 10.0f)
                lineTo(226.66f, 310.26f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -3.59f, 15.54f)
                lineToRelative(58.65f, 137.38f)
                curveToRelative(0.06f, 0.2f, 0.12f, 0.38f, 0.19f, 0.57f)
                curveToRelative(3.2f, 9.27f, 11.3f, 15.81f, 21.09f, 16.25f)
                curveToRelative(0.43f, 0.0f, 0.58f, 0.0f, 1.0f, 0.0f)
                arcToRelative(24.63f, 24.63f, 0.0f, false, false, 23.0f, -15.46f)
                lineTo(478.39f, 64.62f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 473.0f, 39.05f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
