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

public val SimpleIcons.Uniqlo: ImageVector
    get() {
        if (_uniqlo != null) {
            return _uniqlo!!
        }
        _uniqlo = Builder(name = "Uniqlo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(3.006f, 3.236f)
                horizontalLineToRelative(1.52f)
                verticalLineToRelative(5.051f)
                arcToRelative(1.007f, 1.007f, 0.0f, true, false, 2.014f, 0.0f)
                verticalLineToRelative(-5.05f)
                horizontalLineToRelative(1.517f)
                verticalLineToRelative(5.056f)
                arcToRelative(2.525f, 2.525f, 0.0f, true, true, -5.051f, 0.0f)
                lineTo(3.006f, 3.236f)
                close()
                moveTo(10.076f, 3.236f)
                horizontalLineToRelative(1.514f)
                lineToRelative(2.023f, 4.328f)
                lineTo(13.613f, 3.236f)
                horizontalLineToRelative(1.516f)
                verticalLineToRelative(7.575f)
                horizontalLineToRelative(-1.516f)
                lineTo(11.59f, 6.482f)
                verticalLineToRelative(4.329f)
                horizontalLineToRelative(-1.514f)
                lineTo(10.076f, 3.236f)
                close()
                moveTo(17.645f, 3.246f)
                horizontalLineToRelative(1.488f)
                verticalLineToRelative(7.576f)
                horizontalLineToRelative(-1.488f)
                lineTo(17.645f, 3.246f)
                close()
                moveTo(5.533f, 13.078f)
                arcToRelative(2.526f, 2.526f, 0.0f, false, true, 2.524f, 2.53f)
                verticalLineToRelative(2.523f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -0.75f, 1.793f)
                lineToRelative(0.75f, 2.248f)
                lineTo(6.539f, 22.172f)
                lineToRelative(-0.518f, -1.563f)
                arcToRelative(2.472f, 2.472f, 0.0f, false, true, -0.488f, 0.043f)
                arcToRelative(2.524f, 2.524f, 0.0f, false, true, -2.527f, -2.521f)
                verticalLineToRelative(-2.524f)
                arcToRelative(2.527f, 2.527f, 0.0f, false, true, 2.527f, -2.529f)
                close()
                moveTo(10.08f, 13.078f)
                horizontalLineToRelative(1.514f)
                verticalLineToRelative(6.057f)
                horizontalLineToRelative(3.535f)
                verticalLineToRelative(1.517f)
                lineTo(10.08f, 20.652f)
                verticalLineToRelative(-7.574f)
                close()
                moveTo(18.416f, 13.078f)
                arcToRelative(2.526f, 2.526f, 0.0f, false, true, 2.523f, 2.53f)
                verticalLineToRelative(2.523f)
                arcToRelative(2.525f, 2.525f, 0.0f, false, true, -2.523f, 2.521f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, true, -2.531f, -2.521f)
                verticalLineToRelative(-2.524f)
                arcToRelative(2.533f, 2.533f, 0.0f, false, true, 2.531f, -2.529f)
                close()
                moveTo(5.536f, 14.598f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -1.01f, 1.01f)
                verticalLineToRelative(2.523f)
                curveToRelative(0.0f, 0.552f, 0.45f, 1.006f, 1.01f, 1.006f)
                curveToRelative(0.558f, 0.0f, 1.003f, -0.454f, 1.003f, -1.006f)
                verticalLineToRelative(-2.524f)
                curveToRelative(0.0f, -0.559f, -0.445f, -1.01f, -1.004f, -1.01f)
                close()
                moveTo(18.416f, 14.598f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -1.012f, 1.01f)
                verticalLineToRelative(2.523f)
                curveToRelative(0.0f, 0.552f, 0.453f, 1.006f, 1.012f, 1.006f)
                arcToRelative(1.012f, 1.012f, 0.0f, false, false, 1.01f, -1.006f)
                verticalLineToRelative(-2.524f)
                curveToRelative(0.0f, -0.559f, -0.455f, -1.01f, -1.01f, -1.01f)
                close()
            }
        }
        .build()
        return _uniqlo!!
    }

private var _uniqlo: ImageVector? = null
