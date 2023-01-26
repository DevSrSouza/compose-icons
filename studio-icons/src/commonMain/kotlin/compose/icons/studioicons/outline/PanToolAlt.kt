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

public val OutlineGroup.PanToolAlt: ImageVector
    get() {
        if (_panToolAlt != null) {
            return _panToolAlt!!
        }
        _panToolAlt = Builder(name = "PanToolAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.89f, 11.77f)
                lineToRelative(-3.8f, -1.67f)
                curveTo(14.96f, 10.04f, 14.81f, 10.0f, 14.65f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.5f)
                curveTo(14.0f, 4.12f, 12.88f, 3.0f, 11.5f, 3.0f)
                reflectiveCurveTo(9.0f, 4.12f, 9.0f, 5.5f)
                verticalLineToRelative(8.15f)
                lineToRelative(-1.87f, -0.4f)
                curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f)
                lineTo(4.0f, 15.22f)
                lineToRelative(5.12f, 5.19f)
                curveTo(9.49f, 20.79f, 10.0f, 21.0f, 10.53f, 21.0f)
                horizontalLineToRelative(6.55f)
                curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f)
                lineToRelative(0.92f, -5.44f)
                curveTo(20.12f, 13.03f, 19.68f, 12.17f, 18.89f, 11.77f)
                close()
                moveTo(17.08f, 19.0f)
                horizontalLineToRelative(-6.55f)
                lineToRelative(-3.7f, -3.78f)
                lineTo(11.0f, 16.11f)
                verticalLineTo(5.5f)
                curveTo(11.0f, 5.22f, 11.22f, 5.0f, 11.5f, 5.0f)
                reflectiveCurveTo(12.0f, 5.22f, 12.0f, 5.5f)
                verticalLineToRelative(6.18f)
                horizontalLineToRelative(1.76f)
                lineTo(18.0f, 13.56f)
                lineTo(17.08f, 19.0f)
                close()
            }
        }
        .build()
        return _panToolAlt!!
    }

private var _panToolAlt: ImageVector? = null
