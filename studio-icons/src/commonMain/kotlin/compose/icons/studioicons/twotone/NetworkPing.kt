package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.NetworkPing: ImageVector
    get() {
        if (_networkPing != null) {
            return _networkPing!!
        }
        _networkPing = Builder(name = "NetworkPing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.67f)
                lineTo(3.41f, 6.09f)
                lineTo(2.0f, 7.5f)
                lineToRelative(8.5f, 8.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(5.15f, -5.15f)
                curveTo(18.91f, 10.95f, 19.2f, 11.0f, 19.5f, 11.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(20.88f, 6.0f, 19.5f, 6.0f)
                reflectiveCurveTo(17.0f, 7.12f, 17.0f, 8.5f)
                curveToRelative(0.0f, 0.35f, 0.07f, 0.67f, 0.2f, 0.97f)
                lineTo(12.0f, 14.67f)
                close()
            }
        }
        .build()
        return _networkPing!!
    }

private var _networkPing: ImageVector? = null
