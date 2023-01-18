package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Cut: ImageVector
    get() {
        if (_cut != null) {
            return _cut!!
        }
        _cut = Builder(name = "Cut", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.48f, 224.0f)
                arcToRelative(71.64f, 71.64f, 0.0f, false, false, 44.76f, -15.66f)
                lineToRelative(41.5f, 16.89f)
                lineToRelative(6.82f, -12.63f)
                arcToRelative(39.15f, 39.15f, 0.0f, false, true, 4.32f, -6.37f)
                lineToRelative(14.22f, -14.42f)
                lineToRelative(-41.17f, -24.94f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 103.48f, 224.0f)
                close()
                moveTo(103.48f, 112.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 103.48f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 169.0f)
                lineToRelative(-5.52f, -12.58f)
                curveToRelative(-4.48f, -10.42f, -14.74f, -16.0f, -32.78f, -17.85f)
                curveToRelative(-10.12f, -1.0f, -26.95f, -1.24f, -49.69f, 3.81f)
                curveToRelative(-20.0f, 4.45f, -122.14f, 28.2f, -164.95f, 58.62f)
                curveTo(206.81f, 215.39f, 203.0f, 234.67f, 200.0f, 250.16f)
                curveToRelative(-2.78f, 14.14f, -5.0f, 25.31f, -18.0f, 35.0f)
                curveToRelative(-15.0f, 11.14f, -27.27f, 16.38f, -33.58f, 18.6f)
                arcToRelative(71.74f, 71.74f, 0.0f, true, false, 24.79f, 38.0f)
                close()
                moveTo(255.48f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 255.48f, 256.0f)
                close()
                moveTo(103.48f, 400.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 103.48f, 400.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(343.79f, 259.87f)
                lineToRelative(-83.74f, 48.18f)
                lineToRelative(27.63f, 13.08f)
                lineToRelative(3.62f, 1.74f)
                curveTo(310.0f, 331.92f, 359.74f, 356.0f, 410.53f, 359.0f)
                curveToRelative(3.89f, 0.23f, 7.47f, 0.34f, 10.78f, 0.34f)
                curveTo(442.0f, 359.31f, 453.0f, 354.0f, 459.75f, 350.0f)
                lineTo(480.0f, 336.0f)
                close()
            }
        }
        .build()
        return _cut!!
    }

private var _cut: ImageVector? = null
