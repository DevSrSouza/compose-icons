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

public val SolidGroup.Industry: ImageVector
    get() {
        if (_industry != null) {
            return _industry!!
        }
        _industry = Builder(name = "Industry", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(46.3f, 32.0f, 32.0f, 46.3f, 32.0f, 64.0f)
                verticalLineTo(304.0f)
                verticalLineToRelative(48.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineTo(496.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(304.0f)
                verticalLineTo(152.2f)
                curveToRelative(0.0f, -18.2f, -19.4f, -29.7f, -35.4f, -21.1f)
                lineTo(352.0f, 215.4f)
                verticalLineTo(152.2f)
                curveToRelative(0.0f, -18.2f, -19.4f, -29.7f, -35.4f, -21.1f)
                lineTo(160.0f, 215.4f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(64.0f)
                close()
            }
        }
        .build()
        return _industry!!
    }

private var _industry: ImageVector? = null
