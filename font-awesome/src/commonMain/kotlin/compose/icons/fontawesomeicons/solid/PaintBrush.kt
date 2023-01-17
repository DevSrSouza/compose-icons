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

public val SolidGroup.Paintbrush: ImageVector
    get() {
        if (_paintbrush != null) {
            return _paintbrush!!
        }
        _paintbrush = Builder(name = "Paintbrush", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(371.3f, 367.1f)
                curveToRelative(27.3f, -3.9f, 51.9f, -19.4f, 67.2f, -42.9f)
                lineTo(600.2f, 74.1f)
                curveToRelative(12.6f, -19.5f, 9.4f, -45.3f, -7.6f, -61.2f)
                reflectiveCurveTo(549.7f, -4.4f, 531.1f, 9.6f)
                lineTo(294.4f, 187.2f)
                curveToRelative(-24.0f, 18.0f, -38.2f, 46.1f, -38.4f, 76.1f)
                lineTo(371.3f, 367.1f)
                close()
                moveTo(351.7f, 392.5f)
                lineToRelative(-116.0f, -104.4f)
                curveTo(175.9f, 290.3f, 128.0f, 339.6f, 128.0f, 400.0f)
                curveToRelative(0.0f, 3.9f, 0.2f, 7.8f, 0.6f, 11.6f)
                curveToRelative(1.8f, 17.5f, -10.2f, 36.4f, -27.8f, 36.4f)
                lineTo(96.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(240.0f, 512.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                curveToRelative(0.0f, -2.5f, -0.1f, -5.0f, -0.2f, -7.5f)
                close()
            }
        }
        .build()
        return _paintbrush!!
    }

private var _paintbrush: ImageVector? = null
