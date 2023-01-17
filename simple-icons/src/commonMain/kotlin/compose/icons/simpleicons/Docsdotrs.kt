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

public val SimpleIcons.Docsdotrs: ImageVector
    get() {
        if (_docsdotrs != null) {
            return _docsdotrs!!
        }
        _docsdotrs = Builder(name = "Docsdotrs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.903f, 11.728f)
                lineToRelative(-4.528f, -1.697f)
                lineTo(18.375f, 4.945f)
                arcToRelative(1.69f, 1.69f, 0.0f, false, false, -1.097f, -1.58f)
                lineToRelative(-4.687f, -1.757f)
                arcToRelative(1.668f, 1.668f, 0.0f, false, false, -1.186f, 0.0f)
                lineTo(6.717f, 3.366f)
                arcToRelative(1.687f, 1.687f, 0.0f, false, false, -1.097f, 1.58f)
                verticalLineToRelative(5.085f)
                lineToRelative(-4.528f, 1.697f)
                arcTo(1.69f, 1.69f, 0.0f, false, false, 0.0f, 13.308f)
                verticalLineToRelative(5.16f)
                curveToRelative(0.0f, 0.638f, 0.36f, 1.224f, 0.933f, 1.51f)
                lineToRelative(4.687f, 2.344f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, 1.51f, 0.0f)
                lineTo(12.0f, 19.884f)
                lineToRelative(4.87f, 2.438f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, 1.51f, 0.0f)
                lineToRelative(4.687f, -2.344f)
                arcToRelative(1.69f, 1.69f, 0.0f, false, false, 0.933f, -1.51f)
                verticalLineToRelative(-5.16f)
                curveToRelative(0.0f, -0.703f, -0.436f, -1.331f, -1.097f, -1.58f)
                close()
                moveTo(16.781f, 10.068f)
                lineTo(12.797f, 11.564f)
                lineTo(12.797f, 8.367f)
                lineToRelative(3.984f, -1.734f)
                close()
                moveTo(7.22f, 4.88f)
                lineTo(12.0f, 3.09f)
                lineToRelative(4.781f, 1.79f)
                verticalLineToRelative(0.028f)
                lineTo(12.0f, 6.848f)
                lineToRelative(-4.781f, -1.94f)
                close()
                moveTo(11.157f, 18.525f)
                lineTo(7.173f, 20.517f)
                lineTo(7.173f, 16.81f)
                lineToRelative(3.984f, -1.818f)
                close()
                moveTo(11.157f, 13.275f)
                lineTo(6.376f, 15.215f)
                lineTo(1.595f, 13.275f)
                verticalLineToRelative(-0.028f)
                lineToRelative(4.781f, -1.79f)
                lineToRelative(4.781f, 1.79f)
                close()
                moveTo(22.407f, 18.525f)
                lineTo(18.423f, 20.517f)
                lineTo(18.423f, 16.81f)
                lineToRelative(3.984f, -1.818f)
                close()
                moveTo(22.407f, 13.275f)
                lineTo(17.626f, 15.215f)
                lineTo(12.845f, 13.275f)
                verticalLineToRelative(-0.028f)
                lineToRelative(4.781f, -1.79f)
                lineToRelative(4.781f, 1.79f)
                close()
            }
        }
        .build()
        return _docsdotrs!!
    }

private var _docsdotrs: ImageVector? = null
