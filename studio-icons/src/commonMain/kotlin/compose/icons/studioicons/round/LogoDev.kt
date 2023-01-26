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

public val RoundGroup.LogoDev: ImageVector
    get() {
        if (_logoDev != null) {
            return _logoDev!!
        }
        _logoDev = Builder(name = "LogoDev", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(7.68f, 14.98f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.71f)
                curveToRelative(1.28f, 0.0f, 1.71f, 1.03f, 1.71f, 1.71f)
                lineToRelative(0.0f, 2.56f)
                curveTo(9.42f, 13.95f, 9.0f, 14.98f, 7.68f, 14.98f)
                close()
                moveTo(12.38f, 11.46f)
                verticalLineToRelative(1.07f)
                horizontalLineToRelative(-1.18f)
                verticalLineToRelative(1.39f)
                horizontalLineToRelative(1.93f)
                verticalLineToRelative(1.07f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-0.4f, 0.01f, -0.74f, -0.31f, -0.75f, -0.71f)
                verticalLineTo(9.75f)
                curveToRelative(-0.01f, -0.4f, 0.31f, -0.74f, 0.71f, -0.75f)
                horizontalLineToRelative(2.28f)
                lineToRelative(0.0f, 1.07f)
                horizontalLineToRelative(-1.92f)
                verticalLineToRelative(1.39f)
                horizontalLineTo(12.38f)
                close()
                moveTo(16.88f, 14.23f)
                curveToRelative(-0.48f, 1.11f, -1.33f, 0.89f, -1.71f, 0.0f)
                lineTo(13.77f, 9.0f)
                horizontalLineToRelative(1.18f)
                lineToRelative(1.07f, 4.11f)
                lineTo(17.09f, 9.0f)
                horizontalLineToRelative(1.18f)
                lineTo(16.88f, 14.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.77f, 10.12f)
                horizontalLineTo(7.14f)
                verticalLineToRelative(3.77f)
                horizontalLineToRelative(0.63f)
                curveToRelative(0.14f, 0.0f, 0.28f, -0.05f, 0.42f, -0.16f)
                curveToRelative(0.14f, -0.1f, 0.21f, -0.26f, 0.21f, -0.47f)
                verticalLineToRelative(-2.52f)
                curveToRelative(0.0f, -0.21f, -0.07f, -0.37f, -0.21f, -0.47f)
                curveTo(8.05f, 10.17f, 7.91f, 10.12f, 7.77f, 10.12f)
                close()
            }
        }
        .build()
        return _logoDev!!
    }

private var _logoDev: ImageVector? = null
