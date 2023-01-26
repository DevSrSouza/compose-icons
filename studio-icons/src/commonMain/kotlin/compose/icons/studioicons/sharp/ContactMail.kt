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

public val SharpGroup.ContactMail: ImageVector
    get() {
        if (_contactMail != null) {
            return _contactMail!!
        }
        _contactMail = Builder(name = "ContactMail", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                lineTo(21.0f, 7.0f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(-3.0f, -2.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(3.0f, -2.0f)
                close()
                moveTo(24.0f, 3.0f)
                lineTo(0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(23.99f)
                lineTo(24.0f, 3.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(14.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f)
                reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(14.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _contactMail!!
    }

private var _contactMail: ImageVector? = null
