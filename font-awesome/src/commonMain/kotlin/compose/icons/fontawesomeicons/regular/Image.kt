package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 64.0f)
                lineTo(48.0f, 64.0f)
                curveTo(21.49f, 64.0f, 0.0f, 85.49f, 0.0f, 112.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(512.0f, 112.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(458.0f, 400.0f)
                lineTo(54.0f, 400.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(48.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(404.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                verticalLineToRelative(276.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                close()
                moveTo(128.0f, 152.0f)
                curveToRelative(-22.091f, 0.0f, -40.0f, 17.909f, -40.0f, 40.0f)
                reflectiveCurveToRelative(17.909f, 40.0f, 40.0f, 40.0f)
                reflectiveCurveToRelative(40.0f, -17.909f, 40.0f, -40.0f)
                reflectiveCurveToRelative(-17.909f, -40.0f, -40.0f, -40.0f)
                close()
                moveTo(96.0f, 352.0f)
                horizontalLineToRelative(320.0f)
                verticalLineToRelative(-80.0f)
                lineToRelative(-87.515f, -87.515f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0.0f)
                lineTo(192.0f, 304.0f)
                lineToRelative(-39.515f, -39.515f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0.0f)
                lineTo(96.0f, 304.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
