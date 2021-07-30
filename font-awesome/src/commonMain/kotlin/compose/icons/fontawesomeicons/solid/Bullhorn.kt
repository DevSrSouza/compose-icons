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

public val SolidGroup.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.0f, 240.0f)
                curveToRelative(0.0f, -23.63f, -12.95f, -44.04f, -32.0f, -55.12f)
                lineTo(544.0f, 32.01f)
                curveTo(544.0f, 23.26f, 537.02f, 0.0f, 512.0f, 0.0f)
                curveToRelative(-7.12f, 0.0f, -14.19f, 2.38f, -19.98f, 7.02f)
                lineToRelative(-85.03f, 68.03f)
                curveTo(364.28f, 109.19f, 310.66f, 128.0f, 256.0f, 128.0f)
                lineTo(64.0f, 128.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(33.7f)
                curveToRelative(-1.39f, 10.48f, -2.18f, 21.14f, -2.18f, 32.0f)
                curveToRelative(0.0f, 39.77f, 9.26f, 77.35f, 25.56f, 110.94f)
                curveToRelative(5.19f, 10.69f, 16.52f, 17.06f, 28.4f, 17.06f)
                horizontalLineToRelative(74.28f)
                curveToRelative(26.05f, 0.0f, 41.69f, -29.84f, 25.9f, -50.56f)
                curveToRelative(-16.4f, -21.52f, -26.15f, -48.36f, -26.15f, -77.44f)
                curveToRelative(0.0f, -11.11f, 1.62f, -21.79f, 4.41f, -32.0f)
                lineTo(256.0f, 352.0f)
                curveToRelative(54.66f, 0.0f, 108.28f, 18.81f, 150.98f, 52.95f)
                lineToRelative(85.03f, 68.03f)
                arcToRelative(32.023f, 32.023f, 0.0f, false, false, 19.98f, 7.02f)
                curveToRelative(24.92f, 0.0f, 32.0f, -22.78f, 32.0f, -32.0f)
                lineTo(543.99f, 295.13f)
                curveTo(563.05f, 284.04f, 576.0f, 263.63f, 576.0f, 240.0f)
                close()
                moveTo(480.0f, 381.42f)
                lineToRelative(-33.05f, -26.44f)
                curveTo(392.95f, 311.78f, 325.12f, 288.0f, 256.0f, 288.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(69.12f, 0.0f, 136.95f, -23.78f, 190.95f, -66.98f)
                lineTo(480.0f, 98.58f)
                verticalLineToRelative(282.84f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null
