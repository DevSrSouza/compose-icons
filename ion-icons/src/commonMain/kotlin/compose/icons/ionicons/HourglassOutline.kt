package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.HourglassOutline: ImageVector
    get() {
        if (_hourglassOutline != null) {
            return _hourglassOutline!!
        }
        _hourglassOutline = Builder(name = "HourglassOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(145.61f, 464.0f)
                horizontalLineTo(366.39f)
                curveToRelative(19.8f, 0.0f, 35.55f, -16.29f, 33.42f, -35.06f)
                curveTo(386.06f, 308.0f, 304.0f, 310.0f, 304.0f, 256.0f)
                reflectiveCurveToRelative(83.11f, -51.0f, 95.8f, -172.94f)
                curveToRelative(2.0f, -18.78f, -13.61f, -35.06f, -33.41f, -35.06f)
                horizontalLineTo(145.61f)
                curveToRelative(-19.8f, 0.0f, -35.37f, 16.28f, -33.41f, 35.06f)
                curveTo(124.89f, 205.0f, 208.0f, 201.0f, 208.0f, 256.0f)
                reflectiveCurveToRelative(-82.06f, 52.0f, -95.8f, 172.94f)
                curveTo(110.06f, 447.71f, 125.81f, 464.0f, 145.61f, 464.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(343.3f, 432.0f)
                horizontalLineTo(169.13f)
                curveToRelative(-15.6f, 0.0f, -20.0f, -18.0f, -9.06f, -29.16f)
                curveTo(186.55f, 376.0f, 240.0f, 356.78f, 240.0f, 326.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -19.85f, -38.0f, -35.0f, -61.51f, -67.2f)
                curveToRelative(-3.88f, -5.31f, -3.49f, -12.8f, 6.37f, -12.8f)
                horizontalLineTo(327.59f)
                curveToRelative(8.41f, 0.0f, 10.23f, 7.43f, 6.4f, 12.75f)
                curveTo(310.82f, 189.0f, 272.0f, 204.05f, 272.0f, 224.0f)
                verticalLineTo(326.0f)
                curveToRelative(0.0f, 30.53f, 55.71f, 47.0f, 80.4f, 76.87f)
                curveTo(362.35f, 414.91f, 358.87f, 432.0f, 343.3f, 432.0f)
                close()
            }
        }
        .build()
        return _hourglassOutline!!
    }

private var _hourglassOutline: ImageVector? = null
