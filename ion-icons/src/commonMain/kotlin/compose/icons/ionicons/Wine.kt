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

public val IonIcons.Wine: ImageVector
    get() {
        if (_wine != null) {
            return _wine!!
        }
        _wine = Builder(name = "Wine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.56f, 94.92f)
                lineTo(414.56f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(113.44f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(97.44f, 94.92f)
                curveToRelative(-1.46f, 11.37f, -9.65f, 90.74f, 36.93f, 144.69f)
                curveToRelative(24.87f, 28.8f, 60.36f, 44.85f, 105.63f, 47.86f)
                lineTo(240.0f, 416.0f)
                lineTo(160.0f, 416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                lineTo(352.0f, 448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                lineTo(272.0f, 416.0f)
                lineTo(272.0f, 287.47f)
                curveToRelative(45.27f, -3.0f, 80.76f, -19.06f, 105.63f, -47.86f)
                curveTo(424.21f, 185.66f, 416.0f, 106.29f, 414.56f, 94.92f)
                close()
                moveTo(129.26f, 98.33f)
                arcToRelative(15.14f, 15.14f, 0.0f, false, false, 0.18f, -2.33f)
                lineTo(382.56f, 96.0f)
                arcToRelative(15.14f, 15.14f, 0.0f, false, false, 0.18f, 2.33f)
                arcToRelative(201.91f, 201.91f, 0.0f, false, true, 0.0f, 45.67f)
                lineTo(129.32f, 144.0f)
                arcTo(204.29f, 204.29f, 0.0f, false, true, 129.26f, 98.33f)
                close()
            }
        }
        .build()
        return _wine!!
    }

private var _wine: ImageVector? = null
