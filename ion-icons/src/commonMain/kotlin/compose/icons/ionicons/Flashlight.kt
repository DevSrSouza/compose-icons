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

public val IonIcons.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(462.0f, 216.0f)
                curveToRelative(9.35f, -9.35f, 15.14f, -19.09f, 17.19f, -28.95f)
                curveToRelative(2.7f, -12.95f, -1.29f, -25.55f, -11.22f, -35.48f)
                lineTo(360.43f, 44.05f)
                curveTo(346.29f, 29.92f, 322.0f, 24.07f, 296.0f, 50.0f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineTo(448.64f, 218.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 460.0f, 218.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.14f, 153.08f)
                lineToRelative(-0.16f, 2.34f)
                curveToRelative(-0.53f, 7.18f, -6.88f, 19.15f, -13.88f, 26.14f)
                lineTo(47.27f, 370.36f)
                curveToRelative(-11.12f, 11.11f, -16.46f, 25.57f, -15.05f, 40.7f)
                curveTo(33.49f, 424.58f, 40.16f, 438.0f, 51.0f, 448.83f)
                lineTo(63.17f, 461.0f)
                curveToRelative(12.61f, 12.6f, 27.78f, 19.0f, 42.49f, 19.0f)
                arcToRelative(50.4f, 50.4f, 0.0f, false, false, 36.0f, -15.24f)
                lineToRelative(188.84f, -188.8f)
                curveToRelative(7.07f, -7.07f, 18.84f, -13.3f, 26.17f, -13.87f)
                curveToRelative(17.48f, -1.32f, 43.57f, -3.28f, 67.79f, -15.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -6.37f)
                lineTo(271.69f, 86.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.39f, 1.0f)
                curveTo(253.18f, 110.3f, 251.48f, 134.22f, 250.14f, 153.08f)
                close()
                moveTo(240.19f, 299.91f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -25.25f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 240.19f, 299.91f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
