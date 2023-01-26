package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AutoDelete: ImageVector
    get() {
        if (_autoDelete != null) {
            return _autoDelete!!
        }
        _autoDelete = Builder(name = "AutoDelete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveToRelative(-0.7f, 0.0f, -1.37f, 0.1f, -2.0f, 0.29f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.68f)
                curveToRelative(1.12f, 2.36f, 3.53f, 4.0f, 6.32f, 4.0f)
                curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f)
                curveTo(23.0f, 12.13f, 19.87f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 21.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-0.71f, -0.71f)
                curveTo(10.61f, 1.11f, 10.35f, 1.0f, 10.09f, 1.0f)
                horizontalLineTo(5.91f)
                curveTo(5.65f, 1.0f, 5.39f, 1.11f, 5.21f, 1.29f)
                lineTo(4.5f, 2.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 2.0f, 1.0f, 2.45f, 1.0f, 3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 12.0f)
                lineTo(15.75f, 12.0f)
                curveTo(15.34f, 12.0f, 15.0f, 12.34f, 15.0f, 12.75f)
                verticalLineToRelative(3.68f)
                curveToRelative(0.0f, 0.36f, 0.19f, 0.68f, 0.5f, 0.86f)
                lineToRelative(2.52f, 1.47f)
                curveToRelative(0.33f, 0.19f, 0.75f, 0.09f, 0.96f, -0.22f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.23f, -0.34f, 0.12f, -0.81f, -0.24f, -1.02f)
                lineTo(16.5f, 16.2f)
                verticalLineToRelative(-3.45f)
                curveTo(16.5f, 12.34f, 16.16f, 12.0f, 15.75f, 12.0f)
                close()
            }
        }
        .build()
        return _autoDelete!!
    }

private var _autoDelete: ImageVector? = null
