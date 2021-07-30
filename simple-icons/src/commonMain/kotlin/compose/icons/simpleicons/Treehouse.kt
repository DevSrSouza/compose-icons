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

public val SimpleIcons.Treehouse: ImageVector
    get() {
        if (_treehouse != null) {
            return _treehouse!!
        }
        _treehouse = Builder(name = "Treehouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3981f, 4.3857f)
                curveToRelative(-0.8211f, -0.448f, -2.0902f, 0.2986f, -2.8367f, 1.6423f)
                lineToRelative(-1.4183f, 2.3888f)
                curveToRelative(-0.5226f, 0.9704f, -0.448f, 2.1648f, 0.224f, 3.1353f)
                lineToRelative(0.0746f, 0.0747f)
                curveToRelative(0.6718f, 0.8958f, 1.493f, 1.7916f, 1.7916f, 2.0902f)
                curveToRelative(0.1493f, 0.1493f, 0.2986f, 0.3732f, 0.3732f, 0.6718f)
                curveToRelative(0.224f, 0.8212f, -0.224f, 1.717f, -1.1197f, 1.941f)
                curveToRelative(-0.8212f, 0.2239f, -1.717f, -0.224f, -1.941f, -1.1198f)
                curveToRelative(-0.0746f, -0.224f, -0.0746f, -0.448f, -0.0746f, -0.5972f)
                curveToRelative(0.0747f, -0.3733f, -0.0746f, -0.8958f, -0.5972f, -1.493f)
                curveToRelative(-0.5225f, -0.5226f, -1.493f, 0.5225f, -1.8662f, 1.5676f)
                verticalLineToRelative(0.0747f)
                curveToRelative(-0.2986f, 1.045f, -0.5226f, 2.0155f, -0.448f, 2.0902f)
                curveToRelative(0.0f, 0.0746f, 0.0747f, 0.0746f, 0.0747f, 0.1493f)
                curveToRelative(0.448f, 0.8958f, 0.1493f, 1.9409f, -0.7465f, 2.3888f)
                curveToRelative(-0.8958f, 0.4479f, -1.9409f, 0.1493f, -2.3888f, -0.7465f)
                curveToRelative(-0.4479f, -0.8958f, -0.1493f, -1.941f, 0.7465f, -2.3888f)
                curveToRelative(0.0747f, 0.0f, 0.0747f, -0.0747f, 0.1493f, -0.0747f)
                curveToRelative(0.0747f, 0.0f, 0.224f, -0.4479f, 0.448f, -1.0451f)
                curveToRelative(0.1492f, -0.5225f, 0.2239f, -0.7465f, 0.2985f, -0.9704f)
                curveToRelative(0.0747f, -0.2986f, 0.224f, -1.0451f, 0.1493f, -1.3437f)
                curveToRelative(-0.0746f, -0.3733f, -0.4479f, -0.3733f, -0.8211f, -0.1493f)
                curveToRelative(-0.224f, 0.1493f, -0.6719f, 0.5225f, -0.8212f, 0.6718f)
                curveToRelative(-0.3732f, 0.2986f, -0.6718f, 0.7465f, -0.8211f, 1.1198f)
                curveToRelative(-0.0747f, 0.1493f, -0.224f, 0.3732f, -0.3733f, 0.5225f)
                curveToRelative(-0.6718f, 0.5226f, -1.6423f, 0.4479f, -2.2395f, -0.224f)
                curveToRelative(-0.5225f, -0.6718f, -0.4479f, -1.6422f, 0.224f, -2.2394f)
                curveToRelative(0.224f, -0.1494f, 0.4479f, -0.2987f, 0.6718f, -0.2987f)
                curveToRelative(0.3733f, -0.0746f, 1.717f, -0.8958f, 2.5381f, -1.493f)
                curveToRelative(0.1493f, -0.0746f, 0.3733f, -0.2986f, 0.448f, -0.3732f)
                curveToRelative(0.2239f, -0.2986f, 0.0f, -0.5226f, -0.224f, -0.5226f)
                curveToRelative(-0.6719f, 0.0747f, -1.4184f, 0.1493f, -1.5677f, 0.3733f)
                curveToRelative(-0.0746f, 0.0746f, -0.1493f, 0.224f, -0.2986f, 0.2986f)
                curveToRelative(-0.5972f, 0.4479f, -1.493f, 0.2986f, -1.9409f, -0.2986f)
                curveToRelative(-0.4479f, -0.5972f, -0.2986f, -1.493f, 0.2986f, -1.9409f)
                curveToRelative(0.224f, -0.224f, 0.5972f, -0.2986f, 0.8212f, -0.2986f)
                curveToRelative(0.5225f, 0.0f, 1.8662f, 0.2986f, 2.9113f, 0.0746f)
                lineToRelative(0.2986f, -0.0746f)
                curveToRelative(1.1198f, -0.224f, 2.4635f, -1.1944f, 2.986f, -2.1649f)
                curveToRelative(0.0f, 0.0f, 0.5226f, -0.8958f, 1.1198f, -2.0155f)
                curveToRelative(0.6718f, -1.1198f, 0.5972f, -2.3888f, -0.0747f, -2.762f)
                lineToRelative(-1.269f, -0.7466f)
                curveToRelative(-0.6719f, -0.3732f, -1.6423f, -0.3732f, -2.3142f, 0.0f)
                lineTo(2.1835f, 5.207f)
                curveTo(1.5117f, 5.58f, 0.9891f, 6.4758f, 0.9891f, 7.2223f)
                verticalLineToRelative(9.5552f)
                curveToRelative(0.0f, 0.7465f, 0.5226f, 1.6423f, 1.1944f, 2.0156f)
                lineTo(10.843f, 23.72f)
                curveToRelative(0.6719f, 0.3732f, 1.717f, 0.3732f, 2.3142f, 0.0f)
                lineToRelative(8.6594f, -4.927f)
                curveToRelative(0.6718f, -0.3732f, 1.1944f, -1.269f, 1.1944f, -2.0155f)
                verticalLineTo(7.2224f)
                curveToRelative(0.0f, -0.7465f, -0.5226f, -1.6423f, -1.1944f, -2.0156f)
                curveToRelative(0.0f, 0.0f, -0.5972f, -0.3732f, -1.4184f, -0.8211f)
                close()
            }
        }
        .build()
        return _treehouse!!
    }

private var _treehouse: ImageVector? = null
