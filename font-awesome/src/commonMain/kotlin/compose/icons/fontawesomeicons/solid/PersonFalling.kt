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

public val SolidGroup.PersonFalling: ImageVector
    get() {
        if (_personFalling != null) {
            return _personFalling!!
        }
        _personFalling = Builder(name = "PersonFalling", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 9.8f)
                curveToRelative(0.0f, 54.6f, -27.9f, 104.6f, -72.5f, 133.6f)
                lineToRelative(0.2f, 0.3f)
                lineTo(304.5f, 256.0f)
                lineToRelative(87.5f, 0.0f)
                curveToRelative(15.1f, 0.0f, 29.3f, 7.1f, 38.4f, 19.2f)
                lineToRelative(43.2f, 57.6f)
                curveToRelative(10.6f, 14.1f, 7.7f, 34.2f, -6.4f, 44.8f)
                reflectiveCurveToRelative(-34.2f, 7.7f, -44.8f, -6.4f)
                lineTo(384.0f, 320.0f)
                lineToRelative(-96.0f, 0.0f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(92.3f, 142.6f)
                curveToRelative(9.6f, 14.8f, 5.4f, 34.6f, -9.5f, 44.3f)
                reflectiveCurveToRelative(-34.6f, 5.4f, -44.3f, -9.5f)
                lineTo(164.5f, 249.2f)
                curveToRelative(-2.9f, 9.2f, -4.5f, 19.0f, -4.5f, 29.0f)
                lineToRelative(0.0f, 73.8f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(278.2f)
                curveToRelative(0.0f, -65.1f, 39.6f, -123.7f, 100.1f, -147.9f)
                curveTo(232.3f, 115.8f, 256.0f, 80.8f, 256.0f, 41.8f)
                lineToRelative(0.0f, -9.8f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(112.0f, 32.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _personFalling!!
    }

private var _personFalling: ImageVector? = null
