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

public val SolidGroup.Registered: ImageVector
    get() {
        if (_registered != null) {
            return _registered!!
        }
        _registered = Builder(name = "Registered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(285.363f, 207.475f)
                curveToRelative(0.0f, 18.6f, -9.831f, 28.431f, -28.431f, 28.431f)
                horizontalLineToRelative(-29.876f)
                verticalLineToRelative(-56.14f)
                horizontalLineToRelative(23.378f)
                curveToRelative(28.668f, 0.0f, 34.929f, 8.773f, 34.929f, 27.709f)
                close()
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 136.967f, -111.033f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.967f, 8.0f, 256.0f)
                reflectiveCurveTo(119.033f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.033f, 248.0f, 248.0f)
                close()
                moveTo(363.411f, 360.414f)
                curveToRelative(-46.729f, -84.825f, -43.299f, -78.636f, -44.702f, -80.98f)
                curveToRelative(23.432f, -15.172f, 37.945f, -42.979f, 37.945f, -74.486f)
                curveToRelative(0.0f, -54.244f, -31.5f, -89.252f, -105.498f, -89.252f)
                horizontalLineToRelative(-70.667f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineTo(372.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(22.567f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineToRelative(-71.663f)
                horizontalLineToRelative(25.556f)
                lineToRelative(44.129f, 82.937f)
                arcToRelative(24.001f, 24.001f, 0.0f, false, false, 21.188f, 12.727f)
                horizontalLineToRelative(24.464f)
                curveToRelative(18.261f, -0.001f, 29.829f, -19.591f, 21.018f, -35.587f)
                close()
            }
        }
        .build()
        return _registered!!
    }

private var _registered: ImageVector? = null
