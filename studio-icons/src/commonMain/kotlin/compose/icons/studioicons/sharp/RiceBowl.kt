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

public val SharpGroup.RiceBowl: ImageVector
    get() {
        if (_riceBowl != null) {
            return _riceBowl!!
        }
        _riceBowl = Builder(name = "RiceBowl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                lineTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.75f)
                curveTo(19.53f, 18.86f, 22.0f, 15.69f, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(5.08f)
                curveTo(18.39f, 6.47f, 20.0f, 9.05f, 20.0f, 12.0f)
                close()
                moveTo(14.0f, 4.26f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(4.26f)
                curveTo(10.64f, 4.1f, 11.31f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(13.36f, 4.1f, 14.0f, 4.26f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -2.95f, 1.61f, -5.53f, 4.0f, -6.92f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _riceBowl!!
    }

private var _riceBowl: ImageVector? = null
