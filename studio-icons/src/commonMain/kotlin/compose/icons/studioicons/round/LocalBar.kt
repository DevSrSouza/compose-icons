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

public val RoundGroup.LocalBar: ImageVector
    get() {
        if (_localBar != null) {
            return _localBar!!
        }
        _localBar = Builder(name = "LocalBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.45f)
                curveToRelative(0.0f, -0.8f, -0.65f, -1.45f, -1.45f, -1.45f)
                horizontalLineTo(4.45f)
                curveTo(3.65f, 3.0f, 3.0f, 3.65f, 3.0f, 4.45f)
                curveToRelative(0.0f, 0.35f, 0.13f, 0.7f, 0.37f, 0.96f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(7.63f, -8.59f)
                curveToRelative(0.24f, -0.26f, 0.37f, -0.61f, 0.37f, -0.96f)
                close()
                moveTo(7.43f, 7.0f)
                lineTo(5.66f, 5.0f)
                horizontalLineToRelative(12.69f)
                lineToRelative(-1.78f, 2.0f)
                horizontalLineTo(7.43f)
                close()
            }
        }
        .build()
        return _localBar!!
    }

private var _localBar: ImageVector? = null
