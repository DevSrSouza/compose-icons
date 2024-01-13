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

public val SolidGroup.Mask: ImageVector
    get() {
        if (_mask != null) {
            return _mask!!
        }
        _mask = Builder(name = "Mask", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 64.0f)
                curveTo(64.0f, 64.0f, 0.0f, 160.0f, 0.0f, 272.0f)
                reflectiveCurveTo(80.0f, 448.0f, 176.0f, 448.0f)
                horizontalLineToRelative(8.4f)
                curveToRelative(24.2f, 0.0f, 46.4f, -13.7f, 57.2f, -35.4f)
                lineToRelative(23.2f, -46.3f)
                curveToRelative(4.4f, -8.8f, 13.3f, -14.3f, 23.2f, -14.3f)
                reflectiveCurveToRelative(18.8f, 5.5f, 23.2f, 14.3f)
                lineToRelative(23.2f, 46.3f)
                curveToRelative(10.8f, 21.7f, 33.0f, 35.4f, 57.2f, 35.4f)
                lineTo(400.0f, 448.0f)
                curveToRelative(96.0f, 0.0f, 176.0f, -64.0f, 176.0f, -176.0f)
                reflectiveCurveToRelative(-64.0f, -208.0f, -288.0f, -208.0f)
                close()
                moveTo(96.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 96.0f, 256.0f)
                close()
                moveTo(416.0f, 192.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -128.0f)
                close()
            }
        }
        .build()
        return _mask!!
    }

private var _mask: ImageVector? = null
