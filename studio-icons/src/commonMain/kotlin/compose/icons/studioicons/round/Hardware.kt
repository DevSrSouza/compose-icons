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

public val RoundGroup.Hardware: ImageVector
    get() {
        if (_hardware != null) {
            return _hardware!!
        }
        _hardware = Builder(name = "Hardware", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.59f, 3.41f)
                lineTo(15.0f, 6.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(9.0f)
                curveTo(6.24f, 3.0f, 4.0f, 5.24f, 4.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(8.0f)
                lineToRelative(2.59f, 2.59f)
                curveToRelative(0.26f, 0.26f, 0.62f, 0.41f, 1.0f, 0.41f)
                horizontalLineToRelative(0.01f)
                curveTo(19.37f, 11.0f, 20.0f, 10.37f, 20.0f, 9.59f)
                verticalLineTo(4.41f)
                curveTo(20.0f, 3.63f, 19.37f, 3.0f, 18.59f, 3.0f)
                horizontalLineToRelative(-0.01f)
                curveTo(18.21f, 3.0f, 17.85f, 3.15f, 17.59f, 3.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _hardware!!
    }

private var _hardware: ImageVector? = null
