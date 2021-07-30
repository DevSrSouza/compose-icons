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

public val SimpleIcons.Amd: ImageVector
    get() {
        if (_amd != null) {
            return _amd!!
        }
        _amd = Builder(name = "Amd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.324f, 9.137f)
                lineToRelative(1.559f, 1.56f)
                horizontalLineToRelative(2.556f)
                verticalLineToRelative(2.557f)
                lineTo(24.0f, 14.814f)
                lineTo(24.0f, 9.137f)
                close()
                moveTo(2.0f, 9.52f)
                lineToRelative(-2.0f, 4.96f)
                horizontalLineToRelative(1.309f)
                lineToRelative(0.37f, -0.982f)
                lineTo(3.9f, 13.498f)
                lineToRelative(0.408f, 0.982f)
                horizontalLineToRelative(1.338f)
                lineTo(3.432f, 9.52f)
                close()
                moveTo(6.209f, 9.52f)
                verticalLineToRelative(4.955f)
                horizontalLineToRelative(1.238f)
                verticalLineToRelative(-3.092f)
                lineToRelative(1.338f, 1.562f)
                horizontalLineToRelative(0.188f)
                lineToRelative(1.338f, -1.556f)
                verticalLineToRelative(3.091f)
                horizontalLineToRelative(1.238f)
                lineTo(11.549f, 9.52f)
                lineTo(10.47f, 9.52f)
                lineToRelative(-1.592f, 1.845f)
                lineTo(7.287f, 9.52f)
                close()
                moveTo(12.492f, 9.52f)
                verticalLineToRelative(4.96f)
                horizontalLineToRelative(2.057f)
                curveToRelative(1.979f, 0.0f, 2.88f, -1.046f, 2.88f, -2.472f)
                curveToRelative(0.0f, -1.36f, -0.937f, -2.488f, -2.747f, -2.488f)
                close()
                moveTo(13.729f, 10.43f)
                horizontalLineToRelative(0.792f)
                curveToRelative(1.17f, 0.0f, 1.63f, 0.711f, 1.63f, 1.57f)
                curveToRelative(0.0f, 0.728f, -0.372f, 1.572f, -1.616f, 1.572f)
                horizontalLineToRelative(-0.806f)
                close()
                moveTo(2.744f, 10.703f)
                lineToRelative(0.791f, 1.932f)
                lineTo(2.008f, 12.635f)
                close()
                moveTo(19.881f, 11.01f)
                lineToRelative(-1.604f, 1.603f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(2.246f)
                lineToRelative(1.604f, -1.607f)
                horizontalLineToRelative(-2.246f)
                close()
            }
        }
        .build()
        return _amd!!
    }

private var _amd: ImageVector? = null
