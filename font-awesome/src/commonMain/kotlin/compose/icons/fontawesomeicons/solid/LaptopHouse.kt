package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LaptopHouse: ImageVector
    get() {
        if (_laptopHouse != null) {
            return _laptopHouse!!
        }
        _laptopHouse = Builder(name = "LaptopHouse", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 288.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(37.12f)
                curveTo(299.11f, 232.24f, 315.0f, 224.0f, 332.8f, 224.0f)
                horizontalLineTo(469.74f)
                lineToRelative(6.65f, -7.53f)
                arcTo(16.51f, 16.51f, 0.0f, false, false, 480.0f, 207.0f)
                arcToRelative(16.31f, 16.31f, 0.0f, false, false, -4.75f, -10.61f)
                lineTo(416.0f, 144.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(87.3f)
                lineTo(263.5f, 8.92f)
                curveTo(258.0f, 4.0f, 247.45f, 0.0f, 240.05f, 0.0f)
                reflectiveCurveToRelative(-17.93f, 4.0f, -23.47f, 8.92f)
                lineTo(4.78f, 196.42f)
                arcTo(16.15f, 16.15f, 0.0f, false, false, 0.0f, 207.0f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 3.55f, 9.39f)
                lineTo(22.34f, 237.7f)
                arcTo(16.22f, 16.22f, 0.0f, false, false, 33.0f, 242.48f)
                arcTo(16.51f, 16.51f, 0.0f, false, false, 42.34f, 239.0f)
                lineTo(64.0f, 219.88f)
                verticalLineTo(384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(272.0f)
                close()
                moveTo(629.33f, 448.0f)
                horizontalLineTo(592.0f)
                verticalLineTo(288.0f)
                curveToRelative(0.0f, -17.67f, -12.89f, -32.0f, -28.8f, -32.0f)
                horizontalLineTo(332.8f)
                curveToRelative(-15.91f, 0.0f, -28.8f, 14.33f, -28.8f, 32.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(266.67f)
                arcTo(10.67f, 10.67f, 0.0f, false, false, 256.0f, 458.67f)
                verticalLineToRelative(10.66f)
                arcTo(42.82f, 42.82f, 0.0f, false, false, 298.6f, 512.0f)
                horizontalLineTo(597.4f)
                arcTo(42.82f, 42.82f, 0.0f, false, false, 640.0f, 469.33f)
                verticalLineTo(458.67f)
                arcTo(10.67f, 10.67f, 0.0f, false, false, 629.33f, 448.0f)
                close()
                moveTo(544.0f, 448.0f)
                horizontalLineTo(352.0f)
                verticalLineTo(304.0f)
                horizontalLineTo(544.0f)
                close()
            }
        }
        .build()
        return _laptopHouse!!
    }

private var _laptopHouse: ImageVector? = null
