package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Swipe: ImageVector
    get() {
        if (_swipe != null) {
            return _swipe!!
        }
        _swipe = Builder(name = "Swipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.13f, 3.87f)
                curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                lineTo(4.93f, 4.93f)
                curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f)
                reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(2.0f)
                lineTo(20.13f, 3.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.5f)
                verticalLineToRelative(-6.0f)
                curveTo(13.0f, 5.67f, 12.33f, 5.0f, 11.5f, 5.0f)
                reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f)
                verticalLineToRelative(10.74f)
                lineToRelative(-4.04f, -0.85f)
                lineToRelative(-1.21f, 1.23f)
                lineTo(10.13f, 23.0f)
                horizontalLineToRelative(8.97f)
                lineToRelative(1.09f, -7.64f)
                lineToRelative(-6.11f, -2.86f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _swipe!!
    }

private var _swipe: ImageVector? = null
