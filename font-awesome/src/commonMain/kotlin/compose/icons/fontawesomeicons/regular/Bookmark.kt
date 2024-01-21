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

public val RegularGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 48.0f)
                curveTo(0.0f, 21.5f, 21.5f, 0.0f, 48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                verticalLineTo(441.4f)
                lineToRelative(130.1f, -92.9f)
                curveToRelative(8.3f, -6.0f, 19.6f, -6.0f, 27.9f, 0.0f)
                lineTo(336.0f, 441.4f)
                verticalLineTo(48.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(336.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineTo(488.0f)
                curveToRelative(0.0f, 9.0f, -5.0f, 17.2f, -13.0f, 21.3f)
                reflectiveCurveToRelative(-17.6f, 3.4f, -24.9f, -1.8f)
                lineTo(192.0f, 397.5f)
                lineTo(37.9f, 507.5f)
                curveToRelative(-7.3f, 5.2f, -16.9f, 5.9f, -24.9f, 1.8f)
                reflectiveCurveTo(0.0f, 497.0f, 0.0f, 488.0f)
                verticalLineTo(48.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
