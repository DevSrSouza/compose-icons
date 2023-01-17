package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.Goal24: ImageVector
    get() {
        if (_goal24 != null) {
            return _goal24!!
        }
        _goal24 = Builder(name = "Goal24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.172f, 6.75f)
                horizontalLineToRelative(-1.861f)
                lineToRelative(-4.566f, 4.564f)
                arcToRelative(1.874f, 1.874f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(4.565f, -4.565f)
                verticalLineTo(3.828f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, 0.275f, -0.664f)
                lineToRelative(1.73f, -1.73f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, true, 0.25f, -0.063f)
                curveToRelative(0.089f, 0.026f, 0.155f, 0.1f, 0.173f, 0.191f)
                lineToRelative(0.46f, 2.301f)
                lineToRelative(2.3f, 0.46f)
                curveToRelative(0.09f, 0.018f, 0.164f, 0.084f, 0.19f, 0.173f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.062f, 0.249f)
                lineToRelative(-1.731f, 1.73f)
                arcToRelative(0.937f, 0.937f, 0.0f, false, true, -0.663f, 0.275f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.625f, 12.0f)
                arcTo(9.375f, 9.375f, 0.0f, false, false, 12.0f, 21.375f)
                arcTo(9.375f, 9.375f, 0.0f, false, false, 21.375f, 12.0f)
                curveToRelative(0.0f, -0.898f, -0.126f, -1.766f, -0.361f, -2.587f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 22.455f, 9.0f)
                curveToRelative(0.274f, 0.954f, 0.42f, 1.96f, 0.42f, 3.0f)
                curveToRelative(0.0f, 6.006f, -4.869f, 10.875f, -10.875f, 10.875f)
                reflectiveCurveTo(1.125f, 18.006f, 1.125f, 12.0f)
                reflectiveCurveTo(5.994f, 1.125f, 12.0f, 1.125f)
                curveToRelative(1.015f, -0.001f, 2.024f, 0.14f, 3.0f, 0.419f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.413f, 1.442f)
                arcTo(9.39f, 9.39f, 0.0f, false, false, 12.0f, 2.625f)
                arcTo(9.375f, 9.375f, 0.0f, false, false, 2.625f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.125f, 12.0f)
                arcToRelative(4.874f, 4.874f, 0.0f, true, false, 9.717f, -0.569f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 1.047f, -0.798f)
                curveToRelative(0.251f, 0.112f, 0.42f, 0.351f, 0.442f, 0.625f)
                arcToRelative(6.373f, 6.373f, 0.0f, false, true, -10.836f, 5.253f)
                arcToRelative(6.376f, 6.376f, 0.0f, false, true, 5.236f, -10.844f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.17f, 1.49f)
                arcTo(4.876f, 4.876f, 0.0f, false, false, 7.125f, 12.0f)
                close()
            }
        }
        .build()
        return _goal24!!
    }

private var _goal24: ImageVector? = null
