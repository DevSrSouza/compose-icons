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

public val IonIcons.PersonCircleOutline: ImageVector
    get() {
        if (_personCircleOutline != null) {
            return _personCircleOutline!!
        }
        _personCircleOutline = Builder(name = "PersonCircleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(258.9f, 48.0f)
                curveTo(141.92f, 46.42f, 46.42f, 141.92f, 48.0f, 258.9f)
                curveTo(49.56f, 371.09f, 140.91f, 462.44f, 253.1f, 464.0f)
                curveToRelative(117.0f, 1.6f, 212.48f, -93.9f, 210.88f, -210.88f)
                curveTo(462.44f, 140.91f, 371.09f, 49.56f, 258.9f, 48.0f)
                close()
                moveTo(385.32f, 375.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.14f, -0.32f)
                arcToRelative(124.27f, 124.27f, 0.0f, false, false, -32.35f, -29.59f)
                curveTo(321.37f, 329.0f, 289.11f, 320.0f, 256.0f, 320.0f)
                reflectiveCurveToRelative(-65.37f, 9.0f, -90.83f, 25.34f)
                arcToRelative(124.24f, 124.24f, 0.0f, false, false, -32.35f, 29.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.14f, 0.32f)
                arcTo(175.32f, 175.32f, 0.0f, false, true, 80.0f, 259.0f)
                curveTo(78.37f, 161.69f, 158.22f, 80.24f, 255.57f, 80.0f)
                reflectiveCurveTo(432.0f, 158.81f, 432.0f, 256.0f)
                arcTo(175.32f, 175.32f, 0.0f, false, true, 385.32f, 375.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 144.0f)
                curveToRelative(-19.72f, 0.0f, -37.55f, 7.39f, -50.22f, 20.82f)
                reflectiveCurveToRelative(-19.0f, 32.0f, -17.57f, 51.93f)
                curveTo(191.11f, 256.0f, 221.52f, 288.0f, 256.0f, 288.0f)
                reflectiveCurveToRelative(64.83f, -32.0f, 67.79f, -71.24f)
                curveToRelative(1.48f, -19.74f, -4.8f, -38.14f, -17.68f, -51.82f)
                curveTo(293.39f, 151.44f, 275.59f, 144.0f, 256.0f, 144.0f)
                close()
            }
        }
        .build()
        return _personCircleOutline!!
    }

private var _personCircleOutline: ImageVector? = null
