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

public val SimpleIcons.Jpeg: ImageVector
    get() {
        if (_jpeg != null) {
            return _jpeg!!
        }
        _jpeg = Builder(name = "Jpeg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.559f, 20.407f)
                curveToRelative(-0.63f, 0.0f, -1.08f, -0.026f, -1.08f, -0.026f)
                verticalLineTo(17.22f)
                horizontalLineToRelative(1.073f)
                curveToRelative(1.19f, 0.0f, 1.95f, 0.33f, 1.95f, 1.426f)
                curveToRelative(0.0f, 0.93f, -0.329f, 1.76f, -1.943f, 1.76f)
                moveToRelative(0.028f, -3.965f)
                horizontalLineTo(6.61f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(0.87f)
                verticalLineToRelative(-2.797f)
                horizontalLineToRelative(1.275f)
                curveToRelative(1.783f, 0.0f, 2.634f, -1.096f, 2.634f, -2.483f)
                curveToRelative(0.0f, -1.413f, -0.871f, -2.279f, -2.8f, -2.279f)
                moveTo(13.37f, 20.571f)
                horizontalLineToRelative(3.063f)
                verticalLineToRelative(-0.812f)
                horizontalLineTo(13.37f)
                verticalLineToRelative(-2.55f)
                horizontalLineToRelative(3.548f)
                verticalLineToRelative(-0.768f)
                horizontalLineTo(12.5f)
                verticalLineToRelative(7.42f)
                horizontalLineToRelative(4.566f)
                verticalLineToRelative(-0.768f)
                horizontalLineTo(13.37f)
                close()
                moveTo(21.485f, 19.938f)
                verticalLineToRelative(0.753f)
                horizontalLineToRelative(1.289f)
                verticalLineToRelative(1.866f)
                curveToRelative(-0.395f, 0.587f, -1.452f, 0.587f, -1.452f, 0.587f)
                curveToRelative(-0.805f, 0.0f, -1.454f, -0.277f, -1.927f, -0.838f)
                curveToRelative(-0.47f, -0.558f, -0.707f, -1.158f, -0.707f, -2.06f)
                curveToRelative(0.0f, -0.947f, 0.235f, -1.675f, 0.711f, -2.257f)
                curveToRelative(0.482f, -0.583f, 1.15f, -0.905f, 1.982f, -0.905f)
                curveToRelative(0.427f, 0.0f, 0.884f, 0.131f, 1.33f, 0.405f)
                lineToRelative(0.538f, -0.602f)
                curveToRelative(-0.482f, -0.396f, -1.096f, -0.593f, -1.84f, -0.593f)
                curveToRelative(-1.11f, 0.0f, -2.005f, 0.361f, -2.656f, 1.08f)
                curveToRelative(-0.657f, 0.715f, -0.99f, 1.668f, -0.99f, 2.832f)
                reflectiveCurveToRelative(0.305f, 2.043f, 0.9f, 2.745f)
                curveToRelative(0.591f, 0.692f, 1.42f, 1.047f, 2.44f, 1.047f)
                curveToRelative(0.46f, 0.0f, 0.932f, -0.043f, 1.423f, -0.197f)
                curveToRelative(0.378f, -0.12f, 0.508f, -0.216f, 1.075f, -0.216f)
                verticalLineToRelative(-3.647f)
                close()
                moveTo(3.856f, 16.441f)
                horizontalLineToRelative(-0.584f)
                verticalLineToRelative(0.768f)
                horizontalLineToRelative(0.584f)
                verticalLineToRelative(3.571f)
                curveToRelative(0.0f, 1.101f, 0.033f, 1.746f, -0.345f, 2.124f)
                arcToRelative(1.267f, 1.267f, 0.0f, false, true, -0.865f, 0.367f)
                curveToRelative(-1.362f, 0.0f, -1.412f, -1.091f, -1.412f, -1.091f)
                horizontalLineTo(0.4f)
                curveToRelative(0.08f, 1.942f, 2.362f, 1.813f, 2.362f, 1.813f)
                curveToRelative(0.607f, -0.033f, 1.087f, -0.233f, 1.462f, -0.609f)
                curveToRelative(0.495f, -0.499f, 0.507f, -1.422f, 0.507f, -2.192f)
                verticalLineToRelative(-4.75f)
                close()
                moveTo(17.352f, 0.0f)
                horizontalLineTo(3.063f)
                verticalLineToRelative(14.282f)
                horizontalLineToRelative(8.266f)
                verticalLineTo(8.271f)
                horizontalLineToRelative(6.023f)
                close()
                moveTo(18.038f, 9.067f)
                horizontalLineToRelative(5.213f)
                verticalLineToRelative(5.216f)
                horizontalLineToRelative(-5.213f)
                close()
            }
        }
        .build()
        return _jpeg!!
    }

private var _jpeg: ImageVector? = null
