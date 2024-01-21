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

public val SolidGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                horizontalLineTo(448.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(323.8f, 202.5f)
                curveToRelative(-4.5f, -6.6f, -11.9f, -10.5f, -19.8f, -10.5f)
                reflectiveCurveToRelative(-15.4f, 3.9f, -19.8f, 10.5f)
                lineToRelative(-87.0f, 127.6f)
                lineTo(170.7f, 297.0f)
                curveToRelative(-4.6f, -5.7f, -11.5f, -9.0f, -18.7f, -9.0f)
                reflectiveCurveToRelative(-14.2f, 3.3f, -18.7f, 9.0f)
                lineToRelative(-64.0f, 80.0f)
                curveToRelative(-5.8f, 7.2f, -6.9f, 17.1f, -2.9f, 25.4f)
                reflectiveCurveToRelative(12.4f, 13.6f, 21.6f, 13.6f)
                horizontalLineToRelative(96.0f)
                horizontalLineToRelative(32.0f)
                horizontalLineTo(424.0f)
                curveToRelative(8.9f, 0.0f, 17.1f, -4.9f, 21.2f, -12.8f)
                reflectiveCurveToRelative(3.6f, -17.4f, -1.4f, -24.7f)
                lineToRelative(-120.0f, -176.0f)
                close()
                moveTo(112.0f, 192.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
