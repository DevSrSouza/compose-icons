package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PrayingHands: ImageVector
    get() {
        if (_prayingHands != null) {
            return _prayingHands!!
        }
        _prayingHands = Builder(name = "PrayingHands", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 191.91f)
                curveToRelative(-17.6f, 0.0f, -32.0f, 14.4f, -32.0f, 32.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-76.55f)
                curveToRelative(0.0f, -17.39f, 4.72f, -34.47f, 13.69f, -49.39f)
                lineToRelative(77.75f, -129.59f)
                curveToRelative(9.09f, -15.16f, 4.19f, -34.81f, -10.97f, -43.91f)
                curveToRelative(-14.45f, -8.67f, -32.72f, -4.3f, -42.3f, 9.21f)
                curveToRelative(-0.2f, 0.23f, -0.62f, 0.21f, -0.79f, 0.48f)
                lineToRelative(-117.26f, 175.9f)
                curveTo(117.56f, 205.9f, 112.0f, 224.31f, 112.0f, 243.29f)
                verticalLineToRelative(80.23f)
                lineToRelative(-90.12f, 30.04f)
                arcTo(31.974f, 31.974f, 0.0f, false, false, 0.0f, 383.91f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 10.82f, 8.52f, 32.0f, 32.0f, 32.0f)
                curveToRelative(2.69f, 0.0f, 5.41f, -0.34f, 8.06f, -1.03f)
                lineToRelative(179.19f, -46.62f)
                curveTo(269.16f, 449.99f, 304.0f, 403.8f, 304.0f, 351.91f)
                verticalLineToRelative(-128.0f)
                curveToRelative(0.0f, -17.6f, -14.4f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(618.12f, 353.64f)
                lineTo(528.0f, 323.6f)
                verticalLineToRelative(-80.23f)
                curveToRelative(0.0f, -18.98f, -5.56f, -37.39f, -16.12f, -53.23f)
                lineTo(394.62f, 14.25f)
                curveToRelative(-0.18f, -0.27f, -0.59f, -0.24f, -0.79f, -0.48f)
                curveToRelative(-9.58f, -13.51f, -27.85f, -17.88f, -42.3f, -9.21f)
                curveToRelative(-15.16f, 9.09f, -20.06f, 28.75f, -10.97f, 43.91f)
                lineToRelative(77.75f, 129.59f)
                curveToRelative(8.97f, 14.92f, 13.69f, 32.0f, 13.69f, 49.39f)
                lineTo(432.0f, 304.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-80.0f)
                curveToRelative(0.0f, -17.6f, -14.4f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.4f, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 51.89f, 34.84f, 98.08f, 84.75f, 112.34f)
                lineToRelative(179.19f, 46.62f)
                curveToRelative(2.66f, 0.69f, 5.38f, 1.03f, 8.06f, 1.03f)
                curveToRelative(23.48f, 0.0f, 32.0f, -21.18f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -13.77f, -8.81f, -25.99f, -21.88f, -30.35f)
                close()
            }
        }
        .build()
        return _prayingHands!!
    }

private var _prayingHands: ImageVector? = null
