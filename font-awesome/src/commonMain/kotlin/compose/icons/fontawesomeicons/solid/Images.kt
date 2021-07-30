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

public val SolidGroup.Images: ImageVector
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
                verticalLineToRelative(208.0f)
                curveToRelative(0.0f, 44.112f, 35.888f, 80.0f, 80.0f, 80.0f)
                horizontalLineToRelative(336.0f)
                close()
                moveTo(576.0f, 336.0f)
                lineTo(576.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                lineTo(144.0f, 32.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                close()
                moveTo(256.0f, 128.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                close()
                moveTo(160.0f, 272.0f)
                lineToRelative(55.515f, -55.515f)
                curveToRelative(4.686f, -4.686f, 12.284f, -4.686f, 16.971f, 0.0f)
                lineTo(272.0f, 256.0f)
                lineToRelative(135.515f, -135.515f)
                curveToRelative(4.686f, -4.686f, 12.284f, -4.686f, 16.971f, 0.0f)
                lineTo(512.0f, 208.0f)
                verticalLineToRelative(112.0f)
                lineTo(160.0f, 320.0f)
                verticalLineToRelative(-48.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
