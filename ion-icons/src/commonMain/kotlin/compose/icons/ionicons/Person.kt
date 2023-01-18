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

public val IonIcons.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(332.64f, 64.58f)
                curveTo(313.18f, 43.57f, 286.0f, 32.0f, 256.0f, 32.0f)
                curveToRelative(-30.16f, 0.0f, -57.43f, 11.5f, -76.8f, 32.38f)
                curveToRelative(-19.58f, 21.11f, -29.12f, 49.8f, -26.88f, 80.78f)
                curveTo(156.76f, 206.28f, 203.27f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(99.16f, -49.71f, 103.67f, -110.82f)
                curveTo(361.94f, 114.48f, 352.34f, 85.85f, 332.64f, 64.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 480.0f)
                horizontalLineTo(80.0f)
                arcTo(31.0f, 31.0f, 0.0f, false, true, 55.8f, 468.87f)
                curveToRelative(-6.5f, -7.77f, -9.12f, -18.38f, -7.18f, -29.11f)
                curveTo(57.06f, 392.94f, 83.4f, 353.61f, 124.8f, 326.0f)
                curveToRelative(36.78f, -24.51f, 83.37f, -38.0f, 131.2f, -38.0f)
                reflectiveCurveToRelative(94.42f, 13.5f, 131.2f, 38.0f)
                curveToRelative(41.4f, 27.6f, 67.74f, 66.93f, 76.18f, 113.75f)
                curveToRelative(1.94f, 10.73f, -0.68f, 21.34f, -7.18f, 29.11f)
                arcTo(31.0f, 31.0f, 0.0f, false, true, 432.0f, 480.0f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
