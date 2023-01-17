package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Adguard: ImageVector
    get() {
        if (_adguard != null) {
            return _adguard!!
        }
        _adguard = Builder(name = "Adguard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.249f, 0.0f, 3.725f, 0.861f, 0.0f, 2.755f)
                curveTo(0.0f, 6.845f, -0.051f, 17.037f, 12.0f, 24.0f)
                curveTo(24.051f, 17.037f, 24.0f, 6.845f, 24.0f, 2.755f)
                curveTo(20.275f, 0.861f, 15.751f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.894f, 15.429f)
                lineTo(6.857f, 9.612f)
                curveToRelative(0.331f, -0.239f, 1.75f, -1.143f, 2.794f, 0.042f)
                lineToRelative(2.187f, 2.588f)
                curveToRelative(0.009f, -0.001f, 5.801f, -5.948f, 5.815f, -5.938f)
                curveToRelative(0.246f, -0.22f, 0.694f, -0.503f, 1.204f, -0.101f)
                lineToRelative(-6.963f, 9.226f)
                close()
            }
        }
        .build()
        return _adguard!!
    }

private var _adguard: ImageVector? = null
