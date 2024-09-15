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

public val RegularGroup.Hdd: ImageVector
    get() {
        if (_hdd != null) {
            return _hdd!!
        }
        _hdd = Builder(name = "Hdd", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(567.4f, 235.64f)
                lineTo(462.32f, 84.59f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 422.92f, 64.0f)
                lineTo(153.08f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -39.4f, 20.59f)
                lineTo(8.6f, 235.64f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 0.0f, 263.05f)
                lineTo(0.0f, 400.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(576.0f, 263.05f)
                curveToRelative(0.0f, -9.8f, -3.0f, -19.37f, -8.6f, -27.41f)
                close()
                moveTo(153.08f, 112.0f)
                horizontalLineToRelative(269.84f)
                lineToRelative(77.91f, 112.0f)
                lineTo(75.17f, 224.0f)
                lineToRelative(77.91f, -112.0f)
                close()
                moveTo(528.0f, 400.0f)
                lineTo(48.0f, 400.0f)
                lineTo(48.0f, 272.0f)
                horizontalLineToRelative(480.0f)
                verticalLineToRelative(128.0f)
                close()
                moveTo(496.0f, 336.0f)
                curveToRelative(0.0f, 17.67f, -14.33f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                close()
                moveTo(400.0f, 336.0f)
                curveToRelative(0.0f, 17.67f, -14.33f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _hdd!!
    }

private var _hdd: ImageVector? = null
