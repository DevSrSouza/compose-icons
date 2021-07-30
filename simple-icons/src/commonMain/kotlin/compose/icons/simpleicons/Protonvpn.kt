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

public val SimpleIcons.Protonvpn: ImageVector
    get() {
        if (_protonvpn != null) {
            return _protonvpn!!
        }
        _protonvpn = Builder(name = "Protonvpn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.971f, 2.68f)
                arcToRelative(2.68f, 2.68f, 0.0f, true, false, -5.361f, 0.0f)
                verticalLineToRelative(0.082f)
                lineTo(5.927f, 6.534f)
                arcToRelative(2.68f, 2.68f, 0.0f, true, false, -2.218f, 4.187f)
                curveToRelative(0.279f, -0.004f, 0.555f, -0.052f, 0.819f, -0.142f)
                lineToRelative(7.673f, 9.69f)
                arcToRelative(2.68f, 2.68f, 0.0f, true, false, 4.211f, -0.984f)
                lineToRelative(4.08f, -13.937f)
                arcToRelative(2.669f, 2.669f, 0.0f, false, false, 2.479f, -2.668f)
                close()
                moveTo(14.681f, 18.585f)
                curveToRelative(-0.414f, 0.005f, -0.82f, 0.107f, -1.187f, 0.296f)
                lineTo(5.998f, 9.393f)
                arcToRelative(2.66f, 2.66f, 0.0f, false, false, 0.38f, -1.115f)
                lineTo(18.31f, 4.47f)
                curveToRelative(0.124f, 0.14f, 0.263f, 0.267f, 0.415f, 0.379f)
                lineToRelative(-4.033f, 13.735f)
                horizontalLineToRelative(-0.012f)
                close()
            }
        }
        .build()
        return _protonvpn!!
    }

private var _protonvpn: ImageVector? = null
