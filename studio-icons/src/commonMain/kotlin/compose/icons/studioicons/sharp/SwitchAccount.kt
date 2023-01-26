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

public val SharpGroup.SwitchAccount: ImageVector
    get() {
        if (_switchAccount != null) {
            return _switchAccount!!
        }
        _switchAccount = Builder(name = "SwitchAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.0f, 5.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                curveTo(11.0f, 6.34f, 12.34f, 5.0f, 14.0f, 5.0f)
                close()
                moveTo(7.76f, 16.0f)
                curveToRelative(1.47f, -1.83f, 3.71f, -3.0f, 6.24f, -3.0f)
                reflectiveCurveToRelative(4.77f, 1.17f, 6.24f, 3.0f)
                horizontalLineTo(7.76f)
                close()
            }
        }
        .build()
        return _switchAccount!!
    }

private var _switchAccount: ImageVector? = null