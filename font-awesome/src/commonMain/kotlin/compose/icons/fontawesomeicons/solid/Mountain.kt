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

public val SolidGroup.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(634.92f, 462.7f)
                lineToRelative(-288.0f, -448.0f)
                curveTo(341.03f, 5.54f, 330.89f, 0.0f, 320.0f, 0.0f)
                reflectiveCurveToRelative(-21.03f, 5.54f, -26.92f, 14.7f)
                lineToRelative(-288.0f, 448.0f)
                arcToRelative(32.001f, 32.001f, 0.0f, false, false, -1.17f, 32.64f)
                arcTo(32.004f, 32.004f, 0.0f, false, false, 32.0f, 512.0f)
                horizontalLineToRelative(576.0f)
                curveToRelative(11.71f, 0.0f, 22.48f, -6.39f, 28.09f, -16.67f)
                arcToRelative(31.983f, 31.983f, 0.0f, false, false, -1.17f, -32.63f)
                close()
                moveTo(320.0f, 91.18f)
                lineTo(405.39f, 224.0f)
                horizontalLineTo(320.0f)
                lineToRelative(-64.0f, 64.0f)
                lineToRelative(-38.06f, -38.06f)
                lineTo(320.0f, 91.18f)
                close()
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
