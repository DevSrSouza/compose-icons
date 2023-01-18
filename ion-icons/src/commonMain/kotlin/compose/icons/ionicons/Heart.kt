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

public val IonIcons.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -18.0f, -5.57f)
                curveToRelative(-78.59f, -53.35f, -112.62f, -89.93f, -131.39f, -112.8f)
                curveToRelative(-40.0f, -48.75f, -59.15f, -98.8f, -58.61f, -153.0f)
                curveTo(48.63f, 114.52f, 98.46f, 64.0f, 159.08f, 64.0f)
                curveToRelative(44.08f, 0.0f, 74.61f, 24.83f, 92.39f, 45.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.06f, 0.0f)
                curveTo(278.31f, 88.81f, 308.84f, 64.0f, 352.92f, 64.0f)
                curveTo(413.54f, 64.0f, 463.37f, 114.52f, 464.0f, 176.64f)
                curveToRelative(0.54f, 54.21f, -18.63f, 104.26f, -58.61f, 153.0f)
                curveToRelative(-18.77f, 22.87f, -52.8f, 59.45f, -131.39f, 112.8f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 256.0f, 448.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
