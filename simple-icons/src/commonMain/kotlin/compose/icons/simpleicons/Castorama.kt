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

public val SimpleIcons.Castorama: ImageVector
    get() {
        if (_castorama != null) {
            return _castorama!!
        }
        _castorama = Builder(name = "Castorama", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.91f, 16.106f)
                curveToRelative(-2.129f, 0.0f, -3.659f, -1.794f, -3.659f, -4.266f)
                curveToRelative(0.0f, -2.148f, 1.468f, -4.095f, 3.488f, -4.095f)
                curveToRelative(2.275f, 0.0f, 3.545f, 1.857f, 3.545f, 1.857f)
                lineToRelative(2.939f, -3.298f)
                curveToRelative(-0.91f, -1.062f, -2.598f, -2.882f, -6.503f, -2.882f)
                curveToRelative(-4.388f, 0.0f, -8.209f, 3.489f, -8.209f, 8.456f)
                curveToRelative(0.0f, 4.766f, 3.475f, 8.532f, 8.266f, 8.532f)
                curveToRelative(3.855f, 0.0f, 5.572f, -2.017f, 6.54f, -3.129f)
                lineToRelative(-2.831f, -2.969f)
                curveToRelative(0.0f, 0.001f, -1.415f, 1.794f, -3.576f, 1.794f)
                close()
                moveTo(18.283f, 0.0f)
                verticalLineToRelative(9.988f)
                horizontalLineToRelative(-2.064f)
                arcToRelative(1.92f, 1.92f, 0.0f, true, false, 0.0f, 3.84f)
                horizontalLineToRelative(2.064f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(5.205f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-5.205f)
                close()
            }
        }
        .build()
        return _castorama!!
    }

private var _castorama: ImageVector? = null
