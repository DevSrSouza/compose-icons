package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) {
            return _eyedropper!!
        }
        _eyedropper = Builder(name = "Eyedropper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(45.1f, 229.8f)
                arcTo(19.6f, 19.6f, 0.0f, false, true, 31.0f, 223.9f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, true, -3.7f, -19.6f)
                lineTo(36.6f, 183.0f)
                arcToRelative(44.2f, 44.2f, 0.0f, false, true, 12.3f, -38.1f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -5.2f, 19.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -0.6f, 7.9f)
                lineToRelative(-5.3f, 12.1f)
                lineToRelative(12.1f, -5.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 7.9f, -0.6f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 19.3f, -5.2f)
                lineToRelative(56.0f, -56.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-56.0f, 56.0f)
                arcTo(44.2f, 44.2f, 0.0f, false, true, 73.0f, 219.4f)
                lineToRelative(-19.9f, 8.7f)
                arcTo(18.9f, 18.9f, 0.0f, false, true, 45.1f, 229.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 164.7f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -14.1f, -5.9f)
                lineTo(97.2f, 98.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 0.0f, -28.2f)
                lineToRelative(15.0f, -15.1f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, true, 35.7f, -3.2f)
                lineToRelative(11.4f, -11.5f)
                curveToRelative(15.4f, -15.4f, 40.6f, -15.9f, 56.2f, -1.2f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, true, 0.8f, 57.4f)
                lineToRelative(-11.9f, 11.8f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, true, -3.2f, 35.7f)
                lineToRelative(-15.1f, 15.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 172.0f, 164.7f)
                close()
                moveTo(117.0f, 84.0f)
                lineToRelative(55.0f, 55.0f)
                lineToRelative(12.2f, -12.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineToRelative(-4.9f, -4.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(20.0f, -20.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -0.3f, -22.9f)
                curveToRelative(-6.2f, -5.9f, -16.4f, -5.6f, -22.7f, 0.7f)
                lineTo(156.7f, 76.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-4.9f, -4.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                close()
            }
        }
        .build()
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
