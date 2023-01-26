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

public val SharpGroup.Yard: ImageVector
    get() {
        if (_yard != null) {
            return _yard!!
        }
        _yard = Builder(name = "Yard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(8.0f, 8.22f)
                curveToRelative(0.0f, -0.86f, 0.7f, -1.56f, 1.56f, -1.56f)
                curveToRelative(0.33f, 0.0f, 0.64f, 0.1f, 0.89f, 0.28f)
                lineToRelative(-0.01f, -0.12f)
                curveToRelative(0.0f, -0.86f, 0.7f, -1.56f, 1.56f, -1.56f)
                reflectiveCurveToRelative(1.56f, 0.7f, 1.56f, 1.56f)
                lineToRelative(-0.01f, 0.12f)
                curveToRelative(0.26f, -0.18f, 0.56f, -0.28f, 0.89f, -0.28f)
                curveToRelative(0.86f, 0.0f, 1.56f, 0.7f, 1.56f, 1.56f)
                curveToRelative(0.0f, 0.62f, -0.37f, 1.16f, -0.89f, 1.4f)
                curveTo(15.63f, 9.87f, 16.0f, 10.41f, 16.0f, 11.03f)
                curveToRelative(0.0f, 0.86f, -0.7f, 1.56f, -1.56f, 1.56f)
                curveToRelative(-0.33f, 0.0f, -0.64f, -0.11f, -0.89f, -0.28f)
                lineToRelative(0.01f, 0.12f)
                curveToRelative(0.0f, 0.86f, -0.7f, 1.56f, -1.56f, 1.56f)
                reflectiveCurveToRelative(-1.56f, -0.7f, -1.56f, -1.56f)
                lineToRelative(0.01f, -0.12f)
                curveToRelative(-0.26f, 0.18f, -0.56f, 0.28f, -0.89f, 0.28f)
                curveTo(8.7f, 12.59f, 8.0f, 11.89f, 8.0f, 11.03f)
                curveToRelative(0.0f, -0.62f, 0.37f, -1.16f, 0.89f, -1.4f)
                curveTo(8.37f, 9.38f, 8.0f, 8.84f, 8.0f, 8.22f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                curveTo(9.31f, 13.0f, 12.0f, 15.69f, 12.0f, 19.0f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                curveTo(18.0f, 16.31f, 15.31f, 19.0f, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.62f)
                moveToRelative(-1.56f, 0.0f)
                arcToRelative(1.56f, 1.56f, 0.0f, true, true, 3.12f, 0.0f)
                arcToRelative(1.56f, 1.56f, 0.0f, true, true, -3.12f, 0.0f)
            }
        }
        .build()
        return _yard!!
    }

private var _yard: ImageVector? = null