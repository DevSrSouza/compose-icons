package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) {
            return _personSimple!!
        }
        _personSimple = Builder(name = "PersonSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(127.9f, 78.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 127.9f, 78.0f)
                close()
                moveTo(127.9f, 30.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 127.9f, 30.0f)
                close()
                moveTo(229.1f, 131.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.2f, 2.0f)
                curveToRelative(-0.4f, -0.2f, -36.5f, -21.4f, -86.9f, -23.0f)
                verticalLineToRelative(39.6f)
                lineTo(196.5f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.5f, 8.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -4.0f, 1.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -4.5f, -2.0f)
                lineTo(128.0f, 161.0f)
                lineTo(68.5f, 228.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, -8.0f)
                lineTo(122.0f, 149.7f)
                lineTo(122.0f, 110.1f)
                curveToRelative(-50.4f, 1.6f, -86.5f, 22.8f, -86.9f, 23.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.2f, -10.2f)
                curveTo(30.6f, 121.8f, 71.0f, 98.0f, 128.0f, 98.0f)
                reflectiveCurveToRelative(97.4f, 23.8f, 99.1f, 24.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 229.1f, 131.1f)
                close()
            }
        }
        .build()
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
