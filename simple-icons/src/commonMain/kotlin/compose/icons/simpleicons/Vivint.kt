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

public val SimpleIcons.Vivint: ImageVector
    get() {
        if (_vivint != null) {
            return _vivint!!
        }
        _vivint = Builder(name = "Vivint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.102f, 2.04f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, false, -0.553f, 0.218f)
                lineTo(0.514f, 9.756f)
                arcTo(1.62f, 1.62f, 0.0f, false, false, 0.0f, 10.939f)
                lineTo(0.0f, 21.15f)
                curveToRelative(0.0f, 0.447f, 0.362f, 0.81f, 0.809f, 0.81f)
                horizontalLineToRelative(16.584f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, false, 0.808f, -0.81f)
                lineTo(18.201f, 10.94f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, false, -0.514f, -1.184f)
                lineToRelative(-8.035f, -7.5f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, false, -0.55f, -0.217f)
                close()
                moveTo(9.102f, 7.004f)
                lineTo(14.354f, 11.908f)
                verticalLineToRelative(6.203f)
                lineTo(3.848f, 18.111f)
                verticalLineToRelative(-6.203f)
                lineToRelative(5.254f, -4.904f)
                close()
                moveTo(21.648f, 17.35f)
                arcToRelative(2.305f, 2.305f, 0.0f, false, false, -2.26f, 2.304f)
                arcToRelative(2.305f, 2.305f, 0.0f, false, false, 2.307f, 2.307f)
                arcTo(2.305f, 2.305f, 0.0f, false, false, 24.0f, 19.654f)
                arcToRelative(2.305f, 2.305f, 0.0f, false, false, -2.305f, -2.304f)
                arcToRelative(2.305f, 2.305f, 0.0f, false, false, -0.047f, 0.0f)
                close()
            }
        }
        .build()
        return _vivint!!
    }

private var _vivint: ImageVector? = null
