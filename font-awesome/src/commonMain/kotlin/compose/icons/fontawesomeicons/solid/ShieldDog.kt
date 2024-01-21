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

public val SolidGroup.ShieldDog: ImageVector
    get() {
        if (_shieldDog != null) {
            return _shieldDog!!
        }
        _shieldDog = Builder(name = "ShieldDog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(269.4f, 2.9f)
                curveTo(265.2f, 1.0f, 260.7f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-9.2f, 1.0f, -13.4f, 2.9f)
                lineTo(54.3f, 82.8f)
                curveToRelative(-22.0f, 9.3f, -38.4f, 31.0f, -38.3f, 57.2f)
                curveToRelative(0.5f, 99.2f, 41.3f, 280.7f, 213.6f, 363.2f)
                curveToRelative(16.7f, 8.0f, 36.1f, 8.0f, 52.8f, 0.0f)
                curveTo(454.7f, 420.7f, 495.5f, 239.2f, 496.0f, 140.0f)
                curveToRelative(0.1f, -26.2f, -16.3f, -47.9f, -38.3f, -57.2f)
                lineTo(269.4f, 2.9f)
                close()
                moveTo(160.9f, 286.2f)
                curveToRelative(4.8f, 1.2f, 9.9f, 1.8f, 15.1f, 1.8f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(240.0f, 160.0f)
                horizontalLineToRelative(44.2f)
                curveToRelative(12.1f, 0.0f, 23.2f, 6.8f, 28.6f, 17.7f)
                lineTo(320.0f, 192.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                lineTo(272.0f, 320.0f)
                verticalLineToRelative(50.7f)
                curveToRelative(0.0f, 7.3f, -5.9f, 13.3f, -13.3f, 13.3f)
                curveToRelative(-1.8f, 0.0f, -3.6f, -0.4f, -5.2f, -1.1f)
                lineToRelative(-98.7f, -42.3f)
                curveToRelative(-6.6f, -2.8f, -10.8f, -9.3f, -10.8f, -16.4f)
                curveToRelative(0.0f, -2.8f, 0.6f, -5.5f, 1.9f, -8.0f)
                lineToRelative(15.0f, -30.0f)
                close()
                moveTo(160.0f, 160.0f)
                horizontalLineToRelative(40.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(144.0f, 176.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(288.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shieldDog!!
    }

private var _shieldDog: ImageVector? = null
