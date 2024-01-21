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

public val SolidGroup.Ankh: ImageVector
    get() {
        if (_ankh != null) {
            return _ankh!!
        }
        _ankh = Builder(name = "Ankh", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 128.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 41.6f, -20.7f, 76.6f, -46.6f, 104.1f)
                curveToRelative(-5.9f, 6.2f, -11.8f, 11.8f, -17.4f, 16.7f)
                curveToRelative(-5.6f, -4.9f, -11.5f, -10.5f, -17.4f, -16.7f)
                curveTo(116.7f, 204.6f, 96.0f, 169.6f, 96.0f, 128.0f)
                close()
                moveTo(160.0f, 0.0f)
                curveTo(89.3f, 0.0f, 32.0f, 57.3f, 32.0f, 128.0f)
                curveToRelative(0.0f, 52.4f, 21.5f, 95.5f, 46.8f, 128.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(320.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(241.2f)
                curveToRelative(25.4f, -32.5f, 46.8f, -75.6f, 46.8f, -128.0f)
                curveTo(288.0f, 57.3f, 230.7f, 0.0f, 160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _ankh!!
    }

private var _ankh: ImageVector? = null
