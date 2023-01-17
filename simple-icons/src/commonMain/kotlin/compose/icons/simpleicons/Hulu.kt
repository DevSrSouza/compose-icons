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

public val SimpleIcons.Hulu: ImageVector
    get() {
        if (_hulu != null) {
            return _hulu!!
        }
        _hulu = Builder(name = "Hulu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.707f, 15.957f)
                horizontalLineToRelative(1.912f)
                lineTo(16.619f, 8.043f)
                horizontalLineToRelative(-1.912f)
                close()
                moveTo(11.35f, 13.701f)
                arcToRelative(0.517f, 0.517f, 0.0f, false, true, -0.512f, 0.511f)
                lineTo(9.727f, 14.212f)
                arcToRelative(0.517f, 0.517f, 0.0f, false, true, -0.512f, -0.511f)
                verticalLineToRelative(-3.19f)
                lineTo(7.303f, 10.511f)
                verticalLineToRelative(3.345f)
                curveToRelative(0.0f, 1.368f, 0.879f, 2.09f, 2.168f, 2.09f)
                horizontalLineToRelative(1.868f)
                curveToRelative(1.189f, 0.0f, 1.912f, -0.856f, 1.912f, -2.09f)
                lineTo(13.251f, 10.51f)
                horizontalLineToRelative(-1.912f)
                curveToRelative(0.01f, 0.0f, 0.01f, 3.09f, 0.01f, 3.19f)
                close()
                moveTo(22.1f, 10.511f)
                verticalLineToRelative(3.19f)
                arcToRelative(0.517f, 0.517f, 0.0f, false, true, -0.512f, 0.511f)
                horizontalLineToRelative(-1.112f)
                arcToRelative(0.517f, 0.517f, 0.0f, false, true, -0.511f, -0.511f)
                verticalLineToRelative(-3.19f)
                horizontalLineToRelative(-1.912f)
                verticalLineToRelative(3.345f)
                curveToRelative(0.0f, 1.368f, 0.878f, 2.09f, 2.167f, 2.09f)
                horizontalLineToRelative(1.868f)
                curveToRelative(1.19f, 0.0f, 1.912f, -0.856f, 1.912f, -2.09f)
                lineTo(24.0f, 10.51f)
                close()
                moveTo(3.78f, 10.511f)
                lineTo(2.557f, 10.511f)
                curveToRelative(-0.434f, 0.0f, -0.645f, 0.11f, -0.645f, 0.11f)
                lineTo(1.912f, 8.044f)
                lineTo(0.0f, 8.044f)
                verticalLineToRelative(7.903f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-3.179f)
                curveToRelative(0.0f, -0.278f, 0.234f, -0.511f, 0.512f, -0.511f)
                horizontalLineToRelative(1.112f)
                curveToRelative(0.278f, 0.0f, 0.511f, 0.233f, 0.511f, 0.511f)
                verticalLineToRelative(3.19f)
                horizontalLineToRelative(1.912f)
                verticalLineToRelative(-3.446f)
                curveToRelative(0.0f, -1.445f, -0.967f, -2.0f, -2.167f, -2.0f)
                close()
            }
        }
        .build()
        return _hulu!!
    }

private var _hulu: ImageVector? = null
