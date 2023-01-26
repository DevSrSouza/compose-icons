package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Male: ImageVector
    get() {
        if (_male != null) {
            return _male!!
        }
        _male = Builder(name = "Male", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.58f)
                lineToRelative(-3.97f, 3.97f)
                curveTo(11.73f, 9.36f, 10.66f, 9.0f, 9.5f, 9.0f)
                curveTo(6.46f, 9.0f, 4.0f, 11.46f, 4.0f, 14.5f)
                curveTo(4.0f, 17.54f, 6.46f, 20.0f, 9.5f, 20.0f)
                reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
                curveToRelative(0.0f, -1.16f, -0.36f, -2.23f, -0.97f, -3.12f)
                lineTo(18.0f, 7.42f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 4.45f, 19.55f, 4.0f, 19.0f, 4.0f)
                close()
                moveTo(9.5f, 18.0f)
                curveTo(7.57f, 18.0f, 6.0f, 16.43f, 6.0f, 14.5f)
                curveTo(6.0f, 12.57f, 7.57f, 11.0f, 9.5f, 11.0f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveTo(13.0f, 16.43f, 11.43f, 18.0f, 9.5f, 18.0f)
                close()
            }
        }
        .build()
        return _male!!
    }

private var _male: ImageVector? = null
