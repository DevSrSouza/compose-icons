package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Microsoftword: ImageVector
    get() {
        if (_microsoftword != null) {
            return _microsoftword!!
        }
        _microsoftword = Builder(name = "Microsoftword", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.004f, 1.5f)
                quadToRelative(0.41f, 0.0f, 0.703f, 0.293f)
                reflectiveQuadToRelative(0.293f, 0.703f)
                verticalLineToRelative(19.008f)
                quadToRelative(0.0f, 0.41f, -0.293f, 0.703f)
                reflectiveQuadToRelative(-0.703f, 0.293f)
                lineTo(6.996f, 22.5f)
                quadToRelative(-0.41f, 0.0f, -0.703f, -0.293f)
                reflectiveQuadTo(6.0f, 21.504f)
                lineTo(6.0f, 18.0f)
                lineTo(0.996f, 18.0f)
                quadToRelative(-0.41f, 0.0f, -0.703f, -0.293f)
                reflectiveQuadTo(0.0f, 17.004f)
                lineTo(0.0f, 6.996f)
                quadToRelative(0.0f, -0.41f, 0.293f, -0.703f)
                reflectiveQuadTo(0.996f, 6.0f)
                lineTo(6.0f, 6.0f)
                lineTo(6.0f, 2.496f)
                quadToRelative(0.0f, -0.41f, 0.293f, -0.703f)
                reflectiveQuadToRelative(0.703f, -0.293f)
                close()
                moveTo(6.035f, 11.203f)
                lineToRelative(1.442f, 4.735f)
                horizontalLineToRelative(1.64f)
                lineToRelative(1.57f, -7.876f)
                lineTo(9.036f, 8.062f)
                lineToRelative(-0.937f, 4.653f)
                lineToRelative(-1.325f, -4.5f)
                lineTo(5.38f, 8.215f)
                lineToRelative(-1.406f, 4.523f)
                lineToRelative(-0.938f, -4.675f)
                lineTo(1.312f, 8.063f)
                lineToRelative(1.57f, 7.874f)
                horizontalLineToRelative(1.641f)
                close()
                moveTo(22.5f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(22.5f, 16.5f)
                verticalLineToRelative(-3.75f)
                lineTo(12.0f, 12.75f)
                verticalLineToRelative(3.75f)
                close()
                moveTo(22.5f, 11.25f)
                lineTo(22.5f, 7.5f)
                lineTo(12.0f, 7.5f)
                verticalLineToRelative(3.75f)
                close()
                moveTo(22.5f, 6.0f)
                lineTo(22.5f, 3.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _microsoftword!!
    }

private var _microsoftword: ImageVector? = null
