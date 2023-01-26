package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Toys: ImageVector
    get() {
        if (_toys != null) {
            return _toys!!
        }
        _toys = Builder(name = "Toys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.72f, 10.0f)
                lineToRelative(-2.0f, -6.0f)
                horizontalLineTo(7.28f)
                lineTo(5.81f, 8.4f)
                lineTo(4.41f, 7.0f)
                lineToRelative(1.0f, -1.0f)
                lineTo(4.0f, 4.59f)
                lineTo(0.59f, 8.0f)
                lineTo(2.0f, 9.41f)
                lineToRelative(1.0f, -1.0f)
                lineTo(4.59f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.18f)
                curveTo(4.59f, 19.16f, 5.7f, 20.0f, 7.0f, 20.0f)
                curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f)
                horizontalLineToRelative(4.37f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f)
                curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.82f, -2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(18.72f)
                close()
                moveTo(7.0f, 18.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(7.55f, 18.0f, 7.0f, 18.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineTo(7.41f)
                lineTo(7.39f, 9.98f)
                lineTo(8.72f, 6.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.0f, 10.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.28f)
                lineToRelative(1.33f, 4.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(17.55f, 18.0f, 17.0f, 18.0f)
                close()
            }
        }
        .build()
        return _toys!!
    }

private var _toys: ImageVector? = null
