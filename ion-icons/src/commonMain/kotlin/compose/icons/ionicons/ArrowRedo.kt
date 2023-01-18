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

public val IonIcons.ArrowRedo: ImageVector
    get() {
        if (_arrowRedo != null) {
            return _arrowRedo!!
        }
        _arrowRedo = Builder(name = "ArrowRedo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.79f, 439.13f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 424.0f)
                curveToRelative(0.0f, -73.1f, 14.68f, -131.56f, 43.65f, -173.77f)
                curveToRelative(35.0f, -51.0f, 90.21f, -78.46f, 164.35f, -81.87f)
                verticalLineTo(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.05f, -11.57f)
                lineToRelative(176.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 23.14f)
                lineToRelative(-176.0f, 168.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 424.0f)
                verticalLineTo(344.23f)
                curveToRelative(-45.0f, 1.36f, -79.0f, 8.65f, -106.07f, 22.64f)
                curveToRelative(-29.25f, 15.12f, -50.46f, 37.71f, -73.32f, 67.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -17.82f, 5.28f)
                close()
            }
        }
        .build()
        return _arrowRedo!!
    }

private var _arrowRedo: ImageVector? = null
