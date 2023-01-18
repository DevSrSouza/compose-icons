package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ContactsBookLine: ImageVector
    get() {
        if (_contactsBookLine != null) {
            return _contactsBookLine!!
        }
        _contactsBookLine = Builder(name = "ContactsBookLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(16.005f)
                curveTo(20.107f, 2.0f, 21.0f, 2.898f, 21.0f, 3.99f)
                verticalLineToRelative(16.02f)
                curveToRelative(0.0f, 1.099f, -0.893f, 1.99f, -1.995f, 1.99f)
                lineTo(3.0f, 22.0f)
                lineTo(3.0f, 2.0f)
                close()
                moveTo(7.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(9.0f, 20.0f)
                horizontalLineToRelative(10.0f)
                lineTo(19.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(11.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(14.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(22.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 6.0f)
                close()
                moveTo(22.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _contactsBookLine!!
    }

private var _contactsBookLine: ImageVector? = null
