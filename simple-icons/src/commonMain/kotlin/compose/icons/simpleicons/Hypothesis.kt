package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hypothesis: ImageVector
    get() {
        if (_hypothesis != null) {
            return _hypothesis!!
        }
        _hypothesis = Builder(name = "Hypothesis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.425f, 0.0f)
                curveToRelative(-0.93f, 0.0f, -1.71f, 0.768f, -1.71f, 1.72f)
                verticalLineToRelative(17.14f)
                curveToRelative(0.0f, 0.94f, 0.78f, 1.71f, 1.71f, 1.71f)
                horizontalLineToRelative(5.95f)
                lineToRelative(2.62f, 3.43f)
                lineToRelative(2.62f, -3.43f)
                horizontalLineToRelative(5.95f)
                curveToRelative(0.93f, 0.0f, 1.72f, -0.77f, 1.72f, -1.71f)
                verticalLineTo(1.72f)
                curveToRelative(0.0f, -0.95f, -0.79f, -1.72f, -1.72f, -1.72f)
                horizontalLineTo(3.425f)
                moveToRelative(1.71f, 3.43f)
                horizontalLineToRelative(2.58f)
                verticalLineToRelative(6.0f)
                reflectiveCurveToRelative(0.86f, -1.71f, 2.56f, -1.71f)
                curveToRelative(1.72f, 0.0f, 3.46f, 0.85f, 3.46f, 3.52f)
                verticalLineToRelative(5.9f)
                horizontalLineToRelative(-2.58f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -1.39f, -0.88f, -1.93f, -1.73f, -1.71f)
                curveToRelative(-0.86f, 0.21f, -1.71f, 1.12f, -1.71f, 3.0f)
                verticalLineToRelative(3.85f)
                horizontalLineToRelative(-2.58f)
                verticalLineTo(3.43f)
                moveToRelative(12.86f, 10.29f)
                curveToRelative(0.95f, 0.0f, 1.72f, 0.78f, 1.72f, 1.7f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, true, -1.72f, 1.71f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, true, -1.71f, -1.71f)
                curveToRelative(0.0f, -0.92f, 0.76f, -1.71f, 1.71f, -1.71f)
                close()
            }
        }
        .build()
        return _hypothesis!!
    }

private var _hypothesis: ImageVector? = null
