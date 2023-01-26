package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Person2: ImageVector
    get() {
        if (_person2 != null) {
            return _person2!!
        }
        _person2 = Builder(name = "Person2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.39f, 14.56f)
                curveTo(16.71f, 13.7f, 14.53f, 13.0f, 12.0f, 13.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(4.61f, 15.07f, 4.0f, 16.1f, 4.0f, 17.22f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.78f)
                curveTo(20.0f, 16.1f, 19.39f, 15.07f, 18.39f, 14.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.78f, 12.0f)
                horizontalLineToRelative(4.44f)
                curveToRelative(1.21f, 0.0f, 2.14f, -1.06f, 1.98f, -2.26f)
                lineToRelative(-0.32f, -2.45f)
                curveTo(15.57f, 5.39f, 13.92f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(8.43f, 5.39f, 8.12f, 7.29f)
                lineTo(7.8f, 9.74f)
                curveTo(7.64f, 10.94f, 8.57f, 12.0f, 9.78f, 12.0f)
                close()
            }
        }
        .build()
        return _person2!!
    }

private var _person2: ImageVector? = null
