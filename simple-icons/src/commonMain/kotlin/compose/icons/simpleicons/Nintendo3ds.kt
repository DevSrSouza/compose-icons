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

public val SimpleIcons.Nintendo3ds: ImageVector
    get() {
        if (_nintendo3ds != null) {
            return _nintendo3ds!!
        }
        _nintendo3ds = Builder(name = "Nintendo3ds", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.653f, 16.63f)
                arcToRelative(0.712f, 0.712f, 0.0f, true, false, 1.424f, 0.0f)
                arcToRelative(0.712f, 0.712f, 0.0f, true, false, -1.424f, 0.0f)
                moveToRelative(-9.45f, 4.238f)
                horizontalLineToRelative(7.575f)
                curveToRelative(0.3f, 0.0f, 0.524f, -0.225f, 0.544f, -0.524f)
                verticalLineToRelative(-5.175f)
                curveToRelative(-0.02f, -0.282f, -0.263f, -0.525f, -0.544f, -0.507f)
                lineTo(8.203f, 14.662f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.544f, 0.525f)
                verticalLineToRelative(5.156f)
                curveToRelative(0.0f, 0.301f, 0.244f, 0.525f, 0.544f, 0.525f)
                close()
                moveTo(21.254f, 17.343f)
                arcToRelative(0.729f, 0.729f, 0.0f, false, false, 0.73f, -0.729f)
                arcToRelative(0.73f, 0.73f, 0.0f, true, false, -0.73f, 0.729f)
                close()
                moveTo(19.811f, 17.324f)
                arcToRelative(0.714f, 0.714f, 0.0f, true, false, 0.001f, 1.427f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -0.001f, -1.427f)
                close()
                moveTo(19.098f, 15.187f)
                arcToRelative(0.712f, 0.712f, 0.0f, true, false, 1.424f, 0.0f)
                arcToRelative(0.712f, 0.712f, 0.0f, true, false, -1.424f, 0.0f)
                moveTo(2.54f, 16.612f)
                arcToRelative(1.65f, 1.65f, 0.0f, true, false, 3.3f, 0.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, true, false, -3.3f, 0.0f)
                moveTo(21.272f, 0.0f)
                lineTo(2.728f, 0.0f)
                arcTo(2.73f, 2.73f, 0.0f, false, false, -0.01f, 2.72f)
                verticalLineToRelative(18.542f)
                curveTo(0.009f, 22.781f, 1.228f, 24.0f, 2.728f, 24.0f)
                horizontalLineToRelative(18.526f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, false, 2.756f, -2.719f)
                lineTo(24.01f, 2.737f)
                curveTo(23.991f, 1.219f, 22.772f, 0.0f, 21.272f, 0.0f)
                close()
                moveTo(23.185f, 21.281f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, -1.912f, 1.912f)
                lineTo(2.728f, 23.193f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, -1.913f, -1.912f)
                verticalLineToRelative(-8.456f)
                horizontalLineToRelative(22.369f)
                verticalLineToRelative(8.456f)
                close()
                moveTo(23.185f, 11.587f)
                lineTo(0.815f, 11.587f)
                verticalLineToRelative(-8.85f)
                arcTo(1.92f, 1.92f, 0.0f, false, true, 2.728f, 0.824f)
                horizontalLineToRelative(18.544f)
                curveToRelative(1.049f, 0.0f, 1.912f, 0.863f, 1.912f, 1.913f)
                verticalLineToRelative(8.85f)
                moveTo(17.409f, 3.112f)
                lineTo(6.534f, 3.112f)
                curveToRelative(-0.3f, 0.0f, -0.544f, 0.263f, -0.544f, 0.563f)
                lineTo(5.99f, 9.15f)
                curveToRelative(0.0f, 0.3f, 0.226f, 0.563f, 0.544f, 0.563f)
                horizontalLineToRelative(10.875f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, 0.544f, -0.563f)
                lineTo(17.953f, 3.656f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, -0.544f, -0.544f)
                close()
            }
        }
        .build()
        return _nintendo3ds!!
    }

private var _nintendo3ds: ImageVector? = null
