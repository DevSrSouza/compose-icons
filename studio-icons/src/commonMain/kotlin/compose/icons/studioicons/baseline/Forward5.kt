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

public val BaselineGroup.Forward5: ImageVector
    get() {
        if (_forward5 != null) {
            return _forward5!!
        }
        _forward5 = Builder(name = "Forward5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(-5.0f, -5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                horizontalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.03f, 15.38f)
                curveToRelative(-0.44f, 0.0f, -0.58f, -0.31f, -0.6f, -0.56f)
                horizontalLineToRelative(-0.84f)
                curveToRelative(0.03f, 0.85f, 0.79f, 1.25f, 1.44f, 1.25f)
                curveToRelative(0.93f, 0.0f, 1.44f, -0.63f, 1.44f, -1.43f)
                curveToRelative(0.0f, -1.33f, -0.97f, -1.44f, -1.3f, -1.44f)
                curveToRelative(-0.2f, 0.0f, -0.43f, 0.05f, -0.64f, 0.16f)
                lineToRelative(0.11f, -0.92f)
                horizontalLineToRelative(1.7f)
                verticalLineToRelative(-0.71f)
                horizontalLineToRelative(-2.39f)
                lineToRelative(-0.25f, 2.17f)
                lineToRelative(0.67f, 0.17f)
                curveToRelative(0.13f, -0.13f, 0.28f, -0.23f, 0.57f, -0.23f)
                curveToRelative(0.4f, 0.0f, 0.69f, 0.23f, 0.69f, 0.75f)
                curveTo(12.62f, 14.64f, 12.65f, 15.38f, 12.03f, 15.38f)
                close()
            }
        }
        .build()
        return _forward5!!
    }

private var _forward5: ImageVector? = null
