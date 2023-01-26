package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ScreenSearchDesktop: ImageVector
    get() {
        if (_screenSearchDesktop != null) {
            return _screenSearchDesktop!!
        }
        _screenSearchDesktop = Builder(name = "ScreenSearchDesktop", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineToRelative(11.0f)
                curveTo(2.0f, 17.1f, 2.9f, 18.0f, 4.0f, 18.0f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 19.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.97f, 7.53f)
                curveToRelative(-1.37f, -1.37f, -3.58f, -1.37f, -4.95f, 0.0f)
                reflectiveCurveToRelative(-1.37f, 3.58f, 0.0f, 4.95f)
                curveToRelative(1.18f, 1.18f, 3.0f, 1.34f, 4.36f, 0.47f)
                lineToRelative(2.09f, 2.09f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-2.09f, -2.09f)
                curveTo(15.31f, 10.53f, 15.16f, 8.71f, 13.97f, 7.53f)
                close()
                moveTo(12.91f, 11.41f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f)
                reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0.0f)
                curveTo(13.69f, 9.37f, 13.69f, 10.63f, 12.91f, 11.41f)
                close()
            }
        }
        .build()
        return _screenSearchDesktop!!
    }

private var _screenSearchDesktop: ImageVector? = null
