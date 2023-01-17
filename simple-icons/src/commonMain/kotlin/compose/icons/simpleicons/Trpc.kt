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

public val SimpleIcons.Trpc: ImageVector
    get() {
        if (_trpc != null) {
            return _trpc!!
        }
        _trpc = Builder(name = "Trpc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.62f, -5.38f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.38f, 12.0f, 12.0f)
                close()
                moveTo(1.21f, 12.0f)
                arcTo(10.78f, 10.78f, 0.0f, false, false, 12.0f, 22.79f)
                arcTo(10.78f, 10.78f, 0.0f, false, false, 22.79f, 12.0f)
                arcTo(10.78f, 10.78f, 0.0f, false, false, 12.0f, 1.21f)
                arcTo(10.78f, 10.78f, 0.0f, false, false, 1.21f, 12.0f)
                close()
                moveTo(12.125f, 5.914f)
                lineTo(14.287f, 7.162f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.125f, 0.217f)
                verticalLineToRelative(1.103f)
                lineToRelative(2.473f, 1.428f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.125f, 0.217f)
                verticalLineToRelative(2.355f)
                lineToRelative(0.955f, 0.551f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.125f, 0.217f)
                verticalLineToRelative(2.496f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.125f, 0.217f)
                lineToRelative(-2.162f, 1.248f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.0f)
                lineToRelative(-0.956f, -0.552f)
                lineToRelative(-2.472f, 1.427f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.0f)
                lineToRelative(-2.472f, -1.427f)
                lineToRelative(-0.956f, 0.552f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.0f)
                lineToRelative(-2.162f, -1.248f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.125f, -0.217f)
                lineTo(5.91f, 13.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.125f, -0.217f)
                lineToRelative(0.955f, -0.551f)
                verticalLineToRelative(-2.355f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.125f, -0.217f)
                lineToRelative(2.473f, -1.428f)
                lineTo(9.588f, 7.38f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.125f, -0.217f)
                lineToRelative(2.162f, -1.248f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.0f)
                close()
                moveTo(13.393f, 15.963f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.125f, -0.217f)
                lineTo(13.268f, 13.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.125f, -0.217f)
                lineToRelative(2.16f, -1.248f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.0f)
                lineToRelative(0.707f, 0.408f)
                verticalLineToRelative(-1.922f)
                lineToRelative(-2.098f, -1.21f)
                verticalLineToRelative(0.814f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.125f, 0.217f)
                lineToRelative(-2.162f, 1.248f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.0f)
                lineToRelative(-2.162f, -1.248f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.125f, -0.217f)
                lineTo(9.588f, 9.06f)
                lineTo(7.49f, 10.271f)
                verticalLineToRelative(1.922f)
                lineToRelative(0.707f, -0.408f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.0f)
                lineToRelative(2.16f, 1.248f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.125f, 0.217f)
                verticalLineToRelative(2.496f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.125f, 0.217f)
                lineToRelative(-0.705f, 0.408f)
                lineTo(12.0f, 17.582f)
                lineToRelative(2.098f, -1.211f)
                close()
                moveTo(10.088f, 9.73f)
                lineToRelative(1.662f, 0.96f)
                lineTo(11.75f, 8.766f)
                lineToRelative(-1.662f, -0.955f)
                close()
                moveTo(13.912f, 9.73f)
                lineTo(13.912f, 7.811f)
                lineToRelative(-1.662f, 0.955f)
                verticalLineToRelative(1.924f)
                close()
                moveTo(12.0f, 6.418f)
                lineToRelative(-1.66f, 0.96f)
                lineToRelative(1.66f, 0.954f)
                lineToRelative(1.66f, -0.954f)
                close()
                moveTo(6.41f, 15.602f)
                lineTo(8.07f, 16.56f)
                verticalLineToRelative(-1.921f)
                lineToRelative(-1.66f, -0.956f)
                close()
                moveTo(10.232f, 15.602f)
                verticalLineToRelative(-1.92f)
                lineToRelative(-1.662f, 0.957f)
                verticalLineToRelative(1.923f)
                close()
                moveTo(8.322f, 12.291f)
                lineTo(6.66f, 13.251f)
                lineTo(8.321f, 14.206f)
                lineTo(9.981f, 13.25f)
                close()
                moveTo(13.768f, 15.601f)
                lineTo(15.428f, 16.561f)
                verticalLineToRelative(-1.922f)
                lineToRelative(-1.66f, -0.956f)
                close()
                moveTo(17.59f, 15.601f)
                verticalLineToRelative(-1.918f)
                lineToRelative(-1.662f, 0.956f)
                verticalLineToRelative(1.922f)
                close()
                moveTo(15.678f, 12.291f)
                lineTo(14.018f, 13.251f)
                lineTo(15.678f, 14.206f)
                lineTo(17.338f, 13.25f)
                close()
            }
        }
        .build()
        return _trpc!!
    }

private var _trpc: ImageVector? = null
