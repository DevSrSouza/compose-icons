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

public val RoundGroup.Cabin: ImageVector
    get() {
        if (_cabin != null) {
            return _cabin!!
        }
        _cabin = Builder(name = "Cabin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.37f, 3.55f)
                curveTo(4.89f, 2.62f, 5.87f, 2.0f, 7.0f, 2.0f)
                curveToRelative(0.38f, 0.0f, 0.72f, -0.22f, 0.89f, -0.53f)
                curveTo(8.04f, 1.16f, 8.39f, 1.0f, 8.73f, 1.0f)
                curveToRelative(0.74f, 0.0f, 1.26f, 0.8f, 0.9f, 1.45f)
                curveTo(9.11f, 3.38f, 8.13f, 4.0f, 7.0f, 4.0f)
                curveTo(6.62f, 4.0f, 6.28f, 4.22f, 6.11f, 4.53f)
                curveTo(5.96f, 4.84f, 5.61f, 5.0f, 5.27f, 5.0f)
                curveTo(4.53f, 5.0f, 4.01f, 4.2f, 4.37f, 3.55f)
                close()
                moveTo(22.39f, 12.19f)
                curveToRelative(-0.34f, 0.44f, -0.96f, 0.52f, -1.4f, 0.19f)
                lineTo(20.0f, 11.62f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-8.38f)
                lineToRelative(-0.99f, 0.76f)
                curveToRelative(-0.44f, 0.34f, -1.07f, 0.25f, -1.4f, -0.19f)
                curveToRelative(-0.33f, -0.44f, -0.25f, -1.07f, 0.19f, -1.4f)
                lineTo(4.0f, 9.11f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.58f)
                lineToRelative(5.39f, -4.12f)
                curveToRelative(0.36f, -0.27f, 0.86f, -0.27f, 1.21f, 0.0f)
                lineToRelative(9.6f, 7.33f)
                curveTo(22.64f, 11.13f, 22.73f, 11.76f, 22.39f, 12.19f)
                close()
                moveTo(10.06f, 7.0f)
                horizontalLineToRelative(3.89f)
                lineTo(12.0f, 5.52f)
                lineTo(10.06f, 7.0f)
                close()
                moveTo(6.0f, 10.1f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.9f)
                lineTo(16.56f, 9.0f)
                horizontalLineTo(7.44f)
                lineTo(6.0f, 10.1f)
                close()
                moveTo(6.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(18.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _cabin!!
    }

private var _cabin: ImageVector? = null
