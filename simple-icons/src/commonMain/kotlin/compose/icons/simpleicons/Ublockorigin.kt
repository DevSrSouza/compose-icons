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

public val SimpleIcons.Ublockorigin: ImageVector
    get() {
        if (_ublockorigin != null) {
            return _ublockorigin!!
        }
        _ublockorigin = Builder(name = "Ublockorigin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(7.502f, 3.0f, 6.002f, 3.0f, 1.5f, 3.0f)
                curveToRelative(0.0f, 15.002f, 0.0f, 15.002f, 10.5f, 21.0f)
                curveToRelative(10.5f, -5.998f, 10.5f, -5.998f, 10.5f, -21.0f)
                curveToRelative(-4.498f, 0.0f, -5.998f, 0.0f, -10.5f, -3.0f)
                close()
                moveTo(5.956f, 7.472f)
                horizontalLineToRelative(1.512f)
                verticalLineToRelative(4.536f)
                curveToRelative(0.0f, 1.322f, 0.19f, 1.508f, 1.512f, 1.508f)
                curveToRelative(1.323f, 0.0f, 1.512f, -0.19f, 1.512f, -1.512f)
                lineTo(10.492f, 7.472f)
                lineTo(12.0f, 7.472f)
                verticalLineToRelative(0.767f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 2.268f, -0.767f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, true, 3.776f, 3.78f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, true, -3.78f, 3.775f)
                arcToRelative(3.765f, 3.764f, 0.0f, false, true, -2.684f, -1.133f)
                curveToRelative(-0.464f, 0.77f, -1.315f, 1.133f, -2.6f, 1.133f)
                curveToRelative(-2.079f, 0.0f, -3.024f, -0.944f, -3.024f, -3.023f)
                close()
                moveTo(14.264f, 8.984f)
                arcTo(2.254f, 2.254f, 0.0f, false, false, 12.0f, 11.252f)
                arcToRelative(2.254f, 2.254f, 0.0f, false, false, 2.268f, 2.264f)
                arcToRelative(2.254f, 2.254f, 0.0f, false, false, 2.264f, -2.268f)
                arcToRelative(2.254f, 2.254f, 0.0f, false, false, -2.268f, -2.264f)
                close()
            }
        }
        .build()
        return _ublockorigin!!
    }

private var _ublockorigin: ImageVector? = null
