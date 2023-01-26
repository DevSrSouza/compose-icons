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

public val SharpGroup.PersonAddDisabled: ImageVector
    get() {
        if (_personAddDisabled != null) {
            return _personAddDisabled!!
        }
        _personAddDisabled = Builder(name = "PersonAddDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.48f, 11.95f)
                curveToRelative(0.17f, 0.02f, 0.34f, 0.05f, 0.52f, 0.05f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.18f, 0.03f, 0.35f, 0.05f, 0.52f)
                lineToRelative(3.43f, 3.43f)
                close()
                moveTo(16.69f, 14.16f)
                lineTo(22.53f, 20.0f)
                lineTo(23.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.14f, -3.56f, -3.5f, -6.31f, -3.84f)
                close()
                moveTo(0.0f, 3.12f)
                lineToRelative(4.0f, 4.0f)
                lineTo(4.0f, 10.0f)
                lineTo(1.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.88f)
                lineToRelative(2.51f, 2.51f)
                curveTo(9.19f, 15.11f, 7.0f, 16.3f, 7.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.88f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.71f)
                lineTo(0.0f, 3.12f)
                close()
                moveTo(6.88f, 10.0f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(-0.88f)
                lineToRelative(0.88f, 0.88f)
                close()
            }
        }
        .build()
        return _personAddDisabled!!
    }

private var _personAddDisabled: ImageVector? = null
