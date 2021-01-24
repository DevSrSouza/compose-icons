package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 416.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(0.0f, 176.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(48.0f)
                lineTo(54.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(244.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(372.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(522.0f, 80.0f)
                lineTo(150.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(244.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(372.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(528.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                close()
                moveTo(528.0f, 32.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(144.0f, 384.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(96.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(384.0f)
                close()
                moveTo(264.0f, 144.0f)
                curveToRelative(0.0f, 22.091f, -17.909f, 40.0f, -40.0f, 40.0f)
                reflectiveCurveToRelative(-40.0f, -17.909f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.909f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.909f, 40.0f, 40.0f)
                close()
                moveTo(192.0f, 240.0f)
                lineToRelative(39.515f, -39.515f)
                curveToRelative(4.686f, -4.686f, 12.284f, -4.686f, 16.971f, 0.0f)
                lineTo(288.0f, 240.0f)
                lineToRelative(103.515f, -103.515f)
                curveToRelative(4.686f, -4.686f, 12.284f, -4.686f, 16.971f, 0.0f)
                lineTo(480.0f, 208.0f)
                verticalLineToRelative(80.0f)
                lineTo(192.0f, 288.0f)
                verticalLineToRelative(-48.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
