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

public val SolidGroup.FaceLaughSquint: ImageVector
    get() {
        if (_faceLaughSquint != null) {
            return _faceLaughSquint!!
        }
        _faceLaughSquint = Builder(name = "FaceLaughSquint", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(96.8f, 314.1f)
                curveToRelative(-3.8f, -13.7f, 7.4f, -26.1f, 21.6f, -26.1f)
                lineTo(393.6f, 288.0f)
                curveToRelative(14.2f, 0.0f, 25.5f, 12.4f, 21.6f, 26.1f)
                curveTo(396.2f, 382.0f, 332.1f, 432.0f, 256.0f, 432.0f)
                reflectiveCurveToRelative(-140.2f, -50.0f, -159.2f, -117.9f)
                close()
                moveTo(133.5f, 114.7f)
                lineToRelative(89.9f, 47.9f)
                curveToRelative(10.7f, 5.7f, 10.7f, 21.1f, 0.0f, 26.8f)
                lineToRelative(-89.9f, 47.9f)
                curveToRelative(-7.9f, 4.2f, -17.5f, -1.5f, -17.5f, -10.5f)
                curveToRelative(0.0f, -2.8f, 1.0f, -5.5f, 2.8f, -7.6f)
                lineToRelative(36.0f, -43.2f)
                lineToRelative(-36.0f, -43.2f)
                curveToRelative(-1.8f, -2.1f, -2.8f, -4.8f, -2.8f, -7.6f)
                curveToRelative(0.0f, -9.0f, 9.6f, -14.7f, 17.5f, -10.5f)
                close()
                moveTo(396.0f, 125.1f)
                curveToRelative(0.0f, 2.8f, -1.0f, 5.5f, -2.8f, 7.6f)
                lineToRelative(-36.0f, 43.2f)
                lineToRelative(36.0f, 43.2f)
                curveToRelative(1.8f, 2.1f, 2.8f, 4.8f, 2.8f, 7.6f)
                curveToRelative(0.0f, 9.0f, -9.6f, 14.7f, -17.5f, 10.5f)
                lineToRelative(-89.9f, -47.9f)
                curveToRelative(-10.7f, -5.7f, -10.7f, -21.1f, 0.0f, -26.8f)
                lineToRelative(89.9f, -47.9f)
                curveToRelative(7.9f, -4.2f, 17.5f, 1.5f, 17.5f, 10.5f)
                close()
            }
        }
        .build()
        return _faceLaughSquint!!
    }

private var _faceLaughSquint: ImageVector? = null
