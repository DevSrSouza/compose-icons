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

public val IonIcons.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.15f, 360.11f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, -4.92f, -0.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -10.92f, -13.0f)
                curveToRelative(-2.15f, -15.0f, -19.95f, -32.46f, -36.62f, -35.85f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 284.16f)
                lineTo(383.09f, 49.06f)
                curveToRelative(0.19f, -0.22f, 0.39f, -0.43f, 0.59f, -0.63f)
                arcToRelative(56.57f, 56.57f, 0.0f, false, true, 79.89f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(56.51f, 56.51f, 0.0f, false, true, 0.11f, 79.78f)
                lineToRelative(-219.0f, 227.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 233.15f, 360.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.89f, 480.11f)
                curveToRelative(-32.14f, 0.0f, -65.45f, -16.89f, -84.85f, -43.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.85f, -25.54f)
                curveToRelative(5.34f, 0.0f, 20.0f, -4.87f, 20.0f, -20.57f)
                curveToRelative(0.0f, -39.07f, 31.4f, -70.86f, 70.0f, -70.86f)
                reflectiveCurveToRelative(70.0f, 31.79f, 70.0f, 70.86f)
                curveTo(207.89f, 440.12f, 168.41f, 480.11f, 119.89f, 480.11f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
