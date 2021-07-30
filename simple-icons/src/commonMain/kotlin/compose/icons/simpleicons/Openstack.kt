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

public val SimpleIcons.Openstack: ImageVector
    get() {
        if (_openstack != null) {
            return _openstack!!
        }
        _openstack = Builder(name = "Openstack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.575f, 9.29f)
                horizontalLineToRelative(5.418f)
                verticalLineToRelative(5.42f)
                horizontalLineToRelative(-5.418f)
                close()
                moveTo(0.0f, 9.29f)
                horizontalLineToRelative(5.419f)
                verticalLineToRelative(5.42f)
                lineTo(0.0f, 14.71f)
                close()
                moveTo(18.575f, 17.117f)
                arcToRelative(1.207f, 1.207f, 0.0f, false, true, -1.206f, 1.206f)
                lineTo(6.623f, 18.323f)
                arcToRelative(1.207f, 1.207f, 0.0f, false, true, -1.205f, -1.206f)
                verticalLineToRelative(-0.858f)
                lineTo(0.0f, 16.259f)
                verticalLineToRelative(5.252f)
                arcToRelative(2.236f, 2.236f, 0.0f, false, false, 2.229f, 2.23f)
                horizontalLineToRelative(19.53f)
                arcTo(2.237f, 2.237f, 0.0f, false, false, 24.0f, 21.512f)
                lineTo(24.0f, 16.26f)
                horizontalLineToRelative(-5.425f)
                close()
                moveTo(21.763f, 0.258f)
                lineTo(2.233f, 0.258f)
                arcToRelative(2.236f, 2.236f, 0.0f, false, false, -2.23f, 2.23f)
                lineTo(0.003f, 7.74f)
                horizontalLineToRelative(5.419f)
                verticalLineToRelative(-0.858f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, true, 1.205f, -1.206f)
                horizontalLineToRelative(10.746f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, true, 1.205f, 1.206f)
                verticalLineToRelative(0.858f)
                lineTo(24.0f, 7.74f)
                lineTo(24.0f, 2.487f)
                arcTo(2.237f, 2.237f, 0.0f, false, false, 21.763f, 0.258f)
                close()
            }
        }
        .build()
        return _openstack!!
    }

private var _openstack: ImageVector? = null
