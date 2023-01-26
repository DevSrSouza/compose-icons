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

public val OutlineGroup.Male: ImageVector
    get() {
        if (_male != null) {
            return _male!!
        }
        _male = Builder(name = "Male", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 11.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveTo(11.43f, 18.0f, 9.5f, 18.0f)
                reflectiveCurveTo(6.0f, 16.43f, 6.0f, 14.5f)
                reflectiveCurveTo(7.57f, 11.0f, 9.5f, 11.0f)
                close()
                moveTo(9.5f, 9.0f)
                curveTo(6.46f, 9.0f, 4.0f, 11.46f, 4.0f, 14.5f)
                reflectiveCurveTo(6.46f, 20.0f, 9.5f, 20.0f)
                reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
                curveToRelative(0.0f, -1.16f, -0.36f, -2.23f, -0.97f, -3.12f)
                lineTo(18.0f, 7.42f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.58f)
                lineToRelative(-3.97f, 3.97f)
                curveTo(11.73f, 9.36f, 10.66f, 9.0f, 9.5f, 9.0f)
                close()
            }
        }
        .build()
        return _male!!
    }

private var _male: ImageVector? = null
