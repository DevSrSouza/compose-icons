package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Preview: ImageVector
    get() {
        if (_preview != null) {
            return _preview!!
        }
        _preview = Builder(name = "Preview", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(1.84f, 0.0f, 3.48f, 0.96f, 4.34f, 2.5f)
                curveToRelative(-0.86f, 1.54f, -2.5f, 2.5f, -4.34f, 2.5f)
                reflectiveCurveTo(8.52f, 14.54f, 7.66f, 13.0f)
                curveTo(8.52f, 11.46f, 10.16f, 10.5f, 12.0f, 10.5f)
                moveTo(12.0f, 9.0f)
                curveToRelative(-2.73f, 0.0f, -5.06f, 1.66f, -6.0f, 4.0f)
                curveToRelative(0.94f, 2.34f, 3.27f, 4.0f, 6.0f, 4.0f)
                reflectiveCurveToRelative(5.06f, -1.66f, 6.0f, -4.0f)
                curveTo(17.06f, 10.66f, 14.73f, 9.0f, 12.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                close()
                moveTo(12.0f, 14.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(12.83f, 14.5f, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _preview!!
    }

private var _preview: ImageVector? = null
