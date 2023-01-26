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

public val SharpGroup.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                verticalLineTo(8.0f)
                curveToRelative(4.56f, -0.58f, 8.0f, -3.1f, 8.0f, -6.0f)
                horizontalLineTo(2.0f)
                curveToRelative(0.0f, 2.9f, 3.44f, 5.42f, 8.0f, 6.0f)
                lineToRelative(0.0f, 3.0f)
                curveToRelative(-3.68f, 0.73f, -8.0f, 3.61f, -8.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(4.13f)
                curveToRelative(0.93f, -6.83f, 6.65f, -7.2f, 7.87f, -7.2f)
                reflectiveCurveToRelative(6.94f, 0.37f, 7.87f, 7.2f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                curveTo(22.0f, 14.61f, 17.68f, 11.73f, 14.0f, 11.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.55f, 0.22f, -1.05f, 0.59f, -1.41f)
                curveTo(11.39f, 17.79f, 16.0f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-1.79f, 4.61f, -2.59f, 5.41f)
                curveTo(13.05f, 21.78f, 12.55f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
