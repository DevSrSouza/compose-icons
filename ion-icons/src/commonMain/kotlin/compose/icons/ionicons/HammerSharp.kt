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

public val IonIcons.HammerSharp: ImageVector
    get() {
        if (_hammerSharp != null) {
            return _hammerSharp!!
        }
        _hammerSharp = Builder(name = "HammerSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(294.28f, 256.9f)
                lineToRelative(-54.42f, -54.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(12.45f, 401.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.27f, 17.2f)
                lineToRelative(66.05f, 66.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.22f, -0.23f)
                lineTo(294.26f, 273.89f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 294.28f, 256.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(499.33f, 199.33f)
                lineToRelative(-43.89f, -43.58f)
                arcToRelative(21.46f, 21.46f, 0.0f, false, false, -15.28f, -6.26f)
                arcToRelative(21.89f, 21.89f, 0.0f, false, false, -12.79f, 4.14f)
                curveToRelative(0.0f, -0.43f, 0.06f, -0.85f, 0.09f, -1.22f)
                curveToRelative(0.45f, -6.5f, 1.15f, -16.32f, -5.2f, -25.22f)
                arcToRelative(258.0f, 258.0f, 0.0f, false, false, -24.8f, -28.74f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.08f, -0.08f)
                curveToRelative(-13.32f, -13.12f, -42.31f, -37.83f, -86.72f, -55.94f)
                arcTo(139.55f, 139.55f, 0.0f, false, false, 257.56f, 32.0f)
                curveTo(226.0f, 32.0f, 202.0f, 46.24f, 192.81f, 54.68f)
                arcTo(53.4f, 53.4f, 0.0f, false, false, 176.0f, 86.17f)
                lineTo(192.0f, 96.0f)
                reflectiveCurveToRelative(8.06f, -2.0f, 13.86f, -3.39f)
                arcToRelative(62.73f, 62.73f, 0.0f, false, true, 18.45f, -1.15f)
                curveTo(237.5f, 92.55f, 253.1f, 99.1f, 260.0f, 104.55f)
                curveToRelative(11.7f, 9.41f, 17.33f, 22.09f, 18.26f, 41.09f)
                curveToRelative(0.2f, 4.23f, -9.52f, 21.35f, -24.16f, 39.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.61f, 10.62f)
                lineToRelative(45.37f, 45.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, 0.25f)
                curveToRelative(12.07f, -11.0f, 30.49f, -28.0f, 34.67f, -30.59f)
                curveToRelative(7.69f, -4.73f, 13.19f, -5.64f, 14.7f, -5.8f)
                arcToRelative(19.18f, 19.18f, 0.0f, false, true, 11.29f, 2.38f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, true, -0.31f, 0.95f)
                lineToRelative(-1.82f, 1.73f)
                lineToRelative(-0.3f, 0.28f)
                arcToRelative(21.52f, 21.52f, 0.0f, false, false, 0.05f, 30.54f)
                lineToRelative(43.95f, 43.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.28f, 0.0f)
                lineToRelative(74.68f, -74.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 499.33f, 199.33f)
                close()
            }
        }
        .build()
        return _hammerSharp!!
    }

private var _hammerSharp: ImageVector? = null
