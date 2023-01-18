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

public val IonIcons.BatteryChargingSharp: ImageVector
    get() {
        if (_batteryChargingSharp != null) {
            return _batteryChargingSharp!!
        }
        _batteryChargingSharp = Builder(name = "BatteryChargingSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(306.68f, 237.62f)
                horizontalLineToRelative(-66.5f)
                lineToRelative(15.33f, -54.7f)
                lineTo(261.94f, 160.0f)
                lineTo(265.88f, 146.0f)
                lineToRelative(4.29f, -15.33f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, false, 0.06f, -0.44f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.12f, 0.0f, -0.19f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, false, 0.0f, -0.23f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -0.24f)
                lineToRelative(0.0f, -0.14f)
                curveToRelative(0.0f, -0.1f, -0.07f, -0.19f, -0.11f, -0.29f)
                lineToRelative(0.0f, -0.05f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, false, -2.0f, -1.35f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -1.8f, 1.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-12.5f, 17.15f)
                lineTo(234.9f, 171.44f)
                lineToRelative(-8.36f, 11.48f)
                lineToRelative(-35.41f, 48.6f)
                lineTo(160.0f, 274.26f)
                horizontalLineToRelative(66.44f)
                lineToRelative(-30.0f, 107.0f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, -0.06f, 0.48f)
                reflectiveCurveToRelative(0.0f, 0.06f, 0.0f, 0.1f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 0.0f, 0.34f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, false, 0.0f, 0.09f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.07f, 0.32f)
                lineToRelative(0.0f, 0.06f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, false, 0.14f, 0.32f)
                verticalLineToRelative(0.0f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, false, 1.52f, 1.16f)
                lineToRelative(0.11f, 0.0f)
                lineToRelative(0.33f, 0.0f)
                horizontalLineToRelative(0.13f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 1.31f, -0.5f)
                lineToRelative(0.06f, -0.05f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, 0.42f, -0.45f)
                horizontalLineToRelative(0.0f)
                lineTo(223.3f, 352.0f)
                lineToRelative(13.0f, -17.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.78f, 134.55f)
                lineToRelative(-0.14f, 0.74f)
                lineToRelative(-0.21f, 0.73f)
                lineToRelative(-6.72f, 24.0f)
                horizontalLineTo(417.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(248.05f)
                lineToRelative(-23.33f, 32.0f)
                horizontalLineTo(449.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(290.13f)
                arcTo(22.62f, 22.62f, 0.0f, false, true, 289.78f, 134.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(49.0f, 160.0f)
                horizontalLineTo(218.49f)
                lineToRelative(23.31f, -32.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(384.0f)
                horizontalLineTo(176.49f)
                arcToRelative(22.73f, 22.73f, 0.0f, false, true, 0.34f, -6.67f)
                lineToRelative(0.15f, -0.75f)
                lineToRelative(0.2f, -0.73f)
                lineTo(183.87f, 352.0f)
                horizontalLineTo(49.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(264.76f, 329.08f)
                lineToRelative(130.55f, 0.0f)
                lineToRelative(0.0f, -146.16f)
                lineToRelative(-119.03f, 0.0f)
                lineToRelative(-9.73f, 34.7f)
                lineToRelative(40.13f, 0.0f)
                lineToRelative(39.32f, 0.0f)
                lineToRelative(-23.16f, 31.78f)
                lineToRelative(-58.08f, 79.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 294.26f)
                lineToRelative(-39.31f, 0.0f)
                lineToRelative(23.15f, -31.78f)
                lineToRelative(57.95f, -79.56f)
                lineToRelative(-131.1f, 0.0f)
                lineToRelative(0.0f, 146.16f)
                lineToRelative(119.6f, 0.0f)
                lineToRelative(9.77f, -34.82f)
                lineToRelative(-40.06f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(465.0f, 202.67f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(106.67f)
                horizontalLineToRelative(-32.0f)
                close()
            }
        }
        .build()
        return _batteryChargingSharp!!
    }

private var _batteryChargingSharp: ImageVector? = null
