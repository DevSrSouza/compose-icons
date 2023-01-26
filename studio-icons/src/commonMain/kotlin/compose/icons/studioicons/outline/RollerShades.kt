package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.RollerShades: ImageVector
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
                moveTo(18.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(6.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.82f)
                curveToRelative(-0.45f, 0.32f, -0.75f, 0.84f, -0.75f, 1.43f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.78f, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.59f, -0.3f, -1.12f, -0.75f, -1.43f)
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
