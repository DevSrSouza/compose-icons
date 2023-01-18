package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.RocketOutline: ImageVector
    get() {
        if (_rocketOutline != null) {
            return _rocketOutline!!
        }
        _rocketOutline = Builder(name = "RocketOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(461.81f, 53.81f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -3.3f, -3.39f)
                curveToRelative(-54.38f, -13.3f, -180.0f, 34.09f, -248.13f, 102.17f)
                arcToRelative(294.9f, 294.9f, 0.0f, false, false, -33.09f, 39.08f)
                curveToRelative(-21.0f, -1.9f, -42.0f, -0.3f, -59.88f, 7.5f)
                curveToRelative(-50.49f, 22.2f, -65.18f, 80.18f, -69.28f, 105.07f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.8f, 10.4f)
                lineToRelative(81.07f, -8.9f)
                arcToRelative(180.29f, 180.29f, 0.0f, false, false, 1.1f, 18.3f)
                arcToRelative(18.15f, 18.15f, 0.0f, false, false, 5.3f, 11.09f)
                lineToRelative(31.39f, 31.39f)
                arcToRelative(18.15f, 18.15f, 0.0f, false, false, 11.1f, 5.3f)
                arcToRelative(179.91f, 179.91f, 0.0f, false, false, 18.19f, 1.1f)
                lineToRelative(-8.89f, 81.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 10.39f, 9.79f)
                curveToRelative(24.9f, -4.0f, 83.0f, -18.69f, 105.07f, -69.17f)
                curveToRelative(7.8f, -17.9f, 9.4f, -38.79f, 7.6f, -59.69f)
                arcToRelative(293.91f, 293.91f, 0.0f, false, false, 39.19f, -33.09f)
                curveTo(427.82f, 233.76f, 474.91f, 110.9f, 461.81f, 53.81f)
                close()
                moveTo(298.66f, 213.67f)
                arcToRelative(42.7f, 42.7f, 0.0f, true, true, 60.38f, 0.0f)
                arcTo(42.65f, 42.65f, 0.0f, false, true, 298.66f, 213.67f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(109.64f, 352.0f)
                arcToRelative(45.06f, 45.06f, 0.0f, false, false, -26.35f, 12.84f)
                curveTo(65.67f, 382.52f, 64.0f, 448.0f, 64.0f, 448.0f)
                reflectiveCurveToRelative(65.52f, -1.67f, 83.15f, -19.31f)
                arcTo(44.73f, 44.73f, 0.0f, false, false, 160.0f, 402.32f)
            }
        }
        .build()
        return _rocketOutline!!
    }

private var _rocketOutline: ImageVector? = null
