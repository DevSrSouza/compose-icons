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

public val SharpGroup.RollerShades: ImageVector
    get() {
        if (_rollerShades != null) {
            return _rollerShades!!
        }
        _rollerShades = Builder(name = "RollerShades", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(6.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.8f)
                curveToRelative(-0.4f, 0.3f, -0.8f, 0.8f, -0.8f, 1.4f)
                curveToRelative(0.0f, 1.0f, 0.8f, 1.8f, 1.8f, 1.8f)
                reflectiveCurveToRelative(1.8f, -0.8f, 1.8f, -1.8f)
                curveToRelative(0.0f, -0.6f, -0.3f, -1.1f, -0.8f, -1.4f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _rollerShades!!
    }

private var _rollerShades: ImageVector? = null
