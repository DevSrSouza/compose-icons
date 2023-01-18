package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ConstructOutline: ImageVector
    get() {
        if (_constructOutline != null) {
            return _constructOutline!!
        }
        _constructOutline = Builder(name = "ConstructOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(436.67f, 184.11f)
                arcToRelative(27.17f, 27.17f, 0.0f, false, true, -38.3f, 0.0f)
                lineToRelative(-22.48f, -22.49f)
                arcToRelative(27.15f, 27.15f, 0.0f, false, true, 0.0f, -38.29f)
                lineToRelative(50.89f, -50.89f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, -0.26f, -1.38f)
                curveTo(393.68f, 57.0f, 351.09f, 64.15f, 324.05f, 91.0f)
                curveToRelative(-25.88f, 25.69f, -27.35f, 64.27f, -17.87f, 98.0f)
                arcToRelative(27.0f, 27.0f, 0.0f, false, true, -7.67f, 27.14f)
                lineToRelative(-173.0f, 160.76f)
                arcToRelative(40.76f, 40.76f, 0.0f, true, false, 57.57f, 57.54f)
                lineToRelative(162.15f, -173.3f)
                arcTo(27.0f, 27.0f, 0.0f, false, true, 372.0f, 253.44f)
                curveToRelative(33.46f, 8.94f, 71.49f, 7.26f, 97.07f, -17.94f)
                curveToRelative(27.49f, -27.08f, 33.42f, -74.94f, 20.1f, -102.33f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, -1.36f, -0.22f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 284.0f)
                curveToRelative(-17.48f, -17.0f, -25.49f, -24.91f, -31.0f, -30.29f)
                arcToRelative(18.24f, 18.24f, 0.0f, false, true, -3.33f, -21.35f)
                arcToRelative(20.76f, 20.76f, 0.0f, false, true, 3.5f, -4.62f)
                lineToRelative(15.68f, -15.29f)
                arcToRelative(18.66f, 18.66f, 0.0f, false, true, 5.63f, -3.87f)
                arcToRelative(18.11f, 18.11f, 0.0f, false, true, 20.0f, 3.62f)
                curveToRelative(5.45f, 5.29f, 15.43f, 15.0f, 33.41f, 32.52f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(317.07f, 291.3f)
                curveToRelative(40.95f, 38.1f, 90.62f, 83.27f, 110.0f, 99.41f)
                arcToRelative(13.46f, 13.46f, 0.0f, false, true, 0.94f, 19.92f)
                lineTo(394.63f, 444.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -20.29f, -0.76f)
                curveToRelative(-16.53f, -19.18f, -61.09f, -67.11f, -99.27f, -107.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.34f, 193.5f)
                lineToRelative(29.41f, -28.74f)
                arcToRelative(4.71f, 4.71f, 0.0f, false, true, 3.41f, -1.35f)
                arcToRelative(4.85f, 4.85f, 0.0f, false, true, 3.41f, 1.35f)
                horizontalLineToRelative(0.0f)
                arcToRelative(9.86f, 9.86f, 0.0f, false, false, 8.19f, 2.77f)
                curveToRelative(3.83f, -0.42f, 7.92f, -1.6f, 10.57f, -4.12f)
                curveToRelative(6.0f, -5.8f, -0.94f, -17.23f, 4.34f, -24.54f)
                arcToRelative(207.0f, 207.0f, 0.0f, false, true, 19.78f, -22.6f)
                curveToRelative(6.0f, -5.88f, 29.84f, -28.32f, 69.9f, -44.45f)
                arcTo(107.31f, 107.31f, 0.0f, false, true, 206.67f, 64.0f)
                curveToRelative(22.59f, 0.0f, 40.0f, 10.0f, 46.26f, 15.67f)
                arcToRelative(89.54f, 89.54f, 0.0f, false, true, 10.28f, 11.64f)
                arcTo(78.92f, 78.92f, 0.0f, false, false, 254.0f, 88.54f)
                arcTo(68.82f, 68.82f, 0.0f, false, false, 234.0f, 87.28f)
                curveToRelative(-13.33f, 1.09f, -29.41f, 7.26f, -38.0f, 14.0f)
                curveToRelative(-13.9f, 11.0f, -19.87f, 25.72f, -20.81f, 44.71f)
                curveToRelative(-0.68f, 14.12f, 2.72f, 22.1f, 36.1f, 55.49f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, true, -0.34f, 9.16f)
                lineToRelative(-18.22f, 18.0f)
                arcToRelative(6.88f, 6.88f, 0.0f, false, true, -9.54f, 0.09f)
                curveToRelative(-21.94f, -21.94f, -36.65f, -33.09f, -45.0f, -38.16f)
                reflectiveCurveToRelative(-15.07f, -6.5f, -18.3f, -6.85f)
                arcToRelative(30.85f, 30.85f, 0.0f, false, false, -18.27f, 3.87f)
                arcToRelative(11.39f, 11.39f, 0.0f, false, false, -2.64f, 2.0f)
                arcToRelative(14.14f, 14.14f, 0.0f, false, false, 0.42f, 20.08f)
                lineToRelative(1.71f, 1.6f)
                arcToRelative(4.63f, 4.63f, 0.0f, false, true, 0.0f, 6.64f)
                lineTo(71.73f, 246.6f)
                arcTo(4.71f, 4.71f, 0.0f, false, true, 68.32f, 248.0f)
                arcToRelative(4.86f, 4.86f, 0.0f, false, true, -3.41f, -1.35f)
                lineTo(17.34f, 200.22f)
                arcTo(4.88f, 4.88f, 0.0f, false, true, 17.34f, 193.5f)
                close()
            }
        }
        .build()
        return _constructOutline!!
    }

private var _constructOutline: ImageVector? = null
