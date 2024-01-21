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

public val SolidGroup.UserGroup: ImageVector
    get() {
        if (_userGroup != null) {
            return _userGroup!!
        }
        _userGroup = Builder(name = "UserGroup", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, true, 96.0f, 128.0f)
                close()
                moveTo(0.0f, 482.3f)
                curveTo(0.0f, 383.8f, 79.8f, 304.0f, 178.3f, 304.0f)
                horizontalLineToRelative(91.4f)
                curveTo(368.2f, 304.0f, 448.0f, 383.8f, 448.0f, 482.3f)
                curveToRelative(0.0f, 16.4f, -13.3f, 29.7f, -29.7f, 29.7f)
                horizontalLineTo(29.7f)
                curveTo(13.3f, 512.0f, 0.0f, 498.7f, 0.0f, 482.3f)
                close()
                moveTo(609.3f, 512.0f)
                horizontalLineTo(471.4f)
                curveToRelative(5.4f, -9.4f, 8.6f, -20.3f, 8.6f, -32.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -60.7f, -27.1f, -115.2f, -69.8f, -151.8f)
                curveToRelative(2.4f, -0.1f, 4.7f, -0.2f, 7.1f, -0.2f)
                horizontalLineToRelative(61.4f)
                curveTo(567.8f, 320.0f, 640.0f, 392.2f, 640.0f, 481.3f)
                curveToRelative(0.0f, 17.0f, -13.8f, 30.7f, -30.7f, 30.7f)
                close()
                moveTo(432.0f, 256.0f)
                curveToRelative(-31.0f, 0.0f, -59.0f, -12.6f, -79.3f, -32.9f)
                curveTo(372.4f, 196.5f, 384.0f, 163.6f, 384.0f, 128.0f)
                curveToRelative(0.0f, -26.8f, -6.6f, -52.1f, -18.3f, -74.3f)
                curveTo(384.3f, 40.1f, 407.2f, 32.0f, 432.0f, 32.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, 50.1f, 112.0f, 112.0f)
                reflectiveCurveToRelative(-50.1f, 112.0f, -112.0f, 112.0f)
                close()
            }
        }
        .build()
        return _userGroup!!
    }

private var _userGroup: ImageVector? = null
