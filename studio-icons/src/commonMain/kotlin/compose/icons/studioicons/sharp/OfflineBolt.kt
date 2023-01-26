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

public val SharpGroup.OfflineBolt: ImageVector
    get() {
        if (_offlineBolt != null) {
            return _offlineBolt!!
        }
        _offlineBolt = Builder(name = "OfflineBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.02f)
                curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f)
                reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f)
                reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f)
                reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f)
                close()
                moveTo(11.48f, 20.0f)
                verticalLineToRelative(-6.26f)
                horizontalLineTo(8.0f)
                lineTo(13.0f, 4.0f)
                verticalLineToRelative(6.26f)
                horizontalLineToRelative(3.35f)
                lineTo(11.48f, 20.0f)
                close()
            }
        }
        .build()
        return _offlineBolt!!
    }

private var _offlineBolt: ImageVector? = null
