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

public val IonIcons.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(396.0f, 432.0f)
                horizontalLineTo(136.0f)
                curveToRelative(-36.44f, 0.0f, -70.36f, -12.57f, -95.51f, -35.41f)
                curveTo(14.38f, 372.88f, 0.0f, 340.0f, 0.0f, 304.0f)
                curveToRelative(0.0f, -36.58f, 13.39f, -68.12f, 38.72f, -91.22f)
                curveToRelative(18.11f, -16.53f, 42.22f, -28.25f, 69.18f, -33.87f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.37f, -9.15f)
                arcToRelative(156.24f, 156.24f, 0.0f, false, true, 42.05f, -56.0f)
                curveTo(187.76f, 91.69f, 220.5f, 80.0f, 256.0f, 80.0f)
                arcToRelative(153.57f, 153.57f, 0.0f, false, true, 107.14f, 42.9f)
                curveToRelative(24.73f, 23.81f, 41.5f, 55.28f, 49.18f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.12f, 12.39f)
                curveTo(470.0f, 237.42f, 512.0f, 270.43f, 512.0f, 328.0f)
                curveToRelative(0.0f, 33.39f, -12.24f, 60.78f, -35.41f, 79.23f)
                curveTo(456.23f, 423.43f, 428.37f, 432.0f, 396.0f, 432.0f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
