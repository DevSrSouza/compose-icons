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

public val IonIcons.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.0f, 307.27f)
                curveToRelative(32.75f, -46.35f, 46.59f, -101.63f, 39.0f, -155.68f)
                arcTo(175.82f, 175.82f, 0.0f, false, false, 231.38f, 2.0f)
                curveToRelative(-96.0f, 13.49f, -163.14f, 102.58f, -149.65f, 198.58f)
                curveToRelative(7.57f, 53.89f, 36.12f, 103.16f, 80.37f, 138.74f)
                curveTo(186.68f, 359.0f, 214.41f, 372.82f, 240.72f, 379.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.0f, 9.22f)
                lineToRelative(-4.87f, 26.38f)
                arcToRelative(16.29f, 16.29f, 0.0f, false, false, 1.48f, 10.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.2f, 8.61f)
                arcToRelative(15.21f, 15.21f, 0.0f, false, false, 2.23f, -0.16f)
                lineToRelative(17.81f, -2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.09f, 1.14f)
                curveToRelative(16.72f, 36.31f, 45.46f, 63.85f, 82.15f, 78.36f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 21.0f, -9.65f)
                curveToRelative(2.83f, -8.18f, -1.64f, -17.07f, -9.68f, -20.28f)
                arcToRelative(118.57f, 118.57f, 0.0f, false, true, -59.3f, -51.88f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.45f, -3.0f)
                lineToRelative(7.4f, -1.0f)
                arcToRelative(16.54f, 16.54f, 0.0f, false, false, 10.08f, -5.23f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 2.39f, -17.8f)
                lineToRelative(-12.06f, -24.23f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 326.35f, 367.0f)
                curveTo(349.94f, 353.83f, 372.8f, 333.0f, 391.0f, 307.27f)
                close()
                moveTo(236.1f, 324.05f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -5.88f, -1.12f)
                curveToRelative(-41.26f, -16.32f, -76.3f, -52.7f, -91.45f, -94.94f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 30.12f, -10.8f)
                curveToRelative(14.5f, 40.44f, 47.27f, 65.77f, 73.1f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -5.89f, 30.88f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
