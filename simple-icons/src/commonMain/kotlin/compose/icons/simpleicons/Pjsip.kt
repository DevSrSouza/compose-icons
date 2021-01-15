package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Pjsip: ImageVector
    get() {
        if (_pjsip != null) {
            return _pjsip!!
        }
        _pjsip = Builder(name = "Pjsip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.272f, 20.562f)
                lineTo(10.2f, 20.562f)
                lineToRelative(2.657f, 2.657f)
                curveToRelative(0.873f, 0.874f, 2.114f, 1.039f, 2.782f, 0.371f)
                lineToRelative(7.951f, -7.951f)
                curveToRelative(0.668f, -0.668f, 0.503f, -1.909f, -0.37f, -2.782f)
                lineTo(11.142f, 0.781f)
                curveTo(10.27f, -0.093f, 9.029f, -0.258f, 8.36f, 0.41f)
                lineTo(0.41f, 8.36f)
                curveToRelative(-0.668f, 0.668f, -0.503f, 1.909f, 0.37f, 2.782f)
                lineToRelative(4.492f, 4.492f)
                close()
                moveTo(7.414f, 18.42f)
                verticalLineToRelative(-3.768f)
                lineToRelative(-0.88f, -0.88f)
                horizontalLineToRelative(0.016f)
                lineToRelative(-2.507f, -2.507f)
                curveToRelative(-0.873f, -0.873f, -1.039f, -2.114f, -0.371f, -2.782f)
                lineToRelative(4.811f, -4.811f)
                curveToRelative(0.668f, -0.668f, 1.909f, -0.502f, 2.782f, 0.371f)
                lineToRelative(8.692f, 8.692f)
                curveToRelative(0.873f, 0.873f, 1.039f, 2.114f, 0.371f, 2.782f)
                lineToRelative(-4.811f, 4.811f)
                curveToRelative(-0.438f, 0.438f, -1.12f, 0.511f, -1.786f, 0.269f)
                arcToRelative(1.218f, 3.063f, 25.325f, false, false, 0.557f, -2.845f)
                arcToRelative(1.218f, 3.063f, 25.325f, false, false, -1.557f, 0.033f)
                arcToRelative(1.218f, 3.063f, 25.325f, false, false, -0.931f, 1.252f)
                lineToRelative(-0.618f, -0.617f)
                close()
                moveTo(5.172f, 11.24f)
                arcToRelative(1.628f, 1.628f, 0.0f, false, false, 2.302f, 0.0f)
                arcToRelative(1.628f, 1.628f, 0.0f, false, false, 0.0f, -2.302f)
                arcToRelative(1.628f, 1.628f, 0.0f, false, false, -2.303f, 0.0f)
                arcToRelative(1.628f, 1.628f, 0.0f, false, false, 0.0f, 2.302f)
                close()
            }
        }
        .build()
        return _pjsip!!
    }

private var _pjsip: ImageVector? = null
