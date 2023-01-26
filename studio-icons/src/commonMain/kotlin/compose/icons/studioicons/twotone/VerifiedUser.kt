package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.VerifiedUser: ImageVector
    get() {
        if (_verifiedUser != null) {
            return _verifiedUser!!
        }
        _verifiedUser = Builder(name = "VerifiedUser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f)
                curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f)
                lineTo(21.0f, 5.0f)
                lineToRelative(-9.0f, -4.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(0.0f, 4.52f, -2.98f, 8.69f, -7.0f, 9.93f)
                curveToRelative(-4.02f, -1.24f, -7.0f, -5.41f, -7.0f, -9.93f)
                lineTo(5.0f, 6.3f)
                lineToRelative(7.0f, -3.11f)
                lineToRelative(7.0f, 3.11f)
                lineTo(19.0f, 11.0f)
                close()
                moveTo(7.41f, 11.59f)
                lineTo(6.0f, 13.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(8.0f, -8.0f)
                lineToRelative(-1.41f, -1.42f)
                lineTo(10.0f, 14.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 6.3f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 4.52f, 2.98f, 8.69f, 7.0f, 9.93f)
                curveToRelative(4.02f, -1.23f, 7.0f, -5.41f, 7.0f, -9.93f)
                verticalLineTo(6.3f)
                lineToRelative(-7.0f, -3.11f)
                lineTo(5.0f, 6.3f)
                close()
                moveTo(18.0f, 9.0f)
                lineToRelative(-8.0f, 8.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(10.0f, 14.17f)
                lineToRelative(6.59f, -6.59f)
                lineTo(18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _verifiedUser!!
    }

private var _verifiedUser: ImageVector? = null
