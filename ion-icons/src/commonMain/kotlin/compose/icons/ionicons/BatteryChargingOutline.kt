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

public val IonIcons.BatteryChargingOutline: ImageVector
    get() {
        if (_batteryChargingOutline != null) {
            return _batteryChargingOutline!!
        }
        _batteryChargingOutline = Builder(name = "BatteryChargingOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 322.3f)
                verticalLineTo(189.7f)
                arcTo(29.74f, 29.74f, 0.0f, false, true, 77.7f, 160.0f)
                horizontalLineTo(215.14f)
                lineToRelative(24.4f, -32.0f)
                horizontalLineTo(77.7f)
                arcTo(61.77f, 61.77f, 0.0f, false, false, 16.0f, 189.7f)
                verticalLineTo(322.3f)
                arcTo(61.77f, 61.77f, 0.0f, false, false, 77.7f, 384.0f)
                horizontalLineToRelative(96.85f)
                arcToRelative(22.57f, 22.57f, 0.0f, false, true, 0.26f, -7.32f)
                lineToRelative(0.15f, -0.75f)
                lineToRelative(0.21f, -0.73f)
                lineToRelative(6.5f, -23.2f)
                horizontalLineTo(77.7f)
                arcTo(29.74f, 29.74f, 0.0f, false, true, 48.0f, 322.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.3f, 128.0f)
                horizontalLineTo(287.66f)
                arcToRelative(22.69f, 22.69f, 0.0f, false, true, -0.27f, 7.2f)
                lineToRelative(-0.15f, 0.74f)
                lineToRelative(-0.21f, 0.73f)
                lineTo(280.49f, 160.0f)
                horizontalLineTo(386.3f)
                arcTo(29.74f, 29.74f, 0.0f, false, true, 416.0f, 189.7f)
                verticalLineTo(322.3f)
                arcTo(29.74f, 29.74f, 0.0f, false, true, 386.3f, 352.0f)
                horizontalLineTo(247.0f)
                lineToRelative(-24.42f, 32.0f)
                horizontalLineTo(386.3f)
                arcTo(61.77f, 61.77f, 0.0f, false, false, 448.0f, 322.3f)
                verticalLineTo(189.7f)
                arcTo(61.77f, 61.77f, 0.0f, false, false, 386.3f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.65f, 294.16f)
                arcToRelative(24.37f, 24.37f, 0.0f, false, true, -21.56f, -13.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, 1.42f, -25.83f)
                lineToRelative(0.31f, -0.46f)
                lineToRelative(0.33f, -0.44f)
                lineTo(197.62f, 183.0f)
                horizontalLineTo(89.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineTo(309.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(98.42f)
                lineToRelative(9.78f, -34.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(276.07f, 280.89f)
                lineToRelative(27.07f, -35.49f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, 0.77f, -1.91f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.08f, -0.66f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.08f, -1.29f)
                arcToRelative(5.11f, 5.11f, 0.0f, false, false, -0.68f, -1.75f)
                arcToRelative(4.76f, 4.76f, 0.0f, false, false, -0.78f, -0.95f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -0.48f, -0.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.11f, -0.55f)
                arcToRelative(4.28f, 4.28f, 0.0f, false, false, -1.31f, -0.2f)
                horizontalLineTo(237.93f)
                lineToRelative(12.12f, -43.21f)
                lineTo(253.28f, 183.0f)
                lineToRelative(6.21f, -22.16f)
                lineTo(260.0f, 159.0f)
                lineToRelative(7.79f, -27.76f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 0.05f, -0.55f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, 0.0f, -0.16f)
                reflectiveCurveToRelative(0.0f, -0.26f, -0.05f, -0.38f)
                reflectiveCurveToRelative(0.0f, -0.09f, 0.0f, -0.14f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.17f, -0.45f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, false, -0.26f, -0.39f)
                lineToRelative(-0.09f, -0.1f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, -0.25f, -0.23f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(3.14f, 3.14f, 0.0f, false, false, -0.39f, -0.24f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.41f, -0.14f)
                lineToRelative(-0.13f, 0.0f)
                lineToRelative(-0.33f, 0.0f)
                horizontalLineToRelative(-0.13f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.45f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.42f, 0.15f)
                lineToRelative(-0.13f, 0.07f)
                lineToRelative(-0.3f, 0.21f)
                lineToRelative(-0.11f, 0.1f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.36f, 0.41f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-18.0f, 23.63f)
                lineToRelative(-13.14f, 17.22f)
                lineTo(222.77f, 183.0f)
                lineToRelative(-63.71f, 83.55f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, false, -0.44f, 0.8f)
                arcToRelative(4.78f, 4.78f, 0.0f, false, false, -0.35f, 1.09f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -0.08f, 1.29f)
                arcToRelative(4.86f, 4.86f, 0.0f, false, false, 2.0f, 3.71f)
                arcToRelative(4.74f, 4.74f, 0.0f, false, false, 0.54f, 0.31f)
                arcToRelative(4.31f, 4.31f, 0.0f, false, false, 1.89f, 0.43f)
                horizontalLineToRelative(61.62f)
                lineTo(194.42f, 380.6f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, false, 0.0f, 0.56f)
                reflectiveCurveToRelative(0.0f, 0.1f, 0.0f, 0.15f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, false, 0.06f, 0.38f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.0f, 0.14f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 0.17f, 0.45f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.62f, 3.62f, 0.0f, false, false, 0.26f, 0.38f)
                lineToRelative(0.09f, 0.1f)
                lineToRelative(0.25f, 0.24f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, 0.1f, 0.08f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, false, 0.39f, 0.23f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.83f, 2.83f, 0.0f, false, false, 0.41f, 0.14f)
                lineToRelative(0.13f, 0.0f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, false, 0.33f, 0.0f)
                horizontalLineToRelative(0.13f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, false, 0.45f, -0.06f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, false, 0.41f, -0.16f)
                lineToRelative(0.13f, -0.07f)
                lineToRelative(0.3f, -0.21f)
                lineToRelative(0.11f, -0.09f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 0.36f, -0.41f)
                horizontalLineToRelative(0.0f)
                lineTo(221.82f, 352.0f)
                lineToRelative(17.53f, -23.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(319.5f, 256.93f)
                lineToRelative(-0.46f, 0.6f)
                lineTo(264.51f, 329.0f)
                horizontalLineToRelative(109.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(203.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(274.05f)
                lineToRelative(-9.74f, 34.73f)
                horizontalLineToRelative(35.24f)
                arcTo(24.35f, 24.35f, 0.0f, false, true, 321.0f, 230.5f)
                arcToRelative(25.21f, 25.21f, 0.0f, false, true, -1.0f, 25.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 202.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(74.66f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineTo(218.67f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 480.0f, 202.67f)
                close()
            }
        }
        .build()
        return _batteryChargingOutline!!
    }

private var _batteryChargingOutline: ImageVector? = null
