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

public val SimpleIcons.Sidequest: ImageVector
    get() {
        if (_sidequest != null) {
            return _sidequest!!
        }
        _sidequest = Builder(name = "Sidequest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.409f)
                lineTo(18.689f, 1.21f)
                lineTo(8.065f, 1.21f)
                lineToRelative(2.518f, 4.359f)
                lineToRelative(0.769f, 1.331f)
                lineToRelative(-0.918f, 1.592f)
                lineTo(8.598f, 8.492f)
                lineToRelative(-0.769f, -1.333f)
                lineToRelative(-2.517f, -4.36f)
                lineTo(0.0f, 11.999f)
                lineToRelative(5.311f, 9.199f)
                lineToRelative(2.518f, -4.36f)
                lineToRelative(0.769f, -1.333f)
                horizontalLineToRelative(1.836f)
                lineToRelative(0.919f, 1.593f)
                lineToRelative(-0.77f, 1.332f)
                lineToRelative(-2.517f, 4.359f)
                lineTo(18.69f, 22.789f)
                lineTo(24.0f, 13.59f)
                horizontalLineToRelative(-6.571f)
                lineToRelative(-0.919f, -1.591f)
                lineToRelative(0.919f, -1.59f)
                lineTo(24.0f, 10.409f)
                close()
                moveTo(5.288f, 5.328f)
                lineTo(6.27f, 7.03f)
                lineTo(4.763f, 9.64f)
                horizontalLineToRelative(6.334f)
                lineToRelative(3.169f, -5.486f)
                horizontalLineToRelative(-3.015f)
                lineToRelative(-0.983f, -1.702f)
                horizontalLineToRelative(7.046f)
                lineToRelative(-5.183f, 8.977f)
                lineTo(1.763f, 11.429f)
                lineToRelative(3.525f, -6.101f)
                close()
                moveTo(10.268f, 21.547f)
                lineTo(11.251f, 19.844f)
                horizontalLineToRelative(3.015f)
                lineToRelative(-3.169f, -5.488f)
                lineTo(4.763f, 14.356f)
                lineToRelative(1.507f, 2.611f)
                lineToRelative(-0.982f, 1.704f)
                lineToRelative(-3.525f, -6.104f)
                horizontalLineToRelative(10.368f)
                lineToRelative(1.364f, 2.363f)
                lineToRelative(3.819f, 6.617f)
                horizontalLineToRelative(-7.046f)
                close()
                moveTo(18.352f, 17.485f)
                lineTo(19.857f, 14.875f)
                horizontalLineToRelative(1.969f)
                lineToRelative(-3.525f, 6.102f)
                lineToRelative(-3.109f, -5.382f)
                lineToRelative(-2.077f, -3.596f)
                lineToRelative(2.459f, -4.257f)
                lineToRelative(2.727f, -4.72f)
                lineToRelative(3.525f, 6.102f)
                horizontalLineToRelative(-1.969f)
                lineToRelative(-1.505f, -2.611f)
                lineToRelative(-3.17f, 5.486f)
                lineToRelative(3.17f, 5.486f)
                close()
            }
        }
        .build()
        return _sidequest!!
    }

private var _sidequest: ImageVector? = null
