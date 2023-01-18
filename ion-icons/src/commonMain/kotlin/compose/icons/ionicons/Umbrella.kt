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

public val IonIcons.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.39f, 113.61f)
                arcTo(222.26f, 222.26f, 0.0f, false, false, 278.06f, 49.07f)
                arcToRelative(8.09f, 8.09f, 0.0f, false, true, -6.88f, -5.62f)
                arcToRelative(15.79f, 15.79f, 0.0f, false, false, -30.36f, 0.0f)
                arcToRelative(8.09f, 8.09f, 0.0f, false, true, -6.88f, 5.62f)
                arcTo(224.0f, 224.0f, 0.0f, false, false, 32.0f, 271.52f)
                arcToRelative(16.41f, 16.41f, 0.0f, false, false, 7.24f, 13.87f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.07f, -2.08f)
                arcToRelative(51.89f, 51.89f, 0.0f, false, true, 73.31f, -0.06f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 22.6f, 0.15f)
                arcToRelative(62.59f, 62.59f, 0.0f, false, true, 81.49f, -5.87f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, true, 3.29f, 6.59f)
                verticalLineTo(431.54f)
                curveToRelative(0.0f, 8.6f, -6.6f, 16.0f, -15.19f, 16.44f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.29f, -16.0f)
                curveToRelative(-9.0f, 0.16f, -15.9f, 8.11f, -15.7f, 17.1f)
                arcTo(48.06f, 48.06f, 0.0f, false, false, 223.38f, 480.0f)
                curveToRelative(26.88f, 0.34f, 48.62f, -21.93f, 48.62f, -48.81f)
                verticalLineTo(284.12f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, true, 3.29f, -6.59f)
                horizontalLineToRelative(0.0f)
                arcToRelative(62.59f, 62.59f, 0.0f, false, true, 81.4f, 5.78f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f)
                arcToRelative(51.91f, 51.91f, 0.0f, false, true, 73.38f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.54f, 2.41f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 480.0f, 271.51f)
                arcTo(222.54f, 222.54f, 0.0f, false, false, 414.39f, 113.61f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
