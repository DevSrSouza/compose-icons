package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PanTool: ImageVector
    get() {
        if (_panTool != null) {
            return _panTool!!
        }
        _panTool = Builder(name = "PanTool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 5.5f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 2.2f, -1.8f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-7.3f)
                curveToRelative(-1.08f, 0.0f, -2.1f, -0.43f, -2.85f, -1.19f)
                lineTo(1.0f, 14.83f)
                curveToRelative(0.0f, 0.0f, 1.26f, -1.23f, 1.3f, -1.25f)
                curveToRelative(0.22f, -0.19f, 0.49f, -0.29f, 0.79f, -0.29f)
                curveToRelative(0.22f, 0.0f, 0.42f, 0.06f, 0.6f, 0.16f)
                curveTo(3.73f, 13.46f, 8.0f, 15.91f, 8.0f, 15.91f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveTo(11.0f, 3.17f, 11.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(1.5f)
                curveTo(12.0f, 0.67f, 12.67f, 0.0f, 13.5f, 0.0f)
                reflectiveCurveTo(15.0f, 0.67f, 15.0f, 1.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(2.5f)
                curveTo(16.0f, 1.67f, 16.67f, 1.0f, 17.5f, 1.0f)
                reflectiveCurveTo(19.0f, 1.67f, 19.0f, 2.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(5.5f)
                curveTo(20.0f, 4.67f, 20.67f, 4.0f, 21.5f, 4.0f)
                reflectiveCurveTo(23.0f, 4.67f, 23.0f, 5.5f)
                close()
            }
        }
        .build()
        return _panTool!!
    }

private var _panTool: ImageVector? = null
