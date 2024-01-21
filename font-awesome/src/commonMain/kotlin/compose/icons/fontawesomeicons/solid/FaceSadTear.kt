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

public val SolidGroup.FaceSadTear: ImageVector
    get() {
        if (_faceSadTear != null) {
            return _faceSadTear!!
        }
        _faceSadTear = Builder(name = "FaceSadTear", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 0.0f, 256.0f)
                close()
                moveTo(240.0f, 336.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                curveToRelative(45.0f, 0.0f, 85.6f, 20.5f, 115.7f, 53.1f)
                curveToRelative(6.0f, 6.5f, 5.6f, 16.6f, -0.9f, 22.6f)
                reflectiveCurveToRelative(-16.6f, 5.6f, -22.6f, -0.9f)
                curveToRelative(-25.0f, -27.1f, -57.4f, -42.9f, -92.3f, -42.9f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
                moveTo(160.0f, 416.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.0f, -48.0f, -47.0f)
                curveToRelative(0.0f, -20.0f, 28.6f, -60.4f, 41.6f, -77.7f)
                curveToRelative(3.2f, -4.4f, 9.6f, -4.4f, 12.8f, 0.0f)
                curveTo(179.6f, 308.6f, 208.0f, 349.0f, 208.0f, 369.0f)
                curveToRelative(0.0f, 26.0f, -21.5f, 47.0f, -48.0f, 47.0f)
                close()
                moveTo(367.6f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                close()
                moveTo(175.6f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceSadTear!!
    }

private var _faceSadTear: ImageVector? = null
