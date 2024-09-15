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

public val SolidGroup.Lungs: ImageVector
    get() {
        if (_lungs != null) {
            return _lungs!!
        }
        _lungs = Builder(name = "Lungs", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(636.11f, 390.15f)
                curveTo(614.44f, 308.85f, 580.07f, 231.0f, 534.1f, 159.13f)
                curveTo(511.98f, 124.56f, 498.03f, 96.0f, 454.05f, 96.0f)
                curveTo(415.36f, 96.0f, 384.0f, 125.42f, 384.0f, 161.71f)
                verticalLineToRelative(60.11f)
                lineToRelative(-32.88f, -21.92f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -7.12f, -13.31f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(170.59f)
                curveToRelative(0.0f, 5.35f, -2.67f, 10.34f, -7.12f, 13.31f)
                lineTo(256.0f, 221.82f)
                verticalLineToRelative(-60.11f)
                curveTo(256.0f, 125.42f, 224.64f, 96.0f, 185.95f, 96.0f)
                curveToRelative(-43.98f, 0.0f, -57.93f, 28.56f, -80.05f, 63.13f)
                curveTo(59.93f, 231.0f, 25.56f, 308.85f, 3.89f, 390.15f)
                curveTo(1.3f, 399.84f, 0.0f, 409.79f, 0.0f, 419.78f)
                curveToRelative(0.0f, 61.23f, 62.48f, 105.44f, 125.24f, 88.62f)
                lineToRelative(59.5f, -15.95f)
                curveToRelative(42.18f, -11.3f, 71.26f, -47.47f, 71.26f, -88.62f)
                verticalLineToRelative(-87.49f)
                lineToRelative(-85.84f, 57.23f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, -11.09f, -2.22f)
                lineToRelative(-8.88f, -13.31f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, 2.22f, -11.09f)
                lineTo(320.0f, 235.23f)
                lineToRelative(167.59f, 111.72f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, 2.22f, 11.09f)
                lineToRelative(-8.88f, 13.31f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, -11.09f, 2.22f)
                lineTo(384.0f, 316.34f)
                verticalLineToRelative(87.49f)
                curveToRelative(0.0f, 41.15f, 29.08f, 77.31f, 71.26f, 88.62f)
                lineToRelative(59.5f, 15.95f)
                curveTo(577.52f, 525.22f, 640.0f, 481.01f, 640.0f, 419.78f)
                curveToRelative(0.0f, -9.99f, -1.3f, -19.94f, -3.89f, -29.63f)
                close()
            }
        }
        .build()
        return _lungs!!
    }

private var _lungs: ImageVector? = null
