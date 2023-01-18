package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) {
            return _personSimple!!
        }
        _personSimple = Builder(name = "PersonSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(127.9f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 127.9f, 76.0f)
                close()
                moveTo(127.9f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 127.9f, 28.0f)
                close()
                moveTo(227.4f, 130.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 224.0f, 132.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.1f, -0.6f)
                curveToRelative(-0.3f, -0.2f, -37.8f, -22.3f, -89.9f, -23.4f)
                verticalLineToRelative(42.5f)
                lineToRelative(63.0f, 70.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.3f, 5.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.7f, 1.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -3.0f, -1.3f)
                lineTo(128.0f, 158.0f)
                lineTo(67.0f, 226.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.0f, -5.4f)
                lineToRelative(63.0f, -70.8f)
                lineTo(124.0f, 108.0f)
                curveToRelative(-52.1f, 1.1f, -89.6f, 23.2f, -89.9f, 23.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.5f, -1.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.3f, -5.5f)
                curveToRelative(1.7f, -1.0f, 41.6f, -24.6f, 98.1f, -24.6f)
                reflectiveCurveToRelative(96.4f, 23.6f, 98.1f, 24.6f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 227.4f, 130.1f)
                close()
            }
        }
        .build()
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
