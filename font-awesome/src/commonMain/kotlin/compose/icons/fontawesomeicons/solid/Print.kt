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

public val SolidGroup.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 192.0f)
                lineTo(448.0f, 77.25f)
                curveToRelative(0.0f, -8.49f, -3.37f, -16.62f, -9.37f, -22.63f)
                lineTo(393.37f, 9.37f)
                curveToRelative(-6.0f, -6.0f, -14.14f, -9.37f, -22.63f, -9.37f)
                lineTo(96.0f, 0.0f)
                curveTo(78.33f, 0.0f, 64.0f, 14.33f, 64.0f, 32.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(512.0f, 256.0f)
                curveToRelative(0.0f, -35.35f, -28.65f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(384.0f, 448.0f)
                lineTo(128.0f, 448.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(256.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(384.0f, 224.0f)
                lineTo(128.0f, 224.0f)
                lineTo(128.0f, 64.0f)
                horizontalLineToRelative(192.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(432.0f, 296.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -10.75f, -24.0f, -24.0f)
                curveToRelative(0.0f, -13.26f, 10.75f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null
